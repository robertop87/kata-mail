package com.swissbytes.katamail;

/**
 * Created by UTEPSA on 4/6/2016.
 */
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class ClientTest {

    @Test
    public void testConectarAunServidor(){
        MailServer servidor = new MailServer();
        MailClient cliente = new MailClient();
        assertTrue(cliente.conectarA(servidor));
    }

    @Test
    public void testconectarDosVecesAunServidor(){
        MailServer server = new MailServer();
        MailClient cliente= new MailClient();
        cliente.conectarA(server);
        assertFalse(cliente.conectarA(server));
    }

    @Test
    public void testConectarDosClientesAunServidor(){
        MailServer server = new MailServer();

        MailClient thunderbird= new MailClient("thunderbird");
        MailClient evolution= new MailClient("evolution");

        assertTrue(thunderbird.conectarA(server));
        assertTrue(evolution.conectarA(server));
    }
}
