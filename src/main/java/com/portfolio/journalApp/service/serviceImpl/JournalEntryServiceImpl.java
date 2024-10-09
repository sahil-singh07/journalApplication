package com.portfolio.journalApp.service.serviceImpl;

import com.portfolio.journalApp.entity.JournalEntry;
import com.portfolio.journalApp.repository.JournalEntryRepository;
import com.portfolio.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalEntryServiceImpl implements JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    @Override
    public void saveEntry(JournalEntry old) {
        journalEntryRepository.save(old);
    }

    @Override
    public Optional<JournalEntry> findById(ObjectId id) {
        return journalEntryRepository.findById(String.valueOf(id));
    }

    @Override
    public void deleteById(ObjectId id) {
        journalEntryRepository.deleteById(String.valueOf(id));
    }

    @Override
    public List<JournalEntry> getAll() {
        return journalEntryRepository.findAll();
    }
}
