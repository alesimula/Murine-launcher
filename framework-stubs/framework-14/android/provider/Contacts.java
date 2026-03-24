package android.provider;

@java.lang.Deprecated
public class Contacts {
    @java.lang.Deprecated
    public static final java.lang.String AUTHORITY = "contacts";
    @java.lang.Deprecated
    public static final android.net.Uri CONTENT_URI = null;
    @java.lang.Deprecated
    public static final int KIND_EMAIL = 1;
    @java.lang.Deprecated
    public static final int KIND_POSTAL = 2;
    @java.lang.Deprecated
    public static final int KIND_IM = 3;
    @java.lang.Deprecated
    public static final int KIND_ORGANIZATION = 4;
    @java.lang.Deprecated
    public static final int KIND_PHONE = 5;

    @java.lang.Deprecated
    public static interface OrganizationColumns {
        @java.lang.Deprecated
        public static final java.lang.String TYPE = "type";
        @java.lang.Deprecated
        public static final int TYPE_CUSTOM = 0;
        @java.lang.Deprecated
        public static final int TYPE_WORK = 1;
        @java.lang.Deprecated
        public static final int TYPE_OTHER = 2;
        @java.lang.Deprecated
        public static final java.lang.String LABEL = "label";
        @java.lang.Deprecated
        public static final java.lang.String COMPANY = "company";
        @java.lang.Deprecated
        public static final java.lang.String TITLE = "title";
        @java.lang.Deprecated
        public static final java.lang.String PERSON_ID = "person";
        @java.lang.Deprecated
        public static final java.lang.String ISPRIMARY = "isprimary";
    }

    @java.lang.Deprecated
    public static final class Intents {
        @java.lang.Deprecated
        public static final java.lang.String SEARCH_SUGGESTION_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CLICKED";
        @java.lang.Deprecated
        public static final java.lang.String SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED";
        @java.lang.Deprecated
        public static final java.lang.String SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED";
        @java.lang.Deprecated
        public static final java.lang.String ATTACH_IMAGE = "com.android.contacts.action.ATTACH_IMAGE";
        @java.lang.Deprecated
        public static final java.lang.String SHOW_OR_CREATE_CONTACT = "com.android.contacts.action.SHOW_OR_CREATE_CONTACT";
        @java.lang.Deprecated
        public static final java.lang.String EXTRA_FORCE_CREATE = "com.android.contacts.action.FORCE_CREATE";
        @java.lang.Deprecated
        public static final java.lang.String EXTRA_CREATE_DESCRIPTION = "com.android.contacts.action.CREATE_DESCRIPTION";
        @java.lang.Deprecated
        public static final java.lang.String EXTRA_TARGET_RECT = "target_rect";
        @java.lang.Deprecated
        public Intents() {}

        @java.lang.Deprecated
        public static final class Insert {
            @java.lang.Deprecated
            public static final java.lang.String ACTION = "android.intent.action.INSERT";
            @java.lang.Deprecated
            public static final java.lang.String FULL_MODE = "full_mode";
            @java.lang.Deprecated
            public static final java.lang.String NAME = "name";
            @java.lang.Deprecated
            public static final java.lang.String PHONETIC_NAME = "phonetic_name";
            @java.lang.Deprecated
            public static final java.lang.String COMPANY = "company";
            @java.lang.Deprecated
            public static final java.lang.String JOB_TITLE = "job_title";
            @java.lang.Deprecated
            public static final java.lang.String NOTES = "notes";
            @java.lang.Deprecated
            public static final java.lang.String PHONE = "phone";
            @java.lang.Deprecated
            public static final java.lang.String PHONE_TYPE = "phone_type";
            @java.lang.Deprecated
            public static final java.lang.String PHONE_ISPRIMARY = "phone_isprimary";
            @java.lang.Deprecated
            public static final java.lang.String SECONDARY_PHONE = "secondary_phone";
            @java.lang.Deprecated
            public static final java.lang.String SECONDARY_PHONE_TYPE = "secondary_phone_type";
            @java.lang.Deprecated
            public static final java.lang.String TERTIARY_PHONE = "tertiary_phone";
            @java.lang.Deprecated
            public static final java.lang.String TERTIARY_PHONE_TYPE = "tertiary_phone_type";
            @java.lang.Deprecated
            public static final java.lang.String EMAIL = "email";
            @java.lang.Deprecated
            public static final java.lang.String EMAIL_TYPE = "email_type";
            @java.lang.Deprecated
            public static final java.lang.String EMAIL_ISPRIMARY = "email_isprimary";
            @java.lang.Deprecated
            public static final java.lang.String SECONDARY_EMAIL = "secondary_email";
            @java.lang.Deprecated
            public static final java.lang.String SECONDARY_EMAIL_TYPE = "secondary_email_type";
            @java.lang.Deprecated
            public static final java.lang.String TERTIARY_EMAIL = "tertiary_email";
            @java.lang.Deprecated
            public static final java.lang.String TERTIARY_EMAIL_TYPE = "tertiary_email_type";
            @java.lang.Deprecated
            public static final java.lang.String POSTAL = "postal";
            @java.lang.Deprecated
            public static final java.lang.String POSTAL_TYPE = "postal_type";
            @java.lang.Deprecated
            public static final java.lang.String POSTAL_ISPRIMARY = "postal_isprimary";
            @java.lang.Deprecated
            public static final java.lang.String IM_HANDLE = "im_handle";
            @java.lang.Deprecated
            public static final java.lang.String IM_PROTOCOL = "im_protocol";
            @java.lang.Deprecated
            public static final java.lang.String IM_ISPRIMARY = "im_isprimary";
            @java.lang.Deprecated
            public Insert() {}
        }

        @java.lang.Deprecated
        public static final class UI {
            @java.lang.Deprecated
            public static final java.lang.String LIST_DEFAULT = "com.android.contacts.action.LIST_DEFAULT";
            @java.lang.Deprecated
            public static final java.lang.String LIST_GROUP_ACTION = "com.android.contacts.action.LIST_GROUP";
            @java.lang.Deprecated
            public static final java.lang.String GROUP_NAME_EXTRA_KEY = "com.android.contacts.extra.GROUP";
            @java.lang.Deprecated
            public static final java.lang.String LIST_ALL_CONTACTS_ACTION = "com.android.contacts.action.LIST_ALL_CONTACTS";
            @java.lang.Deprecated
            public static final java.lang.String LIST_CONTACTS_WITH_PHONES_ACTION = "com.android.contacts.action.LIST_CONTACTS_WITH_PHONES";
            @java.lang.Deprecated
            public static final java.lang.String LIST_STARRED_ACTION = "com.android.contacts.action.LIST_STARRED";
            @java.lang.Deprecated
            public static final java.lang.String LIST_FREQUENT_ACTION = "com.android.contacts.action.LIST_FREQUENT";
            @java.lang.Deprecated
            public static final java.lang.String LIST_STREQUENT_ACTION = "com.android.contacts.action.LIST_STREQUENT";
            @java.lang.Deprecated
            public static final java.lang.String TITLE_EXTRA_KEY = "com.android.contacts.extra.TITLE_EXTRA";
            @java.lang.Deprecated
            public static final java.lang.String FILTER_CONTACTS_ACTION = "com.android.contacts.action.FILTER_CONTACTS";
            @java.lang.Deprecated
            public static final java.lang.String FILTER_TEXT_EXTRA_KEY = "com.android.contacts.extra.FILTER_TEXT";
            @java.lang.Deprecated
            public UI() {}
        }
    }

    @java.lang.Deprecated
    public static final class Settings implements android.provider.BaseColumns, android.provider.Contacts.SettingsColumns {
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_URI = null;
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_DIRECTORY = "settings";
        @java.lang.Deprecated
        public static final java.lang.String DEFAULT_SORT_ORDER = "key ASC";
        @java.lang.Deprecated
        public static final java.lang.String SYNC_EVERYTHING = "syncEverything";
        @java.lang.Deprecated
        public static java.lang.String getSetting(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2) { return null; }
        @java.lang.Deprecated
        public static void setSetting(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    }

    @java.lang.Deprecated
    public static interface PhonesColumns {
        @java.lang.Deprecated
        public static final java.lang.String TYPE = "type";
        @java.lang.Deprecated
        public static final int TYPE_CUSTOM = 0;
        @java.lang.Deprecated
        public static final int TYPE_HOME = 1;
        @java.lang.Deprecated
        public static final int TYPE_MOBILE = 2;
        @java.lang.Deprecated
        public static final int TYPE_WORK = 3;
        @java.lang.Deprecated
        public static final int TYPE_FAX_WORK = 4;
        @java.lang.Deprecated
        public static final int TYPE_FAX_HOME = 5;
        @java.lang.Deprecated
        public static final int TYPE_PAGER = 6;
        @java.lang.Deprecated
        public static final int TYPE_OTHER = 7;
        @java.lang.Deprecated
        public static final java.lang.String LABEL = "label";
        @java.lang.Deprecated
        public static final java.lang.String NUMBER = "number";
        @java.lang.Deprecated
        public static final java.lang.String NUMBER_KEY = "number_key";
        @java.lang.Deprecated
        public static final java.lang.String ISPRIMARY = "isprimary";
    }

    @java.lang.Deprecated
    public static final class GroupMembership implements android.provider.BaseColumns, android.provider.Contacts.GroupsColumns {
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_URI = null;
        @java.lang.Deprecated
        public static final android.net.Uri RAW_CONTENT_URI = null;
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_DIRECTORY = "groupmembership";
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contactsgroupmembership";
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contactsgroupmembership";
        @java.lang.Deprecated
        public static final java.lang.String DEFAULT_SORT_ORDER = "group_id ASC";
        @java.lang.Deprecated
        public static final java.lang.String GROUP_ID = "group_id";
        @java.lang.Deprecated
        public static final java.lang.String GROUP_SYNC_ID = "group_sync_id";
        @java.lang.Deprecated
        public static final java.lang.String GROUP_SYNC_ACCOUNT = "group_sync_account";
        @java.lang.Deprecated
        public static final java.lang.String GROUP_SYNC_ACCOUNT_TYPE = "group_sync_account_type";
        @java.lang.Deprecated
        public static final java.lang.String PERSON_ID = "person";
    }

    @java.lang.Deprecated
    public static final class Groups implements android.provider.BaseColumns, android.provider.Contacts.GroupsColumns {
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_URI = null;
        @java.lang.Deprecated
        public static final android.net.Uri DELETED_CONTENT_URI = null;
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contactsgroup";
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contactsgroup";
        @java.lang.Deprecated
        public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";
        @java.lang.Deprecated
        public static final java.lang.String GROUP_ANDROID_STARRED = "Starred in Android";
        @java.lang.Deprecated
        public static final java.lang.String GROUP_MY_CONTACTS = "Contacts";
    }

    @java.lang.Deprecated
    public static interface PeopleColumns {
        @java.lang.Deprecated
        public static final java.lang.String NAME = "name";
        @java.lang.Deprecated
        public static final java.lang.String PHONETIC_NAME = "phonetic_name";
        @java.lang.Deprecated
        public static final java.lang.String DISPLAY_NAME = "display_name";
        @java.lang.Deprecated
        public static final java.lang.String SORT_STRING = "sort_string";
        @java.lang.Deprecated
        public static final java.lang.String NOTES = "notes";
        @java.lang.Deprecated
        public static final java.lang.String TIMES_CONTACTED = "times_contacted";
        @java.lang.Deprecated
        public static final java.lang.String LAST_TIME_CONTACTED = "last_time_contacted";
        @java.lang.Deprecated
        public static final java.lang.String CUSTOM_RINGTONE = "custom_ringtone";
        @java.lang.Deprecated
        public static final java.lang.String SEND_TO_VOICEMAIL = "send_to_voicemail";
        @java.lang.Deprecated
        public static final java.lang.String STARRED = "starred";
        @java.lang.Deprecated
        public static final java.lang.String PHOTO_VERSION = "photo_version";
    }

    @java.lang.Deprecated
    public static interface ExtensionsColumns {
        @java.lang.Deprecated
        public static final java.lang.String NAME = "name";
        @java.lang.Deprecated
        public static final java.lang.String VALUE = "value";
    }

    @java.lang.Deprecated
    public static final class Organizations implements android.provider.BaseColumns, android.provider.Contacts.OrganizationColumns {
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_URI = null;
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_DIRECTORY = "organizations";
        @java.lang.Deprecated
        public static final java.lang.String DEFAULT_SORT_ORDER = "company, title, isprimary ASC";
        @java.lang.Deprecated
        public static final java.lang.CharSequence getDisplayLabel(android.content.Context p0, int p1, java.lang.CharSequence p2) { return null; }
    }

    @java.lang.Deprecated
    public static final class Extensions implements android.provider.BaseColumns, android.provider.Contacts.ExtensionsColumns {
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_URI = null;
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contact_extensions";
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_extensions";
        @java.lang.Deprecated
        public static final java.lang.String DEFAULT_SORT_ORDER = "person, name ASC";
        @java.lang.Deprecated
        public static final java.lang.String PERSON_ID = "person";
    }

    @java.lang.Deprecated
    public static final class Phones implements android.provider.BaseColumns, android.provider.Contacts.PhonesColumns, android.provider.Contacts.PeopleColumns {
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_URI = null;
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_FILTER_URL = null;
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/phone";
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/phone";
        @java.lang.Deprecated
        public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";
        @java.lang.Deprecated
        public static final java.lang.String PERSON_ID = "person";
        @java.lang.Deprecated
        public static final java.lang.CharSequence getDisplayLabel(android.content.Context p0, int p1, java.lang.CharSequence p2, java.lang.CharSequence[] p3) { return null; }
        @java.lang.Deprecated
        public static final java.lang.CharSequence getDisplayLabel(android.content.Context p0, int p1, java.lang.CharSequence p2) { return null; }
    }

    @java.lang.Deprecated
    public static interface PhotosColumns {
        @java.lang.Deprecated
        public static final java.lang.String LOCAL_VERSION = "local_version";
        @java.lang.Deprecated
        public static final java.lang.String PERSON_ID = "person";
        @java.lang.Deprecated
        public static final java.lang.String DOWNLOAD_REQUIRED = "download_required";
        @java.lang.Deprecated
        public static final java.lang.String EXISTS_ON_SERVER = "exists_on_server";
        @java.lang.Deprecated
        public static final java.lang.String SYNC_ERROR = "sync_error";
        @java.lang.Deprecated
        public static final java.lang.String DATA = "data";
    }

    @java.lang.Deprecated
    public static interface SettingsColumns {
        @java.lang.Deprecated
        public static final java.lang.String _SYNC_ACCOUNT = "_sync_account";
        @java.lang.Deprecated
        public static final java.lang.String _SYNC_ACCOUNT_TYPE = "_sync_account_type";
        @java.lang.Deprecated
        public static final java.lang.String KEY = "key";
        @java.lang.Deprecated
        public static final java.lang.String VALUE = "value";
    }

    @java.lang.Deprecated
    public static final class ContactMethods implements android.provider.BaseColumns, android.provider.Contacts.ContactMethodsColumns, android.provider.Contacts.PeopleColumns {
        @java.lang.Deprecated
        public static final java.lang.String POSTAL_LOCATION_LATITUDE = "data";
        @java.lang.Deprecated
        public static final java.lang.String POSTAL_LOCATION_LONGITUDE = "aux_data";
        @java.lang.Deprecated
        public static final int PROTOCOL_AIM = 0;
        @java.lang.Deprecated
        public static final int PROTOCOL_MSN = 1;
        @java.lang.Deprecated
        public static final int PROTOCOL_YAHOO = 2;
        @java.lang.Deprecated
        public static final int PROTOCOL_SKYPE = 3;
        @java.lang.Deprecated
        public static final int PROTOCOL_QQ = 4;
        @java.lang.Deprecated
        public static final int PROTOCOL_GOOGLE_TALK = 5;
        @java.lang.Deprecated
        public static final int PROTOCOL_ICQ = 6;
        @java.lang.Deprecated
        public static final int PROTOCOL_JABBER = 7;
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_URI = null;
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_EMAIL_URI = null;
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contact-methods";
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_EMAIL_TYPE = "vnd.android.cursor.dir/email";
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_POSTAL_TYPE = "vnd.android.cursor.dir/postal-address";
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_EMAIL_ITEM_TYPE = "vnd.android.cursor.item/email";
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_POSTAL_ITEM_TYPE = "vnd.android.cursor.item/postal-address";
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_IM_ITEM_TYPE = "vnd.android.cursor.item/jabber-im";
        @java.lang.Deprecated
        public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";
        @java.lang.Deprecated
        public static final java.lang.String PERSON_ID = "person";
        @java.lang.Deprecated
        public static java.lang.String encodePredefinedImProtocol(int p0) { return null; }
        @java.lang.Deprecated
        public static java.lang.String encodeCustomImProtocol(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public static java.lang.Object decodeImProtocol(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public static java.lang.String lookupProviderNameFromId(int p0) { return null; }
        @java.lang.Deprecated
        public static final java.lang.CharSequence getDisplayLabel(android.content.Context p0, int p1, int p2, java.lang.CharSequence p3) { return null; }
        @java.lang.Deprecated
        public void addPostalLocation(android.content.Context p0, long p1, double p2, double p3) {}

        static interface ProviderNames {
            public static final java.lang.String YAHOO = "Yahoo";
            public static final java.lang.String GTALK = "GTalk";
            public static final java.lang.String MSN = "MSN";
            public static final java.lang.String ICQ = "ICQ";
            public static final java.lang.String AIM = "AIM";
            public static final java.lang.String XMPP = "XMPP";
            public static final java.lang.String JABBER = "JABBER";
            public static final java.lang.String SKYPE = "SKYPE";
            public static final java.lang.String QQ = "QQ";
        }
    }

    @java.lang.Deprecated
    public static interface GroupsColumns {
        @java.lang.Deprecated
        public static final java.lang.String NAME = "name";
        @java.lang.Deprecated
        public static final java.lang.String NOTES = "notes";
        @java.lang.Deprecated
        public static final java.lang.String SHOULD_SYNC = "should_sync";
        @java.lang.Deprecated
        public static final java.lang.String SYSTEM_ID = "system_id";
    }

    @java.lang.Deprecated
    public static interface ContactMethodsColumns {
        @java.lang.Deprecated
        public static final java.lang.String KIND = "kind";
        @java.lang.Deprecated
        public static final java.lang.String TYPE = "type";
        @java.lang.Deprecated
        public static final int TYPE_CUSTOM = 0;
        @java.lang.Deprecated
        public static final int TYPE_HOME = 1;
        @java.lang.Deprecated
        public static final int TYPE_WORK = 2;
        @java.lang.Deprecated
        public static final int TYPE_OTHER = 3;
        @java.lang.Deprecated
        public static final int MOBILE_EMAIL_TYPE_INDEX = 2;
        @java.lang.Deprecated
        public static final java.lang.String MOBILE_EMAIL_TYPE_NAME = "_AUTO_CELL";
        @java.lang.Deprecated
        public static final java.lang.String LABEL = "label";
        @java.lang.Deprecated
        public static final java.lang.String DATA = "data";
        @java.lang.Deprecated
        public static final java.lang.String AUX_DATA = "aux_data";
        @java.lang.Deprecated
        public static final java.lang.String ISPRIMARY = "isprimary";
    }

    @java.lang.Deprecated
    public static final class People implements android.provider.BaseColumns, android.provider.Contacts.PeopleColumns, android.provider.Contacts.PhonesColumns, android.provider.Contacts.PresenceColumns {
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_URI = null;
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_FILTER_URI = null;
        @java.lang.Deprecated
        public static final android.net.Uri DELETED_CONTENT_URI = null;
        @java.lang.Deprecated
        public static final android.net.Uri WITH_EMAIL_OR_IM_FILTER_URI = null;
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/person";
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/person";
        @java.lang.Deprecated
        public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";
        @java.lang.Deprecated
        public static final java.lang.String PRIMARY_PHONE_ID = "primary_phone";
        @java.lang.Deprecated
        public static final java.lang.String PRIMARY_EMAIL_ID = "primary_email";
        @java.lang.Deprecated
        public static final java.lang.String PRIMARY_ORGANIZATION_ID = "primary_organization";
        @java.lang.Deprecated
        public static void markAsContacted(android.content.ContentResolver p0, long p1) {}
        @java.lang.Deprecated
        public static long tryGetMyContactsGroupId(android.content.ContentResolver p0) { return 0L; }
        @java.lang.Deprecated
        public static android.net.Uri addToMyContactsGroup(android.content.ContentResolver p0, long p1) { return null; }
        @java.lang.Deprecated
        public static android.net.Uri addToGroup(android.content.ContentResolver p0, long p1, java.lang.String p2) { return null; }
        @java.lang.Deprecated
        public static android.net.Uri addToGroup(android.content.ContentResolver p0, long p1, long p2) { return null; }
        @java.lang.Deprecated
        public static android.net.Uri createPersonInMyContactsGroup(android.content.ContentResolver p0, android.content.ContentValues p1) { return null; }
        @java.lang.Deprecated
        public static android.database.Cursor queryGroups(android.content.ContentResolver p0, long p1) { return null; }
        @java.lang.Deprecated
        public static void setPhotoData(android.content.ContentResolver p0, android.net.Uri p1, byte[] p2) {}
        @java.lang.Deprecated
        public static java.io.InputStream openContactPhotoInputStream(android.content.ContentResolver p0, android.net.Uri p1) { return null; }
        @java.lang.Deprecated
        public static android.graphics.Bitmap loadContactPhoto(android.content.Context p0, android.net.Uri p1, int p2, android.graphics.BitmapFactory.Options p3) { return null; }

        @java.lang.Deprecated
        public static final class Phones implements android.provider.BaseColumns, android.provider.Contacts.PhonesColumns, android.provider.Contacts.PeopleColumns {
            @java.lang.Deprecated
            public static final java.lang.String CONTENT_DIRECTORY = "phones";
            @java.lang.Deprecated
            public static final java.lang.String DEFAULT_SORT_ORDER = "number ASC";
        }

        @java.lang.Deprecated
        public static class Extensions implements android.provider.BaseColumns, android.provider.Contacts.ExtensionsColumns {
            @java.lang.Deprecated
            public static final java.lang.String CONTENT_DIRECTORY = "extensions";
            @java.lang.Deprecated
            public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";
            @java.lang.Deprecated
            public static final java.lang.String PERSON_ID = "person";
        }

        @java.lang.Deprecated
        public static final class ContactMethods implements android.provider.BaseColumns, android.provider.Contacts.ContactMethodsColumns, android.provider.Contacts.PeopleColumns {
            @java.lang.Deprecated
            public static final java.lang.String CONTENT_DIRECTORY = "contact_methods";
            @java.lang.Deprecated
            public static final java.lang.String DEFAULT_SORT_ORDER = "data ASC";
        }
    }

    @java.lang.Deprecated
    public static final class Photos implements android.provider.BaseColumns, android.provider.Contacts.PhotosColumns {
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_URI = null;
        @java.lang.Deprecated
        public static final java.lang.String CONTENT_DIRECTORY = "photo";
        @java.lang.Deprecated
        public static final java.lang.String DEFAULT_SORT_ORDER = "person ASC";
    }

    @java.lang.Deprecated
    public static interface PresenceColumns {
        public static final java.lang.String PRIORITY = "priority";
        public static final java.lang.String PRESENCE_STATUS = "mode";
        public static final int OFFLINE = 0;
        public static final int INVISIBLE = 1;
        public static final int AWAY = 2;
        public static final int IDLE = 3;
        public static final int DO_NOT_DISTURB = 4;
        public static final int AVAILABLE = 5;
        public static final java.lang.String PRESENCE_CUSTOM_STATUS = "status";
        @java.lang.Deprecated
        public static final java.lang.String IM_PROTOCOL = "im_protocol";
        @java.lang.Deprecated
        public static final java.lang.String IM_HANDLE = "im_handle";
        @java.lang.Deprecated
        public static final java.lang.String IM_ACCOUNT = "im_account";
    }

    @java.lang.Deprecated
    public static final class Presence implements android.provider.BaseColumns, android.provider.Contacts.PresenceColumns, android.provider.Contacts.PeopleColumns {
        @java.lang.Deprecated
        public static final android.net.Uri CONTENT_URI = null;
        @java.lang.Deprecated
        public static final java.lang.String PERSON_ID = "person";
        public Presence() {}
        @java.lang.Deprecated
        public static final int getPresenceIconResourceId(int p0) { return 0; }
        @java.lang.Deprecated
        public static final void setPresenceIcon(android.widget.ImageView p0, int p1) {}
    }
}
