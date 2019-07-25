package com.dh.chat.contact.service.model.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Santiago Mamani
 */
@Entity
@Table(name = "detail_table")
public class Detail implements Serializable {

    @Id
    @Column(name = "detailid", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "information", length = 100, nullable = false)
    private String information;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createddate", nullable = false, updatable = false)
    private Date createdDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @PrePersist
    void onPrePersist(){
        this.createdDate = new Date();
    }
}
