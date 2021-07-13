package com.saikalyandaroju.designpatterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void showPrice() {

        System.out.println(name);
        for (Component component : components) {
            component.showPrice();            // recusrive call.
        }

    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

}
