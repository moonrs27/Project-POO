/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_tvdemo;

/**
 *
 * @author alanm
 */
public class App extends Thread{
    private String nombreApp;
    private boolean Estado;

    public String getNombreApp() {
        return nombreApp;
    }

    public void setNombreApp(String nombreApp) {
        this.nombreApp = nombreApp;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    public void Abrir(){
        
        System.out.println("Llego a las APPs");
        /*AppStreaming Stream = new AppStreaming();
        AppMusica Music = new AppMusica();
        
        if(this.Estado == false && this.nombreApp == "Stream"){
         Stream.start();
       }else{
         Music.start();
         
        
        } */  
        
    }
    
    
}
