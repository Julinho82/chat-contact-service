package com.dh.chat.contact.service.model.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static com.dh.chat.contact.service.model.domain.Constants.DetailTable;

/**
 * @author Santiago Mamani
 */
@Data
@Entity
@Table(name = DetailTable.NAME)
public class Detail implements Serializable {

    @Id
    @Column(name = DetailTable.Id.NAME, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = DetailTable.Information.NAME, length = DetailTable.Information.LENGTH, nullable = false)
    private String information;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = DetailTable.CratedDate.NAME, nullable = false, updatable = false)
    private Date createdDate;

    @PrePersist
    void onPrePersist() {
        this.createdDate = new Date();
    }
}
