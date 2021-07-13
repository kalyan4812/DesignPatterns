package com.saikalyandaroju.designpatterns.Behavioural.Observer;

public class ObserverMain {
    public static void main(String[] args) {
        Channel achannel=new Channel("Android Channel");
        Subscriber subscriber1=new Subscriber("Kalyan");
        Subscriber subscriber2=new Subscriber("Goutham");

        subscriber1.subscribe(achannel);
        subscriber2.subscribe(achannel);

        achannel.uploadVideo("VIDEO ON MVVM PATTERN",achannel);

        subscriber2.unSubscribe(achannel);

        achannel.uploadVideo("VIDEO ON DESIGN PATTERN",achannel);

        Channel channel2=new Channel("DSA CHANNEL");
        subscriber1.subscribe(channel2);
        subscriber2.subscribe(channel2);

        channel2.uploadVideo("Video on Linked List",channel2);


    }
}
