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
        MailServer Server = new MailServer();
        MailClient Cliente= new MailClient();
        boolean Conectado = Cliente.ConectarA(Server);
        assertTrue(Conectado);
    }

    @Test
    public void testconectarDosVecesAunServidor(){
        MailServer Server = new MailServer();
        MailClient Cliente= new MailClient();
        Cliente.ConectarA(Server);
        assertFalse(Cliente.ConectarA(Server));
    }

    @Test
    public void testconectarDosClientesAunServidor(){
        MailServer Server = new MailServer();
        MailClient Cliente1= new MailClient("thunderbird");
        MailClient Cliente2= new MailClient("evolution");
        boolean conectado1=Cliente1.ConectarA(Server);
        boolean conectado2=Cliente2.ConectarA(Server);
        assertTrue(conectado1);
        assertTrue(conectado2);
    }







}
