package android.content;

public class SyncAdapterType implements android.os.Parcelable {
    public final java.lang.String authority = null;
    public final java.lang.String accountType = null;
    public final boolean isKey = false;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private final boolean userVisible = false;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private final boolean supportsUploading = false;
    @android.annotation.UnsupportedAppUsage
    private final boolean isAlwaysSyncable = false;
    @android.annotation.UnsupportedAppUsage
    private final boolean allowParallelSyncs = false;
    @android.annotation.UnsupportedAppUsage
    private final java.lang.String settingsActivity = null;
    private final java.lang.String packageName = null;
    public static final android.os.Parcelable.Creator<android.content.SyncAdapterType> CREATOR = null;
    public SyncAdapterType(java.lang.String p0, java.lang.String p1, boolean p2, boolean p3) {}
    public SyncAdapterType(java.lang.String p0, java.lang.String p1, boolean p2, boolean p3, boolean p4, boolean p5, java.lang.String p6, java.lang.String p7) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private SyncAdapterType(java.lang.String p0, java.lang.String p1) {}
    public boolean supportsUploading() { return false; }
    public boolean isUserVisible() { return false; }
    public boolean allowParallelSyncs() { return false; }
    public boolean isAlwaysSyncable() { return false; }
    public java.lang.String getSettingsActivity() { return null; }
    public java.lang.String getPackageName() { return null; }
    public static android.content.SyncAdapterType newKey(java.lang.String p0, java.lang.String p1) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public SyncAdapterType(android.os.Parcel p0) {}
}
