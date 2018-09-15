package ru.javarush.internship.parts.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "test", schema = "test")
public class Note {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "message")
    private String message;
    @Column(name = "date")
    private Date date;
    @Column(name = "done")
    private boolean done;

    public Note() {
    }

    public Note(String message) {
        this.message = message;
        this.date = new Date();
        this.done = false;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
