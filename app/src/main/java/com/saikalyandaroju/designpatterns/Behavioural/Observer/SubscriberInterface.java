package com.saikalyandaroju.designpatterns.Behavioural.Observer;

import androidx.core.app.NotificationChannelCompat;

public interface SubscriberInterface {
    void subscribe(Channel channel);
    void unSubscribe(Channel channel);
    void getNotifications(String title, Channel channel);

}
