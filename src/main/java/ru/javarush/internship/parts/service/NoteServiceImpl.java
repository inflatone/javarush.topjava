package ru.javarush.internship.parts.service;

import ru.javarush.internship.parts.repository.NoteRepository;
import ru.javarush.internship.parts.entity.Note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    private NoteRepository repository;

    @Autowired
    public void setNoteRepository(NoteRepository repository) {
        this.repository = repository;
    }

    @Override
    public Note getNoteById(Integer id) {
        return this.repository.getOne(id);
    }

    @Override
    public void saveNote(Note note) {
        this.repository.save(note);

    }

    @Override
    public void updateNote(Integer id, String message, boolean done) {
        Note updated = this.repository.getOne(id);
        updated.setDone(done);
        updated.setMessage(message);
        this.repository.save(updated);
    }

    @Override
    public void deleteNote(Integer id) {
        this.repository.deleteById(id);
    }

    @Override
    public List<Note> findAllByOrderByDateAsc() {
        return this.repository.findAllByOrderByDateAsc();
    }

    @Override
    public List<Note> findAllByOrderByDateDesc() {
        return this.repository.findAllByOrderByDateDesc();
    }
}
