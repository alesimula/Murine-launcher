package android.telecom;

public final class CallAttributes implements android.os.Parcelable {
    public static final java.lang.String CALL_CAPABILITIES_KEY = "TelecomCapabilities";
    public static final java.lang.String DISPLAY_NAME_KEY = "DisplayName";
    public static final java.lang.String CALLER_PID_KEY = "CallerPid";
    public static final java.lang.String CALLER_UID_KEY = "CallerUid";
    public static final int DIRECTION_INCOMING = 1;
    public static final int DIRECTION_OUTGOING = 2;
    public static final int AUDIO_CALL = 1;
    public static final int VIDEO_CALL = 2;
    public static final int SUPPORTS_SET_INACTIVE = 2;
    public static final int SUPPORTS_STREAM = 4;
    public static final int SUPPORTS_TRANSFER = 8;
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.transactional_video_state")
    public static final int SUPPORTS_VIDEO_CALLING = 16;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telecom.CallAttributes> CREATOR = null;
    @android.annotation.NonNull
    public android.telecom.PhoneAccountHandle getPhoneAccountHandle() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getDisplayName() { return null; }
    @android.annotation.NonNull
    public android.net.Uri getAddress() { return null; }
    public int getDirection() { return 0; }
    public int getCallType() { return 0; }
    public int getCallCapabilities() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(android.telecom.PhoneAccountHandle p0, int p1, java.lang.CharSequence p2, android.net.Uri p3) {}
        @android.annotation.NonNull
        public android.telecom.CallAttributes.Builder setCallType(int p0) { return null; }
        @android.annotation.NonNull
        public android.telecom.CallAttributes.Builder setCallCapabilities(int p0) { return null; }
        @android.annotation.NonNull
        public android.telecom.CallAttributes build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallCapability {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Direction {
    }
}
