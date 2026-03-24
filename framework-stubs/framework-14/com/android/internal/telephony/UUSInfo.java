package com.android.internal.telephony;

public class UUSInfo {
    public static final int UUS_TYPE1_IMPLICIT = 0;
    public static final int UUS_TYPE1_REQUIRED = 1;
    public static final int UUS_TYPE1_NOT_REQUIRED = 2;
    public static final int UUS_TYPE2_REQUIRED = 3;
    public static final int UUS_TYPE2_NOT_REQUIRED = 4;
    public static final int UUS_TYPE3_REQUIRED = 5;
    public static final int UUS_TYPE3_NOT_REQUIRED = 6;
    public static final int UUS_DCS_USP = 0;
    public static final int UUS_DCS_OSIHLP = 1;
    public static final int UUS_DCS_X244 = 2;
    public static final int UUS_DCS_RMCF = 3;
    public static final int UUS_DCS_IA5c = 4;
    public UUSInfo() {}
    public UUSInfo(int p0, int p1, byte[] p2) {}
    public int getDcs() { return 0; }
    public void setDcs(int p0) {}
    public int getType() { return 0; }
    public void setType(int p0) {}
    public byte[] getUserData() { return null; }
    public void setUserData(byte[] p0) {}
}
