package com.android.ims.internal.uce.uceservice;

public class ImsUceManager {
    public static final java.lang.String ACTION_UCE_SERVICE_UP = "com.android.ims.internal.uce.UCE_SERVICE_UP";
    public static final java.lang.String ACTION_UCE_SERVICE_DOWN = "com.android.ims.internal.uce.UCE_SERVICE_DOWN";
    public static final int UCE_SERVICE_STATUS_FAILURE = 0;
    public static final int UCE_SERVICE_STATUS_ON = 1;
    public static final int UCE_SERVICE_STATUS_CLOSED = 2;
    public static final int UCE_SERVICE_STATUS_READY = 3;
    public static com.android.ims.internal.uce.uceservice.ImsUceManager getInstance(android.content.Context p0) { return null; }
    public com.android.ims.internal.uce.uceservice.IUceService getUceServiceInstance() { return null; }
    public void createUceService(boolean p0) {}

    private class UceServiceDeathRecipient implements android.os.IBinder.DeathRecipient {
        public void binderDied() {}
    }
}
