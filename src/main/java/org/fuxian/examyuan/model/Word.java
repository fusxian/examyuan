package org.fuxian.examyuan.model;

import java.sql.Timestamp;

public class Word {
    private int id;
    private String value;
    private Timestamp date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Word() {
    }

    public Word(int id, String value, Timestamp date) {
        this.id = id;
        this.value = value;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", date=" + date +
                '}';
    }
}
