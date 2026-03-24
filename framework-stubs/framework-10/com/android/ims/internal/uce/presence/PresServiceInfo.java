package com.android.ims.internal.uce.presence;

public class PresServiceInfo implements android.os.Parcelable {
    public static final int UCE_PRES_MEDIA_CAP_NONE = 0;
    public static final int UCE_PRES_MEDIA_CAP_FULL_AUDIO_ONLY = 1;
    public static final int UCE_PRES_MEDIA_CAP_FULL_AUDIO_AND_VIDEO = 2;
    public static final int UCE_PRES_MEDIA_CAP_UNKNOWN = 3;
    private int mMediaCap;
    private java.lang.String mServiceID;
    private java.lang.String mServiceDesc;
    private java.lang.String mServiceVer;
    public static final android.os.Parcelable.Creator<com.android.ims.internal.uce.presence.PresServiceInfo> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public int getMediaType() { return 0; }
    public void setMediaType(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getServiceId() { return null; }
    public void setServiceId(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getServiceDesc() { return null; }
    public void setServiceDesc(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getServiceVer() { return null; }
    public void setServiceVer(java.lang.String p0) {}
    public PresServiceInfo() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private PresServiceInfo(android.os.Parcel p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
}
