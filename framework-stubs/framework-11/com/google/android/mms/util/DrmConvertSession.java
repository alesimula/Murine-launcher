package com.google.android.mms.util;

public class DrmConvertSession {
    private android.drm.DrmManagerClient mDrmClient;
    private int mConvertSessionId;
    private static final java.lang.String TAG = "DrmConvertSession";
    public static final int STATUS_SUCCESS = 200;
    public static final int STATUS_NOT_ACCEPTABLE = 406;
    public static final int STATUS_UNKNOWN_ERROR = 491;
    public static final int STATUS_FILE_ERROR = 492;
    private DrmConvertSession(android.drm.DrmManagerClient p0, int p1) {}
    public static com.google.android.mms.util.DrmConvertSession open(android.content.Context p0, java.lang.String p1) { return null; }
    public byte[] convert(byte[] p0, int p1) { return null; }
    public int close(java.lang.String p0) { return 0; }
}
