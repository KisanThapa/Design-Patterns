package com.kisan.BehavioralDesignPatterns.ObserverPattern;

public class SpreadSheet implements Observer {

    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Spreadsheet got: " + dataSource.getValue() + " and notified...");
    }
}
