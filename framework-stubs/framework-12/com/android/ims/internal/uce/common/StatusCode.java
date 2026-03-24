package com.android.ims.internal.uce.common;

public class StatusCode implements android.os.Parcelable {
    public static final int UCE_SUCCESS = 0;
    public static final int UCE_FAILURE = 1;
    public static final int UCE_SUCCESS_ASYC_UPDATE = 2;
    public static final int UCE_INVALID_SERVICE_HANDLE = 3;
    public static final int UCE_INVALID_LISTENER_HANDLE = 4;
    public static final int UCE_INVALID_PARAM = 5;
    public static final int UCE_FETCH_ERROR = 6;
    public static final int UCE_REQUEST_TIMEOUT = 7;
    public static final int UCE_INSUFFICIENT_MEMORY = 8;
    public static final int UCE_LOST_NET = 9;
    public static final int UCE_NOT_SUPPORTED = 10;
    public static final int UCE_NOT_FOUND = 11;
    public static final int UCE_SERVICE_UNAVAILABLE = 12;
    public static final int UCE_NO_CHANGE_IN_CAP = 13;
    public static final int UCE_SERVICE_UNKNOWN = 14;
    public static final int UCE_INVALID_FEATURE_TAG = 15;
    public static final int UCE_SERVICE_AVAILABLE = 16;
    private int mStatusCode;
    public static final android.os.Parcelable.Creator<com.android.ims.internal.uce.common.StatusCode> CREATOR = null;
    public StatusCode() {}
    public int getStatusCode() { return 0; }
    public void setStatusCode(int p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private StatusCode(android.os.Parcel p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
}
