package android.content.pm;

public final class ShortcutQueryWrapper extends android.content.pm.LauncherApps.ShortcutQuery implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.pm.ShortcutQueryWrapper> CREATOR = null;
    public ShortcutQueryWrapper(android.content.pm.LauncherApps.ShortcutQuery p0) { super(); }
    public long getChangedSince() { return 0L; }
    @android.annotation.Nullable
    public java.lang.String getPackage() { return null; }
    @android.annotation.Nullable
    public java.util.List<android.content.LocusId> getLocusIds() { return null; }
    @android.annotation.Nullable
    public java.util.List<java.lang.String> getShortcutIds() { return null; }
    @android.annotation.Nullable
    public android.content.ComponentName getActivity() { return null; }
    public int getQueryFlags() { return 0; }
    public ShortcutQueryWrapper() { super(); }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    ShortcutQueryWrapper(android.os.Parcel p0) { super(); }
}
