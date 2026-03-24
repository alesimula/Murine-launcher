package com.android.internal.logging;

public final class InstanceId implements android.os.Parcelable {
    static final int INSTANCE_ID_MAX = 1048576;
    private final int mId = 0;
    public static final android.os.Parcelable.Creator<com.android.internal.logging.InstanceId> CREATOR = null;
    InstanceId(int p0) {}
    private InstanceId(android.os.Parcel p0) {}
    public int getId() { return 0; }
    public static com.android.internal.logging.InstanceId fakeInstanceId(int p0) { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
