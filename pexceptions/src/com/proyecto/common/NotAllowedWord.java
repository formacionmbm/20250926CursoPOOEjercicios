package com.proyecto.common;

public enum NotAllowedWord {
    DROP("drop"),
    TRUNCATE("truncate"),
    DELETE("delete"),
    SELECT("select"),
    INSERT("insert"),
    UPDATE("update");

    private final String word;

    NotAllowedWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }

}
