package com.kisan.Memento.MultipleAttribute;

import java.util.List;
import java.util.ArrayList;

public class DocumentHistory {
    private List<DocumentState> states = new ArrayList<>();

    public void push(DocumentState state) {
        states.add(state);
    }

    public DocumentState pop() {
        for (var item : states)
            System.out.println(item);
        var lastIndex = states.size() - 1;
        return states.get(lastIndex);
    }

}
