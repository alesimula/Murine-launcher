package android.telephony.ims.stub;

@android.annotation.SystemApi
public class ImsConfigImplBase {
    public static final int CONFIG_RESULT_UNKNOWN = -1;
    public static final int CONFIG_RESULT_SUCCESS = 0;
    public static final int CONFIG_RESULT_FAILED = 1;
    android.telephony.ims.stub.ImsConfigImplBase.ImsConfigStub mImsConfigStub;
    public ImsConfigImplBase(java.util.concurrent.Executor p0) {}
    public ImsConfigImplBase(android.content.Context p0) {}
    public ImsConfigImplBase() {}
    public android.telephony.ims.aidl.IImsConfig getIImsConfig() { return null; }
    public final void notifyProvisionedValueChanged(int p0, int p1) {}
    public final void notifyProvisionedValueChanged(int p0, java.lang.String p1) {}
    public void notifyRcsAutoConfigurationReceived(byte[] p0, boolean p1) {}
    public void notifyRcsAutoConfigurationRemoved() {}
    public int setConfig(int p0, int p1) { return 0; }
    public int setConfig(int p0, java.lang.String p1) { return 0; }
    public int getConfigInt(int p0) { return 0; }
    public java.lang.String getConfigString(int p0) { return null; }
    public void updateImsCarrierConfigs(android.os.PersistableBundle p0) {}
    public void setRcsClientConfiguration(android.telephony.ims.RcsClientConfiguration p0) {}
    public void triggerAutoConfiguration() {}
    public final void notifyAutoConfigurationErrorReceived(int p0, java.lang.String p1) {}
    public final void notifyPreProvisioningReceived(byte[] p0) {}
    public final void setDefaultExecutor(java.util.concurrent.Executor p0) {}
    public final void clearConfigurationCache() {}

    public static class ImsConfigStub extends android.telephony.ims.aidl.IImsConfig.Stub {
        java.lang.ref.WeakReference<android.telephony.ims.stub.ImsConfigImplBase> mImsConfigImplBaseWeakReference;
        public ImsConfigStub(android.telephony.ims.stub.ImsConfigImplBase p0, java.util.concurrent.Executor p1) { super(); }
        public void addImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws android.os.RemoteException {}
        public void removeImsConfigCallback(android.telephony.ims.aidl.IImsConfigCallback p0) throws android.os.RemoteException {}
        public int getConfigInt(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getConfigString(int p0) throws android.os.RemoteException { return null; }
        public int setConfigInt(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int setConfigString(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void updateImsCarrierConfigs(android.os.PersistableBundle p0) throws android.os.RemoteException {}
        public void notifyRcsAutoConfigurationReceived(byte[] p0, boolean p1) throws android.os.RemoteException {}
        public void notifyRcsAutoConfigurationRemoved() throws android.os.RemoteException {}
        protected void updateCachedValue(int p0, int p1) {}
        protected void updateCachedValue(int p0, java.lang.String p1) {}
        public void addRcsConfigCallback(android.telephony.ims.aidl.IRcsConfigCallback p0) throws android.os.RemoteException {}
        public void removeRcsConfigCallback(android.telephony.ims.aidl.IRcsConfigCallback p0) throws android.os.RemoteException {}
        public void triggerRcsReconfiguration() throws android.os.RemoteException {}
        public void setRcsClientConfiguration(android.telephony.ims.RcsClientConfiguration p0) throws android.os.RemoteException {}
        public void notifyIntImsConfigChanged(int p0, int p1) throws android.os.RemoteException {}
        public void notifyStringImsConfigChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void clearCachedValue() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SetConfigResult {
    }
}
