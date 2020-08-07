package com.kisan.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();

        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);

        var chart1 = new Chart(dataSource);

        dataSource.addObservers(sheet1);
        dataSource.addObservers(sheet2);
        dataSource.addObservers(chart1);

        dataSource.setValue(5);
    }
}
