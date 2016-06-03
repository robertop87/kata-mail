package com.swissbytes.katamail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by team on 3/6/2016.
 */
public class MailServer {

    private List userList;

    public MailServer(){
        userList = new ArrayList<String>();
    }

    public boolean isAvailable() {
        return true;
    }

    public boolean register(String client) {
        if (isRegistered(client)) return false;
        this.userList.add(client);
        return true;
    }

    public boolean registerMessage(String to, String from, String message) {
        return (isRegistered(to) && isRegistered(from));
    }

    private boolean isRegistered(String client) {
        return this.userList.contains(client);
    }
}
