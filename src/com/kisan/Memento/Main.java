package com.kisan.Memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("first");
        history.push(editor.createState());

        editor.setContent("second");
        history.push(editor.createState());

        editor.setContent("third");
        history.push(editor.createState());

        editor.setContent("fourth");
        history.push(editor.createState());

        editor.restoreState(history.pop()); // Undo
        editor.restoreState(history.pop()); // Undo
        editor.restoreState(history.pop()); // Undo

        System.out.println(editor.getContent());
    }
}
