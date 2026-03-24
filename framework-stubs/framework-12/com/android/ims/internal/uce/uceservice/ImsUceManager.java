package com.android.ims.internal.uce.uceservice;

public class ImsUceManager {
    private static final java.lang.String LOG_TAG = "ImsUceManager";
    private static final java.lang.String UCE_SERVICE = "uce";
    private com.android.ims.internal.uce.uceservice.IUceService mUceService;
    private com.android.ims.internal.uce.uceservice.ImsUceManager.UceServiceDeathRecipient mDeathReceipient;
    private android.content.Context mContext;
    private static final java.lang.Object sLock = null;
    private static com.android.ims.internal.uce.uceservice.ImsUceManager sUceManager;
    public static final java.lang.String ACTION_UCE_SERVICE_UP = "com.android.ims.internal.uce.UCE_SERVICE_UP";
    public static final java.lang.String ACTION_UCE_SERVICE_DOWN = "com.android.ims.internal.uce.UCE_SERVICE_DOWN";
    public static final int UCE_SERVICE_STATUS_FAILURE = 0;
    public static final int UCE_SERVICE_STATUS_ON = 1;
    public static final int UCE_SERVICE_STATUS_CLOSED = 2;
    public static final int UCE_SERVICE_STATUS_READY = 3;
    public static com.android.ims.internal.uce.uceservice.ImsUceManager getInstance(android.content.Context p0) { return null; }
    private ImsUceManager(android.content.Context p0) {}
    public com.android.ims.internal.uce.uceservice.IUceService getUceServiceInstance() { return null; }
    private java.lang.String getUceServiceName() { return null; }
    public void createUceService(boolean p0) {}

    private class UceServiceDeathRecipient implements android.os.IBinder.DeathRecipient {
        private UceServiceDeathRecipient(com.android.ims.internal.uce.uceservice.ImsUceManager p0) {}
        public void binderDied() {}
    }
}
