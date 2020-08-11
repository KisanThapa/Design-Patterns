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

        // Undo
        editor.restoreState(history.pop());
        editor.restoreState(history.pop());

        System.out.println(editor.getContent());
    }
}
