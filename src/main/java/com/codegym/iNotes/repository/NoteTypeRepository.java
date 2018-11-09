package com.codegym.iNotes.repository;

import com.codegym.iNotes.model.NoteType;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NoteTypeRepository extends PagingAndSortingRepository<NoteType, Integer> {
}
