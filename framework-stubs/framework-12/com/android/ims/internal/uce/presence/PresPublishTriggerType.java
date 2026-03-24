package com.android.ims.internal.uce.presence;

public class PresPublishTriggerType implements android.os.Parcelable {
    public static final int UCE_PRES_PUBLISH_TRIGGER_ETAG_EXPIRED = 0;
    public static final int UCE_PRES_PUBLISH_TRIGGER_MOVE_TO_LTE_VOPS_DISABLED = 1;
    public static final int UCE_PRES_PUBLISH_TRIGGER_MOVE_TO_LTE_VOPS_ENABLED = 2;
    public static final int UCE_PRES_PUBLISH_TRIGGER_MOVE_TO_EHRPD = 3;
    public static final int UCE_PRES_PUBLISH_TRIGGER_MOVE_TO_HSPAPLUS = 4;
    public static final int UCE_PRES_PUBLISH_TRIGGER_MOVE_TO_3G = 5;
    public static final int UCE_PRES_PUBLISH_TRIGGER_MOVE_TO_2G = 6;
    public static final int UCE_PRES_PUBLISH_TRIGGER_MOVE_TO_WLAN = 7;
    public static final int UCE_PRES_PUBLISH_TRIGGER_MOVE_TO_IWLAN = 8;
    public static final int UCE_PRES_PUBLISH_TRIGGER_UNKNOWN = 9;
    public static final int UCE_PRES_PUBLISH_TRIGGER_MOVE_TO_NR5G_VOPS_DISABLED = 10;
    public static final int UCE_PRES_PUBLISH_TRIGGER_MOVE_TO_NR5G_VOPS_ENABLED = 11;
    private int mPublishTriggerType;
    public static final android.os.Parcelable.Creator<com.android.ims.internal.uce.presence.PresPublishTriggerType> CREATOR = null;
    public int getPublishTrigeerType() { return 0; }
    public void setPublishTrigeerType(int p0) {}
    public PresPublishTriggerType() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private PresPublishTriggerType(android.os.Parcel p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
}
