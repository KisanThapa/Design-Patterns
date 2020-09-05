package com.kisan.BehavioralDesignPatterns.Memento.MultipleAttribute;

public class Main {
    public static void main(String[] args) {
        var history = new DocumentHistory();
        var document = new Document();

        // First document
        document.setContent("Content 1");
        document.setFontName("Arial 1");
        document.setFontSize(12);
        history.push(document.createState());

        // Second document
        document.setContent("Content 2");
        document.setFontName("Arial 2");
        document.setFontSize(14);
        history.push(document.createState());

        // Lets undo
        document.restoreContent(history.pop());
//        document.restoreFontName(history.pop());

        System.out.println(document);
    }
}
