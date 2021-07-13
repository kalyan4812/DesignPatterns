package com.saikalyandaroju.designpatterns.Structural.Composite;

public class CompositeMain {
    public static void main(String[] args) {
        Component hdd = new Leaf("Hard Drive", 4000);
        Component mouse = new Leaf("Mouse", 500);
        Component ram = new Leaf("RAM", 3000);
        Component cpu = new Leaf("CPU", 9000);
        Component keyboard = new Leaf("KeyBoard", 800);

        Composite pheripheral = new Composite("Pheripheral");
        Composite motherboard = new Composite("MotherBoard");
        Composite cabinet = new Composite("Cabinet");
        Composite computer = new Composite("Computer");

        pheripheral.addComponent(mouse);
        pheripheral.addComponent(keyboard);

        motherboard.addComponent(ram);
        motherboard.addComponent(cpu);

        cabinet.addComponent(hdd);
        cabinet.addComponent(motherboard);

        computer.addComponent(cabinet);
        computer.addComponent(pheripheral);

        computer.showPrice();
    }
}
