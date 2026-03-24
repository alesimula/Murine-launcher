package com.android.internal.telephony.ims;

public class ImsServiceController {
    protected final java.lang.Object mLock = null;
    protected final android.content.Context mContext = null;
    public ImsServiceController(android.content.Context p0, android.content.ComponentName p1, com.android.internal.telephony.ims.ImsServiceController.ImsServiceControllerCallbacks p2, com.android.ims.ImsFeatureBinderRepository p3) {}
    public ImsServiceController(android.content.Context p0, android.content.ComponentName p1, com.android.internal.telephony.ims.ImsServiceController.ImsServiceControllerCallbacks p2, android.os.Handler p3, com.android.internal.telephony.ims.ImsServiceController.RebindRetry p4, com.android.ims.ImsFeatureBinderRepository p5) {}
    public boolean bind(java.util.Set<android.telephony.ims.stub.ImsFeatureConfiguration.FeatureSlotPair> p0, android.util.SparseIntArray p1) { return false; }
    public void unbind() throws android.os.RemoteException {}
    public void changeImsServiceFeatures(java.util.Set<android.telephony.ims.stub.ImsFeatureConfiguration.FeatureSlotPair> p0, android.util.SparseIntArray p1) throws android.os.RemoteException {}
    public android.telephony.ims.aidl.IImsServiceController getImsServiceController() { return null; }
    public long getRebindDelay() { return 0L; }
    public void stopBackoffTimerForTesting() {}
    public android.content.ComponentName getComponentName() { return null; }
    public void enableIms(int p0, int p1) {}
    public void disableIms(int p0, int p1) {}
    public void resetIms(int p0, int p1) {}
    public android.telephony.ims.aidl.IImsRegistration getRegistration(int p0, int p1) throws android.os.RemoteException { return null; }
    public android.telephony.ims.aidl.IImsConfig getConfig(int p0, int p1) throws android.os.RemoteException { return null; }
    public android.telephony.ims.aidl.ISipTransport getSipTransport(int p0) throws android.os.RemoteException { return null; }
    protected long getStaticServiceCapabilities() throws android.os.RemoteException { return 0L; }
    protected void notifyImsServiceReady() throws android.os.RemoteException {}
    protected java.lang.String getServiceInterface() { return null; }
    protected void setServiceController(android.os.IBinder p0) {}
    protected boolean isServiceControllerAvailable() { return false; }
    protected android.os.IInterface createImsFeature(int p0, int p1, int p2, long p3) throws android.os.RemoteException { return null; }
    protected void registerImsFeatureStatusCallback(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) throws android.os.RemoteException {}
    protected void unregisterImsFeatureStatusCallback(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) {}
    protected void removeImsFeature(int p0, int p1, boolean p2) throws android.os.RemoteException {}
    public java.lang.String toString() { return null; }
    public void dump(java.io.PrintWriter p0) {}

    private class ImsFeatureStatusCallback {
        ImsFeatureStatusCallback(com.android.internal.telephony.ims.ImsServiceController p0, int p1, int p2) {}
        public com.android.ims.internal.IImsFeatureStatusCallback getCallback() { return null; }
    }

    class ImsServiceConnection implements android.content.ServiceConnection {
        ImsServiceConnection(com.android.internal.telephony.ims.ImsServiceController p0) {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        public void onBindingDied(android.content.ComponentName p0) {}
        public void onNullBinding(android.content.ComponentName p0) {}
    }

    public static interface ImsServiceControllerCallbacks {
        public void imsServiceFeatureCreated(int p0, int p1, com.android.internal.telephony.ims.ImsServiceController p2);
        public void imsServiceFeatureRemoved(int p0, int p1, com.android.internal.telephony.ims.ImsServiceController p2);
        public void imsServiceFeaturesChanged(android.telephony.ims.stub.ImsFeatureConfiguration p0, com.android.internal.telephony.ims.ImsServiceController p1);
        public void imsServiceBindPermanentError(android.content.ComponentName p0);
    }

    public static interface RebindRetry {
        public long getStartDelay();
        public long getMaximumDelay();
    }
}
