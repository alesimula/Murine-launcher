package android.provider;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
public final class BlockedNumbersManager {
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
    public static final java.lang.String ACTION_BLOCK_SUPPRESSION_STATE_CHANGED = "android.provider.action.BLOCK_SUPPRESSION_STATE_CHANGED";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
    public static final java.lang.String ENHANCED_SETTING_KEY_BLOCK_UNREGISTERED = "block_numbers_not_in_contacts_setting";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
    public static final java.lang.String ENHANCED_SETTING_KEY_BLOCK_PRIVATE = "block_private_number_calls_setting";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
    public static final java.lang.String ENHANCED_SETTING_KEY_BLOCK_PAYPHONE = "block_payphone_calls_setting";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
    public static final java.lang.String ENHANCED_SETTING_KEY_BLOCK_UNKNOWN = "block_unknown_calls_setting";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
    public static final java.lang.String ENHANCED_SETTING_KEY_SHOW_EMERGENCY_CALL_NOTIFICATION = "show_emergency_call_notification";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
    public static final java.lang.String ENHANCED_SETTING_KEY_BLOCK_UNAVAILABLE = "block_unavailable_calls_setting";
    public BlockedNumbersManager(android.content.Context p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_BLOCKED_NUMBERS", "android.permission.WRITE_BLOCKED_NUMBERS"})
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
    public void notifyEmergencyContact() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_BLOCKED_NUMBERS", "android.permission.WRITE_BLOCKED_NUMBERS"})
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
    public void endBlockSuppression() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_BLOCKED_NUMBERS", "android.permission.WRITE_BLOCKED_NUMBERS"})
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
    public int shouldSystemBlockNumber(java.lang.String p0, int p1, boolean p2) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_BLOCKED_NUMBERS", "android.permission.WRITE_BLOCKED_NUMBERS"})
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
    @android.annotation.NonNull
    public android.provider.BlockedNumbersManager.BlockSuppressionStatus getBlockSuppressionStatus() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_BLOCKED_NUMBERS", "android.permission.WRITE_BLOCKED_NUMBERS"})
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
    public boolean shouldShowEmergencyCallNotification() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_BLOCKED_NUMBERS", "android.permission.WRITE_BLOCKED_NUMBERS"})
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
    public boolean getBlockedNumberSetting(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_BLOCKED_NUMBERS", "android.permission.WRITE_BLOCKED_NUMBERS"})
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
    public void setBlockedNumberSetting(java.lang.String p0, boolean p1) {}

    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
    public static final class BlockSuppressionStatus {
        public BlockSuppressionStatus(boolean p0, long p1) {}
        public java.lang.String toString() { return null; }
        public boolean getIsSuppressed() { return false; }
        public long getUntilTimestampMillis() { return 0L; }
    }
}
