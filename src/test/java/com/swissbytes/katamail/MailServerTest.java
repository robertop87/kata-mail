package com.swissbytes.katamail;

/**
 * Created by team on 3/6/2016.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class MailServerTest {

    @Test
    public void testCheckAvailability() {
        MailServer server = new MailServer();
        assertTrue(server.isAvailable());
    }

    @Test
    public void testSuccessfulRegistration() {
        MailServer server = new MailServer();
        assertTrue(server.register("miguel@coding.dojo"));
    }

    @Test
    public void testFailRegisterForDuplicateUser(){
        MailServer server = new MailServer();
        server.register("miguel@coding.dojo");
        assertFalse(server.register("miguel@coding.dojo"));
    }

    @Test
    public void testRegisterMessage(){
        MailServer server = new MailServer();
        server.register("miguel@coding.dojo");
        server.register("eliana@coding.dojo");
        assertTrue(server.registerMessage("miguel@coding.dojo","eliana@coding.dojo","Message"));
    }

    @Test
    public void testRegisterMailForNonExistingUser() {
        MailServer server = new MailServer();
        assertFalse(server.registerMessage("fake", "me", "Nothing"));
    }
}
