package com.swissbytes.katamail;

/**
 * Created by UTEPSA on 4/6/2016.
 */
public class MailClient {
    private String nombre;
    public MailClient(String nombre) {
       this.nombre = nombre;
    }
    public MailClient() {
        this.nombre = "Prueba";
    }
    public boolean ConectarA(MailServer server) {
        return server.aceptarConexion(nombre);
    }
}
