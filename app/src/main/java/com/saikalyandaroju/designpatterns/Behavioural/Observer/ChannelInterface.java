package com.saikalyandaroju.designpatterns.Behavioural.Observer;

public interface ChannelInterface {

    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void uploadVideo(String title,Channel channel);
    void notifySubscribers(String title,Channel channel);
}

