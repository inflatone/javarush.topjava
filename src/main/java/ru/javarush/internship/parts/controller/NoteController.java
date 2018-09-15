package ru.javarush.internship.parts.controller;

import ru.javarush.internship.parts.entity.Note;
import ru.javarush.internship.parts.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class NoteController {

    private NoteService service;
    private String sortDateMethod = "ASC";

    @Autowired
    public void setNoteService(NoteService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String list(Model model) {
        List<Note> notebook = filterAndSort();
        model.addAttribute("notes", notebook);
        model.addAttribute("sort", this.sortDateMethod);
        return "index";
    }

    @GetMapping("/sort/{sortDate}")
    public String sortChoose(@PathVariable String sortDate) {
        this.sortDateMethod = sortDate;
        return "redirect:/";
    }

    @GetMapping("/new")
    public String newNote() {
        return "operations/new";
    }

    @PostMapping("/save")
    public String updateNote(@RequestParam String message) {
        this.service.saveNote(new Note(message));
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(
            @PathVariable Integer id,
            Model model
    ) {
        Note note = this.service.getNoteById(id);
        model.addAttribute("note", note);
        return "operations/edit";
    }

    @PostMapping("/update")
    public String saveNote(
            @RequestParam Integer id,
            @RequestParam String message,
            @RequestParam(value = "done", required = false) boolean done
    ) {
        this.service.updateNote(id, message,done);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        this.service.deleteNote(id);
        return "redirect:/";
    }

    private List<Note> filterAndSort() {
        List<Note> notebook = null;
        switch (this.sortDateMethod) {
            case "ASC":  {
                notebook = this.service.findAllByOrderByDateAsc();
                break;
            }
            case "DESC": {
                notebook = this.service.findAllByOrderByDateDesc();
                break;
            }
        }
        return notebook;
    }
}
