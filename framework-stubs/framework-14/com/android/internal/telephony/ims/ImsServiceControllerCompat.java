package com.android.internal.telephony.ims;

public class ImsServiceControllerCompat extends com.android.internal.telephony.ims.ImsServiceController {
    public ImsServiceControllerCompat(android.content.Context p0, android.content.ComponentName p1, com.android.internal.telephony.ims.ImsServiceController.ImsServiceControllerCallbacks p2, com.android.ims.ImsFeatureBinderRepository p3) { super((android.content.Context)null, (android.content.ComponentName)null, (com.android.internal.telephony.ims.ImsServiceController.ImsServiceControllerCallbacks)null, (com.android.ims.ImsFeatureBinderRepository)null); }
    public ImsServiceControllerCompat(android.content.Context p0, android.content.ComponentName p1, com.android.internal.telephony.ims.ImsServiceController.ImsServiceControllerCallbacks p2, android.os.Handler p3, com.android.internal.telephony.ims.ImsServiceController.RebindRetry p4, com.android.ims.ImsFeatureBinderRepository p5, com.android.internal.telephony.ims.ImsServiceControllerCompat.MmTelFeatureCompatFactory p6) { super((android.content.Context)null, (android.content.ComponentName)null, (com.android.internal.telephony.ims.ImsServiceController.ImsServiceControllerCallbacks)null, (com.android.ims.ImsFeatureBinderRepository)null); }
    protected final java.lang.String getServiceInterface() { return null; }
    public final void enableIms(int p0, int p1) {}
    public final void disableIms(int p0, int p1) {}
    public final android.telephony.ims.aidl.IImsRegistration getRegistration(int p0, int p1) { return null; }
    public final android.telephony.ims.aidl.IImsConfig getConfig(int p0, int p1) { return null; }
    public android.telephony.ims.aidl.ISipTransport getSipTransport(int p0) { return null; }
    protected long getStaticServiceCapabilities() { return 0L; }
    protected final void notifyImsServiceReady() {}
    protected final android.os.IInterface createImsFeature(int p0, int p1, int p2, long p3) throws android.os.RemoteException { return null; }
    protected void registerImsFeatureStatusCallback(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) throws android.os.RemoteException {}
    protected void unregisterImsFeatureStatusCallback(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) {}
    protected final void removeImsFeature(int p0, int p1, boolean p2) throws android.os.RemoteException {}
    protected void setServiceController(android.os.IBinder p0) {}
    protected boolean isServiceControllerAvailable() { return false; }

    public static interface MmTelFeatureCompatFactory {
        public com.android.internal.telephony.ims.MmTelFeatureCompatAdapter create(android.content.Context p0, int p1, com.android.internal.telephony.ims.MmTelInterfaceAdapter p2);
    }
}
