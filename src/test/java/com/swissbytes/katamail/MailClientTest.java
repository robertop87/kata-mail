package com.swissbytes.katamail;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by team on 3/6/2016.
 */
public class MailClientTest {

    @Test
    public void testSendMessage(){
        MailServer server = new MailServer();
        MailClient client = new MailClient();
        assertTrue(client.sendMail("miguel@coding.dojo", "eliana@coding.dojo", "Message", server));
    }

//    @Test
//    public void testReceiveMessage() {
//        MailServer server = new MailServer();
//        MailClient client = new MailClient();
//        server.register("miguel@coding.dojo");
//        server.register("eliana@coding.dojo");
//
//        client.sendMail("miguel@coding.dojo", "eliana@coding.dojo", "Message", server);
//        List messages = client.receiveMessages(server);
//        assertEquals(1, messages.size());
//    }


    @Test
    public void testReceiveMessage() {
        MailServer server = new MailServer();
        MailClient client = new MailClient();
        List messages = client.receiveMessages(server);
        assertEquals(0, messages.size());
    }
}
