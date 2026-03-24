package android.window;

public final class ActivityWindowInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.window.ActivityWindowInfo> CREATOR = null;
    public ActivityWindowInfo() {}
    public ActivityWindowInfo(android.window.ActivityWindowInfo p0) {}
    public void set(android.window.ActivityWindowInfo p0) {}
    public void set(boolean p0, android.graphics.Rect p1, android.graphics.Rect p2) {}
    public boolean isEmbedded() { return false; }
    @android.annotation.NonNull
    public android.graphics.Rect getTaskBounds() { return null; }
    @android.annotation.NonNull
    public android.graphics.Rect getTaskFragmentBounds() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    @android.annotation.Nullable
    public static android.window.ActivityWindowInfo getActivityWindowInfo(android.app.Activity p0) { return null; }
}
