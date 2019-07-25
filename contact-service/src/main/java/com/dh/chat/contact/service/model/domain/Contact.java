package com.dh.chat.contact.service.model.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static com.dh.chat.contact.service.model.domain.Constants.ContactTable;
import static com.dh.chat.contact.service.model.domain.Constants.DetailTable;

/**
 * @author Santiago Mamani
 */
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(String avatarId) {
        this.avatarId = avatarId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    @PrePersist
    void onPrePersist(){
        this.createdDate = new Date();
    }
}
