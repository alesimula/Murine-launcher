package android.hardware.face;

public class FaceAuthenticateOptions implements android.hardware.biometrics.AuthenticateOptions, android.os.Parcelable {
    public static final int AUTHENTICATE_REASON_UNKNOWN = 0;
    public static final int AUTHENTICATE_REASON_STARTED_WAKING_UP = 1;
    public static final int AUTHENTICATE_REASON_PRIMARY_BOUNCER_SHOWN = 2;
    public static final int AUTHENTICATE_REASON_ASSISTANT_VISIBLE = 3;
    public static final int AUTHENTICATE_REASON_ALTERNATE_BIOMETRIC_BOUNCER_SHOWN = 4;
    public static final int AUTHENTICATE_REASON_NOTIFICATION_PANEL_CLICKED = 5;
    public static final int AUTHENTICATE_REASON_OCCLUDING_APP_REQUESTED = 6;
    public static final int AUTHENTICATE_REASON_PICK_UP_GESTURE_TRIGGERED = 7;
    public static final int AUTHENTICATE_REASON_QS_EXPANDED = 8;
    public static final int AUTHENTICATE_REASON_SWIPE_UP_ON_BOUNCER = 9;
    public static final int AUTHENTICATE_REASON_UDFPS_POINTER_DOWN = 10;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.face.FaceAuthenticateOptions> CREATOR = null;
    public static java.lang.String authenticateReasonToString(int p0) { return null; }
    FaceAuthenticateOptions(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, java.lang.String p6) {}
    public int getUserId() { return 0; }
    public int getSensorId() { return 0; }
    public int getDisplayState() { return 0; }
    public int getAuthenticateReason() { return 0; }
    public int getWakeReason() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getOpPackageName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getAttributionTag() { return null; }
    @android.annotation.NonNull
    public android.hardware.face.FaceAuthenticateOptions setSensorId(int p0) { return null; }
    @android.annotation.NonNull
    public android.hardware.face.FaceAuthenticateOptions setOpPackageName(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public android.hardware.face.FaceAuthenticateOptions setAttributionTag(java.lang.String p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    protected FaceAuthenticateOptions(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AuthenticateReason {
    }

    public static class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.hardware.face.FaceAuthenticateOptions.Builder setUserId(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.face.FaceAuthenticateOptions.Builder setSensorId(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.face.FaceAuthenticateOptions.Builder setDisplayState(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.face.FaceAuthenticateOptions.Builder setAuthenticateReason(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.face.FaceAuthenticateOptions.Builder setWakeReason(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.face.FaceAuthenticateOptions.Builder setOpPackageName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.face.FaceAuthenticateOptions.Builder setAttributionTag(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.face.FaceAuthenticateOptions build() { return null; }
    }
}
