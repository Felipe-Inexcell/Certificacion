package cl.inexcell.exploradorperu.preferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by felip on 01/10/2015.
 */
public class FactSave {
    public static final String NAME = "FACT_SAVE_PERU";
    public Context mContext;
    public SharedPreferences sharedPreferences;

    public FactSave(Context context) {
        super();
        mContext = context;
        sharedPreferences = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
    }

    public void setValue(String boton, String info){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(boton, info);
        editor.apply();
    }


    public String getValue(String boton){
        return sharedPreferences.getString(boton, "0");
    }

    public void clearPreferences(){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
       editor.apply();
    }






}
