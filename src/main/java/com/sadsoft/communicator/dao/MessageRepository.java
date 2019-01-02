package com.sadsoft.communicator.dao;

import com.sadsoft.communicator.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    Set<Message> findAllByConversationUniqueConversationsNameOrderByCreatedAt(String uniqueConversationsName);
}
