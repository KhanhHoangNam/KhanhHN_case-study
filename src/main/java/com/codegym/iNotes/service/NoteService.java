package com.codegym.iNotes.service;

import com.codegym.iNotes.model.Note;
import com.codegym.iNotes.model.NoteType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface NoteService {
    Page<Note> findAll(Pageable pageable);

    Note findById(Integer typeId);

    void save(Note note);

    void remove(Integer typeId);

    Iterable<Note> findAllByNoteType(NoteType noteType);

    Page<Note> findAllByTitleContaining(String title, Pageable pageable);
}
