package com.android.ims.internal.uce.presence;

public class PresRlmiInfo implements android.os.Parcelable {
    private java.lang.String mUri;
    private int mVersion;
    private boolean mFullState;
    private java.lang.String mListName;
    private int mRequestId;
    private com.android.ims.internal.uce.presence.PresSubscriptionState mPresSubscriptionState;
    private int mSubscriptionExpireTime;
    private java.lang.String mSubscriptionTerminatedReason;
    public static final android.os.Parcelable.Creator<com.android.ims.internal.uce.presence.PresRlmiInfo> CREATOR = null;
    public java.lang.String getUri() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setUri(java.lang.String p0) {}
    public int getVersion() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setVersion(int p0) {}
    public boolean isFullState() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setFullState(boolean p0) {}
    public java.lang.String getListName() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setListName(java.lang.String p0) {}
    public int getRequestId() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setRequestId(int p0) {}
    public com.android.ims.internal.uce.presence.PresSubscriptionState getPresSubscriptionState() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setPresSubscriptionState(com.android.ims.internal.uce.presence.PresSubscriptionState p0) {}
    public int getSubscriptionExpireTime() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setSubscriptionExpireTime(int p0) {}
    public java.lang.String getSubscriptionTerminatedReason() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setSubscriptionTerminatedReason(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public PresRlmiInfo() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private PresRlmiInfo(android.os.Parcel p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
}
