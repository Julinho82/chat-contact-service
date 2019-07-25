package com.dh.chat.contact.service.model.repository;

import com.dh.chat.contact.service.model.domain.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Santiago Mamani
 */
public interface DetailRepository extends JpaRepository<Detail,Long> {
}
