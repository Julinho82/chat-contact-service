package com.dh.chat.contact.service.controller.system;

import com.dh.chat.contact.service.command.ContactCreateCmd;
import com.dh.chat.contact.service.controller.Constants;
import com.dh.chat.contact.service.input.ContactCreateInput;
import com.dh.chat.contact.service.model.domain.Contact;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @author Santiago Mamani
 */
@Api(
        tags = Constants.ContactTag.NAME,
        description = Constants.ContactTag.DESCRIPTION
)
@RestController
@RequestMapping(Constants.BasePath.SYSTEM_CONTACTS)
@RequestScope
public class SystemContactCreateController {

    @Autowired
    private ContactCreateCmd contactCreateCmd;

    @ApiOperation(
            value = "Create a contact"
    )
    @RequestMapping(method = RequestMethod.POST)
    public Contact createContact(@RequestBody ContactCreateInput input) {
        contactCreateCmd.setInput(input);
        contactCreateCmd.execute();

        return contactCreateCmd.getContact();
    }
}
