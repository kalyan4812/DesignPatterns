package com.saikalyandaroju.designpatterns.Structural.Bridge;

public class LongMessage extends Message {


    public LongMessage(MessageSender messageSender){
        super.messsageSender=messageSender;
    }

    @Override
    public void sendMessage(String message) {
          messsageSender.sendMessage(message);
    }
}
