package android.app.prediction;

@android.annotation.SystemApi
public final class AppTargetEvent implements android.os.Parcelable {
    public static final int ACTION_LAUNCH = 1;
    public static final int ACTION_DISMISS = 2;
    public static final int ACTION_PIN = 3;
    public static final int ACTION_UNPIN = 4;
    public static final int ACTION_UNDISMISS = 5;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.prediction.AppTargetEvent> CREATOR = null;
    @android.annotation.Nullable
    public android.app.prediction.AppTarget getTarget() { return null; }
    @android.annotation.Nullable
    public java.lang.String getLaunchLocation() { return null; }
    public int getAction() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ActionType {
    }

    @android.annotation.SystemApi
    public static final class Builder {
        public Builder(android.app.prediction.AppTarget p0, int p1) {}
        @android.annotation.NonNull
        public android.app.prediction.AppTargetEvent.Builder setLaunchLocation(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.prediction.AppTargetEvent build() { return null; }
    }
}
