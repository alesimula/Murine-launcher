package com.android.ims.internal.uce.presence;

public class PresCmdId implements android.os.Parcelable {
    public static final int UCE_PRES_CMD_GET_VERSION = 0;
    public static final int UCE_PRES_CMD_PUBLISHMYCAP = 1;
    public static final int UCE_PRES_CMD_GETCONTACTCAP = 2;
    public static final int UCE_PRES_CMD_GETCONTACTLISTCAP = 3;
    public static final int UCE_PRES_CMD_SETNEWFEATURETAG = 4;
    public static final int UCE_PRES_CMD_REENABLE_SERVICE = 5;
    public static final int UCE_PRES_CMD_UNKNOWN = 6;
    private int mCmdId;
    public static final android.os.Parcelable.Creator<com.android.ims.internal.uce.presence.PresCmdId> CREATOR = null;
    public int getCmdId() { return 0; }
    public void setCmdId(int p0) {}
    public PresCmdId() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private PresCmdId(android.os.Parcel p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
}
