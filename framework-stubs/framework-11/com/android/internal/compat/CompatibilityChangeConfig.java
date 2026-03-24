package com.android.internal.compat;

public final class CompatibilityChangeConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.compat.CompatibilityChangeConfig> CREATOR = null;
    public CompatibilityChangeConfig(android.compat.Compatibility.ChangeConfig p0) {}
    public java.util.Set<java.lang.Long> enabledChanges() { return null; }
    public java.util.Set<java.lang.Long> disabledChanges() { return null; }
    public boolean isChangeEnabled(long p0) { return false; }
    private CompatibilityChangeConfig(android.os.Parcel p0) {}
    private static java.util.Set<java.lang.Long> toLongSet(long[] p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
