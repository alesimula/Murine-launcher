package android.credentials.ui;

public final class AuthenticationEntry implements android.os.Parcelable {
    public static final int STATUS_LOCKED = 0;
    public static final int STATUS_UNLOCKED_BUT_EMPTY_LESS_RECENT = 1;
    public static final int STATUS_UNLOCKED_BUT_EMPTY_MOST_RECENT = 2;
    public static final android.os.Parcelable.Creator<android.credentials.ui.AuthenticationEntry> CREATOR = null;
    public AuthenticationEntry(java.lang.String p0, java.lang.String p1, android.app.slice.Slice p2, int p3) {}
    public AuthenticationEntry(java.lang.String p0, java.lang.String p1, android.app.slice.Slice p2, int p3, android.content.Intent p4) {}
    public java.lang.String getKey() { return null; }
    public java.lang.String getSubkey() { return null; }
    public android.app.slice.Slice getSlice() { return null; }
    public int getStatus() { return 0; }
    @android.annotation.SuppressLint("IntentBuilderName")
    public android.content.Intent getFrameworkExtrasIntent() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
