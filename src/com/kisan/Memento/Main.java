package com.kisan.Memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        editor.setContent("first");
        editor.setContent("second");
        editor.setContent("third");
        editor.setContent("fourth");
        editor.setContent("fifth");

        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();

        System.out.println(editor.getContent());
    }
}
