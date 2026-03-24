package android.telephony.ims.compat.stub;

public class ImsConfigImplBase {
    private static final java.lang.String TAG = "ImsConfigImplBase";
    android.telephony.ims.compat.stub.ImsConfigImplBase.ImsConfigStub mImsConfigStub;
    public ImsConfigImplBase(android.content.Context p0) {}
    public int getProvisionedValue(int p0) throws android.os.RemoteException { return 0; }
    public java.lang.String getProvisionedStringValue(int p0) throws android.os.RemoteException { return null; }
    public int setProvisionedValue(int p0, int p1) throws android.os.RemoteException { return 0; }
    public int setProvisionedStringValue(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
    public void getFeatureValue(int p0, int p1, com.android.ims.ImsConfigListener p2) throws android.os.RemoteException {}
    public void setFeatureValue(int p0, int p1, int p2, com.android.ims.ImsConfigListener p3) throws android.os.RemoteException {}
    public boolean getVolteProvisioned() throws android.os.RemoteException { return false; }
    public void getVideoQuality(com.android.ims.ImsConfigListener p0) throws android.os.RemoteException {}
    public void setVideoQuality(int p0, com.android.ims.ImsConfigListener p1) throws android.os.RemoteException {}
    public com.android.ims.internal.IImsConfig getIImsConfig() { return null; }
    public final void notifyProvisionedValueChanged(int p0, int p1) {}
    public final void notifyProvisionedValueChanged(int p0, java.lang.String p1) {}

    public static class ImsConfigStub extends com.android.ims.internal.IImsConfig.Stub {
        android.content.Context mContext;
        java.lang.ref.WeakReference<android.telephony.ims.compat.stub.ImsConfigImplBase> mImsConfigImplBaseWeakReference;
        private java.util.HashMap<java.lang.Integer, java.lang.Integer> mProvisionedIntValue;
        private java.util.HashMap<java.lang.Integer, java.lang.String> mProvisionedStringValue;
        public ImsConfigStub(android.telephony.ims.compat.stub.ImsConfigImplBase p0, android.content.Context p1) { super(); }
        public synchronized int getProvisionedValue(int p0) throws android.os.RemoteException { return 0; }
        public synchronized java.lang.String getProvisionedStringValue(int p0) throws android.os.RemoteException { return null; }
        public synchronized int setProvisionedValue(int p0, int p1) throws android.os.RemoteException { return 0; }
        public synchronized int setProvisionedStringValue(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void getFeatureValue(int p0, int p1, com.android.ims.ImsConfigListener p2) throws android.os.RemoteException {}
        public void setFeatureValue(int p0, int p1, int p2, com.android.ims.ImsConfigListener p3) throws android.os.RemoteException {}
        public boolean getVolteProvisioned() throws android.os.RemoteException { return false; }
        public void getVideoQuality(com.android.ims.ImsConfigListener p0) throws android.os.RemoteException {}
        public void setVideoQuality(int p0, com.android.ims.ImsConfigListener p1) throws android.os.RemoteException {}
        private android.telephony.ims.compat.stub.ImsConfigImplBase getImsConfigImpl() throws android.os.RemoteException { return null; }
        private void sendImsConfigChangedIntent(int p0, int p1) {}
        private void sendImsConfigChangedIntent(int p0, java.lang.String p1) {}
        protected synchronized void updateCachedValue(int p0, int p1, boolean p2) {}
        protected synchronized void updateCachedValue(int p0, java.lang.String p1, boolean p2) {}
    }
}
