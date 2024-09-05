package com.notizen.notizennotes.repository;

import com.notizen.notizennotes.model.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<Note, Integer> {
}
