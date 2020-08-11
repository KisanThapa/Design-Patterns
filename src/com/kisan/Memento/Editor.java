package com.kisan.Memento;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private String content;
    private List<String> history = new ArrayList<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        history.add(this.content);
        this.content = content;
    }

    public void undo() {
        if (history.size() >= 1) {
            content = history.get(history.size() - 1);
            history.remove(history.size() - 1);
        }
    }
}
