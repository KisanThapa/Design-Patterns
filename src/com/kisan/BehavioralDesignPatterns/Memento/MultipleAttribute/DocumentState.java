package com.kisan.BehavioralDesignPatterns.Memento.MultipleAttribute;

public class DocumentState {

    private String content;
    private String fontName;
    private int fontSize;

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    @Override
    public String toString() {
        return "DocumentState{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
