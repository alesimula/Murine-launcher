package com.android.internal.telephony.cdma;

public class CdmaSubscriptionSourceManager extends android.os.Handler {
    static final java.lang.String LOG_TAG = "CdmaSSM";
    public static final int SUBSCRIPTION_SOURCE_UNKNOWN = -1;
    public static final int SUBSCRIPTION_FROM_RUIM = 0;
    public static final int SUBSCRIPTION_FROM_NV = 1;
    public static com.android.internal.telephony.cdma.CdmaSubscriptionSourceManager getInstance(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, android.os.Handler p2, int p3, java.lang.Object p4) { return null; }
    public void dispose(android.os.Handler p0) {}
    public void handleMessage(android.os.Message p0) {}
    public int getCdmaSubscriptionSource() { return 0; }
    public static int getDefault(android.content.Context p0) { return 0; }
}
