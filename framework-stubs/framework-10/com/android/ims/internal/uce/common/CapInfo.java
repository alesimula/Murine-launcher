package com.android.ims.internal.uce.common;

public class CapInfo implements android.os.Parcelable {
    private boolean mImSupported;
    private boolean mFtSupported;
    private boolean mFtThumbSupported;
    private boolean mFtSnFSupported;
    private boolean mFtHttpSupported;
    private boolean mIsSupported;
    private boolean mVsDuringCSSupported;
    private boolean mVsSupported;
    private boolean mSpSupported;
    private boolean mCdViaPresenceSupported;
    private boolean mIpVoiceSupported;
    private boolean mIpVideoSupported;
    private boolean mGeoPullFtSupported;
    private boolean mGeoPullSupported;
    private boolean mGeoPushSupported;
    private boolean mSmSupported;
    private boolean mFullSnFGroupChatSupported;
    private boolean mRcsIpVoiceCallSupported;
    private boolean mRcsIpVideoCallSupported;
    private boolean mRcsIpVideoOnlyCallSupported;
    private java.lang.String[] mExts;
    private long mCapTimestamp;
    public static final android.os.Parcelable.Creator<com.android.ims.internal.uce.common.CapInfo> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public CapInfo() {}
    @android.annotation.UnsupportedAppUsage
    public boolean isImSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setImSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isFtThumbSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setFtThumbSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isFtSnFSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setFtSnFSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isFtHttpSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setFtHttpSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isFtSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setFtSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isIsSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setIsSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isVsDuringCSSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setVsDuringCSSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isVsSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setVsSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isSpSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setSpSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isCdViaPresenceSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setCdViaPresenceSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isIpVoiceSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setIpVoiceSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isIpVideoSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setIpVideoSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isGeoPullFtSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setGeoPullFtSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isGeoPullSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setGeoPullSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isGeoPushSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setGeoPushSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isSmSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setSmSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isFullSnFGroupChatSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isRcsIpVoiceCallSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isRcsIpVideoCallSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isRcsIpVideoOnlyCallSupported() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setFullSnFGroupChatSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setRcsIpVoiceCallSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setRcsIpVideoCallSupported(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setRcsIpVideoOnlyCallSupported(boolean p0) {}
    public java.lang.String[] getExts() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setExts(java.lang.String[] p0) {}
    @android.annotation.UnsupportedAppUsage
    public long getCapTimestamp() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public void setCapTimestamp(long p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CapInfo(android.os.Parcel p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
}
