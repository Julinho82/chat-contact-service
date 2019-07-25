package com.dh.chat.contact.service.model.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static com.dh.chat.contact.service.model.domain.Constants.DetailTable;

/**
 * @author Santiago Mamani
 */
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
