package com.swissbytes.katamail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UTEPSA on 4/6/2016.
 */
public class MailServer {

    private List clientes = new ArrayList<String>();

    public boolean aceptarConexion(String nombreCliente) {
        nombreCliente = nombreCliente.trim();
        nombreCliente = nombreCliente.toUpperCase();
        if(nombreCliente.isEmpty() ||
                clientes.contains(nombreCliente))
            return false;
        clientes.add(nombreCliente);
        return true;
    }

    public boolean estaConectado(String nombreCliente) {
        nombreCliente = nombreCliente.trim();
        nombreCliente = nombreCliente.toUpperCase();
        if(!nombreCliente.isEmpty() &&
                clientes.contains(nombreCliente)  )
            return true;
        return false;
    }

    public int cantidadConectados() {
        return clientes.size();
    }
}
