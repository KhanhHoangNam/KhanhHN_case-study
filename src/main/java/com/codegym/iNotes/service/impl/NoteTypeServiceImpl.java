package com.codegym.iNotes.service.impl;

import com.codegym.iNotes.model.NoteType;
import com.codegym.iNotes.repository.NoteTypeRepository;
import com.codegym.iNotes.service.NoteTypeService;
import org.springframework.beans.factory.annotation.Autowired;

public class NoteTypeServiceImpl implements NoteTypeService {
    @Autowired
    private NoteTypeRepository noteTypeRepository;
    @Override
    public Iterable<NoteType> findAll() {
        return noteTypeRepository.findAll();
    }

    @Override
    public NoteType findById(Integer id) {
        return noteTypeRepository.findOne(id);
    }

    @Override
    public void save(NoteType noteType) {
        noteTypeRepository.save(noteType);
    }

    @Override
    public void remove(Integer id) {
        noteTypeRepository.delete(id);
    }
}
