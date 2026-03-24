package android.provider;

public class CallLog {
    private static final java.lang.String LOG_TAG = "CallLog";
    private static final boolean VERBOSE_LOG = false;
    public static final java.lang.String AUTHORITY = "call_log";
    public static final android.net.Uri CONTENT_URI = null;
    public static final java.lang.String SHADOW_AUTHORITY = "call_log_shadow";
    public CallLog() {}

    public static class Calls implements android.provider.BaseColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri SHADOW_CONTENT_URI = null;
        public static final android.net.Uri CONTENT_FILTER_URI = null;
        public static final java.lang.String LIMIT_PARAM_KEY = "limit";
        private static final android.net.Uri CONTENT_URI_LIMIT_1 = null;
        public static final java.lang.String OFFSET_PARAM_KEY = "offset";
        public static final java.lang.String ALLOW_VOICEMAILS_PARAM_KEY = "allow_voicemails";
        public static final java.lang.String EXTRA_CALL_TYPE_FILTER = "android.provider.extra.CALL_TYPE_FILTER";
        public static final android.net.Uri CONTENT_URI_WITH_VOICEMAIL = null;
        public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/calls";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/calls";
        public static final java.lang.String TYPE = "type";
        public static final int INCOMING_TYPE = 1;
        public static final int OUTGOING_TYPE = 2;
        public static final int MISSED_TYPE = 3;
        public static final int VOICEMAIL_TYPE = 4;
        public static final int REJECTED_TYPE = 5;
        public static final int BLOCKED_TYPE = 6;
        public static final int ANSWERED_EXTERNALLY_TYPE = 7;
        public static final java.lang.String FEATURES = "features";
        public static final int FEATURES_VIDEO = 1;
        public static final int FEATURES_PULLED_EXTERNALLY = 2;
        public static final int FEATURES_HD_CALL = 4;
        public static final int FEATURES_WIFI = 8;
        public static final int FEATURES_ASSISTED_DIALING_USED = 16;
        public static final int FEATURES_RTT = 32;
        public static final int FEATURES_VOLTE = 64;
        public static final java.lang.String NUMBER = "number";
        public static final java.lang.String NUMBER_PRESENTATION = "presentation";
        public static final int PRESENTATION_ALLOWED = 1;
        public static final int PRESENTATION_RESTRICTED = 2;
        public static final int PRESENTATION_UNKNOWN = 3;
        public static final int PRESENTATION_PAYPHONE = 4;
        public static final java.lang.String COUNTRY_ISO = "countryiso";
        public static final java.lang.String DATE = "date";
        public static final java.lang.String DURATION = "duration";
        public static final java.lang.String DATA_USAGE = "data_usage";
        public static final java.lang.String NEW = "new";
        public static final java.lang.String CACHED_NAME = "name";
        public static final java.lang.String CACHED_NUMBER_TYPE = "numbertype";
        public static final java.lang.String CACHED_NUMBER_LABEL = "numberlabel";
        public static final java.lang.String VOICEMAIL_URI = "voicemail_uri";
        public static final java.lang.String TRANSCRIPTION = "transcription";
        public static final java.lang.String TRANSCRIPTION_STATE = "transcription_state";
        public static final java.lang.String IS_READ = "is_read";
        public static final java.lang.String GEOCODED_LOCATION = "geocoded_location";
        public static final java.lang.String CACHED_LOOKUP_URI = "lookup_uri";
        public static final java.lang.String CACHED_MATCHED_NUMBER = "matched_number";
        public static final java.lang.String CACHED_NORMALIZED_NUMBER = "normalized_number";
        public static final java.lang.String CACHED_PHOTO_ID = "photo_id";
        public static final java.lang.String CACHED_PHOTO_URI = "photo_uri";
        public static final java.lang.String CACHED_FORMATTED_NUMBER = "formatted_number";
        public static final java.lang.String PHONE_ACCOUNT_COMPONENT_NAME = "subscription_component_name";
        public static final java.lang.String PHONE_ACCOUNT_ID = "subscription_id";
        public static final java.lang.String PHONE_ACCOUNT_ADDRESS = "phone_account_address";
        public static final java.lang.String PHONE_ACCOUNT_HIDDEN = "phone_account_hidden";
        public static final java.lang.String SUB_ID = "sub_id";
        public static final java.lang.String POST_DIAL_DIGITS = "post_dial_digits";
        public static final java.lang.String VIA_NUMBER = "via_number";
        public static final java.lang.String ADD_FOR_ALL_USERS = "add_for_all_users";
        public static final java.lang.String LAST_MODIFIED = "last_modified";
        private static final int MIN_DURATION_FOR_NORMALIZED_NUMBER_UPDATE_MS = 10000;
        public static final int BLOCK_REASON_NOT_BLOCKED = 0;
        public static final int BLOCK_REASON_CALL_SCREENING_SERVICE = 1;
        public static final int BLOCK_REASON_DIRECT_TO_VOICEMAIL = 2;
        public static final int BLOCK_REASON_BLOCKED_NUMBER = 3;
        public static final int BLOCK_REASON_UNKNOWN_NUMBER = 4;
        public static final int BLOCK_REASON_RESTRICTED_NUMBER = 5;
        public static final int BLOCK_REASON_PAY_PHONE = 6;
        public static final int BLOCK_REASON_NOT_IN_CONTACTS = 7;
        public static final java.lang.String CALL_SCREENING_COMPONENT_NAME = "call_screening_component_name";
        public static final java.lang.String CALL_SCREENING_APP_NAME = "call_screening_app_name";
        public static final java.lang.String BLOCK_REASON = "block_reason";
        public Calls() {}
        public static android.net.Uri addCall(android.telecom.CallerInfo p0, android.content.Context p1, java.lang.String p2, int p3, int p4, int p5, android.telecom.PhoneAccountHandle p6, long p7, int p8, java.lang.Long p9) { return null; }
        public static android.net.Uri addCall(android.telecom.CallerInfo p0, android.content.Context p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, int p6, int p7, android.telecom.PhoneAccountHandle p8, long p9, int p10, java.lang.Long p11, boolean p12, android.os.UserHandle p13) { return null; }
        public static android.net.Uri addCall(android.telecom.CallerInfo p0, android.content.Context p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, int p6, int p7, android.telecom.PhoneAccountHandle p8, long p9, int p10, java.lang.Long p11, boolean p12, android.os.UserHandle p13, boolean p14, int p15, java.lang.CharSequence p16, java.lang.String p17) { return null; }
        private static java.lang.String charSequenceToString(java.lang.CharSequence p0) { return null; }
        public static boolean shouldHaveSharedCallLogEntries(android.content.Context p0, android.os.UserManager p1, int p2) { return false; }
        public static java.lang.String getLastOutgoingCall(android.content.Context p0) { return null; }
        private static android.net.Uri addEntryAndRemoveExpiredEntries(android.content.Context p0, android.os.UserManager p1, android.os.UserHandle p2, android.content.ContentValues p3) { return null; }
        private static void updateDataUsageStatForData(android.content.ContentResolver p0, java.lang.String p1) {}
        private static void updateNormalizedNumber(android.content.Context p0, android.content.ContentResolver p1, java.lang.String p2, java.lang.String p3) {}
        private static int getLogNumberPresentation(java.lang.String p0, int p1) { return 0; }
        private static java.lang.String getLogAccountAddress(android.content.Context p0, android.telecom.PhoneAccountHandle p1) { return null; }
        private static java.lang.String getCurrentCountryIso(android.content.Context p0) { return null; }
    }
}
