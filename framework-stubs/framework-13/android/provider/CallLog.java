package android.provider;

public class CallLog {
    public static final java.lang.String AUTHORITY = "call_log";
    public static final android.net.Uri CONTENT_URI = null;
    public static final java.lang.String CALL_COMPOSER_SEGMENT = "call_composer";
    public static final android.net.Uri CALL_COMPOSER_PICTURE_URI = null;
    public static final java.lang.String SHADOW_AUTHORITY = "call_log_shadow";
    public static final android.net.Uri SHADOW_CALL_COMPOSER_PICTURE_URI = null;
    public CallLog() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.WRITE_CALL_LOG", "android.permission.INTERACT_ACROSS_USERS"})
    public static void storeCallComposerPicture(android.content.Context p0, java.io.InputStream p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.net.Uri, android.provider.CallLog.CallComposerLoggingException> p3) {}

    public static class AddCallParams {

        public static final class AddCallParametersBuilder {
            public AddCallParametersBuilder() {}
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setCallerInfo(android.telecom.CallerInfo p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setNumber(java.lang.String p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setPostDialDigits(java.lang.String p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setViaNumber(java.lang.String p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setPresentation(int p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setCallType(int p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setFeatures(int p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setAccountHandle(android.telecom.PhoneAccountHandle p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setStart(long p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setDuration(int p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setDataUsage(long p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setAddForAllUsers(boolean p0) { return null; }
            @android.annotation.SuppressLint("UserHandleName")
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setUserToBeInsertedTo(android.os.UserHandle p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setIsRead(boolean p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setCallBlockReason(int p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setCallScreeningAppName(java.lang.CharSequence p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setCallScreeningComponentName(java.lang.String p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setMissedReason(long p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setPriority(int p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setSubject(java.lang.String p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setLatitude(double p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setLongitude(double p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setPictureUri(android.net.Uri p0) { return null; }
            public android.provider.CallLog.AddCallParams.AddCallParametersBuilder setIsPhoneAccountMigrationPending(int p0) { return null; }
            public android.provider.CallLog.AddCallParams build() { return null; }
        }
    }

    @android.annotation.SystemApi
    public static class CallComposerLoggingException extends java.lang.Throwable {
        public static final int ERROR_UNKNOWN = 0;
        public static final int ERROR_REMOTE_END_CLOSED = 1;
        public static final int ERROR_STORAGE_FULL = 2;
        public static final int ERROR_INPUT_CLOSED = 3;
        public CallComposerLoggingException(int p0) { super(); }
        public int getErrorCode() { return 0; }
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface CallComposerLoggingError {
        }
    }

    public static class Calls implements android.provider.BaseColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final android.net.Uri SHADOW_CONTENT_URI = null;
        public static final android.net.Uri CONTENT_FILTER_URI = null;
        public static final java.lang.String LIMIT_PARAM_KEY = "limit";
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
        public static final int PRESENTATION_UNAVAILABLE = 5;
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
        public static final long MISSED_REASON_NOT_MISSED = 0L;
        public static final long AUTO_MISSED_EMERGENCY_CALL = 1L;
        public static final long AUTO_MISSED_MAXIMUM_RINGING = 2L;
        public static final long AUTO_MISSED_MAXIMUM_DIALING = 4L;
        public static final long USER_MISSED_NO_ANSWER = 65536L;
        public static final long USER_MISSED_SHORT_RING = 131072L;
        public static final long SHORT_RING_THRESHOLD = 5000L;
        public static final long USER_MISSED_DND_MODE = 262144L;
        public static final long USER_MISSED_LOW_RING_VOLUME = 524288L;
        public static final int LOW_RING_VOLUME = 0;
        public static final long USER_MISSED_NO_VIBRATE = 1048576L;
        public static final long USER_MISSED_CALL_SCREENING_SERVICE_SILENCED = 2097152L;
        public static final long USER_MISSED_CALL_FILTERS_TIMEOUT = 4194304L;
        public static final long USER_MISSED_NEVER_RANG = 8388608L;
        public static final java.lang.String MISSED_REASON = "missed_reason";
        public static final java.lang.String SUBJECT = "subject";
        public static final int PRIORITY_NORMAL = 0;
        public static final int PRIORITY_URGENT = 1;
        public static final java.lang.String PRIORITY = "priority";
        public static final java.lang.String COMPOSER_PHOTO_URI = "composer_photo_uri";
        public static final java.lang.String LOCATION = "location";
        public static final java.lang.String IS_PHONE_ACCOUNT_MIGRATION_PENDING = "is_call_log_phone_account_migration_pending";
        public Calls() {}
        public static android.net.Uri addCall(android.telecom.CallerInfo p0, android.content.Context p1, java.lang.String p2, int p3, int p4, int p5, android.telecom.PhoneAccountHandle p6, long p7, int p8, java.lang.Long p9, long p10, int p11) { return null; }
        public static android.net.Uri addCall(android.telecom.CallerInfo p0, android.content.Context p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, int p6, int p7, android.telecom.PhoneAccountHandle p8, long p9, int p10, java.lang.Long p11, boolean p12, android.os.UserHandle p13, long p14, int p15) { return null; }
        public static android.net.Uri addCall(android.telecom.CallerInfo p0, android.content.Context p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, int p6, int p7, android.telecom.PhoneAccountHandle p8, long p9, int p10, java.lang.Long p11, boolean p12, android.os.UserHandle p13, boolean p14, int p15, java.lang.CharSequence p16, java.lang.String p17, long p18, int p19) { return null; }
        public static android.net.Uri addCall(android.content.Context p0, android.provider.CallLog.AddCallParams p1) { return null; }
        public static boolean shouldHaveSharedCallLogEntries(android.content.Context p0, android.os.UserManager p1, int p2) { return false; }
        public static java.lang.String getLastOutgoingCall(android.content.Context p0) { return null; }
        public static boolean isUserMissed(long p0) { return false; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface MissedReason {
        }
    }

    public static class Locations implements android.provider.BaseColumns {
        public static final java.lang.String AUTHORITY = "call_composer_locations";
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/call_composer_location";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/call_composer_location";
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String LATITUDE = "latitude";
        public static final java.lang.String LONGITUDE = "longitude";
    }
}
