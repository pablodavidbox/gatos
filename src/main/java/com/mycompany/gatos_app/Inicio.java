/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gatos_app;

import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Inicio {
    
    
    public static void main(String[] args ){
    
        
       int opcion_menu = -1;
       String[] botones = {"1. Ver gatos", "2.SALIR"}; 
       
       do{
       
           String opcion;
           opcion = ( String )JOptionPane.showInputDialog(null,"Gatitos Java", "Menu Principal", JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
       
           for(int i=0; i < botones.length; i++ ){
                       if (opcion.equals(botones[i])){
                            opcion_menu = i; 
                       } 
           } 
           
           switch(opcion_menu){
               case 0: 
                   GatosService.verGatos();
                   break;
               default: 
                   break;
                   
           } 
       
       
       }while( opcion_menu !=1 );
        
    
    }


}
