package com.android.internal.telephony.data;

public class KeepaliveStatus implements android.os.Parcelable {
    public static final int STATUS_ACTIVE = 0;
    public static final int STATUS_INACTIVE = 1;
    public static final int STATUS_PENDING = 2;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_UNSUPPORTED = 1;
    public static final int ERROR_NO_RESOURCES = 2;
    public static final int ERROR_UNKNOWN = 3;
    public static final int INVALID_HANDLE = 2147483647;
    public final int sessionHandle = 0;
    @com.android.internal.telephony.data.KeepaliveStatus.KeepaliveStatusCode
    public final int statusCode = 0;
    public final int errorCode = 0;
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.data.KeepaliveStatus> CREATOR = null;
    public KeepaliveStatus(int p0) {}
    public KeepaliveStatus(int p0, int p1) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface KeepaliveStatusCode {
    }
}
