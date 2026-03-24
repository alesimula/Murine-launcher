package android.telecom;

public class TelecomManager {
    public static final java.lang.String ACTION_INCOMING_CALL = "android.telecom.action.INCOMING_CALL";
    public static final java.lang.String ACTION_NEW_UNKNOWN_CALL = "android.telecom.action.NEW_UNKNOWN_CALL";
    public static final java.lang.String ACTION_CONFIGURE_PHONE_ACCOUNT = "android.telecom.action.CONFIGURE_PHONE_ACCOUNT";
    public static final java.lang.String ACTION_SHOW_CALL_ACCESSIBILITY_SETTINGS = "android.telecom.action.SHOW_CALL_ACCESSIBILITY_SETTINGS";
    public static final java.lang.String ACTION_SHOW_CALL_SETTINGS = "android.telecom.action.SHOW_CALL_SETTINGS";
    public static final java.lang.String ACTION_SHOW_RESPOND_VIA_SMS_SETTINGS = "android.telecom.action.SHOW_RESPOND_VIA_SMS_SETTINGS";
    public static final java.lang.String ACTION_CHANGE_PHONE_ACCOUNTS = "android.telecom.action.CHANGE_PHONE_ACCOUNTS";
    public static final java.lang.String ACTION_PHONE_ACCOUNT_REGISTERED = "android.telecom.action.PHONE_ACCOUNT_REGISTERED";
    public static final java.lang.String ACTION_PHONE_ACCOUNT_UNREGISTERED = "android.telecom.action.PHONE_ACCOUNT_UNREGISTERED";
    public static final java.lang.String ACTION_CHANGE_DEFAULT_DIALER = "android.telecom.action.CHANGE_DEFAULT_DIALER";
    public static final java.lang.String ACTION_DEFAULT_DIALER_CHANGED = "android.telecom.action.DEFAULT_DIALER_CHANGED";
    public static final java.lang.String EXTRA_CHANGE_DEFAULT_DIALER_PACKAGE_NAME = "android.telecom.extra.CHANGE_DEFAULT_DIALER_PACKAGE_NAME";
    public static final java.lang.String ACTION_DEFAULT_CALL_SCREENING_APP_CHANGED = "android.telecom.action.DEFAULT_CALL_SCREENING_APP_CHANGED";
    public static final java.lang.String EXTRA_DEFAULT_CALL_SCREENING_APP_COMPONENT_NAME = "android.telecom.extra.DEFAULT_CALL_SCREENING_APP_COMPONENT_NAME";
    public static final java.lang.String EXTRA_IS_DEFAULT_CALL_SCREENING_APP = "android.telecom.extra.IS_DEFAULT_CALL_SCREENING_APP";
    public static final java.lang.String EXTRA_START_CALL_WITH_SPEAKERPHONE = "android.telecom.extra.START_CALL_WITH_SPEAKERPHONE";
    public static final java.lang.String EXTRA_START_CALL_WITH_VIDEO_STATE = "android.telecom.extra.START_CALL_WITH_VIDEO_STATE";
    public static final java.lang.String EXTRA_INCOMING_VIDEO_STATE = "android.telecom.extra.INCOMING_VIDEO_STATE";
    public static final java.lang.String EXTRA_PHONE_ACCOUNT_HANDLE = "android.telecom.extra.PHONE_ACCOUNT_HANDLE";
    public static final java.lang.String EXTRA_CALL_SUBJECT = "android.telecom.extra.CALL_SUBJECT";
    public static final int PRIORITY_NORMAL = 0;
    public static final int PRIORITY_URGENT = 1;
    public static final java.lang.String EXTRA_PRIORITY = "android.telecom.extra.PRIORITY";
    public static final java.lang.String EXTRA_LOCATION = "android.telecom.extra.LOCATION";
    public static final java.lang.String EXTRA_HAS_PICTURE = "android.telecom.extra.HAS_PICTURE";
    public static final java.lang.String EXTRA_PICTURE_URI = "android.telecom.extra.PICTURE_URI";
    public static final java.lang.String EXTRA_OUTGOING_PICTURE = "android.telecom.extra.OUTGOING_PICTURE";
    public static final java.lang.String EXTRA_INCOMING_CALL_ADDRESS = "android.telecom.extra.INCOMING_CALL_ADDRESS";
    public static final java.lang.String EXTRA_INCOMING_CALL_EXTRAS = "android.telecom.extra.INCOMING_CALL_EXTRAS";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CALL_HAS_IN_BAND_RINGTONE = "android.telecom.extra.CALL_HAS_IN_BAND_RINGTONE";
    public static final java.lang.String EXTRA_OUTGOING_CALL_EXTRAS = "android.telecom.extra.OUTGOING_CALL_EXTRAS";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_IS_USER_INTENT_EMERGENCY_CALL = "android.telecom.extra.IS_USER_INTENT_EMERGENCY_CALL";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_UNKNOWN_CALL_HANDLE = "android.telecom.extra.UNKNOWN_CALL_HANDLE";
    public static final java.lang.String EXTRA_CALL_CREATED_TIME_MILLIS = "android.telecom.extra.CALL_CREATED_TIME_MILLIS";
    public static final java.lang.String EXTRA_CALL_CREATED_EPOCH_TIME_MILLIS = "android.telecom.extra.CALL_CREATED_EPOCH_TIME_MILLIS";
    public static final java.lang.String EXTRA_CALL_TELECOM_ROUTING_START_TIME_MILLIS = "android.telecom.extra.CALL_TELECOM_ROUTING_START_TIME_MILLIS";
    public static final java.lang.String EXTRA_CALL_TELECOM_ROUTING_END_TIME_MILLIS = "android.telecom.extra.CALL_TELECOM_ROUTING_END_TIME_MILLIS";
    public static final java.lang.String EXTRA_CALL_DISCONNECT_CAUSE = "android.telecom.extra.CALL_DISCONNECT_CAUSE";
    public static final java.lang.String EXTRA_CALL_DISCONNECT_MESSAGE = "android.telecom.extra.CALL_DISCONNECT_MESSAGE";
    public static final java.lang.String CALL_AUTO_DISCONNECT_MESSAGE_STRING = "Call dropped by lower layers";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CONNECTION_SERVICE = "android.telecom.extra.CONNECTION_SERVICE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CALL_TECHNOLOGY_TYPE = "android.telecom.extra.CALL_TECHNOLOGY_TYPE";
    public static final java.lang.String EXTRA_CALL_NETWORK_TYPE = "android.telecom.extra.CALL_NETWORK_TYPE";
    public static final java.lang.String GATEWAY_PROVIDER_PACKAGE = "android.telecom.extra.GATEWAY_PROVIDER_PACKAGE";
    public static final java.lang.String GATEWAY_ORIGINAL_ADDRESS = "android.telecom.extra.GATEWAY_ORIGINAL_ADDRESS";
    public static final java.lang.String EXTRA_CALL_BACK_NUMBER = "android.telecom.extra.CALL_BACK_NUMBER";
    public static final java.lang.String EXTRA_NEW_OUTGOING_CALL_CANCEL_TIMEOUT = "android.telecom.extra.NEW_OUTGOING_CALL_CANCEL_TIMEOUT";
    public static final java.lang.String EXTRA_IS_HANDOVER = "android.telecom.extra.IS_HANDOVER";
    public static final java.lang.String EXTRA_IS_HANDOVER_CONNECTION = "android.telecom.extra.IS_HANDOVER_CONNECTION";
    public static final java.lang.String EXTRA_HANDOVER_FROM_PHONE_ACCOUNT = "android.telecom.extra.HANDOVER_FROM_PHONE_ACCOUNT";
    public static final java.lang.String EXTRA_CALL_AUDIO_STATE = "android.telecom.extra.CALL_AUDIO_STATE";
    public static final java.lang.String EXTRA_START_CALL_WITH_RTT = "android.telecom.extra.START_CALL_WITH_RTT";
    public static final java.lang.String ACTION_POST_CALL = "android.telecom.action.POST_CALL";
    public static final java.lang.String EXTRA_HANDLE = "android.telecom.extra.HANDLE";
    public static final java.lang.String EXTRA_DISCONNECT_CAUSE = "android.telecom.extra.DISCONNECT_CAUSE";
    public static final java.lang.String EXTRA_CALL_DURATION = "android.telecom.extra.CALL_DURATION";
    public static final int DURATION_VERY_SHORT = 0;
    public static final int DURATION_SHORT = 1;
    public static final int DURATION_MEDIUM = 2;
    public static final int DURATION_LONG = 3;
    public static final long VERY_SHORT_CALL_TIME_MS = 3000L;
    public static final long SHORT_CALL_TIME_MS = 60000L;
    public static final long MEDIUM_CALL_TIME_MS = 120000L;
    public static final java.lang.String METADATA_IN_CALL_SERVICE_UI = "android.telecom.IN_CALL_SERVICE_UI";
    public static final java.lang.String METADATA_IN_CALL_SERVICE_CAR_MODE_UI = "android.telecom.IN_CALL_SERVICE_CAR_MODE_UI";
    public static final java.lang.String METADATA_IN_CALL_SERVICE_RINGING = "android.telecom.IN_CALL_SERVICE_RINGING";
    public static final java.lang.String METADATA_INCLUDE_EXTERNAL_CALLS = "android.telecom.INCLUDE_EXTERNAL_CALLS";
    public static final java.lang.String METADATA_INCLUDE_SELF_MANAGED_CALLS = "android.telecom.INCLUDE_SELF_MANAGED_CALLS";
    public static final char DTMF_CHARACTER_PAUSE = ',';
    public static final char DTMF_CHARACTER_WAIT = ';';
    @android.annotation.SystemApi
    public static final int TTY_MODE_OFF = 0;
    @android.annotation.SystemApi
    public static final int TTY_MODE_FULL = 1;
    @android.annotation.SystemApi
    public static final int TTY_MODE_HCO = 2;
    @android.annotation.SystemApi
    public static final int TTY_MODE_VCO = 3;
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_CURRENT_TTY_MODE_CHANGED = "android.telecom.action.CURRENT_TTY_MODE_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CURRENT_TTY_MODE = "android.telecom.extra.CURRENT_TTY_MODE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_TTY_PREFERRED_MODE_CHANGED = "android.telecom.action.TTY_PREFERRED_MODE_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_TTY_PREFERRED_MODE = "android.telecom.extra.TTY_PREFERRED_MODE";
    public static final java.lang.String ACTION_SHOW_MISSED_CALLS_NOTIFICATION = "android.telecom.action.SHOW_MISSED_CALLS_NOTIFICATION";
    public static final java.lang.String EXTRA_NOTIFICATION_COUNT = "android.telecom.extra.NOTIFICATION_COUNT";
    public static final java.lang.String EXTRA_NOTIFICATION_PHONE_NUMBER = "android.telecom.extra.NOTIFICATION_PHONE_NUMBER";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CLEAR_MISSED_CALLS_INTENT = "android.telecom.extra.CLEAR_MISSED_CALLS_INTENT";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CALL_BACK_INTENT = "android.telecom.extra.CALL_BACK_INTENT";
    public static final android.content.ComponentName EMERGENCY_DIALER_COMPONENT = null;
    public static final java.lang.String EXTRA_USE_ASSISTED_DIALING = "android.telecom.extra.USE_ASSISTED_DIALING";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CALL_SOURCE = "android.telecom.extra.CALL_SOURCE";
    @android.annotation.SystemApi
    public static final int CALL_SOURCE_EMERGENCY_SHORTCUT = 2;
    @android.annotation.SystemApi
    public static final int CALL_SOURCE_EMERGENCY_DIALPAD = 1;
    @android.annotation.SystemApi
    public static final int CALL_SOURCE_UNSPECIFIED = 0;
    public static final int PRESENTATION_ALLOWED = 1;
    public static final int PRESENTATION_RESTRICTED = 2;
    public static final int PRESENTATION_UNKNOWN = 3;
    public static final int PRESENTATION_PAYPHONE = 4;
    public static final int PRESENTATION_UNAVAILABLE = 5;
    public static final int AUDIO_OUTPUT_ENABLE_SPEAKER = 0;
    public static final int AUDIO_OUTPUT_DISABLE_SPEAKER = 1;
    public static final int AUDIO_OUTPUT_DEFAULT = 0;
    public static final long ENABLE_GET_CALL_STATE_PERMISSION_PROTECTION = 157233955L;
    public static final long ENABLE_GET_PHONE_ACCOUNT_PERMISSION_PROTECTION = 183407956L;
    public static android.telecom.TelecomManager from(android.content.Context p0) { return null; }
    public TelecomManager(android.content.Context p0) {}
    public TelecomManager(android.content.Context p0, com.android.internal.telecom.ITelecomService p1) {}
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public android.telecom.PhoneAccountHandle getDefaultOutgoingPhoneAccount(java.lang.String p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public android.telecom.PhoneAccountHandle getUserSelectedOutgoingPhoneAccount() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setUserSelectedOutgoingPhoneAccount(android.telecom.PhoneAccountHandle p0) {}
    public android.telecom.PhoneAccountHandle getSimCallManager() { return null; }
    public android.telecom.PhoneAccountHandle getSimCallManagerForSubscription(int p0) { return null; }
    public android.telecom.PhoneAccountHandle getSimCallManager(int p0) { return null; }
    @android.annotation.SystemApi
    public android.telecom.PhoneAccountHandle getConnectionManager() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PHONE_STATE"})
    public java.util.List<android.telecom.PhoneAccountHandle> getPhoneAccountsSupportingScheme(java.lang.String p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.util.List<android.telecom.PhoneAccountHandle> getCallCapablePhoneAccounts() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.util.List<android.telecom.PhoneAccountHandle> getSelfManagedPhoneAccounts() { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_OWN_CALLS")
    public java.util.List<android.telecom.PhoneAccountHandle> getOwnSelfManagedPhoneAccounts() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.util.List<android.telecom.PhoneAccountHandle> getCallCapablePhoneAccounts(boolean p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.SuppressLint("RequiresPermission")
    public java.util.List<android.telecom.PhoneAccountHandle> getPhoneAccountsForPackage() { return null; }
    public android.telecom.PhoneAccount getPhoneAccount(android.telecom.PhoneAccountHandle p0) { return null; }
    @android.annotation.SystemApi
    public int getAllPhoneAccountsCount() { return 0; }
    @android.annotation.SystemApi
    public java.util.List<android.telecom.PhoneAccount> getAllPhoneAccounts() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.telecom.PhoneAccountHandle> getAllPhoneAccountHandles() { return null; }
    public void registerPhoneAccount(android.telecom.PhoneAccount p0) {}
    public void unregisterPhoneAccount(android.telecom.PhoneAccountHandle p0) {}
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public void clearPhoneAccounts() {}
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public void clearAccounts() {}
    public void clearAccountsForPackage(java.lang.String p0) {}
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public android.content.ComponentName getDefaultPhoneApp() { return null; }
    public java.lang.String getDefaultDialerPackage() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getDefaultDialerPackage(android.os.UserHandle p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(allOf={"android.permission.MODIFY_PHONE_STATE", "android.permission.WRITE_SECURE_SETTINGS"})
    public boolean setDefaultDialer(java.lang.String p0) { return false; }
    public java.lang.String getSystemDialerPackage() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public boolean isVoiceMailNumber(android.telecom.PhoneAccountHandle p0, java.lang.String p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public java.lang.String getVoiceMailNumber(android.telecom.PhoneAccountHandle p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_STATE", "android.permission.READ_SMS", "android.permission.READ_PHONE_NUMBERS"}, conditional=true)
    public java.lang.String getLine1Number(android.telecom.PhoneAccountHandle p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public boolean isInCall() { return false; }
    public boolean hasManageOngoingCallsPermission() { return false; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public boolean isInManagedCall() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PHONE_STATE"}, conditional=true)
    public int getCallState() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PHONE_STATE"})
    public boolean isRinging() { return false; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ANSWER_PHONE_CALLS")
    public boolean endCall() { return false; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.ANSWER_PHONE_CALLS", "android.permission.MODIFY_PHONE_STATE"})
    public void acceptRingingCall() {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.ANSWER_PHONE_CALLS", "android.permission.MODIFY_PHONE_STATE"})
    public void acceptRingingCall(int p0) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void silenceRinger() {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PHONE_STATE"})
    public boolean isTtySupported() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getCurrentTtyMode() { return 0; }
    public void addNewIncomingCall(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1) {}
    public void addNewIncomingConference(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1) {}
    @android.annotation.SystemApi
    public void addNewUnknownCall(android.telecom.PhoneAccountHandle p0, android.os.Bundle p1) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean handleMmi(java.lang.String p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean handleMmi(java.lang.String p0, android.telecom.PhoneAccountHandle p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public android.net.Uri getAdnUriForPhoneAccount(android.telecom.PhoneAccountHandle p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void cancelMissedCallsNotification() {}
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public void showInCallScreen(boolean p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.CALL_PHONE", "android.permission.MANAGE_OWN_CALLS"})
    public void placeCall(android.net.Uri p0, android.os.Bundle p1) {}
    @android.annotation.RequiresPermission("android.permission.CALL_PHONE")
    public void startConference(java.util.List<android.net.Uri> p0, android.os.Bundle p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void enablePhoneAccount(android.telecom.PhoneAccountHandle p0, boolean p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.DUMP")
    public android.telecom.TelecomAnalytics dumpAnalytics() { return null; }
    public android.content.Intent createManageBlockedNumbersIntent() { return null; }
    @android.annotation.SystemApi
    public android.content.Intent createLaunchEmergencyDialerIntent(java.lang.String p0) { return null; }
    public boolean isIncomingCallPermitted(android.telecom.PhoneAccountHandle p0) { return false; }
    public boolean isOutgoingCallPermitted(android.telecom.PhoneAccountHandle p0) { return false; }
    public void acceptHandover(android.net.Uri p0, int p1, android.telecom.PhoneAccountHandle p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public boolean isInEmergencyCall() { return false; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public boolean isInSelfManagedCall(java.lang.String p0, android.os.UserHandle p1) { return false; }
    public void handleCallIntent(android.content.Intent p0, java.lang.String p1) {}

    private static class DeathRecipient implements android.os.IBinder.DeathRecipient {
        public void binderDied() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Presentation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TtyMode {
    }
}
