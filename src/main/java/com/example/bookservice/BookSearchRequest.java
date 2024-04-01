package com.example.bookservice;

public class BookSearchRequest {

    private String startsWith;
    private String endsWith;
    private String contains;

    public BookSearchRequest(String startsWith, String endsWith, String contains) {
        this.startsWith = startsWith;
        this.endsWith = endsWith;
        this.contains = contains;
    }

    public String getStartsWith() {
        return startsWith;
    }

    public String getEndsWith() {
        return endsWith;
    }

    public String getContains() {
        return contains;
    }
}
