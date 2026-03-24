package com.android.ims.internal.uce.presence;

public class PresSipResponse implements android.os.Parcelable {
    private com.android.ims.internal.uce.presence.PresCmdId mCmdId;
    private int mRequestId;
    private int mSipResponseCode;
    private int mRetryAfter;
    private java.lang.String mReasonPhrase;
    public static final android.os.Parcelable.Creator<com.android.ims.internal.uce.presence.PresSipResponse> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public com.android.ims.internal.uce.presence.PresCmdId getCmdId() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setCmdId(com.android.ims.internal.uce.presence.PresCmdId p0) {}
    @android.annotation.UnsupportedAppUsage
    public int getRequestId() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setRequestId(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public int getSipResponseCode() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setSipResponseCode(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getReasonPhrase() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setReasonPhrase(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public int getRetryAfter() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setRetryAfter(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public PresSipResponse() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private PresSipResponse(android.os.Parcel p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
}
