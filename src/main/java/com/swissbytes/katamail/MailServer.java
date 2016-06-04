package com.swissbytes.katamail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UTEPSA on 4/6/2016.
 */
public class MailServer {

    private List clientes = new ArrayList<String>();

    public boolean aceptarConexion(String nombreCliente) {
        nombreCliente = normalizarNombre(nombreCliente);
        if (nombreCliente.isEmpty() ||
                estaConectado(nombreCliente))
            return false;

        clientes.add(nombreCliente);
        return true;
    }

    public boolean estaConectado(String nombreCliente) {
        nombreCliente = normalizarNombre(nombreCliente);
        return clientes.contains(nombreCliente);
    }

    public int cantidadConectados() {
        return clientes.size();
    }

    private String normalizarNombre(String nombre) {
        nombre = nombre.trim();
        nombre = nombre.toUpperCase();
        return nombre;
    }
}
