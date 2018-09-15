package ru.javarush.internship.parts.service;

import ru.javarush.internship.parts.entity.Note;

import java.util.List;

public interface NoteService {
    Note getNoteById(Integer id);
    void saveNote(Note note);
    void updateNote(Integer id, String message, boolean done);
    void deleteNote(Integer id);

    List<Note> findAllByOrderByDateAsc();
    List<Note> findAllByOrderByDateDesc();

}
