package uach.arquitectura.segaapp.servicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by ezubia on 25/05/15.
 */
public class ReadJSON {

    //Direccion ip de la computadora que es el servidor en ese momento
    public static String ip ="http://192.168.1.67:9000/login";

    /**
     * Metodo que 
     * @param in
     * @return
     */
    private static String readJSON(InputStream in) {
        String line = "";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(in));
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return line;
    }

    public static String leerJSON(String ruta) {
        String json = "";
        try {
            URL url = new URL(ip+ruta);
            System.out.println(url);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            json = readJSON(con.getInputStream()).toString();
        } catch (Exception e) {
            json = "null";
        }
        return json;
    }
}
