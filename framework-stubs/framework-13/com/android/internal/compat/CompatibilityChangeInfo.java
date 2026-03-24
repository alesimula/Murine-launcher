package com.android.internal.compat;

public class CompatibilityChangeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.compat.CompatibilityChangeInfo> CREATOR = null;
    public long getId() { return 0L; }
    public java.lang.String getName() { return null; }
    public int getEnableSinceTargetSdk() { return 0; }
    public boolean getDisabled() { return false; }
    public boolean getLoggingOnly() { return false; }
    public java.lang.String getDescription() { return null; }
    public boolean getOverridable() { return false; }
    public CompatibilityChangeInfo(java.lang.Long p0, java.lang.String p1, int p2, int p3, boolean p4, boolean p5, java.lang.String p6, boolean p7) {}
    public CompatibilityChangeInfo(com.android.internal.compat.CompatibilityChangeInfo p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
}
