package com.saikalyandaroju.designpatterns.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements ChannelInterface {


    String name;

    public Channel(String name) {
        this.name = name;
    }

    List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void uploadVideo(String title,Channel channel) {
        notifySubscribers(title,channel);
    }

    @Override
    public void notifySubscribers(String title,Channel channel) {
        for (Subscriber subscriber : subscribers) {
            subscriber.getNotifications(title,channel);
        }
    }
}
