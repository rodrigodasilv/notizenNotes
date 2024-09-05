package com.notizen.notizennotes.controller;

import com.notizen.notizennotes.model.Note;
import com.notizen.notizennotes.repository.NoteRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/notes")
public class NoteController {
    private final NoteRepository noteRepository;
    @PostMapping
    public Note addNote(@RequestBody Note note) {
        return noteRepository.save(note);
    }

    @GetMapping("/{id}")
    public Optional<Note> getNote(@PathVariable Integer id) {
        return noteRepository.findById(id);
    }
    @GetMapping
    public List<Note> getAllNotes() {
        return (List<Note>) noteRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Integer id) {
        noteRepository.deleteById(id);
    }
}
