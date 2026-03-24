package com.android.internal.telephony;

public class RILRequest {
    static final java.lang.String LOG_TAG = "RilRequest";
    static java.util.Random sRandom;
    static java.util.concurrent.atomic.AtomicInteger sNextSerial;
    int mSerial;
    int mRequest;
    android.os.Message mResult;
    com.android.internal.telephony.RILRequest mNext;
    int mWakeLockType;
    android.os.WorkSource mWorkSource;
    java.lang.String mClientId;
    long mStartTimeMs;
    java.lang.Object[] mArguments;
    public int getSerial() { return 0; }
    public int getRequest() { return 0; }
    public android.os.Message getResult() { return null; }
    public static com.android.internal.telephony.RILRequest obtain(int p0, android.os.Message p1, android.os.WorkSource p2) { return null; }
    public static com.android.internal.telephony.RILRequest obtain(int p0, android.os.Message p1, android.os.WorkSource p2, java.lang.Object... p3) { return null; }
    public java.lang.String getWorkSourceClientId() { return null; }
    void release() {}
    static void resetSerial() {}
    java.lang.String serialString() { return null; }
    void onError(int p0, java.lang.Object p1) {}
    public java.lang.String toString() { return null; }
}
