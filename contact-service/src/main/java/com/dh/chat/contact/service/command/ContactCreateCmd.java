package com.dh.chat.contact.service.command;

import com.dh.chat.contact.service.input.ContactCreateInput;
import com.dh.chat.contact.service.model.domain.Contact;
import com.dh.chat.contact.service.model.domain.Detail;
import com.dh.chat.contact.service.model.repository.ContactRepository;
import com.dh.chat.contact.service.model.repository.DetailRepository;
import com.jatun.open.tools.blcmd.annotations.SynchronousExecution;
import com.jatun.open.tools.blcmd.core.BusinessLogicCommand;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Santiago Mamani
 */
@SynchronousExecution
public class ContactCreateCmd implements BusinessLogicCommand {

    @Setter
    private ContactCreateInput input;

    @Getter
    private Contact contact;

    @Autowired
    private DetailRepository detailRepository;

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public void execute() {
        Detail detail = detailRepository.save(composeDetailInstance());
        contact = contactRepository.save(composeContactInstance(detail));
    }

    private Detail composeDetailInstance() {
        Detail instance = new Detail();
        instance.setInformation("Only calls");

        return instance;
    }

    private Contact composeContactInstance(Detail detail) {
        Contact contact = new Contact();
        contact.setUserId(input.getUserId());
        contact.setEmail(input.getEmail());
        contact.setName(input.getName());
        contact.setAccountId(input.getAccountId());
        contact.setDetail(detail);

        return contact;
    }
}
