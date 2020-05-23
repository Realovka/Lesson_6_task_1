package com.company;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private String ram;
    private String hdd;
    private int resource;

    public Computer(String cpu, String ram, String hdd, int resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    void description(){
        System.out.println(cpu+" "+ram+" "+hdd+" "+resource);
    }

    void turnOnComputer(){
        Random random=new Random();
        int x=random.nextInt(1);
        System.out.println("Введите 0 или 1");
        Scanner scanner=new Scanner(System.in);
        int y=scanner.nextInt();
        if (x==y){
            turnOffComputer();
        }
        else {
            System.out.println("Комп сгорел");
        }
    }

    void turnOffComputer() {
        Random random = new Random();
        int a = random.nextInt(1);
        System.out.println("Введите 0 или 1");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        if (a == y) {
            turnOnComputer();
        } else {
            System.out.println("Комп сгорел");
        }
    }

        void lifeCycleExcess(){
          System.out.println("Введите количество отработанных жизненных циклов");
          Scanner scanner1=new Scanner(System.in);
          int x=scanner1.nextInt();
          if (x>resource) {
              System.out.println("Комп сгорел");
          }
              else {
              System.out.println("Комп работает");
          }
        }
    }

