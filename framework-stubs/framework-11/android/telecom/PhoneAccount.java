package android.telecom;

public final class PhoneAccount implements android.os.Parcelable {
    public static final java.lang.String EXTRA_SORT_ORDER = "android.telecom.extra.SORT_ORDER";
    public static final java.lang.String EXTRA_CALL_SUBJECT_MAX_LENGTH = "android.telecom.extra.CALL_SUBJECT_MAX_LENGTH";
    public static final java.lang.String EXTRA_CALL_SUBJECT_CHARACTER_ENCODING = "android.telecom.extra.CALL_SUBJECT_CHARACTER_ENCODING";
    public static final java.lang.String EXTRA_ALWAYS_USE_VOIP_AUDIO_MODE = "android.telecom.extra.ALWAYS_USE_VOIP_AUDIO_MODE";
    public static final java.lang.String EXTRA_SUPPORTS_HANDOVER_TO = "android.telecom.extra.SUPPORTS_HANDOVER_TO";
    public static final java.lang.String EXTRA_SUPPORTS_VIDEO_CALLING_FALLBACK = "android.telecom.extra.SUPPORTS_VIDEO_CALLING_FALLBACK";
    public static final java.lang.String EXTRA_SUPPORTS_HANDOVER_FROM = "android.telecom.extra.SUPPORTS_HANDOVER_FROM";
    public static final java.lang.String EXTRA_LOG_SELF_MANAGED_CALLS = "android.telecom.extra.LOG_SELF_MANAGED_CALLS";
    public static final java.lang.String EXTRA_PLAY_CALL_RECORDING_TONE = "android.telecom.extra.PLAY_CALL_RECORDING_TONE";
    public static final java.lang.String EXTRA_SKIP_CALL_FILTERING = "android.telecom.extra.SKIP_CALL_FILTERING";
    public static final int CAPABILITY_CONNECTION_MANAGER = 1;
    public static final int CAPABILITY_CALL_PROVIDER = 2;
    public static final int CAPABILITY_SIM_SUBSCRIPTION = 4;
    public static final int CAPABILITY_VIDEO_CALLING = 8;
    public static final int CAPABILITY_PLACE_EMERGENCY_CALLS = 16;
    @android.annotation.SystemApi
    public static final int CAPABILITY_MULTI_USER = 32;
    public static final int CAPABILITY_CALL_SUBJECT = 64;
    public static final int CAPABILITY_EMERGENCY_CALLS_ONLY = 128;
    public static final int CAPABILITY_VIDEO_CALLING_RELIES_ON_PRESENCE = 256;
    public static final int CAPABILITY_EMERGENCY_VIDEO_CALLING = 512;
    public static final int CAPABILITY_SUPPORTS_VIDEO_CALLING = 1024;
    public static final int CAPABILITY_SELF_MANAGED = 2048;
    public static final int CAPABILITY_RTT = 4096;
    public static final int CAPABILITY_EMERGENCY_PREFERRED = 8192;
    public static final int CAPABILITY_ADHOC_CONFERENCE_CALLING = 16384;
    public static final java.lang.String SCHEME_TEL = "tel";
    public static final java.lang.String SCHEME_VOICEMAIL = "voicemail";
    public static final java.lang.String SCHEME_SIP = "sip";
    public static final int NO_ICON_TINT = 0;
    public static final int NO_HIGHLIGHT_COLOR = 0;
    public static final int NO_RESOURCE_ID = -1;
    private final android.telecom.PhoneAccountHandle mAccountHandle = null;
    private final android.net.Uri mAddress = null;
    private final android.net.Uri mSubscriptionAddress = null;
    private final int mCapabilities = 0;
    private final int mHighlightColor = 0;
    private final java.lang.CharSequence mLabel = null;
    private final java.lang.CharSequence mShortDescription = null;
    private final java.util.List<java.lang.String> mSupportedUriSchemes = null;
    private final int mSupportedAudioRoutes = 0;
    private final android.graphics.drawable.Icon mIcon = null;
    private final android.os.Bundle mExtras = null;
    private boolean mIsEnabled;
    private java.lang.String mGroupId;
    public static final android.os.Parcelable.Creator<android.telecom.PhoneAccount> CREATOR = null;
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    private PhoneAccount(android.telecom.PhoneAccountHandle p0, android.net.Uri p1, android.net.Uri p2, int p3, android.graphics.drawable.Icon p4, int p5, java.lang.CharSequence p6, java.lang.CharSequence p7, java.util.List<java.lang.String> p8, android.os.Bundle p9, int p10, boolean p11, java.lang.String p12) {}
    public static android.telecom.PhoneAccount.Builder builder(android.telecom.PhoneAccountHandle p0, java.lang.CharSequence p1) { return null; }
    public android.telecom.PhoneAccount.Builder toBuilder() { return null; }
    public android.telecom.PhoneAccountHandle getAccountHandle() { return null; }
    public android.net.Uri getAddress() { return null; }
    public android.net.Uri getSubscriptionAddress() { return null; }
    public int getCapabilities() { return 0; }
    public boolean hasCapabilities(int p0) { return false; }
    public boolean hasAudioRoutes(int p0) { return false; }
    public java.lang.CharSequence getLabel() { return null; }
    public java.lang.CharSequence getShortDescription() { return null; }
    public java.util.List<java.lang.String> getSupportedUriSchemes() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public int getSupportedAudioRoutes() { return 0; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public boolean isEnabled() { return false; }
    public java.lang.String getGroupId() { return null; }
    public boolean supportsUriScheme(java.lang.String p0) { return false; }
    public int getHighlightColor() { return 0; }
    public void setIsEnabled(boolean p0) {}
    public boolean isSelfManaged() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private PhoneAccount(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public java.lang.String capabilitiesToString() { return null; }
    private java.lang.String audioRoutesToString() { return null; }
    private static boolean areBundlesEqual(android.os.Bundle p0, android.os.Bundle p1) { return false; }

    public static class Builder {
        private android.telecom.PhoneAccountHandle mAccountHandle;
        private android.net.Uri mAddress;
        private android.net.Uri mSubscriptionAddress;
        private int mCapabilities;
        private int mSupportedAudioRoutes;
        private int mHighlightColor;
        private java.lang.CharSequence mLabel;
        private java.lang.CharSequence mShortDescription;
        private java.util.List<java.lang.String> mSupportedUriSchemes;
        private android.graphics.drawable.Icon mIcon;
        private android.os.Bundle mExtras;
        private boolean mIsEnabled;
        private java.lang.String mGroupId;
        public Builder(android.telecom.PhoneAccountHandle p0, java.lang.CharSequence p1) {}
        public Builder(android.telecom.PhoneAccount p0) {}
        public android.telecom.PhoneAccount.Builder setLabel(java.lang.CharSequence p0) { return null; }
        public android.telecom.PhoneAccount.Builder setAddress(android.net.Uri p0) { return null; }
        public android.telecom.PhoneAccount.Builder setSubscriptionAddress(android.net.Uri p0) { return null; }
        public android.telecom.PhoneAccount.Builder setCapabilities(int p0) { return null; }
        public android.telecom.PhoneAccount.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.telecom.PhoneAccount.Builder setHighlightColor(int p0) { return null; }
        public android.telecom.PhoneAccount.Builder setShortDescription(java.lang.CharSequence p0) { return null; }
        public android.telecom.PhoneAccount.Builder addSupportedUriScheme(java.lang.String p0) { return null; }
        public android.telecom.PhoneAccount.Builder setSupportedUriSchemes(java.util.List<java.lang.String> p0) { return null; }
        public android.telecom.PhoneAccount.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.telecom.PhoneAccount.Builder setIsEnabled(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.telecom.PhoneAccount.Builder setGroupId(java.lang.String p0) { return null; }
        public android.telecom.PhoneAccount.Builder setSupportedAudioRoutes(int p0) { return null; }
        public android.telecom.PhoneAccount build() { return null; }
    }
}
