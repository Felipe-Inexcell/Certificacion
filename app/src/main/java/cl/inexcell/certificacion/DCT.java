package cl.inexcell.certificacion;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import cl.inexcell.certificacion.objetos.DCTParamCaja;
import cl.inexcell.certificacion.objetos.DCTParamFono;
import cl.inexcell.certificacion.objetos.DCTParamFonoCabecera;


public class DCT extends Activity {
    public static Activity actividad;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dct);
        actividad = this;
        mContext = this;

        ObtenerDCT task = new ObtenerDCT();
        task.execute();

    }

    public void volver(View v) {
        finish();
    }

    public void shutdown(View v) {
        if (VistaTopologica.topo != null)
            VistaTopologica.topo.finish();
        if (Principal.p != null)
            Principal.p.finish();
        finish();
    }

    private class ObtenerDCT extends AsyncTask<String, String, String> {
        ProgressDialog dialog;

        boolean stateOk = false;

        @Override
        protected void onPreExecute() {
            dialog = new ProgressDialog(mContext);
            dialog.setCancelable(false);
            dialog.setMessage("Buscando información...");
            dialog.show();
        }

        @Override
        protected String doInBackground(String... params) {
            try {
                ArrayList<String> retorno = XMLParser.getReturnCode(URLs.PARAELECTRI);
                if (retorno.get(0).compareTo("0") == 0) {
                    stateOk = true;
                    return URLs.PARAELECTRI;
                } else {
                    return retorno.get(1);
                }
            } catch (Exception e) {
                return e.getMessage();
            }
        }

        @Override
        protected void onPostExecute(String s) {

            if (stateOk) {
                try {
                    cl.inexcell.certificacion.objetos.DCT response = XMLParser.getDCTinfo(s);
                    dibujar(response);
                } catch (Exception e) {
                    Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(mContext, s, Toast.LENGTH_LONG).show();
            }
            if (dialog.isShowing()) dialog.dismiss();
        }
    }

    private void dibujar(cl.inexcell.certificacion.objetos.DCT response) {
        LinearLayout.LayoutParams paramsCenterTextIzq = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams paramsCenterTextDer = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT);
        paramsCenterTextIzq.weight = 2;
        paramsCenterTextDer.weight = 1;

        LinearLayout cCajas = (LinearLayout) findViewById(R.id.contenido);
        TextView t = Funciones.makeTextView(this, "Tecnologías por Fabricante", 1);
        t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        cCajas.addView(t);

        LinearLayout contCajas = new LinearLayout(this);
        contCajas.setBackgroundResource(R.drawable.fondo3);
        contCajas.setOrientation(LinearLayout.VERTICAL);
        contCajas.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        LinearLayout contenido = new LinearLayout(this);
        contenido.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        contenido.setBackgroundResource(R.color.celeste);
        contenido.setOrientation(LinearLayout.HORIZONTAL);

        TextView text = new TextView(this);
        text.setText("Fabricante");
        text.setTextColor(getResources().getColor(android.R.color.white));
        text.setGravity(Gravity.CENTER_HORIZONTAL);
        contenido.addView(text, paramsCenterTextIzq);

        text = new TextView(this);
        text.setText("Velocidad");
        text.setTextColor(getResources().getColor(android.R.color.white));
        text.setGravity(Gravity.CENTER_HORIZONTAL);
        contenido.addView(text, paramsCenterTextDer);
        contCajas.addView(contenido);

        int id = -1;
        for (DCTParamCaja cajas : response.getParametrosCajas()) {
            if (cajas.getId() > id) {
                id = cajas.getId();
                contenido = new LinearLayout(this);
                contenido.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                contenido.setBackgroundResource(android.R.color.holo_green_light);
                contenido.setOrientation(LinearLayout.HORIZONTAL);
                text = new TextView(this);
                text.setGravity(Gravity.CENTER_HORIZONTAL);
                text.setText(cajas.getProveedor());
                contenido.addView(text);
                contCajas.addView(contenido);
            }

            contenido = new LinearLayout(this);
            contenido.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            contenido.setOrientation(LinearLayout.HORIZONTAL);
            text = new TextView(this);
            text.setGravity(Gravity.CENTER_HORIZONTAL);
            text.setText(cajas.getDslam());
            contenido.addView(text, paramsCenterTextIzq);

            text = new TextView(this);
            text.setGravity(Gravity.CENTER_HORIZONTAL);
            text.setText(cajas.getVelocidad());
            contenido.addView(text, paramsCenterTextDer);

            if (response.getParametrosCajas().indexOf(cajas) == 0 || response.getParametrosCajas().indexOf(cajas) % 2 == 0) {
                contenido.setBackgroundResource(R.color.gris);
            }
            contCajas.addView(contenido);
        }
        cCajas.addView(contCajas);

        TextView titulo = Funciones.makeTextView(this, "Caja Terminal en Poste", 1);
        titulo.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        titulo.setPadding(0, 20, 0, 0);
        cCajas.addView(titulo);

        LinearLayout.LayoutParams paramsPar = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT);
        LinearLayout.LayoutParams paramsFono = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT);
        LinearLayout.LayoutParams paramsTipo = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT);
        LinearLayout.LayoutParams paramsPerfil = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT);
        paramsPar.weight = 2;
        paramsFono.weight = 3;
        paramsTipo.weight = 3;
        paramsPerfil.weight = 4;

        contCajas = new LinearLayout(this);
        contCajas.setBackgroundResource(R.drawable.fondo3);
        contCajas.setOrientation(LinearLayout.VERTICAL);
        contCajas.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        contenido = new LinearLayout(this);
        contenido.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        contenido.setBackgroundResource(R.color.celeste);
        contenido.setOrientation(LinearLayout.HORIZONTAL);

        text = new TextView(this);
        text.setText("Par");
        text.setTextColor(getResources().getColor(android.R.color.white));
        text.setGravity(Gravity.CENTER_HORIZONTAL);
        contenido.addView(text, paramsPar);

        text = new TextView(this);
        text.setText("Telefono");
        text.setTextColor(getResources().getColor(android.R.color.white));
        text.setGravity(Gravity.CENTER_HORIZONTAL);
        contenido.addView(text, paramsFono);

        text = new TextView(this);
        text.setText("Tipo");
        text.setTextColor(getResources().getColor(android.R.color.white));
        text.setGravity(Gravity.CENTER_HORIZONTAL);
        contenido.addView(text, paramsTipo);

        text = new TextView(this);
        text.setText("Perfil");
        text.setTextColor(getResources().getColor(android.R.color.white));
        text.setGravity(Gravity.CENTER_HORIZONTAL);
        contenido.addView(text, paramsPerfil);

        contCajas.addView(contenido);
        LinearLayout separador = new LinearLayout(this);
        separador.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 1));
        separador.setBackgroundResource(android.R.color.black);
        contCajas.addView(separador);
        for (final DCTParamFono fonos : response.getParametrosFonos()) {

            contenido = new LinearLayout(this);
            contenido.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            contenido.setOrientation(LinearLayout.HORIZONTAL);

            text = new TextView(this);
            text.setPadding(0, 5, 0, 5);
            text.setText(fonos.getPar());
            text.setGravity(Gravity.CENTER_HORIZONTAL);
            contenido.addView(text, paramsPar);

            text = new TextView(this);
            text.setPadding(0, 5, 0, 5);
            text.setText(fonos.getArea() + "" + fonos.getFono());
            text.setBackgroundResource(R.drawable.boton_style3);
            text.setGravity(Gravity.CENTER_HORIZONTAL);
            text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (fonos.getTipo().compareTo("Banda Ancha") != 0) {
                        return;
                    }
                    DCTParamFonoCabecera cab = fonos.getParametrosFonosCabecera().get(0);
                    String datoselectricos = "";
                    for (int i = 0; i < cab.getParametrosElectricos().size(); i++) {
                        if (i == 0) {
                            datoselectricos += cab.getParametrosElectricos().get(i);
                        } else {

                            datoselectricos += "&" + cab.getParametrosElectricos().get(i);
                        }
                    }

                    Intent intent = new Intent(mContext, DetalleElectrico.class);
                    intent.putExtra("VENDOR", cab.getVendor());
                    intent.putExtra("DSLAM", cab.getDslam());
                    intent.putExtra("MODEL", cab.getModel());
                    intent.putExtra("DATOS", datoselectricos);
                    startActivity(intent);
                }
            });
            contenido.addView(text, paramsFono);

            text = new TextView(this);
            text.setPadding(0, 5, 0, 5);
            text.setText(fonos.getTipo());
            text.setGravity(Gravity.CENTER_HORIZONTAL);
            contenido.addView(text, paramsTipo);

            text = new TextView(this);
            text.setPadding(0, 5, 0, 5);
            text.setText(fonos.getPerfil());
            text.setTextColor(getResources().getColor(R.color.orange));
            text.setBackgroundResource(R.color.gris);
            text.setGravity(Gravity.CENTER_HORIZONTAL);
            contenido.addView(text, paramsPerfil);

            contCajas.addView(contenido);
            separador = new LinearLayout(this);
            separador.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 1));
            separador.setBackgroundResource(android.R.color.black);
            contCajas.addView(separador);
        }
        cCajas.addView(contCajas);
    }

}
