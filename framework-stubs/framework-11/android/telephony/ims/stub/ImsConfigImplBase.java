package android.telephony.ims.stub;

@android.annotation.SystemApi
public class ImsConfigImplBase {
    private static final java.lang.String TAG = "ImsConfigImplBase";
    public static final int CONFIG_RESULT_UNKNOWN = -1;
    public static final int CONFIG_RESULT_SUCCESS = 0;
    public static final int CONFIG_RESULT_FAILED = 1;
    private final com.android.internal.telephony.util.RemoteCallbackListExt<android.telephony.ims.aidl.IImsConfigCallback> mCallbacks = null;
    android.telephony.ims.stub.ImsConfigImplBase.ImsConfigStub mImsConfigStub;
    public ImsConfigImplBase(android.content.Context p0) {}
    public ImsConfigImplBase() {}
    private void addImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) {}
    private void removeImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) {}
    private final void notifyConfigChanged(int p0, int p1) {}
    private void notifyConfigChanged(int p0, java.lang.String p1) {}
    public android.telephony.ims.aidl.IImsConfig getIImsConfig() { return null; }
    public final void notifyProvisionedValueChanged(int p0, int p1) {}
    public final void notifyProvisionedValueChanged(int p0, java.lang.String p1) {}
    public void notifyRcsAutoConfigurationReceived(byte[] p0, boolean p1) {}
    public int setConfig(int p0, int p1) { return 0; }
    public int setConfig(int p0, java.lang.String p1) { return 0; }
    public int getConfigInt(int p0) { return 0; }
    public java.lang.String getConfigString(int p0) { return null; }
    public void updateImsCarrierConfigs(android.os.PersistableBundle p0) {}

    public static class ImsConfigStub extends android.telephony.ims.aidl.IImsConfig.Stub {
        java.lang.ref.WeakReference<android.telephony.ims.stub.ImsConfigImplBase> mImsConfigImplBaseWeakReference;
        private java.util.HashMap<java.lang.Integer, java.lang.Integer> mProvisionedIntValue;
        private java.util.HashMap<java.lang.Integer, java.lang.String> mProvisionedStringValue;
        public ImsConfigStub(android.telephony.ims.stub.ImsConfigImplBase p0) { super(); }
        public void addImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws android.os.RemoteException {}
        public void removeImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws android.os.RemoteException {}
        public synchronized int getConfigInt(int p0) throws android.os.RemoteException { return 0; }
        public synchronized java.lang.String getConfigString(int p0) throws android.os.RemoteException { return null; }
        public synchronized int setConfigInt(int p0, int p1) throws android.os.RemoteException { return 0; }
        public synchronized int setConfigString(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void updateImsCarrierConfigs(android.os.PersistableBundle p0) throws android.os.RemoteException {}
        private android.telephony.ims.stub.ImsConfigImplBase getImsConfigImpl() throws android.os.RemoteException { return null; }
        public void notifyRcsAutoConfigurationReceived(byte[] p0, boolean p1) throws android.os.RemoteException {}
        private void notifyImsConfigChanged(int p0, int p1) throws android.os.RemoteException {}
        private void notifyImsConfigChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
        protected synchronized void updateCachedValue(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        protected synchronized void updateCachedValue(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SetConfigResult {
    }
}
