package com.dh.chat.contact.service.controller.system;

import com.dh.chat.contact.service.controller.Constants;
import com.dh.chat.contact.service.input.ContactCreateInput;
import com.dh.chat.contact.service.model.domain.Contact;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;


@Api(
        tags = Constants.ContactTag.NAME,
        description = "Operations over accounts"
)
@RestController
@RequestMapping(Constants.BasePath.SYSTEM_CONTACTS)
@RequestScope
public class SystemContactCreateController {


    @ApiOperation(
            value = "Create a Contact [Implementation is pending]"
    )
    @RequestMapping(method = RequestMethod.POST)
    public Contact createContact(@RequestBody ContactCreateInput input) {

        throw new UnsupportedOperationException("Implementation is pending");
    }


}
