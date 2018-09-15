package ru.javarush.internship.parts.repository;

import ru.javarush.internship.parts.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Integer>{
    List<Note> findAllByOrderByDateAsc();
    List<Note> findAllByOrderByDateDesc();
}
