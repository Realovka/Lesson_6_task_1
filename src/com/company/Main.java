package com.company;


public class Main {

    public static void main(String[] args) {
        Computer computer1=new Computer("Intel Core 10", "HyperX Predator 2x8GB", "SSD Kingston A400 240Gb",40000);
        computer1.description();
        computer1.turnOnComputer();
        computer1.turnOffComputer();
        computer1.lifeCycleExcess();

    }
}
