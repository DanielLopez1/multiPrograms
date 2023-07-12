/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
/**
 *
 * @author efrai
 */
public class ApiRest {
       
    public static double transformaMoneda(String monedaUno, String monedaDos, double monto){
        double monedaConvertida = 0.0;
         try {
                 // Paso 1: Crear una URL de conexión
            String apiKey = "apiKey";
             String apiUrl = "https://anyapi.io/api/v1/exchange/convert?";
//            String data1 = ";
//            String data2 = "MXN";
//            double data3 = 10;
            
            String encodedData1 = URLEncoder.encode(monedaUno, "UTF-8");
            String encodedData2 = URLEncoder.encode(monedaDos, "UTF-8");

            
            String urlString = apiUrl + "base=" + encodedData1 + "&to=" +encodedData2+ "&amount="+ monto + "&" + apiKey;
            URL url = new URL(urlString);


           // Paso 2: Abrir una conexión HTTP
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            
            // Paso 3: Establecer propiedades de la conexión
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            con.setConnectTimeout(5000);

            // Paso 4: Leer la respuesta de la API
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Paso 5: Procesar la respuesta
             String jsonResponse = response.toString();
            String[] parts = jsonResponse.split(",");
            System.out.println(jsonResponse);
            System.out.println(parts[3]);
//            int tamano = parts[3].length();
//             System.out.println(tamano);
            String cifra = parts[3].substring(12);
            System.out.println(cifra);
            monedaConvertida = Double.parseDouble(cifra);
            // Paso 6: Cerrar la conexión
            con.disconnect();
             return monedaConvertida;
        } catch (IOException e) {
            e.printStackTrace();
        }
         
            return monedaConvertida;
           
    }
}
