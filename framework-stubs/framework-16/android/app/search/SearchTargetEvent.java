package android.app.search;

@android.annotation.SystemApi
public final class SearchTargetEvent implements android.os.Parcelable {
    public static final int FLAG_IME_SHOWN = 1;
    public static final int ACTION_SURFACE_VISIBLE = 1;
    public static final int ACTION_TAP = 3;
    public static final int ACTION_LONGPRESS = 4;
    public static final int ACTION_LAUNCH_TOUCH = 5;
    public static final int ACTION_LAUNCH_KEYBOARD_FOCUS = 6;
    public static final int ACTION_DRAGNDROP = 7;
    public static final int ACTION_SURFACE_INVISIBLE = 8;
    public static final int ACTION_DELETE = 9;
    public static final int ACTION_DISMISS = 10;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.search.SearchTargetEvent> CREATOR = null;
    @android.annotation.NonNull
    public java.lang.String getTargetId() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getTargetIds() { return null; }
    @android.annotation.Nullable
    public java.lang.String getLaunchLocation() { return null; }
    public int getAction() { return 0; }
    public int getFlags() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ActionType {
    }

    @android.annotation.SystemApi
    public static final class Builder {
        public Builder(java.lang.String p0, int p1) {}
        public Builder(java.util.List<java.lang.String> p0, int p1) {}
        @android.annotation.NonNull
        public android.app.search.SearchTargetEvent.Builder setLaunchLocation(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchTargetEvent.Builder setFlags(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.search.SearchTargetEvent build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FlagType {
    }
}
