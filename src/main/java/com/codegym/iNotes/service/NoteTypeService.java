package com.codegym.iNotes.service;

import com.codegym.iNotes.model.NoteType;

public interface NoteTypeService {

    Iterable<NoteType> findAll();

    NoteType findById(Integer id);

    void save(NoteType noteType);

    void remove(Integer id);
}
