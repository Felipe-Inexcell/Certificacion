package cl.inexcell.certificacion;

/**
 * Created by felip on 17/08/2015.
 */
public class URLs {

    public static String PARAELECTRI = "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:SOAP-ENC=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:tns=\"urn:Demo\">" +
               "<SOAP-ENV:Body>" +
                  "<ns1:ParaElectriResponse xmlns:ns1=\"urn:Demo\">" +
                     "<ResponseParaElectri xsi:type=\"tns:ResponseParaElectri\">" +
                        "<Operation xsi:type=\"tns:OperationType\">" +
                           "<OperationCode xsi:type=\"xsd:string\">?</OperationCode>" +
                           "<OperationId xsi:type=\"xsd:string\">?</OperationId>" +
                           "<DateTime xsi:type=\"xsd:string\">?</DateTime>" +
                           "<IdUser xsi:type=\"xsd:string\">?</IdUser>" +
                           "<IMEI xsi:type=\"xsd:string\">?</IMEI>" +
                           "<IMSI xsi:type=\"xsd:string\">?</IMSI>" +
                        "</Operation>" +
                        "<Service xsi:type=\"tns:ServiceParaElectriOut\">" +
                           "<ParaElectri xsi:type=\"tns:ParaElectriOut\">" +
                              "<Output xsi:type=\"tns:ParaElectriOutData\">" +
                                 "<Element xsi:type=\"tns:ElementTypeParaElectri\">" +
                                    "<Identification xsi:type=\"tns:IdentificationTypeDCT\">" +
                                       "<ParametersCajas xsi:type=\"tns:ParametersTypeDCTCajas\">" +
                                          "<id xsi:type=\"xsd:string\">0</id>" +
                                          "<Proveedor xsi:type=\"xsd:string\">HUAWEI</Proveedor>" +
                                          "<dslam xsi:type=\"xsd:string\">MA5600_WASHINGTON-55_F1</dslam>" +
                                          "<Velocidad xsi:type=\"xsd:string\">7080</Velocidad>" +
                                       "</ParametersCajas>" +
                                       "<ParametersCajas xsi:type=\"tns:ParametersTypeDCTCajas\">" +
                                          "<id xsi:type=\"xsd:string\">1</id>" +
                                          "<Proveedor xsi:type=\"xsd:string\">ALCATEL</Proveedor>" +
                                          "<dslam xsi:type=\"xsd:string\">WASHINGTON-32-SR1</dslam>" +
                                          "<Velocidad xsi:type=\"xsd:string\">6144</Velocidad>" +
                                       "</ParametersCajas>" +
                                       "<ParametersCajas xsi:type=\"tns:ParametersTypeDCTCajas\">" +
                                          "<id xsi:type=\"xsd:string\">1</id>" +
                                          "<Proveedor xsi:type=\"xsd:string\">ALCATEL</Proveedor>" +
                                          "<dslam xsi:type=\"xsd:string\">WASHINGTON-4</dslam>" +
                                          "<Velocidad xsi:type=\"xsd:string\">0</Velocidad>" +
                                       "</ParametersCajas>" +
                                       "<ParametersFonos xsi:type=\"tns:ParametersTypeDCTFonos\">" +
                                          "<Par xsi:type=\"xsd:string\">21</Par>" +
                                          "<Area xsi:type=\"xsd:string\">1</Area>" +
                                          "<Fono xsi:type=\"xsd:string\">3326148</Fono>" +
                                          "<Tipo xsi:type=\"xsd:string\">Banda Ancha</Tipo>" +
                                          "<Perfil xsi:type=\"xsd:string\">HUAWEI_4000_512_16_8_D80</Perfil>" +
                                          "<ParametersFonosCabecera xsi:type=\"tns:ParametersTypeDCTFonosCabecera\">" +
                                             "<Vendor xsi:type=\"xsd:string\">HUAWEI</Vendor>" +
                                             "<DSLAM xsi:type=\"xsd:string\">MA5600_WASHINGTON-55_F1</DSLAM>" +
                                             "<Model xsi:type=\"xsd:string\">MA5600</Model>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Vel. Act. Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">511</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Vel. Max.Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">1078</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Ruido Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">26.5</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Atenuacion Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">27.7</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Ocupacion Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">47</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Vel. Act. Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">3200</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Vel. Max. Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">7080</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Ruido Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">13.5</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Atenuacion Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">47.7</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Ocupacion  Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">45</Value>" +
                                             "</ParametersElectricos>" +
                                          "</ParametersFonosCabecera>" +
                                       "</ParametersFonos>" +
                                       "<ParametersFonos xsi:type=\"tns:ParametersTypeDCTFonos\">" +
                                          "<Par xsi:type=\"xsd:string\">23</Par>" +
                                          "<Area xsi:type=\"xsd:string\">1</Area>" +
                                          "<Fono xsi:type=\"xsd:string\">3326026</Fono>" +
                                          "<Tipo xsi:type=\"xsd:string\">Banda Ancha</Tipo>" +
                                          "<Perfil xsi:type=\"xsd:string\">ISAM_2000_256_16_8_2_1</Perfil>" +
                                          "<ParametersFonosCabecera xsi:type=\"tns:ParametersTypeDCTFonosCabecera\">" +
                                             "<Vendor xsi:type=\"xsd:string\">ALCATEL</Vendor>" +
                                             "<DSLAM xsi:type=\"xsd:string\">WASHINGTON-32-SR1</DSLAM>" +
                                             "<Model xsi:type=\"xsd:string\">ISAM 7300</Model>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Vel. Act. Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">256</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Vel. Max.Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">952</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Ruido Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">32.1</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Atenuacion Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">27.7</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Ocupacion Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">34</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Vel. Act. Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">1984</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Vel. Max. Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">6144</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Ruido Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">23</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Atenuacion Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">41.5</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Ocupacion  Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">37</Value>" +
                                             "</ParametersElectricos>" +
                                          "</ParametersFonosCabecera>" +
                                       "</ParametersFonos>" +
                                       "<ParametersFonos xsi:type=\"tns:ParametersTypeDCTFonos\">" +
                                          "<Par xsi:type=\"xsd:string\">24</Par>" +
                                          "<Area xsi:type=\"xsd:string\">1</Area>" +
                                          "<Fono xsi:type=\"xsd:string\">4243466</Fono>" +
                                          "<Tipo xsi:type=\"xsd:string\">Telefonía</Tipo>" +
                                          "<Perfil xsi:type=\"xsd:string\"/>" +
                                          "<ParametersFonosCabecera xsi:type=\"tns:ParametersTypeDCTFonosCabecera\">" +
                                             "<Vendor xsi:type=\"xsd:string\"/>" +
                                             "<DSLAM xsi:type=\"xsd:string\"/>" +
                                             "<Model xsi:type=\"xsd:string\"/>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Vel. Act. Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\"/>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Vel. Max.Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\"/>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Ruido Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\"/>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Atenuacion Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\"/>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Ocupacion Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\"/>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Vel. Act. Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\"/>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Vel. Max. Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\"/>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Ruido Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\"/>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Atenuacion Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\"/>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Ocupacion  Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\"/>" +
                                             "</ParametersElectricos>" +
                                          "</ParametersFonosCabecera>" +
                                       "</ParametersFonos>" +
                                       "<ParametersFonos xsi:type=\"tns:ParametersTypeDCTFonos\">" +
                                          "<Par xsi:type=\"xsd:string\">22</Par>" +
                                          "<Area xsi:type=\"xsd:string\">1</Area>" +
                                          "<Fono xsi:type=\"xsd:string\">4335539</Fono>" +
                                          "<Tipo xsi:type=\"xsd:string\">Banda Ancha</Tipo>" +
                                          "<Perfil xsi:type=\"xsd:string\">900_256</Perfil>" +
                                          "<ParametersFonosCabecera xsi:type=\"tns:ParametersTypeDCTFonosCabecera\">" +
                                             "<Vendor xsi:type=\"xsd:string\">ALCATEL</Vendor>" +
                                             "<DSLAM xsi:type=\"xsd:string\">WASHINGTON-4</DSLAM>" +
                                             "<Model xsi:type=\"xsd:string\">ASAM 7301</Model>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Vel. Act. Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">0</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Vel. Max.Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">0</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Ruido Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">0</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Atenuacion Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">0</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Ocupacion Upstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">0</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Vel. Act. Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">0</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Vel. Max. Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">0</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Ruido Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">0</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Atenuacion Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">0</Value>" +
                                             "</ParametersElectricos>" +
                                             "<ParametersElectricos xsi:type=\"tns:ParametersElectricos\">" +
                                                "<Attribute xsi:type=\"xsd:string\">Ocupacion  Downstream:</Attribute>" +
                                                "<Value xsi:type=\"xsd:string\">0</Value>" +
                                             "</ParametersElectricos>" +
                                          "</ParametersFonosCabecera>" +
                                       "</ParametersFonos>" +
                                    "</Identification>" +
                                 "</Element>" +
                                "<Return xsi:type=\"tns:ReturnType\">" +
                                    "<Code xsi:type=\"xsd:string\">0</Code>" +
                                    "<Description xsi:nil=\"true\" xsi:type=\"xsd:string\"/>" +
                                "</Return>" +
                              "</Output>" +
                           "</ParaElectri>" +
                        "</Service>" +
                     "</ResponseParaElectri>" +
                  "</ns1:ParaElectriResponse>" +
               "</SOAP-ENV:Body>" +
            "</SOAP-ENV:Envelope>";
    
    public static String DCTRESOURCE = "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:SOAP-ENC=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:tns=\"urn:Demo\">" +
               "<SOAP-ENV:Body>" +
                  "<ns1:DCTInformaResponse xmlns:ns1=\"urn:Demo\">" +
                     "<ResponseDCTInforma xsi:type=\"tns:ResponseDCTInforma\">" +
                        "<Operation xsi:type=\"tns:OperationType\">" +
                           "<OperationCode xsi:type=\"xsd:string\">?</OperationCode>" +
                           "<OperationId xsi:type=\"xsd:string\">?</OperationId>" +
                           "<DateTime xsi:type=\"xsd:string\">?</DateTime>" +
                           "<IdUser xsi:type=\"xsd:string\">?</IdUser>" +
                           "<IMEI xsi:type=\"xsd:string\">?</IMEI>" +
                           "<IMSI xsi:type=\"xsd:string\">?</IMSI>" +
                        "</Operation>" +
                        "<Service xsi:type=\"tns:ServiceDCTInformaOut\">" +
                           "<DCTInforma xsi:type=\"tns:DCTInformaOut\">" +
                              "<Output xsi:type=\"tns:DCTInformaOutData\">" +
                                 "<Element xsi:type=\"tns:ElementTypeDCTInforma\">" +
                                    "<Identification xsi:type=\"tns:IdentificationType\">" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">TIPO DE NODO</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">CAJA</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">CALLE</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">JR CONDE DE SUPERUNDA 654</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">ALTURA</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">0</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">PAR DESDE</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">21</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">PAR HASTA</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">40</Value>" +
                                       "</Parameters>" +
                                    "</Identification>" +
            "<SubElement xsi:type=\"tns:SubElementType\">" +
            "<Id xsi:type=\"xsd:string\">0</Id>" +
            "<Type xsi:type=\"xsd:string\">PAR</Type>" +
            "<Head xsi:type=\"xsd:string\">1</Head>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">HEAD</Attribute>" +
            "<Value xsi:type=\"xsd:string\">PAR</Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">HEAD</Attribute>" +
            "<Value xsi:type=\"xsd:string\">TELEFONO</Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">HEAD</Attribute>" +
            "<Value xsi:type=\"xsd:string\">ESTADO</Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">HEAD</Attribute>" +
            "<Value xsi:type=\"xsd:string\"></Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">HEAD</Attribute>" +
            "<Value xsi:type=\"xsd:string\">ESTADO</Value>" +
            "</Parameters>" +
            "</SubElement>" +
            "<SubElement xsi:type=\"tns:SubElementType\">" +
            "<Id xsi:nil=\"true\" xsi:type=\"xsd:string\"/>" +
            "<Type xsi:type=\"xsd:string\">PAR2</Type>" +
            "<Head xsi:type=\"xsd:string\">0</Head>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">PAR</Attribute>" +
            "<Value xsi:type=\"xsd:string\">2,327</Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">TELEFONO</Attribute>" +
            "<Value xsi:type=\"xsd:string\"/>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">ESTADO</Attribute>" +
            "<Value xsi:type=\"xsd:string\">OCUPADO</Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\"></Attribute>" +
            "<Value xsi:type=\"xsd:string\"/>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">ESTADO</Attribute>" +
            "<Value xsi:type=\"xsd:string\">1</Value>" +
            "</Parameters>" +
            "</SubElement>" +
            "<SubElement xsi:type=\"tns:SubElementType\">" +
            "<Id xsi:nil=\"true\" xsi:type=\"xsd:string\"/>" +
            "<Type xsi:type=\"xsd:string\">PAR2</Type>" +
            "<Head xsi:type=\"xsd:string\">0</Head>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">PAR</Attribute>" +
            "<Value xsi:type=\"xsd:string\">2,328</Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">TELEFONO</Attribute>" +
            "<Value xsi:type=\"xsd:string\">00222011108</Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">ESTADO</Attribute>" +
            "<Value xsi:type=\"xsd:string\">OCUPADO</Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\"></Attribute>" +
            "<Value xsi:type=\"xsd:string\"/>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">ESTADO</Attribute>" +
            "<Value xsi:type=\"xsd:string\">2</Value>" +
            "</Parameters>" +
            "</SubElement>" +
            "<SubElement xsi:type=\"tns:SubElementType\">" +
            "<Id xsi:nil=\"true\" xsi:type=\"xsd:string\"/>" +
            "<Type xsi:type=\"xsd:string\">PAR2</Type>" +
            "<Head xsi:type=\"xsd:string\">0</Head>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">PAR</Attribute>" +
            "<Value xsi:type=\"xsd:string\">2,329</Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">TELEFONO</Attribute>" +
            "<Value xsi:type=\"xsd:string\"/>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">ESTADO</Attribute>" +
            "<Value xsi:type=\"xsd:string\">VACANTE</Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\"></Attribute>" +
            "<Value xsi:type=\"xsd:string\"/>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">ESTADO</Attribute>" +
            "<Value xsi:type=\"xsd:string\">1</Value>" +
            "</Parameters>" +
            "</SubElement>" +
            "<SubElement xsi:type=\"tns:SubElementType\">" +
            "<Id xsi:nil=\"true\" xsi:type=\"xsd:string\"/>" +
            "<Type xsi:type=\"xsd:string\">PAR2</Type>" +
            "<Head xsi:type=\"xsd:string\">0</Head>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">PAR</Attribute>" +
            "<Value xsi:type=\"xsd:string\">2,330</Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">TELEFONO</Attribute>" +
            "<Value xsi:type=\"xsd:string\">00222113863</Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">ESTADO</Attribute>" +
            "<Value xsi:type=\"xsd:string\">OCUPADO ADSL</Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\"></Attribute>" +
            "<Value xsi:type=\"xsd:string\"/>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">ESTADO</Attribute>" +
            "<Value xsi:type=\"xsd:string\">1</Value>" +
            "</Parameters>" +
            "</SubElement>" +
            "<SubElement xsi:type=\"tns:SubElementType\">" +
            "<Id xsi:nil=\"true\" xsi:type=\"xsd:string\"/>" +
            "<Type xsi:type=\"xsd:string\">PAR2</Type>" +
            "<Head xsi:type=\"xsd:string\">0</Head>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">PAR</Attribute>" +
            "<Value xsi:type=\"xsd:string\">2,331</Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">TELEFONO</Attribute>" +
            "<Value xsi:type=\"xsd:string\">00222112206</Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">ESTADO</Attribute>" +
            "<Value xsi:type=\"xsd:string\">OCUPADO ADSL</Value>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\"></Attribute>" +
            "<Value xsi:type=\"xsd:string\"/>" +
            "</Parameters>" +
            "<Parameters xsi:type=\"tns:ParametersType\">" +
            "<Attribute xsi:type=\"xsd:string\">ESTADO</Attribute>" +
            "<Value xsi:type=\"xsd:string\">1</Value>" +
            "</Parameters>" +
            "</SubElement>" +
                                 "</Element>" +
                                 "<Return xsi:type=\"tns:ReturnType\">" +
                                    "<Code xsi:type=\"xsd:string\">0</Code>" +
                                    "<Description xsi:nil=\"true\" xsi:type=\"xsd:string\"/>" +
                                 "</Return>" +
                              "</Output>" +
                           "</DCTInforma>" +
                        "</Service>" +
                     "</ResponseDCTInforma>" +
                  "</ns1:DCTInformaResponse>" +
               "</SOAP-ENV:Body>" +
            "</SOAP-ENV:Envelope>";

    public static String RESOURCE = "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:SOAP-ENC=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:tns=\"urn:Demo\">" +
               "<SOAP-ENV:Body>" +
                  "<ns1:ResourceResponse xmlns:ns1=\"urn:Demo\">" +
                     "<ResponseResource xsi:type=\"tns:ResponseResource\">" +
                        "<Operation xsi:type=\"tns:OperationType\">" +
                           "<OperationCode xsi:type=\"xsd:string\">?</OperationCode>" +
                           "<OperationId xsi:type=\"xsd:string\">?</OperationId>" +
                           "<DateTime xsi:type=\"xsd:string\">?</DateTime>" +
                           "<IdUser xsi:type=\"xsd:string\">?</IdUser>" +
                           "<IMEI xsi:type=\"xsd:string\">1</IMEI>" +
                           "<IMSI xsi:type=\"xsd:string\">1</IMSI>" +
                        "</Operation>" +
                        "<Service xsi:type=\"tns:ServiceResourceOut\">" +
                           "<Resource xsi:type=\"tns:ResourceOut\">" +
                              "<Output xsi:type=\"tns:ResourceOutData\">" +
                                 "<Element xsi:type=\"tns:ElementType\">" +
                                    "<Id xsi:type=\"xsd:string\"/>" +
                                    "<Type xsi:type=\"xsd:string\">DIRECCION</Type>" +
                                    "<Value xsi:type=\"xsd:string\">DATOS DEL CLIENTE</Value>" +
                                    "<Identification xsi:type=\"tns:IdentificationType\">" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">TITULAR</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">DANTE OMAR CAVERO NOLE</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">CALLE</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">CONDE SUPERUNDA</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">NUMERO</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">685</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">CODIGO POSTAL</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">LI01</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">COMUNA</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">LIMA</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">CIUDAD</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">LIMA</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">TIPO CLIENTE</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">Natural</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">TIPO LINEA</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">RESIDENCIAL</Value>" +
                                       "</Parameters>" +
                                    "</Identification>" +
                                 "</Element>" +
                                 "<Element xsi:type=\"tns:ElementType\">" +
                                    "<Id xsi:type=\"xsd:string\"/>" +
                                    "<Type xsi:type=\"xsd:string\">PRODUCTOS</Type>" +
                                    "<Value xsi:type=\"xsd:string\">PRODUCTOS Y SERVICIOS</Value>" +
                                    "<Identification xsi:type=\"tns:IdentificationType\">" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">Cantidad de ps</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">14</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">9019</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">IDENTIFICADOR DE LLAMADA</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">9035</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">MEMOVOX</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">9781</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">MODEM ADSL ROUTER</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">16368</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">CONCURSO PROMOCIONES CPSA</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">16732</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">SIN OPERADOR DE LD</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">18975</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">Q49 PLAN SEMIPLANA LIBRE 500</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">19019</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">INSTALACION EQUIPO POST MODEM</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">19259</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">VENTA EQUIPO POST MODEM ROUTER</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">20041</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">EQUIPO INALÁMBRICO AMPER</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">21203</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">MOVISTAR SPEEDY 4M ADSL</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">21207</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">PAQ DUO SEMIPLANO 4M</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">21477</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">RECIBO ENVIADO SOLO A CORREO ELECTR�?NICO</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">22659</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">CONSENTIMIENTO USO INFORMACION TOTAL</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">22726</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">AJUSTE POR FIDELIZACION S/5 ILIMITADO</Value>" +
                                       "</Parameters>" +
                                    "</Identification>" +
                                 "</Element>" +
                                 "<Element xsi:type=\"tns:ElementType\">" +
                                    "<Id xsi:type=\"xsd:string\"/>" +
                                    "<Type xsi:type=\"xsd:string\">PLANTA INTERNA</Type>" +
                                    "<Value xsi:type=\"xsd:string\">PLANTA INTERNA</Value>" +
                                    "<Identification xsi:type=\"tns:IdentificationType\">" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">PLANTA</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">WASH</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">AGREGADOR</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">LIM_WASAG6_HME60X8</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">IP AGREGADOR</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">10.115.0.46</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">DSLAM</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">ISAM 7300</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">IP DSLAM</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">10.227.104.117</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">RACK / SHELF / SLOT / PORT</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">1 / 1 / 3 / 40</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">TIPO PUERTO</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">ADSL2+</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">MDF STB</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">Sin informacion.</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">MDF ADSL</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">Sin informacion.</Value>" +
                                       "</Parameters>" +
                                    "</Identification>" +
                                 "</Element>" +
                                 "<Element xsi:type=\"tns:ElementType\">" +
                                    "<Id xsi:type=\"xsd:string\"/>" +
                                    "<Type xsi:type=\"xsd:string\">PLANTA EXTERNA</Type>" +
                                    "<Value xsi:type=\"xsd:string\">PLANTA EXTERNA</Value>" +
                                    "<Gps xsi:type=\"tns:GPSType\">" +
                                       "<Lat xsi:type=\"xsd:string\"/>" +
                                       "<Lng xsi:type=\"xsd:string\"/>" +
                                    "</Gps>" +
                                    "<Identification xsi:type=\"tns:IdentificationType\">" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">PLANTA</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">WA</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">CABLE</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">WA06</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">PAR PRIMARIO</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">36</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">ARMARIO</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">A138</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">CALLE</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">JR CONDE DE SUPERUNDA 654</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">ARMARIO DESDE-HASTA</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">21-40</Value>" +
                                       "</Parameters>" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">PAR SECUNDARIO</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">23</Value>" +
                                       "</Parameters>" +
                                    "</Identification>" +
                                 "</Element>" +
                                 "<Element xsi:type=\"tns:ElementType\">" +
                                    "<Id xsi:type=\"xsd:string\"/>" +
                                    "<Type xsi:type=\"xsd:string\">CAJA</Type>" +
                                    "<Value xsi:type=\"xsd:string\">DCT</Value>" +
                                 "</Element>" +
                                 "<Element xsi:type=\"tns:ElementType\">" +
                                    "<Id xsi:type=\"xsd:string\"/>" +
                                    "<Type xsi:type=\"xsd:string\">FAMILYSERVICE</Type>" +
                                    "<Value xsi:type=\"xsd:string\">SERVICIO TELEFONIA</Value>" +
                                    "<Identification xsi:type=\"tns:IdentificationType\">" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">TELEFONO</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">1 3326026</Value>" +
                                       "</Parameters>" +
                                    "</Identification>" +
                                 "</Element>" +
                                 "<Element xsi:type=\"tns:ElementType\">" +
                                    "<Id xsi:type=\"xsd:string\"/>" +
                                    "<Type xsi:type=\"xsd:string\">FAMILYSERVICE</Type>" +
                                    "<Value xsi:type=\"xsd:string\">SERVICIO BANDA ANCHA</Value>" +
                                    "<Identification xsi:type=\"tns:IdentificationType\">" +
                                       "<Parameters xsi:type=\"tns:ParametersType\">" +
                                          "<Attribute xsi:type=\"xsd:string\">MODEM</Attribute>" +
                                          "<Value xsi:type=\"xsd:string\">MODEMNO NO IDENTIFICADO</Value>" +
                                       "</Parameters>" +
                                    "</Identification>" +
                                 "</Element>" +
                                 "<Return xsi:type=\"tns:ReturnType\">" +
                                    "<Code xsi:type=\"xsd:string\">0</Code>" +
                                    "<Description xsi:type=\"xsd:string\">aaaaaaaaaaaa</Description>" +
                                 "</Return>" +
                              "</Output>" +
                           "</Resource>" +
                        "</Service>" +
                     "</ResponseResource>" +
                  "</ns1:ResourceResponse>" +
               "</SOAP-ENV:Body>" +
            "</SOAP-ENV:Envelope>";
}
