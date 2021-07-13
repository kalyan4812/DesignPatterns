package com.saikalyandaroju.designpatterns.Behavioural.Observer;

public class Subscriber implements SubscriberInterface {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Channel channel) {
        channel.addSubscriber(this);
    }

    @Override
    public void unSubscribe(Channel channel) {
        channel.removeSubscriber(this);
    }

    @Override
    public void getNotifications(String title,Channel channel) {
        System.out.println("hi "+name+" video is uploaed by "+channel.name +"on "+title);
    }
}
