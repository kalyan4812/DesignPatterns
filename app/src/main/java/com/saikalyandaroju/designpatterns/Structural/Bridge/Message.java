package com.saikalyandaroju.designpatterns.Structural.Bridge;

public abstract class Message {

    protected  MessageSender messsageSender;
    abstract public void sendMessage(String message);
}
