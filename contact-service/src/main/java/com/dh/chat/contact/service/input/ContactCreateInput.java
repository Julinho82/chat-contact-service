package com.dh.chat.contact.service.input;

import lombok.Data;

/**
 * @author Santiago Mamani
 */
@Data
public class ContactCreateInput {

    private Long userId;

    private Long accountId;

    private String email;

    private String name;
}
