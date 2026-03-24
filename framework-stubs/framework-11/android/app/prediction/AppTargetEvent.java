package android.app.prediction;

@android.annotation.SystemApi
public final class AppTargetEvent implements android.os.Parcelable {
    public static final int ACTION_LAUNCH = 1;
    public static final int ACTION_DISMISS = 2;
    public static final int ACTION_PIN = 3;
    public static final int ACTION_UNPIN = 4;
    private final android.app.prediction.AppTarget mTarget = null;
    private final java.lang.String mLocation = null;
    private final int mAction = 0;
    public static final android.os.Parcelable.Creator<android.app.prediction.AppTargetEvent> CREATOR = null;
    private AppTargetEvent(android.app.prediction.AppTarget p0, java.lang.String p1, int p2) {}
    private AppTargetEvent(android.os.Parcel p0) {}
    public android.app.prediction.AppTarget getTarget() { return null; }
    public java.lang.String getLaunchLocation() { return null; }
    public int getAction() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ActionType {
    }

    @android.annotation.SystemApi
    public static final class Builder {
        private android.app.prediction.AppTarget mTarget;
        private java.lang.String mLocation;
        private int mAction;
        public Builder(android.app.prediction.AppTarget p0, int p1) {}
        public android.app.prediction.AppTargetEvent.Builder setLaunchLocation(java.lang.String p0) { return null; }
        public android.app.prediction.AppTargetEvent build() { return null; }
    }
}
