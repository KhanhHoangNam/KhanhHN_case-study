package com.codegym.iNotes.repository;

import com.codegym.iNotes.model.Note;
import com.codegym.iNotes.model.NoteType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NoteRepository extends PagingAndSortingRepository<Note, Integer> {
    Iterable<Note> findAllByNoteType(NoteType noteType);

    Page<Note> findAllByTitleContaining(String name, Pageable pageable);
}
