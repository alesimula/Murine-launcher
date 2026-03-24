package com.android.ims.internal.uce.options;

public class OptionsCmdId implements android.os.Parcelable {
    public static final int UCE_OPTIONS_CMD_GETMYCDINFO = 0;
    public static final int UCE_OPTIONS_CMD_SETMYCDINFO = 1;
    public static final int UCE_OPTIONS_CMD_GETCONTACTCAP = 2;
    public static final int UCE_OPTIONS_CMD_GETCONTACTLISTCAP = 3;
    public static final int UCE_OPTIONS_CMD_RESPONSEINCOMINGOPTIONS = 4;
    public static final int UCE_OPTIONS_CMD_GET_VERSION = 5;
    public static final int UCE_OPTIONS_CMD_UNKNOWN = 6;
    private int mCmdId;
    public static final android.os.Parcelable.Creator<com.android.ims.internal.uce.options.OptionsCmdId> CREATOR = null;
    public int getCmdId() { return 0; }
    public void setCmdId(int p0) {}
    public OptionsCmdId() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private OptionsCmdId(android.os.Parcel p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
}
