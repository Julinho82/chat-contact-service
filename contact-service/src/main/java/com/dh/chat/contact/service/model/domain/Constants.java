package com.dh.chat.contact.service.model.domain;

/**
 * @author Santiago Mamani
 */
public final class Constants {

    private Constants() {
    }

    public static class ContactTable{
        public static final String NAME = "contact_table";

        public static class Id{
            public static final String NAME = "contactid";
        }

        public static class UserId{
            public static final String NAME = "userid";
        }

        public static class AccountId{
            public static final String NAME = "accountid";
        }

        public static class Email{
            public static final String NAME = "email";

            public static final int LENGTH = 100;
        }

        public static class Name{
            public static final String NAME = "name";

            public static final int LENGTH = 200;
        }

        public static class AvatarId{
            public static final String NAME = "avatarid";

            public static final int LENGTH = 200;
        }

        public static class CratedDate{
            public static final String NAME = "createddate";
        }

        public static class DetailId{
            public static final String NAME = "detid";
        }
    }

    public static class DetailTable {
        public static final String NAME = "detail_table";

        public static class Id {
            public static final String NAME = "id";
        }

        public static class Information {
            public static final String NAME = "information";

            public static final int LENGTH = 200;
        }

        public static class CratedDate {
            public static final String NAME = "createddate";
        }
    }
}
