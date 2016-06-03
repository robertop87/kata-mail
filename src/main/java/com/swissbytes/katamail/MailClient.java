package com.swissbytes.katamail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by team on 3/6/2016.
 */
public class MailClient {
    public boolean sendMail(String to, String from, String content, MailServer server) {
        return true;
    }

    public List receiveMessages(MailServer server) {
        return new ArrayList();
    }
}
