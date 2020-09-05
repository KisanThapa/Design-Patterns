package com.kisan.BehavioralDesignPatterns.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private List<String> urls = new ArrayList<>();

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {

        return "";
    }

    public List<String> getUrls() {
        return urls;
    }
}
