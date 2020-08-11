package com.kisan.Iterator;


public class ListIterator implements Iterator {

    private BrowseHistory history;
    private int index;

    public ListIterator(BrowseHistory history) {
        this.history = history;
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public String current() {
        return history.getUrls().get(index);
    }

    @Override
    public boolean hasNext() {
        return index < history.getUrls().size();
    }
}
