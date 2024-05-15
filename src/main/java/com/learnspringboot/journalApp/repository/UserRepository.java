package com.learnspringboot.journalApp.repository;

import com.learnspringboot.journalApp.entity.JournalEntry;
import com.learnspringboot.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String userName);
    void deleteByUserName(String userName);
}
