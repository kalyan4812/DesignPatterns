package com.saikalyandaroju.designpatterns.Structural.Bridge;

public class BridgeMain  {
    public static void main(String[] args) {
        Message message=new LongMessage(new EmailMessageSender());
        message.sendMessage("HELLO how are you....");

        Message message1=new ShortMessage(new SmsMessageSender());
        message1.sendMessage("Hey");

    }
}
