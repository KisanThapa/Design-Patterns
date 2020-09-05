package com.kisan.BehavioralDesignPatterns.Memento.MultipleAttribute;

public class Document {

    private String content;
    private String fontName;
    private int fontSize;

    public DocumentState createState() {
        return new DocumentState();
    }

    public void restoreContent(DocumentState state) {
        content = state.getContent();
    }

    public void restoreFontName(DocumentState state) {
        fontName = state.getFontName();
    }

    public void restoreFontSize(DocumentState state) {
        fontSize = state.getFontSize();
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
