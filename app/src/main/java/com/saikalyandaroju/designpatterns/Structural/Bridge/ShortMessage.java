package com.saikalyandaroju.designpatterns.Structural.Bridge;

public class ShortMessage extends Message {


    public ShortMessage(MessageSender messageSender) {
        super.messsageSender = messageSender;
    }

    @Override
    public void sendMessage(String message) {
        if (message.length() <= 5)
            messsageSender.sendMessage(message);
        else
            System.out.println("Can't send...");
    }
}
