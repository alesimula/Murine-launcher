package android.provider;

public final class ContactsContract {
    public static final java.lang.String AUTHORITY = "com.android.contacts";
    public static final android.net.Uri AUTHORITY_URI = null;
    public static final java.lang.String HIDDEN_COLUMN_PREFIX = "x_";
    public static final java.lang.String CALLER_IS_SYNCADAPTER = "caller_is_syncadapter";
    public static final java.lang.String DIRECTORY_PARAM_KEY = "directory";
    public static final java.lang.String LIMIT_PARAM_KEY = "limit";
    public static final java.lang.String PRIMARY_ACCOUNT_NAME = "name_for_primary_account";
    public static final java.lang.String PRIMARY_ACCOUNT_TYPE = "type_for_primary_account";
    public static final java.lang.String STREQUENT_PHONE_ONLY = "strequent_phone_only";
    public static final java.lang.String DEFERRED_SNIPPETING = "deferred_snippeting";
    public static final java.lang.String DEFERRED_SNIPPETING_QUERY = "deferred_snippeting_query";
    public static final java.lang.String REMOVE_DUPLICATE_ENTRIES = "remove_duplicate_entries";
    public ContactsContract() {}
    public static boolean isProfileId(long p0) { return false; }

    public static final class AggregationExceptions implements android.provider.BaseColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/aggregation_exception";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/aggregation_exception";
        public static final java.lang.String TYPE = "type";
        public static final int TYPE_AUTOMATIC = 0;
        public static final int TYPE_KEEP_TOGETHER = 1;
        public static final int TYPE_KEEP_SEPARATE = 2;
        public static final java.lang.String RAW_CONTACT_ID1 = "raw_contact_id1";
        public static final java.lang.String RAW_CONTACT_ID2 = "raw_contact_id2";
        private AggregationExceptions() {}
    }

    public static final class Authorization {
        public static final java.lang.String AUTHORIZATION_METHOD = "authorize";
        public static final java.lang.String KEY_URI_TO_AUTHORIZE = "uri_to_authorize";
        public static final java.lang.String KEY_AUTHORIZED_URI = "authorized_uri";
        public Authorization() {}
    }

    protected static interface BaseSyncColumns {
        public static final java.lang.String SYNC1 = "sync1";
        public static final java.lang.String SYNC2 = "sync2";
        public static final java.lang.String SYNC3 = "sync3";
        public static final java.lang.String SYNC4 = "sync4";
    }

    public static final class CommonDataKinds {
        public static final java.lang.String PACKAGE_COMMON = "common";
        private CommonDataKinds() {}

        public static interface BaseTypes {
            public static final int TYPE_CUSTOM = 0;
        }

        public static final class Callable implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns, android.provider.ContactsContract.ContactCounts {
            public static final android.net.Uri CONTENT_URI = null;
            public static final android.net.Uri CONTENT_FILTER_URI = null;
            public static final android.net.Uri ENTERPRISE_CONTENT_FILTER_URI = null;
            public Callable() {}
        }

        protected static interface CommonColumns extends android.provider.ContactsContract.CommonDataKinds.BaseTypes {
            public static final java.lang.String DATA = "data1";
            public static final java.lang.String TYPE = "data2";
            public static final java.lang.String LABEL = "data3";
        }

        public static final class Contactables implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns, android.provider.ContactsContract.ContactCounts {
            public static final android.net.Uri CONTENT_URI = null;
            public static final android.net.Uri CONTENT_FILTER_URI = null;
            public static final java.lang.String VISIBLE_CONTACTS_ONLY = "visible_contacts_only";
            public Contactables() {}
        }

        public static final class Email implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns, android.provider.ContactsContract.ContactCounts {
            public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/email_v2";
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/email_v2";
            public static final android.net.Uri CONTENT_URI = null;
            public static final android.net.Uri CONTENT_LOOKUP_URI = null;
            public static final android.net.Uri ENTERPRISE_CONTENT_LOOKUP_URI = null;
            public static final android.net.Uri CONTENT_FILTER_URI = null;
            public static final android.net.Uri ENTERPRISE_CONTENT_FILTER_URI = null;
            public static final java.lang.String ADDRESS = "data1";
            public static final int TYPE_HOME = 1;
            public static final int TYPE_WORK = 2;
            public static final int TYPE_OTHER = 3;
            public static final int TYPE_MOBILE = 4;
            public static final java.lang.String DISPLAY_NAME = "data4";
            private Email() {}
            public static final int getTypeLabelResource(int p0) { return 0; }
            public static final java.lang.CharSequence getTypeLabel(android.content.res.Resources p0, int p1, java.lang.CharSequence p2) { return null; }
        }

        public static final class Event implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns, android.provider.ContactsContract.ContactCounts {
            public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_event";
            public static final int TYPE_ANNIVERSARY = 1;
            public static final int TYPE_OTHER = 2;
            public static final int TYPE_BIRTHDAY = 3;
            public static final java.lang.String START_DATE = "data1";
            private Event() {}
            public static int getTypeResource(java.lang.Integer p0) { return 0; }
            public static final java.lang.CharSequence getTypeLabel(android.content.res.Resources p0, int p1, java.lang.CharSequence p2) { return null; }
        }

        public static final class GroupMembership implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.ContactCounts {
            public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/group_membership";
            public static final java.lang.String GROUP_ROW_ID = "data1";
            public static final java.lang.String GROUP_SOURCE_ID = "group_sourceid";
            private GroupMembership() {}
        }

        public static final class Identity implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.ContactCounts {
            public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/identity";
            public static final java.lang.String IDENTITY = "data1";
            public static final java.lang.String NAMESPACE = "data2";
            private Identity() {}
        }

        public static final class Im implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns, android.provider.ContactsContract.ContactCounts {
            public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/im";
            public static final int TYPE_HOME = 1;
            public static final int TYPE_WORK = 2;
            public static final int TYPE_OTHER = 3;
            public static final java.lang.String PROTOCOL = "data5";
            public static final java.lang.String CUSTOM_PROTOCOL = "data6";
            public static final int PROTOCOL_CUSTOM = -1;
            public static final int PROTOCOL_AIM = 0;
            public static final int PROTOCOL_MSN = 1;
            public static final int PROTOCOL_YAHOO = 2;
            public static final int PROTOCOL_SKYPE = 3;
            public static final int PROTOCOL_QQ = 4;
            public static final int PROTOCOL_GOOGLE_TALK = 5;
            public static final int PROTOCOL_ICQ = 6;
            public static final int PROTOCOL_JABBER = 7;
            public static final int PROTOCOL_NETMEETING = 8;
            private Im() {}
            public static final int getTypeLabelResource(int p0) { return 0; }
            public static final java.lang.CharSequence getTypeLabel(android.content.res.Resources p0, int p1, java.lang.CharSequence p2) { return null; }
            public static final int getProtocolLabelResource(int p0) { return 0; }
            public static final java.lang.CharSequence getProtocolLabel(android.content.res.Resources p0, int p1, java.lang.CharSequence p2) { return null; }
        }

        public static final class Nickname implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns, android.provider.ContactsContract.ContactCounts {
            public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/nickname";
            public static final int TYPE_DEFAULT = 1;
            public static final int TYPE_OTHER_NAME = 2;
            public static final int TYPE_MAIDEN_NAME = 3;
            @java.lang.Deprecated
            public static final int TYPE_MAINDEN_NAME = 3;
            public static final int TYPE_SHORT_NAME = 4;
            public static final int TYPE_INITIALS = 5;
            public static final java.lang.String NAME = "data1";
            private Nickname() {}
        }

        public static final class Note implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.ContactCounts {
            public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/note";
            public static final java.lang.String NOTE = "data1";
            private Note() {}
        }

        public static final class Organization implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns, android.provider.ContactsContract.ContactCounts {
            public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/organization";
            public static final int TYPE_WORK = 1;
            public static final int TYPE_OTHER = 2;
            public static final java.lang.String COMPANY = "data1";
            public static final java.lang.String TITLE = "data4";
            public static final java.lang.String DEPARTMENT = "data5";
            public static final java.lang.String JOB_DESCRIPTION = "data6";
            public static final java.lang.String SYMBOL = "data7";
            public static final java.lang.String PHONETIC_NAME = "data8";
            public static final java.lang.String OFFICE_LOCATION = "data9";
            public static final java.lang.String PHONETIC_NAME_STYLE = "data10";
            private Organization() {}
            public static final int getTypeLabelResource(int p0) { return 0; }
            public static final java.lang.CharSequence getTypeLabel(android.content.res.Resources p0, int p1, java.lang.CharSequence p2) { return null; }
        }

        public static final class Phone implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns, android.provider.ContactsContract.ContactCounts {
            public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/phone_v2";
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/phone_v2";
            public static final android.net.Uri CONTENT_URI = null;
            public static final android.net.Uri ENTERPRISE_CONTENT_URI = null;
            public static final android.net.Uri CONTENT_FILTER_URI = null;
            public static final android.net.Uri ENTERPRISE_CONTENT_FILTER_URI = null;
            public static final java.lang.String SEARCH_DISPLAY_NAME_KEY = "search_display_name";
            public static final java.lang.String SEARCH_PHONE_NUMBER_KEY = "search_phone_number";
            public static final int TYPE_HOME = 1;
            public static final int TYPE_MOBILE = 2;
            public static final int TYPE_WORK = 3;
            public static final int TYPE_FAX_WORK = 4;
            public static final int TYPE_FAX_HOME = 5;
            public static final int TYPE_PAGER = 6;
            public static final int TYPE_OTHER = 7;
            public static final int TYPE_CALLBACK = 8;
            public static final int TYPE_CAR = 9;
            public static final int TYPE_COMPANY_MAIN = 10;
            public static final int TYPE_ISDN = 11;
            public static final int TYPE_MAIN = 12;
            public static final int TYPE_OTHER_FAX = 13;
            public static final int TYPE_RADIO = 14;
            public static final int TYPE_TELEX = 15;
            public static final int TYPE_TTY_TDD = 16;
            public static final int TYPE_WORK_MOBILE = 17;
            public static final int TYPE_WORK_PAGER = 18;
            public static final int TYPE_ASSISTANT = 19;
            public static final int TYPE_MMS = 20;
            public static final java.lang.String NUMBER = "data1";
            public static final java.lang.String NORMALIZED_NUMBER = "data4";
            private Phone() {}
            @java.lang.Deprecated
            public static final java.lang.CharSequence getDisplayLabel(android.content.Context p0, int p1, java.lang.CharSequence p2, java.lang.CharSequence[] p3) { return null; }
            @java.lang.Deprecated
            public static final java.lang.CharSequence getDisplayLabel(android.content.Context p0, int p1, java.lang.CharSequence p2) { return null; }
            public static final int getTypeLabelResource(int p0) { return 0; }
            public static final java.lang.CharSequence getTypeLabel(android.content.res.Resources p0, int p1, java.lang.CharSequence p2) { return null; }
        }

        public static final class Photo implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.ContactCounts {
            public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/photo";
            public static final java.lang.String PHOTO_FILE_ID = "data14";
            public static final java.lang.String PHOTO = "data15";
            private Photo() {}
        }

        public static final class Relation implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns, android.provider.ContactsContract.ContactCounts {
            public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/relation";
            public static final int TYPE_ASSISTANT = 1;
            public static final int TYPE_BROTHER = 2;
            public static final int TYPE_CHILD = 3;
            public static final int TYPE_DOMESTIC_PARTNER = 4;
            public static final int TYPE_FATHER = 5;
            public static final int TYPE_FRIEND = 6;
            public static final int TYPE_MANAGER = 7;
            public static final int TYPE_MOTHER = 8;
            public static final int TYPE_PARENT = 9;
            public static final int TYPE_PARTNER = 10;
            public static final int TYPE_REFERRED_BY = 11;
            public static final int TYPE_RELATIVE = 12;
            public static final int TYPE_SISTER = 13;
            public static final int TYPE_SPOUSE = 14;
            public static final java.lang.String NAME = "data1";
            private Relation() {}
            public static final int getTypeLabelResource(int p0) { return 0; }
            public static final java.lang.CharSequence getTypeLabel(android.content.res.Resources p0, int p1, java.lang.CharSequence p2) { return null; }
        }

        public static final class SipAddress implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns, android.provider.ContactsContract.ContactCounts {
            public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/sip_address";
            public static final int TYPE_HOME = 1;
            public static final int TYPE_WORK = 2;
            public static final int TYPE_OTHER = 3;
            public static final java.lang.String SIP_ADDRESS = "data1";
            private SipAddress() {}
            public static final int getTypeLabelResource(int p0) { return 0; }
            public static final java.lang.CharSequence getTypeLabel(android.content.res.Resources p0, int p1, java.lang.CharSequence p2) { return null; }
        }

        public static final class StructuredName implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.ContactCounts {
            public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/name";
            public static final java.lang.String DISPLAY_NAME = "data1";
            public static final java.lang.String GIVEN_NAME = "data2";
            public static final java.lang.String FAMILY_NAME = "data3";
            public static final java.lang.String PREFIX = "data4";
            public static final java.lang.String MIDDLE_NAME = "data5";
            public static final java.lang.String SUFFIX = "data6";
            public static final java.lang.String PHONETIC_GIVEN_NAME = "data7";
            public static final java.lang.String PHONETIC_MIDDLE_NAME = "data8";
            public static final java.lang.String PHONETIC_FAMILY_NAME = "data9";
            public static final java.lang.String FULL_NAME_STYLE = "data10";
            public static final java.lang.String PHONETIC_NAME_STYLE = "data11";
            private StructuredName() {}
        }

        public static final class StructuredPostal implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns, android.provider.ContactsContract.ContactCounts {
            public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/postal-address_v2";
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/postal-address_v2";
            public static final android.net.Uri CONTENT_URI = null;
            public static final int TYPE_HOME = 1;
            public static final int TYPE_WORK = 2;
            public static final int TYPE_OTHER = 3;
            public static final java.lang.String FORMATTED_ADDRESS = "data1";
            public static final java.lang.String STREET = "data4";
            public static final java.lang.String POBOX = "data5";
            public static final java.lang.String NEIGHBORHOOD = "data6";
            public static final java.lang.String CITY = "data7";
            public static final java.lang.String REGION = "data8";
            public static final java.lang.String POSTCODE = "data9";
            public static final java.lang.String COUNTRY = "data10";
            private StructuredPostal() {}
            public static final int getTypeLabelResource(int p0) { return 0; }
            public static final java.lang.CharSequence getTypeLabel(android.content.res.Resources p0, int p1, java.lang.CharSequence p2) { return null; }
        }

        public static final class Website implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.CommonDataKinds.CommonColumns, android.provider.ContactsContract.ContactCounts {
            public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/website";
            public static final int TYPE_HOMEPAGE = 1;
            public static final int TYPE_BLOG = 2;
            public static final int TYPE_PROFILE = 3;
            public static final int TYPE_HOME = 4;
            public static final int TYPE_WORK = 5;
            public static final int TYPE_FTP = 6;
            public static final int TYPE_OTHER = 7;
            public static final java.lang.String URL = "data1";
            private Website() {}
        }
    }

    static interface ContactCounts {
        public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
        public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
        public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
    }

    protected static interface ContactNameColumns {
        public static final java.lang.String DISPLAY_NAME_SOURCE = "display_name_source";
        public static final java.lang.String DISPLAY_NAME_PRIMARY = "display_name";
        public static final java.lang.String DISPLAY_NAME_ALTERNATIVE = "display_name_alt";
        public static final java.lang.String PHONETIC_NAME_STYLE = "phonetic_name_style";
        public static final java.lang.String PHONETIC_NAME = "phonetic_name";
        public static final java.lang.String SORT_KEY_PRIMARY = "sort_key";
        public static final java.lang.String SORT_KEY_ALTERNATIVE = "sort_key_alt";
    }

    protected static interface ContactOptionsColumns {
        @java.lang.Deprecated
        public static final java.lang.String TIMES_CONTACTED = "times_contacted";
        @java.lang.Deprecated
        public static final java.lang.String LAST_TIME_CONTACTED = "last_time_contacted";
        public static final java.lang.String RAW_TIMES_CONTACTED = "x_times_contacted";
        public static final java.lang.String RAW_LAST_TIME_CONTACTED = "x_last_time_contacted";
        public static final java.lang.String LR_TIMES_CONTACTED = "times_contacted";
        public static final java.lang.String LR_LAST_TIME_CONTACTED = "last_time_contacted";
        public static final java.lang.String STARRED = "starred";
        public static final java.lang.String PINNED = "pinned";
        public static final java.lang.String CUSTOM_RINGTONE = "custom_ringtone";
        public static final java.lang.String SEND_TO_VOICEMAIL = "send_to_voicemail";
    }

    protected static interface ContactStatusColumns {
        public static final java.lang.String CONTACT_PRESENCE = "contact_presence";
        public static final java.lang.String CONTACT_CHAT_CAPABILITY = "contact_chat_capability";
        public static final java.lang.String CONTACT_STATUS = "contact_status";
        public static final java.lang.String CONTACT_STATUS_TIMESTAMP = "contact_status_ts";
        public static final java.lang.String CONTACT_STATUS_RES_PACKAGE = "contact_status_res_package";
        public static final java.lang.String CONTACT_STATUS_LABEL = "contact_status_label";
        public static final java.lang.String CONTACT_STATUS_ICON = "contact_status_icon";
    }

    public static class Contacts implements android.provider.BaseColumns, android.provider.ContactsContract.ContactsColumns, android.provider.ContactsContract.ContactOptionsColumns, android.provider.ContactsContract.ContactNameColumns, android.provider.ContactsContract.ContactStatusColumns, android.provider.ContactsContract.ContactCounts {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri CORP_CONTENT_URI = null;
        public static final android.net.Uri CONTENT_LOOKUP_URI = null;
        public static final android.net.Uri CONTENT_VCARD_URI = null;
        public static final java.lang.String QUERY_PARAMETER_VCARD_NO_PHOTO = "no_photo";
        public static final android.net.Uri CONTENT_MULTI_VCARD_URI = null;
        public static final android.net.Uri CONTENT_FILTER_URI = null;
        public static final android.net.Uri ENTERPRISE_CONTENT_FILTER_URI = null;
        public static final android.net.Uri CONTENT_STREQUENT_URI = null;
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_FREQUENT_URI = null;
        public static final android.net.Uri CONTENT_STREQUENT_FILTER_URI = null;
        public static final android.net.Uri CONTENT_GROUP_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contact";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact";
        public static final java.lang.String CONTENT_VCARD_TYPE = "text/x-vcard";
        public static long ENTERPRISE_CONTACT_ID_BASE;
        public static java.lang.String ENTERPRISE_CONTACT_LOOKUP_PREFIX;
        private Contacts() {}
        public static android.net.Uri getLookupUri(android.content.ContentResolver p0, android.net.Uri p1) { return null; }
        public static android.net.Uri getLookupUri(long p0, java.lang.String p1) { return null; }
        public static android.net.Uri lookupContact(android.content.ContentResolver p0, android.net.Uri p1) { return null; }
        @java.lang.Deprecated
        public static void markAsContacted(android.content.ContentResolver p0, long p1) {}
        public static boolean isEnterpriseContactId(long p0) { return false; }
        public static java.io.InputStream openContactPhotoInputStream(android.content.ContentResolver p0, android.net.Uri p1, boolean p2) { return null; }
        public static java.io.InputStream openContactPhotoInputStream(android.content.ContentResolver p0, android.net.Uri p1) { return null; }
        public static android.net.Uri createCorpLookupUriFromEnterpriseLookupUri(android.net.Uri p0) { return null; }

        public static final class AggregationSuggestions implements android.provider.BaseColumns, android.provider.ContactsContract.ContactsColumns, android.provider.ContactsContract.ContactOptionsColumns, android.provider.ContactsContract.ContactStatusColumns {
            public static final java.lang.String CONTENT_DIRECTORY = "suggestions";
            public static final java.lang.String PARAMETER_MATCH_NAME = "name";
            private AggregationSuggestions() {}
            public static final android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder builder() { return null; }

            public static final class Builder {
                private long mContactId;
                private final java.util.ArrayList<java.lang.String> mValues = null;
                private int mLimit;
                public Builder() {}
                public android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder setContactId(long p0) { return null; }
                public android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder addNameParameter(java.lang.String p0) { return null; }
                public android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder setLimit(int p0) { return null; }
                public android.net.Uri build() { return null; }
            }
        }

        public static final class Data implements android.provider.BaseColumns, android.provider.ContactsContract.DataColumns {
            public static final java.lang.String CONTENT_DIRECTORY = "data";
            private Data() {}
        }

        public static final class Entity implements android.provider.BaseColumns, android.provider.ContactsContract.ContactsColumns, android.provider.ContactsContract.ContactNameColumns, android.provider.ContactsContract.RawContactsColumns, android.provider.ContactsContract.BaseSyncColumns, android.provider.ContactsContract.SyncColumns, android.provider.ContactsContract.DataColumns, android.provider.ContactsContract.StatusColumns, android.provider.ContactsContract.ContactOptionsColumns, android.provider.ContactsContract.ContactStatusColumns, android.provider.ContactsContract.DataUsageStatColumns {
            public static final java.lang.String CONTENT_DIRECTORY = "entities";
            public static final java.lang.String RAW_CONTACT_ID = "raw_contact_id";
            public static final java.lang.String DATA_ID = "data_id";
            private Entity() {}
        }

        public static final class Photo implements android.provider.BaseColumns, android.provider.ContactsContract.DataColumnsWithJoins {
            public static final java.lang.String CONTENT_DIRECTORY = "photo";
            public static final java.lang.String DISPLAY_PHOTO = "display_photo";
            public static final java.lang.String PHOTO_FILE_ID = "data14";
            public static final java.lang.String PHOTO = "data15";
            private Photo() {}
        }

        @java.lang.Deprecated
        public static final class StreamItems implements android.provider.ContactsContract.StreamItemsColumns {
            @java.lang.Deprecated
            public static final java.lang.String CONTENT_DIRECTORY = "stream_items";
            @java.lang.Deprecated
            private StreamItems() {}
        }
    }

    protected static interface ContactsColumns {
        public static final java.lang.String DISPLAY_NAME = "display_name";
        public static final java.lang.String NAME_RAW_CONTACT_ID = "name_raw_contact_id";
        public static final java.lang.String PHOTO_ID = "photo_id";
        public static final java.lang.String PHOTO_FILE_ID = "photo_file_id";
        public static final java.lang.String PHOTO_URI = "photo_uri";
        public static final java.lang.String PHOTO_THUMBNAIL_URI = "photo_thumb_uri";
        public static final java.lang.String IN_DEFAULT_DIRECTORY = "in_default_directory";
        public static final java.lang.String IN_VISIBLE_GROUP = "in_visible_group";
        public static final java.lang.String IS_USER_PROFILE = "is_user_profile";
        public static final java.lang.String HAS_PHONE_NUMBER = "has_phone_number";
        public static final java.lang.String LOOKUP_KEY = "lookup";
        public static final java.lang.String CONTACT_LAST_UPDATED_TIMESTAMP = "contact_last_updated_timestamp";
    }

    public static final class Data implements android.provider.ContactsContract.DataColumnsWithJoins, android.provider.ContactsContract.ContactCounts {
        public static final android.net.Uri CONTENT_URI = null;
        static final android.net.Uri ENTERPRISE_CONTENT_URI = null;
        public static final java.lang.String VISIBLE_CONTACTS_ONLY = "visible_contacts_only";
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/data";
        private Data() {}
        public static android.net.Uri getContactLookupUri(android.content.ContentResolver p0, android.net.Uri p1) { return null; }
    }

    protected static interface DataColumns {
        public static final java.lang.String RES_PACKAGE = "res_package";
        public static final java.lang.String MIMETYPE = "mimetype";
        @java.lang.Deprecated
        public static final java.lang.String HASH_ID = "hash_id";
        public static final java.lang.String RAW_CONTACT_ID = "raw_contact_id";
        public static final java.lang.String IS_PRIMARY = "is_primary";
        public static final java.lang.String IS_SUPER_PRIMARY = "is_super_primary";
        public static final java.lang.String IS_READ_ONLY = "is_read_only";
        public static final java.lang.String DATA_VERSION = "data_version";
        public static final java.lang.String DATA1 = "data1";
        public static final java.lang.String DATA2 = "data2";
        public static final java.lang.String DATA3 = "data3";
        public static final java.lang.String DATA4 = "data4";
        public static final java.lang.String DATA5 = "data5";
        public static final java.lang.String DATA6 = "data6";
        public static final java.lang.String DATA7 = "data7";
        public static final java.lang.String DATA8 = "data8";
        public static final java.lang.String DATA9 = "data9";
        public static final java.lang.String DATA10 = "data10";
        public static final java.lang.String DATA11 = "data11";
        public static final java.lang.String DATA12 = "data12";
        public static final java.lang.String DATA13 = "data13";
        public static final java.lang.String DATA14 = "data14";
        public static final java.lang.String DATA15 = "data15";
        public static final java.lang.String SYNC1 = "data_sync1";
        public static final java.lang.String SYNC2 = "data_sync2";
        public static final java.lang.String SYNC3 = "data_sync3";
        public static final java.lang.String SYNC4 = "data_sync4";
        public static final java.lang.String CARRIER_PRESENCE = "carrier_presence";
        public static final int CARRIER_PRESENCE_VT_CAPABLE = 1;
        public static final java.lang.String PREFERRED_PHONE_ACCOUNT_COMPONENT_NAME = "preferred_phone_account_component_name";
        public static final java.lang.String PREFERRED_PHONE_ACCOUNT_ID = "preferred_phone_account_id";
    }

    protected static interface DataColumnsWithJoins extends android.provider.BaseColumns, android.provider.ContactsContract.DataColumns, android.provider.ContactsContract.StatusColumns, android.provider.ContactsContract.RawContactsColumns, android.provider.ContactsContract.ContactsColumns, android.provider.ContactsContract.ContactNameColumns, android.provider.ContactsContract.ContactOptionsColumns, android.provider.ContactsContract.ContactStatusColumns, android.provider.ContactsContract.DataUsageStatColumns {
    }

    @java.lang.Deprecated
    public static final class DataUsageFeedback {
        public static final android.net.Uri FEEDBACK_URI = null;
        public static final android.net.Uri DELETE_USAGE_URI = null;
        public static final java.lang.String USAGE_TYPE = "type";
        public static final java.lang.String USAGE_TYPE_CALL = "call";
        public static final java.lang.String USAGE_TYPE_LONG_TEXT = "long_text";
        public static final java.lang.String USAGE_TYPE_SHORT_TEXT = "short_text";
        public DataUsageFeedback() {}
    }

    protected static interface DataUsageStatColumns {
        @java.lang.Deprecated
        public static final java.lang.String LAST_TIME_USED = "last_time_used";
        @java.lang.Deprecated
        public static final java.lang.String TIMES_USED = "times_used";
        public static final java.lang.String RAW_LAST_TIME_USED = "x_last_time_used";
        public static final java.lang.String RAW_TIMES_USED = "x_times_used";
        public static final java.lang.String LR_LAST_TIME_USED = "last_time_used";
        public static final java.lang.String LR_TIMES_USED = "times_used";
    }

    public static final class DeletedContacts implements android.provider.ContactsContract.DeletedContactsColumns {
        public static final android.net.Uri CONTENT_URI = null;
        private static final int DAYS_KEPT = 30;
        public static final long DAYS_KEPT_MILLISECONDS = 2592000000L;
        private DeletedContacts() {}
    }

    protected static interface DeletedContactsColumns {
        public static final java.lang.String CONTACT_ID = "contact_id";
        public static final java.lang.String CONTACT_DELETED_TIMESTAMP = "contact_deleted_timestamp";
    }

    public static final class Directory implements android.provider.BaseColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri ENTERPRISE_CONTENT_URI = null;
        public static final android.net.Uri ENTERPRISE_FILE_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contact_directories";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_directory";
        public static final long DEFAULT = 0L;
        public static final long LOCAL_INVISIBLE = 1L;
        public static final long ENTERPRISE_DEFAULT = 1000000000L;
        public static final long ENTERPRISE_LOCAL_INVISIBLE = 1000000001L;
        public static final java.lang.String PACKAGE_NAME = "packageName";
        public static final java.lang.String TYPE_RESOURCE_ID = "typeResourceId";
        public static final java.lang.String DISPLAY_NAME = "displayName";
        public static final java.lang.String DIRECTORY_AUTHORITY = "authority";
        public static final java.lang.String ACCOUNT_TYPE = "accountType";
        public static final java.lang.String ACCOUNT_NAME = "accountName";
        public static final long ENTERPRISE_DIRECTORY_ID_BASE = 1000000000L;
        public static final java.lang.String EXPORT_SUPPORT = "exportSupport";
        public static final int EXPORT_SUPPORT_NONE = 0;
        public static final int EXPORT_SUPPORT_SAME_ACCOUNT_ONLY = 1;
        public static final int EXPORT_SUPPORT_ANY_ACCOUNT = 2;
        public static final java.lang.String SHORTCUT_SUPPORT = "shortcutSupport";
        public static final int SHORTCUT_SUPPORT_NONE = 0;
        public static final int SHORTCUT_SUPPORT_DATA_ITEMS_ONLY = 1;
        public static final int SHORTCUT_SUPPORT_FULL = 2;
        public static final java.lang.String PHOTO_SUPPORT = "photoSupport";
        public static final int PHOTO_SUPPORT_NONE = 0;
        public static final int PHOTO_SUPPORT_THUMBNAIL_ONLY = 1;
        public static final int PHOTO_SUPPORT_FULL_SIZE_ONLY = 2;
        public static final int PHOTO_SUPPORT_FULL = 3;
        public static final java.lang.String CALLER_PACKAGE_PARAM_KEY = "callerPackage";
        private Directory() {}
        public static boolean isRemoteDirectoryId(long p0) { return false; }
        public static boolean isRemoteDirectory(long p0) { return false; }
        public static boolean isEnterpriseDirectoryId(long p0) { return false; }
        public static void notifyDirectoryChange(android.content.ContentResolver p0) {}
    }

    public static interface DisplayNameSources {
        public static final int UNDEFINED = 0;
        public static final int EMAIL = 10;
        public static final int PHONE = 20;
        public static final int ORGANIZATION = 30;
        public static final int NICKNAME = 35;
        public static final int STRUCTURED_PHONETIC_NAME = 37;
        public static final int STRUCTURED_NAME = 40;
    }

    public static final class DisplayPhoto {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri CONTENT_MAX_DIMENSIONS_URI = null;
        public static final java.lang.String DISPLAY_MAX_DIM = "display_max_dim";
        public static final java.lang.String THUMBNAIL_MAX_DIM = "thumbnail_max_dim";
        private DisplayPhoto() {}
    }

    public static interface FullNameStyle {
        public static final int UNDEFINED = 0;
        public static final int WESTERN = 1;
        public static final int CJK = 2;
        public static final int CHINESE = 3;
        public static final int JAPANESE = 4;
        public static final int KOREAN = 5;
    }

    public static final class Groups implements android.provider.BaseColumns, android.provider.ContactsContract.GroupsColumns, android.provider.ContactsContract.SyncColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri CONTENT_SUMMARY_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/group";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/group";
        private Groups() {}
        public static android.content.EntityIterator newEntityIterator(android.database.Cursor p0) { return null; }

        private static class EntityIteratorImpl extends android.content.CursorEntityIterator {
            public EntityIteratorImpl(android.database.Cursor p0) { super(null); }
            public android.content.Entity getEntityAndIncrementCursor(android.database.Cursor p0) throws android.os.RemoteException { return null; }
        }
    }

    protected static interface GroupsColumns {
        public static final java.lang.String DATA_SET = "data_set";
        public static final java.lang.String ACCOUNT_TYPE_AND_DATA_SET = "account_type_and_data_set";
        public static final java.lang.String TITLE = "title";
        public static final java.lang.String RES_PACKAGE = "res_package";
        public static final java.lang.String TITLE_RES = "title_res";
        public static final java.lang.String NOTES = "notes";
        public static final java.lang.String SYSTEM_ID = "system_id";
        public static final java.lang.String SUMMARY_COUNT = "summ_count";
        public static final java.lang.String PARAM_RETURN_GROUP_COUNT_PER_ACCOUNT = "return_group_count_per_account";
        public static final java.lang.String SUMMARY_GROUP_COUNT_PER_ACCOUNT = "group_count_per_account";
        public static final java.lang.String SUMMARY_WITH_PHONES = "summ_phones";
        public static final java.lang.String GROUP_VISIBLE = "group_visible";
        public static final java.lang.String DELETED = "deleted";
        public static final java.lang.String SHOULD_SYNC = "should_sync";
        public static final java.lang.String AUTO_ADD = "auto_add";
        public static final java.lang.String FAVORITES = "favorites";
        public static final java.lang.String GROUP_IS_READ_ONLY = "group_is_read_only";
    }

    public static final class Intents {
        public static final java.lang.String SEARCH_SUGGESTION_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CLICKED";
        public static final java.lang.String SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED";
        public static final java.lang.String SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED";
        public static final java.lang.String CONTACTS_DATABASE_CREATED = "android.provider.Contacts.DATABASE_CREATED";
        public static final java.lang.String ATTACH_IMAGE = "com.android.contacts.action.ATTACH_IMAGE";
        public static final java.lang.String INVITE_CONTACT = "com.android.contacts.action.INVITE_CONTACT";
        public static final java.lang.String SHOW_OR_CREATE_CONTACT = "com.android.contacts.action.SHOW_OR_CREATE_CONTACT";
        public static final java.lang.String ACTION_VOICE_SEND_MESSAGE_TO_CONTACTS = "android.provider.action.VOICE_SEND_MESSAGE_TO_CONTACTS";
        public static final java.lang.String EXTRA_RECIPIENT_CONTACT_URI = "android.provider.extra.RECIPIENT_CONTACT_URI";
        public static final java.lang.String EXTRA_RECIPIENT_CONTACT_CHAT_ID = "android.provider.extra.RECIPIENT_CONTACT_CHAT_ID";
        public static final java.lang.String EXTRA_RECIPIENT_CONTACT_NAME = "android.provider.extra.RECIPIENT_CONTACT_NAME";
        public static final java.lang.String METADATA_ACCOUNT_TYPE = "android.provider.account_type";
        public static final java.lang.String METADATA_MIMETYPE = "android.provider.mimetype";
        public static final java.lang.String ACTION_GET_MULTIPLE_PHONES = "com.android.contacts.action.GET_MULTIPLE_PHONES";
        public static final java.lang.String ACTION_PROFILE_CHANGED = "android.provider.Contacts.PROFILE_CHANGED";
        public static final java.lang.String EXTRA_FORCE_CREATE = "com.android.contacts.action.FORCE_CREATE";
        public static final java.lang.String EXTRA_CREATE_DESCRIPTION = "com.android.contacts.action.CREATE_DESCRIPTION";
        public static final java.lang.String EXTRA_PHONE_URIS = "com.android.contacts.extra.PHONE_URIS";
        @java.lang.Deprecated
        public static final java.lang.String EXTRA_TARGET_RECT = "target_rect";
        @java.lang.Deprecated
        public static final java.lang.String EXTRA_MODE = "mode";
        @java.lang.Deprecated
        public static final int MODE_SMALL = 1;
        @java.lang.Deprecated
        public static final int MODE_MEDIUM = 2;
        @java.lang.Deprecated
        public static final int MODE_LARGE = 3;
        @java.lang.Deprecated
        public static final java.lang.String EXTRA_EXCLUDE_MIMES = "exclude_mimes";
        public Intents() {}

        public static final class Insert {
            public static final java.lang.String ACTION = "android.intent.action.INSERT";
            public static final java.lang.String FULL_MODE = "full_mode";
            public static final java.lang.String NAME = "name";
            public static final java.lang.String PHONETIC_NAME = "phonetic_name";
            public static final java.lang.String COMPANY = "company";
            public static final java.lang.String JOB_TITLE = "job_title";
            public static final java.lang.String NOTES = "notes";
            public static final java.lang.String PHONE = "phone";
            public static final java.lang.String PHONE_TYPE = "phone_type";
            public static final java.lang.String PHONE_ISPRIMARY = "phone_isprimary";
            public static final java.lang.String SECONDARY_PHONE = "secondary_phone";
            public static final java.lang.String SECONDARY_PHONE_TYPE = "secondary_phone_type";
            public static final java.lang.String TERTIARY_PHONE = "tertiary_phone";
            public static final java.lang.String TERTIARY_PHONE_TYPE = "tertiary_phone_type";
            public static final java.lang.String EMAIL = "email";
            public static final java.lang.String EMAIL_TYPE = "email_type";
            public static final java.lang.String EMAIL_ISPRIMARY = "email_isprimary";
            public static final java.lang.String SECONDARY_EMAIL = "secondary_email";
            public static final java.lang.String SECONDARY_EMAIL_TYPE = "secondary_email_type";
            public static final java.lang.String TERTIARY_EMAIL = "tertiary_email";
            public static final java.lang.String TERTIARY_EMAIL_TYPE = "tertiary_email_type";
            public static final java.lang.String POSTAL = "postal";
            public static final java.lang.String POSTAL_TYPE = "postal_type";
            public static final java.lang.String POSTAL_ISPRIMARY = "postal_isprimary";
            public static final java.lang.String IM_HANDLE = "im_handle";
            public static final java.lang.String IM_PROTOCOL = "im_protocol";
            public static final java.lang.String IM_ISPRIMARY = "im_isprimary";
            public static final java.lang.String DATA = "data";
            public static final java.lang.String EXTRA_ACCOUNT = "android.provider.extra.ACCOUNT";
            public static final java.lang.String EXTRA_DATA_SET = "android.provider.extra.DATA_SET";
            public Insert() {}
        }
    }

    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final class MetadataSync implements android.provider.BaseColumns, android.provider.ContactsContract.MetadataSyncColumns {
        public static final java.lang.String METADATA_AUTHORITY = "com.android.contacts.metadata";
        public static final android.net.Uri METADATA_AUTHORITY_URI = null;
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contact_metadata";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_metadata";
        private MetadataSync() {}
    }

    @java.lang.Deprecated
    @android.annotation.SystemApi
    protected static interface MetadataSyncColumns {
        public static final java.lang.String RAW_CONTACT_BACKUP_ID = "raw_contact_backup_id";
        public static final java.lang.String ACCOUNT_TYPE = "account_type";
        public static final java.lang.String ACCOUNT_NAME = "account_name";
        public static final java.lang.String DATA_SET = "data_set";
        public static final java.lang.String DATA = "data";
        public static final java.lang.String DELETED = "deleted";
    }

    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final class MetadataSyncState implements android.provider.BaseColumns, android.provider.ContactsContract.MetadataSyncStateColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contact_metadata_sync_state";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_metadata_sync_state";
        private MetadataSyncState() {}
    }

    @java.lang.Deprecated
    @android.annotation.SystemApi
    protected static interface MetadataSyncStateColumns {
        public static final java.lang.String ACCOUNT_TYPE = "account_type";
        public static final java.lang.String ACCOUNT_NAME = "account_name";
        public static final java.lang.String DATA_SET = "data_set";
        public static final java.lang.String STATE = "state";
    }

    public static final class PhoneLookup implements android.provider.BaseColumns, android.provider.ContactsContract.PhoneLookupColumns, android.provider.ContactsContract.ContactsColumns, android.provider.ContactsContract.ContactOptionsColumns, android.provider.ContactsContract.ContactNameColumns {
        public static final android.net.Uri CONTENT_FILTER_URI = null;
        public static final android.net.Uri ENTERPRISE_CONTENT_FILTER_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/phone_lookup";
        public static final java.lang.String QUERY_PARAMETER_SIP_ADDRESS = "sip";
        private PhoneLookup() {}
    }

    protected static interface PhoneLookupColumns {
        public static final java.lang.String DATA_ID = "data_id";
        public static final java.lang.String CONTACT_ID = "contact_id";
        public static final java.lang.String NUMBER = "number";
        public static final java.lang.String TYPE = "type";
        public static final java.lang.String LABEL = "label";
        public static final java.lang.String NORMALIZED_NUMBER = "normalized_number";
    }

    public static interface PhoneticNameStyle {
        public static final int UNDEFINED = 0;
        public static final int PINYIN = 3;
        public static final int JAPANESE = 4;
        public static final int KOREAN = 5;
    }

    public static final class PhotoFiles implements android.provider.BaseColumns, android.provider.ContactsContract.PhotoFilesColumns {
        private PhotoFiles() {}
    }

    protected static interface PhotoFilesColumns {
        public static final java.lang.String HEIGHT = "height";
        public static final java.lang.String WIDTH = "width";
        public static final java.lang.String FILESIZE = "filesize";
    }

    public static final class PinnedPositions {
        public static final java.lang.String UNDEMOTE_METHOD = "undemote";
        public static final int UNPINNED = 0;
        public static final int DEMOTED = -1;
        public PinnedPositions() {}
        public static void undemote(android.content.ContentResolver p0, long p1) {}
        public static void pin(android.content.ContentResolver p0, long p1, int p2) {}
    }

    @java.lang.Deprecated
    public static final class Presence extends android.provider.ContactsContract.StatusUpdates {
        public Presence() { super(); }
    }

    protected static interface PresenceColumns {
        public static final java.lang.String DATA_ID = "presence_data_id";
        public static final java.lang.String PROTOCOL = "protocol";
        public static final java.lang.String CUSTOM_PROTOCOL = "custom_protocol";
        public static final java.lang.String IM_HANDLE = "im_handle";
        public static final java.lang.String IM_ACCOUNT = "im_account";
    }

    public static final class Profile implements android.provider.BaseColumns, android.provider.ContactsContract.ContactsColumns, android.provider.ContactsContract.ContactOptionsColumns, android.provider.ContactsContract.ContactNameColumns, android.provider.ContactsContract.ContactStatusColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri CONTENT_VCARD_URI = null;
        public static final android.net.Uri CONTENT_RAW_CONTACTS_URI = null;
        public static final long MIN_ID = 9223372034707292160L;
        private Profile() {}
    }

    public static final class ProfileSyncState implements android.provider.SyncStateContract.Columns {
        public static final java.lang.String CONTENT_DIRECTORY = "syncstate";
        public static final android.net.Uri CONTENT_URI = null;
        private ProfileSyncState() {}
        public static byte[] get(android.content.ContentProviderClient p0, android.accounts.Account p1) throws android.os.RemoteException { return null; }
        public static android.util.Pair<android.net.Uri, byte[]> getWithUri(android.content.ContentProviderClient p0, android.accounts.Account p1) throws android.os.RemoteException { return null; }
        public static void set(android.content.ContentProviderClient p0, android.accounts.Account p1, byte[] p2) throws android.os.RemoteException {}
        public static android.content.ContentProviderOperation newSetOperation(android.accounts.Account p0, byte[] p1) { return null; }
    }

    public static final class ProviderStatus {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/provider_status";
        public static final java.lang.String STATUS = "status";
        public static final int STATUS_NORMAL = 0;
        public static final int STATUS_BUSY = 1;
        public static final int STATUS_EMPTY = 2;
        public static final java.lang.String DATABASE_CREATION_TIMESTAMP = "database_creation_timestamp";
        private ProviderStatus() {}
    }

    public static final class QuickContact {
        public static final java.lang.String ACTION_QUICK_CONTACT = "android.provider.action.QUICK_CONTACT";
        @java.lang.Deprecated
        public static final java.lang.String EXTRA_TARGET_RECT = "android.provider.extra.TARGET_RECT";
        public static final java.lang.String EXTRA_MODE = "android.provider.extra.MODE";
        public static final java.lang.String EXTRA_PRIORITIZED_MIMETYPE = "android.provider.extra.PRIORITIZED_MIMETYPE";
        public static final java.lang.String EXTRA_EXCLUDE_MIMES = "android.provider.extra.EXCLUDE_MIMES";
        public static final int MODE_SMALL = 1;
        public static final int MODE_MEDIUM = 2;
        public static final int MODE_LARGE = 3;
        public static final int MODE_DEFAULT = 3;
        public QuickContact() {}
        public static android.content.Intent composeQuickContactsIntent(android.content.Context p0, android.view.View p1, android.net.Uri p2, int p3, java.lang.String[] p4) { return null; }
        public static android.content.Intent composeQuickContactsIntent(android.content.Context p0, android.graphics.Rect p1, android.net.Uri p2, int p3, java.lang.String[] p4) { return null; }
        public static android.content.Intent rebuildManagedQuickContactsIntent(java.lang.String p0, long p1, boolean p2, long p3, android.content.Intent p4) { return null; }
        public static void showQuickContact(android.content.Context p0, android.view.View p1, android.net.Uri p2, int p3, java.lang.String[] p4) {}
        public static void showQuickContact(android.content.Context p0, android.graphics.Rect p1, android.net.Uri p2, int p3, java.lang.String[] p4) {}
        public static void showQuickContact(android.content.Context p0, android.view.View p1, android.net.Uri p2, java.lang.String[] p3, java.lang.String p4) {}
        public static void showQuickContact(android.content.Context p0, android.graphics.Rect p1, android.net.Uri p2, java.lang.String[] p3, java.lang.String p4) {}
    }

    public static final class RawContacts implements android.provider.BaseColumns, android.provider.ContactsContract.RawContactsColumns, android.provider.ContactsContract.ContactOptionsColumns, android.provider.ContactsContract.ContactNameColumns, android.provider.ContactsContract.SyncColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/raw_contact";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/raw_contact";
        public static final int AGGREGATION_MODE_DEFAULT = 0;
        @java.lang.Deprecated
        public static final int AGGREGATION_MODE_IMMEDIATE = 1;
        public static final int AGGREGATION_MODE_SUSPENDED = 2;
        public static final int AGGREGATION_MODE_DISABLED = 3;
        private RawContacts() {}
        public static android.net.Uri getContactLookupUri(android.content.ContentResolver p0, android.net.Uri p1) { return null; }
        public static java.lang.String getLocalAccountName(android.content.Context p0) { return null; }
        public static java.lang.String getLocalAccountType(android.content.Context p0) { return null; }
        public static android.content.EntityIterator newEntityIterator(android.database.Cursor p0) { return null; }

        public static final class Data implements android.provider.BaseColumns, android.provider.ContactsContract.DataColumns {
            public static final java.lang.String CONTENT_DIRECTORY = "data";
            private Data() {}
        }

        public static final class DisplayPhoto {
            public static final java.lang.String CONTENT_DIRECTORY = "display_photo";
            private DisplayPhoto() {}
        }

        public static final class Entity implements android.provider.BaseColumns, android.provider.ContactsContract.DataColumns {
            public static final java.lang.String CONTENT_DIRECTORY = "entity";
            public static final java.lang.String DATA_ID = "data_id";
            private Entity() {}
        }

        private static class EntityIteratorImpl extends android.content.CursorEntityIterator {
            private static final java.lang.String[] DATA_KEYS = null;
            public EntityIteratorImpl(android.database.Cursor p0) { super(null); }
            public android.content.Entity getEntityAndIncrementCursor(android.database.Cursor p0) throws android.os.RemoteException { return null; }
        }

        @java.lang.Deprecated
        public static final class StreamItems implements android.provider.BaseColumns, android.provider.ContactsContract.StreamItemsColumns {
            @java.lang.Deprecated
            public static final java.lang.String CONTENT_DIRECTORY = "stream_items";
            @java.lang.Deprecated
            private StreamItems() {}
        }
    }

    protected static interface RawContactsColumns {
        public static final java.lang.String CONTACT_ID = "contact_id";
        public static final java.lang.String BACKUP_ID = "backup_id";
        public static final java.lang.String DATA_SET = "data_set";
        public static final java.lang.String ACCOUNT_TYPE_AND_DATA_SET = "account_type_and_data_set";
        public static final java.lang.String AGGREGATION_MODE = "aggregation_mode";
        public static final java.lang.String DELETED = "deleted";
        public static final java.lang.String RAW_CONTACT_IS_READ_ONLY = "raw_contact_is_read_only";
        public static final java.lang.String RAW_CONTACT_IS_USER_PROFILE = "raw_contact_is_user_profile";
        @java.lang.Deprecated
        public static final java.lang.String METADATA_DIRTY = "metadata_dirty";
    }

    public static final class RawContactsEntity implements android.provider.BaseColumns, android.provider.ContactsContract.DataColumns, android.provider.ContactsContract.RawContactsColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri CORP_CONTENT_URI = null;
        public static final android.net.Uri PROFILE_CONTENT_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/raw_contact_entity";
        public static final java.lang.String FOR_EXPORT_ONLY = "for_export_only";
        public static final java.lang.String DATA_ID = "data_id";
        private RawContactsEntity() {}
    }

    public static class SearchSnippets {
        public static final java.lang.String SNIPPET = "snippet";
        public static final java.lang.String SNIPPET_ARGS_PARAM_KEY = "snippet_args";
        public static final java.lang.String DEFERRED_SNIPPETING_KEY = "deferred_snippeting";
        public SearchSnippets() {}
    }

    public static final class Settings implements android.provider.ContactsContract.SettingsColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/setting";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/setting";
        private Settings() {}
    }

    protected static interface SettingsColumns {
        public static final java.lang.String ACCOUNT_NAME = "account_name";
        public static final java.lang.String ACCOUNT_TYPE = "account_type";
        public static final java.lang.String DATA_SET = "data_set";
        public static final java.lang.String SHOULD_SYNC = "should_sync";
        public static final java.lang.String UNGROUPED_VISIBLE = "ungrouped_visible";
        public static final java.lang.String ANY_UNSYNCED = "any_unsynced";
        public static final java.lang.String UNGROUPED_COUNT = "summ_count";
        public static final java.lang.String UNGROUPED_WITH_PHONES = "summ_phones";
    }

    protected static interface StatusColumns {
        public static final java.lang.String PRESENCE = "mode";
        @java.lang.Deprecated
        public static final java.lang.String PRESENCE_STATUS = "mode";
        public static final int OFFLINE = 0;
        public static final int INVISIBLE = 1;
        public static final int AWAY = 2;
        public static final int IDLE = 3;
        public static final int DO_NOT_DISTURB = 4;
        public static final int AVAILABLE = 5;
        public static final java.lang.String STATUS = "status";
        @java.lang.Deprecated
        public static final java.lang.String PRESENCE_CUSTOM_STATUS = "status";
        public static final java.lang.String STATUS_TIMESTAMP = "status_ts";
        public static final java.lang.String STATUS_RES_PACKAGE = "status_res_package";
        public static final java.lang.String STATUS_LABEL = "status_label";
        public static final java.lang.String STATUS_ICON = "status_icon";
        public static final java.lang.String CHAT_CAPABILITY = "chat_capability";
        public static final int CAPABILITY_HAS_VOICE = 1;
        public static final int CAPABILITY_HAS_VIDEO = 2;
        public static final int CAPABILITY_HAS_CAMERA = 4;
    }

    public static class StatusUpdates implements android.provider.ContactsContract.StatusColumns, android.provider.ContactsContract.PresenceColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri PROFILE_CONTENT_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/status-update";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/status-update";
        private StatusUpdates() {}
        public static final int getPresenceIconResourceId(int p0) { return 0; }
        public static final int getPresencePrecedence(int p0) { return 0; }
    }

    @java.lang.Deprecated
    public static final class StreamItemPhotos implements android.provider.BaseColumns, android.provider.ContactsContract.StreamItemPhotosColumns {
        @java.lang.Deprecated
        public static final java.lang.String PHOTO = "photo";
        @java.lang.Deprecated
        private StreamItemPhotos() {}
    }

    @java.lang.Deprecated
    protected static interface StreamItemPhotosColumns {
        @java.lang.Deprecated
        public static final java.lang.String STREAM_ITEM_ID = "stream_item_id";
        @java.lang.Deprecated
        public static final java.lang.String SORT_INDEX = "sort_index";
        @java.lang.Deprecated
        public static final java.lang.String PHOTO_FILE_ID = "photo_file_id";
        @java.lang.Deprecated
        public static final java.lang.String PHOTO_URI = "photo_uri";
        @java.lang.Deprecated
        public static final java.lang.String SYNC1 = "stream_item_photo_sync1";
        @java.lang.Deprecated
        public static final java.lang.String SYNC2 = "stream_item_photo_sync2";
        @java.lang.Deprecated
        public static final java.lang.String SYNC3 = "stream_item_photo_sync3";
        @java.lang.Deprecated
        public static final java.lang.String SYNC4 = "stream_item_photo_sync4";
    }

    @java.lang.Deprecated
    public static final class StreamItems implements android.provider.BaseColumns, android.provider.ContactsContract.StreamItemsColumns {
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_URI = null;
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_PHOTO_URI = null;
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_LIMIT_URI = null;
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/stream_item";
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/stream_item";
        @java.lang.Deprecated
        public static final java.lang.String MAX_ITEMS = "max_items";
        @java.lang.Deprecated
        private StreamItems() {}

        @java.lang.Deprecated
        public static final class StreamItemPhotos implements android.provider.BaseColumns, android.provider.ContactsContract.StreamItemPhotosColumns {
            @java.lang.Deprecated
            public static final java.lang.String CONTENT_DIRECTORY = "photo";
            @java.lang.Deprecated
            public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/stream_item_photo";
            @java.lang.Deprecated
            public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/stream_item_photo";
            @java.lang.Deprecated
            private StreamItemPhotos() {}
        }
    }

    @java.lang.Deprecated
    protected static interface StreamItemsColumns {
        @java.lang.Deprecated
        public static final java.lang.String CONTACT_ID = "contact_id";
        @java.lang.Deprecated
        public static final java.lang.String CONTACT_LOOKUP_KEY = "contact_lookup";
        @java.lang.Deprecated
        public static final java.lang.String RAW_CONTACT_ID = "raw_contact_id";
        @java.lang.Deprecated
        public static final java.lang.String RES_PACKAGE = "res_package";
        @java.lang.Deprecated
        public static final java.lang.String ACCOUNT_TYPE = "account_type";
        @java.lang.Deprecated
        public static final java.lang.String ACCOUNT_NAME = "account_name";
        @java.lang.Deprecated
        public static final java.lang.String DATA_SET = "data_set";
        @java.lang.Deprecated
        public static final java.lang.String RAW_CONTACT_SOURCE_ID = "raw_contact_source_id";
        @java.lang.Deprecated
        public static final java.lang.String RES_ICON = "icon";
        @java.lang.Deprecated
        public static final java.lang.String RES_LABEL = "label";
        @java.lang.Deprecated
        public static final java.lang.String TEXT = "text";
        @java.lang.Deprecated
        public static final java.lang.String TIMESTAMP = "timestamp";
        @java.lang.Deprecated
        public static final java.lang.String COMMENTS = "comments";
        @java.lang.Deprecated
        public static final java.lang.String SYNC1 = "stream_item_sync1";
        @java.lang.Deprecated
        public static final java.lang.String SYNC2 = "stream_item_sync2";
        @java.lang.Deprecated
        public static final java.lang.String SYNC3 = "stream_item_sync3";
        @java.lang.Deprecated
        public static final java.lang.String SYNC4 = "stream_item_sync4";
    }

    protected static interface SyncColumns extends android.provider.ContactsContract.BaseSyncColumns {
        public static final java.lang.String ACCOUNT_NAME = "account_name";
        public static final java.lang.String ACCOUNT_TYPE = "account_type";
        public static final java.lang.String SOURCE_ID = "sourceid";
        public static final java.lang.String VERSION = "version";
        public static final java.lang.String DIRTY = "dirty";
    }

    public static final class SyncState implements android.provider.SyncStateContract.Columns {
        public static final java.lang.String CONTENT_DIRECTORY = "syncstate";
        public static final android.net.Uri CONTENT_URI = null;
        private SyncState() {}
        public static byte[] get(android.content.ContentProviderClient p0, android.accounts.Account p1) throws android.os.RemoteException { return null; }
        public static android.util.Pair<android.net.Uri, byte[]> getWithUri(android.content.ContentProviderClient p0, android.accounts.Account p1) throws android.os.RemoteException { return null; }
        public static void set(android.content.ContentProviderClient p0, android.accounts.Account p1, byte[] p2) throws android.os.RemoteException {}
        public static android.content.ContentProviderOperation newSetOperation(android.accounts.Account p0, byte[] p1) { return null; }
    }

    @java.lang.Deprecated
    public static interface SyncStateColumns extends android.provider.SyncStateContract.Columns {
    }
}
