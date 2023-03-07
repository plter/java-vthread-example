package com.plter.examples.vthread;

public class Main {
    public static void main(String[] args) {
        try {
            Thread.ofVirtual().start(() -> System.out.println("vThread OK")).join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
