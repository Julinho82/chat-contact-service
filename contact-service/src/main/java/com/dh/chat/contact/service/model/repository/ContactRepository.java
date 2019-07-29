package com.dh.chat.contact.service.model.repository;

import com.dh.chat.contact.service.model.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Santiago Mamani
 */
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
