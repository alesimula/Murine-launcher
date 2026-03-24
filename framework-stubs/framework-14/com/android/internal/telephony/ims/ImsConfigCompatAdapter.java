package com.android.internal.telephony.ims;

public class ImsConfigCompatAdapter extends android.telephony.ims.stub.ImsConfigImplBase {
    public static final int UNKNOWN = -1;
    public static final int SUCCESS = 0;
    public static final int FAILED = 1;
    public ImsConfigCompatAdapter(com.android.ims.internal.IImsConfig p0) { super(); }
    public int setConfig(int p0, int p1) { return 0; }
    public int setConfig(int p0, java.lang.String p1) { return 0; }
    public int getConfigInt(int p0) { return 0; }
    public java.lang.String getConfigString(int p0) { return null; }
}
