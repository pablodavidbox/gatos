/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gatos_app;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;

/**
 *
 * @author pablo
 */
public class GatosService {
    
    public static void verGatos() throws IOException{
       // Vamos a traer los datos de la API
       
           OkHttpClient client = new OkHttpClient().newBuilder().build();
       
            Request request = new Request.Builder().url("https://api.thecatapi.com/v1/images/search")
              .method("GET", null)
              .build();
            
            Response response = client.newCall(request).execute();
            
            String elJson = response.body().string();
            
            // Cortar los cochetes 
            elJson = elJson.substring(1,elJson.length());
            elJson = elJson.substring(0,elJson.length()-1); 
            
            
            // Crear un objeto de la clase Gson 
            
            Gson gson = new Gson;
            
            Gatos gatos = gson.fromJson(elJson, Gatos.class);
            
            
            // Redimencionar la imagen para que no sea tan grande 
            
            Image image = null;
            try{
            
                URL url = new URL(gatos.getUrl());
                image = ImageIO.read(url);
            
            }catch{
            
            }
            
            
            
    
    }
    
}
