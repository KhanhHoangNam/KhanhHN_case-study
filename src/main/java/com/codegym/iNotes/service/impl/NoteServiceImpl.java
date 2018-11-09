package com.codegym.iNotes.service.impl;

import com.codegym.iNotes.model.Note;
import com.codegym.iNotes.model.NoteType;
import com.codegym.iNotes.repository.NoteRepository;
import com.codegym.iNotes.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteRepository noteRepository;


    @Override
    public Page<Note> findAll(Pageable pageable) {
        return noteRepository.findAll(pageable);
    }

    @Override
    public Note findById(Integer typeId) {
        return noteRepository.findOne(typeId);
    }

    @Override
    public void save(Note note) {
        noteRepository.save(note);
    }

    @Override
    public void remove(Integer typeId) {
        noteRepository.delete(typeId);
    }

    @Override
    public Iterable<Note> findAllByNoteType(NoteType noteType) {
        return noteRepository.findAllByNoteType(noteType);
    }

    @Override
    public Page<Note> findAllByTitleContaining(String title, Pageable pageable) {
        return noteRepository.findAllByTitleContaining(title, pageable);
    }
}
