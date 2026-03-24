package com.android.ims.internal.uce.presence;

public class PresResInstanceInfo implements android.os.Parcelable {
    public static final int UCE_PRES_RES_INSTANCE_STATE_ACTIVE = 0;
    public static final int UCE_PRES_RES_INSTANCE_STATE_PENDING = 1;
    public static final int UCE_PRES_RES_INSTANCE_STATE_TERMINATED = 2;
    public static final int UCE_PRES_RES_INSTANCE_STATE_UNKNOWN = 3;
    public static final int UCE_PRES_RES_INSTANCE_UNKNOWN = 4;
    public static final android.os.Parcelable.Creator<com.android.ims.internal.uce.presence.PresResInstanceInfo> CREATOR = null;
    public int getResInstanceState() { return 0; }
    public void setResInstanceState(int p0) {}
    public java.lang.String getResId() { return null; }
    public void setResId(java.lang.String p0) {}
    public java.lang.String getReason() { return null; }
    public void setReason(java.lang.String p0) {}
    public java.lang.String getPresentityUri() { return null; }
    public void setPresentityUri(java.lang.String p0) {}
    public com.android.ims.internal.uce.presence.PresTupleInfo[] getTupleInfo() { return null; }
    public void setTupleInfo(com.android.ims.internal.uce.presence.PresTupleInfo[] p0) {}
    public PresResInstanceInfo() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
}
