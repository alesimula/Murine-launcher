package android.app.search;

@android.annotation.SystemApi
public final class SearchTargetEvent implements android.os.Parcelable {
    private final java.util.List<java.lang.String> mTargetIds = null;
    private final java.lang.String mLocation = null;
    private final int mAction = 0;
    private int mFlags;
    public static final int FLAG_IME_SHOWN = 1;
    public static final int ACTION_SURFACE_VISIBLE = 1;
    public static final int ACTION_TAP = 3;
    public static final int ACTION_LONGPRESS = 4;
    public static final int ACTION_LAUNCH_TOUCH = 5;
    public static final int ACTION_LAUNCH_KEYBOARD_FOCUS = 6;
    public static final int ACTION_DRAGNDROP = 7;
    public static final int ACTION_SURFACE_INVISIBLE = 8;
    public static final android.os.Parcelable.Creator<android.app.search.SearchTargetEvent> CREATOR = null;
    private SearchTargetEvent(java.util.List<java.lang.String> p0, java.lang.String p1, int p2, int p3) {}
    private SearchTargetEvent(android.os.Parcel p0) {}
    public java.lang.String getTargetId() { return null; }
    public java.util.List<java.lang.String> getTargetIds() { return null; }
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
        private java.util.List<java.lang.String> mTargetIds;
        private java.lang.String mLocation;
        private int mAction;
        private int mFlags;
        public Builder(java.lang.String p0, int p1) {}
        public Builder(java.util.List<java.lang.String> p0, int p1) {}
        public android.app.search.SearchTargetEvent.Builder setLaunchLocation(java.lang.String p0) { return null; }
        public android.app.search.SearchTargetEvent.Builder setFlags(int p0) { return null; }
        public android.app.search.SearchTargetEvent build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FlagType {
    }
}
