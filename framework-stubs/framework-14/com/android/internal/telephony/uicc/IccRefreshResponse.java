package com.android.internal.telephony.uicc;

public class IccRefreshResponse {
    public static final int REFRESH_RESULT_FILE_UPDATE = 0;
    public static final int REFRESH_RESULT_INIT = 1;
    public static final int REFRESH_RESULT_RESET = 2;
    public int refreshResult;
    public int efId;
    public java.lang.String aid;
    public IccRefreshResponse() {}
    public java.lang.String toString() { return null; }
}
