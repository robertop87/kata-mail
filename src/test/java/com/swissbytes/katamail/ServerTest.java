package com.swissbytes.katamail;

/**
 * Created by UTEPSA on 4/6/2016.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class ServerTest {

    @Test
    public void testAceptarUnaConexion() {
        MailServer server = new MailServer();
        boolean aceptado = server.aceptarConexion("thunderbird");
        assertTrue(aceptado);
    }

    @Test
    public void testDenegarUnaConexionYaRealizada() {
        MailServer server = new MailServer();
        server.aceptarConexion("thunderbird");
        boolean aceptado = server.aceptarConexion("thunderbird");
        assertFalse(aceptado);
    }

    @Test
    public void testVerificarEstadoDeConexionDelCliente(){
        MailServer server = new MailServer();
        server.aceptarConexion("thunderbird");
        boolean conectado = server.estaConectado("thunderbird");
        assertTrue(conectado);

    }

    @Test
    public void testVerificarEstadoDeConexionDelClienteNoConectado(){
        MailServer server = new MailServer();

        boolean noconectado = server.estaConectado("thunderbird");
        assertFalse(noconectado);

    }

    @Test
    public void testDenegarConexionAclienteSinNombre() {
        MailServer server = new MailServer();
        boolean aceptado = server.aceptarConexion("");
        assertFalse(aceptado);
    }

    @Test
    public void testDenegarConexionAclientesConEspaciosVacios() {
        MailServer server = new MailServer();
        boolean aceptado = server.aceptarConexion("     ");
        assertFalse(aceptado);
    }

    @Test
    public void testDenegarUnaConexionYaRealizadaConMayuscula() {
        MailServer server = new MailServer();
        server.aceptarConexion("Thunderbird");
        boolean aceptado = server.aceptarConexion("thunderbird");
        assertFalse(aceptado);
    }

    @Test
    public void testCantidadDeClientesConectadosigualcero()
    {

        MailServer server = new MailServer();
        int conectado = server.cantidadConectados();
        assertEquals(0, conectado);
    }

    @Test
    public void testCantidadDeConectadosConUnClienteRegistrado()
    {

        MailServer server = new MailServer();
        server.aceptarConexion("Thunderbird");
        int conectado = server.cantidadConectados();
        assertEquals(1, conectado);
    }
}
