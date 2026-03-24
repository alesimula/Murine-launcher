package com.android.ims.internal.uce.presence;

public class PresCmdStatus implements android.os.Parcelable {
    private com.android.ims.internal.uce.presence.PresCmdId mCmdId;
    private com.android.ims.internal.uce.common.StatusCode mStatus;
    private int mUserData;
    private int mRequestId;
    public static final android.os.Parcelable.Creator<com.android.ims.internal.uce.presence.PresCmdStatus> CREATOR = null;
    public com.android.ims.internal.uce.presence.PresCmdId getCmdId() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setCmdId(com.android.ims.internal.uce.presence.PresCmdId p0) {}
    public int getUserData() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setUserData(int p0) {}
    public com.android.ims.internal.uce.common.StatusCode getStatus() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setStatus(com.android.ims.internal.uce.common.StatusCode p0) {}
    public int getRequestId() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setRequestId(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public PresCmdStatus() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private PresCmdStatus(android.os.Parcel p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
}
