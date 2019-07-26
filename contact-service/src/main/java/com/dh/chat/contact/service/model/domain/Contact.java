package com.dh.chat.contact.service.model.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static com.dh.chat.contact.service.model.domain.Constants.ContactTable;
import static com.dh.chat.contact.service.model.domain.Constants.DetailTable;

/**
 * @author Santiago Mamani
 */
@Data
@Entity
@Table(name = ContactTable.NAME)
public class Contact implements Serializable {

    @Id
    @Column(name = ContactTable.Id.NAME, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = ContactTable.UserId.NAME)
    private Long userId;

    @Column(name = ContactTable.AccountId.NAME, nullable = false)
    private Long accountId;

    @Column(name = ContactTable.Email.NAME, length = ContactTable.Email.LENGTH, nullable = false)
    private String email;

    @Column(name = ContactTable.Name.NAME, length = ContactTable.Name.LENGTH, nullable = false)
    private String name;

    @Column(name = ContactTable.AvatarId.NAME, length = ContactTable.AvatarId.LENGTH, nullable = false)
    private String avatarId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = ContactTable.CratedDate.NAME, nullable = false, updatable = false)
    private Date createdDate;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = ContactTable.DetailId.NAME, referencedColumnName = DetailTable.Id.NAME, nullable = false)
    private Detail detail;



    @PrePersist
    void onPrePersist(){
        this.createdDate = new Date();
    }
}
