package android.provider;

public class BlockedNumberContract {
    public static final java.lang.String AUTHORITY = "com.android.blockednumber";
    public static final android.net.Uri AUTHORITY_URI = null;
    public static final java.lang.String METHOD_IS_BLOCKED = "is_blocked";
    public static final java.lang.String METHOD_UNBLOCK = "unblock";
    public static final java.lang.String RES_NUMBER_IS_BLOCKED = "blocked";
    public static final int STATUS_NOT_BLOCKED = 0;
    public static final int STATUS_BLOCKED_IN_LIST = 1;
    public static final int STATUS_BLOCKED_RESTRICTED = 2;
    public static final int STATUS_BLOCKED_UNKNOWN_NUMBER = 3;
    public static final int STATUS_BLOCKED_PAYPHONE = 4;
    public static final int STATUS_BLOCKED_NOT_IN_CONTACTS = 5;
    public static final int STATUS_BLOCKED_UNAVAILABLE = 6;
    public static final java.lang.String RES_BLOCK_STATUS = "block_status";
    public static final java.lang.String RES_NUM_ROWS_DELETED = "num_deleted";
    public static final java.lang.String METHOD_CAN_CURRENT_USER_BLOCK_NUMBERS = "can_current_user_block_numbers";
    public static final java.lang.String RES_CAN_BLOCK_NUMBERS = "can_block";
    public static final java.lang.String RES_ENHANCED_SETTING_IS_ENABLED = "enhanced_setting_enabled";
    public static final java.lang.String RES_SHOW_EMERGENCY_CALL_NOTIFICATION = "show_emergency_call_notification";
    public static final java.lang.String EXTRA_ENHANCED_SETTING_KEY = "extra_enhanced_setting_key";
    public static final java.lang.String EXTRA_ENHANCED_SETTING_VALUE = "extra_enhanced_setting_value";
    public static final java.lang.String EXTRA_CONTACT_EXIST = "extra_contact_exist";
    public static final java.lang.String EXTRA_CALL_PRESENTATION = "extra_call_presentation";
    public static boolean isBlocked(android.content.Context p0, java.lang.String p1) { return false; }
    public static int unblock(android.content.Context p0, java.lang.String p1) { return 0; }
    public static boolean canCurrentUserBlockNumbers(android.content.Context p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BlockStatus {
    }

    public static class BlockedNumbers {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/blocked_number";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/blocked_number";
        public static final java.lang.String COLUMN_ID = "_id";
        public static final java.lang.String COLUMN_ORIGINAL_NUMBER = "original_number";
        public static final java.lang.String COLUMN_E164_NUMBER = "e164_number";
    }

    public static class SystemContract {
        public static final java.lang.String ACTION_BLOCK_SUPPRESSION_STATE_CHANGED = "android.provider.action.BLOCK_SUPPRESSION_STATE_CHANGED";
        public static final java.lang.String METHOD_NOTIFY_EMERGENCY_CONTACT = "notify_emergency_contact";
        public static final java.lang.String METHOD_END_BLOCK_SUPPRESSION = "end_block_suppression";
        public static final java.lang.String METHOD_SHOULD_SYSTEM_BLOCK_NUMBER = "should_system_block_number";
        public static final java.lang.String METHOD_GET_BLOCK_SUPPRESSION_STATUS = "get_block_suppression_status";
        public static final java.lang.String METHOD_SHOULD_SHOW_EMERGENCY_CALL_NOTIFICATION = "should_show_emergency_call_notification";
        public static final java.lang.String RES_IS_BLOCKING_SUPPRESSED = "blocking_suppressed";
        public static final java.lang.String RES_BLOCKING_SUPPRESSED_UNTIL_TIMESTAMP = "blocking_suppressed_until_timestamp";
        public static final java.lang.String METHOD_GET_ENHANCED_BLOCK_SETTING = "get_enhanced_block_setting";
        public static final java.lang.String METHOD_SET_ENHANCED_BLOCK_SETTING = "set_enhanced_block_setting";
        public static final java.lang.String ENHANCED_SETTING_KEY_BLOCK_UNREGISTERED = "block_numbers_not_in_contacts_setting";
        public static final java.lang.String ENHANCED_SETTING_KEY_BLOCK_PRIVATE = "block_private_number_calls_setting";
        public static final java.lang.String ENHANCED_SETTING_KEY_BLOCK_PAYPHONE = "block_payphone_calls_setting";
        public static final java.lang.String ENHANCED_SETTING_KEY_BLOCK_UNKNOWN = "block_unknown_calls_setting";
        public static final java.lang.String ENHANCED_SETTING_KEY_SHOW_EMERGENCY_CALL_NOTIFICATION = "show_emergency_call_notification";
        public static final java.lang.String ENHANCED_SETTING_KEY_BLOCK_UNAVAILABLE = "block_unavailable_calls_setting";
        public SystemContract() {}
        public static void notifyEmergencyContact(android.content.Context p0) {}
        public static void endBlockSuppression(android.content.Context p0) {}
        public static int shouldSystemBlockNumber(android.content.Context p0, java.lang.String p1, android.os.Bundle p2) { return 0; }
        public static android.provider.BlockedNumberContract.SystemContract.BlockSuppressionStatus getBlockSuppressionStatus(android.content.Context p0) { return null; }
        public static boolean shouldShowEmergencyCallNotification(android.content.Context p0) { return false; }
        public static boolean getEnhancedBlockSetting(android.content.Context p0, java.lang.String p1) { return false; }
        public static void setEnhancedBlockSetting(android.content.Context p0, java.lang.String p1, boolean p2) {}
        public static java.lang.String blockStatusToString(int p0) { return null; }

        public static class BlockSuppressionStatus {
            public final boolean isSuppressed = false;
            public final long untilTimestampMillis = 0L;
            public BlockSuppressionStatus(boolean p0, long p1) {}
            public java.lang.String toString() { return null; }
        }
    }
}
