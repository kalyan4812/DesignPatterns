package com.saikalyandaroju.designpatterns.Structural.Bridge;

public class SmsMessageSender implements MessageSender{
    @Override
    public void sendMessage(String s) {
        System.out.println(s+" sent using SMS");
    }
}
