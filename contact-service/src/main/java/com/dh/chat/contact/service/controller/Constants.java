package com.dh.chat.contact.service.controller;

/**
 * @author Santiago Mamani
 */
public final class Constants {

    private Constants() {
    }

    public static class ContactTag {
        public static final String NAME = "contact-controller";

        public static final String DESCRIPTION = "Available operations over contacts";
    }

    public static class DetailTag {
        public static final String NAME = "detail-controller";

        public static final String DESCRIPTION = "Available operations over details";
    }

    public static class BasePath {
        public static final String PUBLIC = "/public";

        public static final String SECURE = "/secure";

        public static final String SYSTEM = "/system";

        public static final String SYSTEM_CONTACTS = SYSTEM + "/contacts";
    }
}
