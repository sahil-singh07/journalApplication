package com.portfolio.journalApp.service;

import com.portfolio.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface JournalEntryService {
    void saveEntry(JournalEntry old);

    Optional<JournalEntry> findById(ObjectId id);

    void deleteById(ObjectId id);

    List<JournalEntry> getAll();
}
