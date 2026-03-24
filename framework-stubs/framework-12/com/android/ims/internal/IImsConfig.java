package com.android.ims.internal;

public interface IImsConfig extends android.os.IInterface {
    public int getProvisionedValue(int p0) throws android.os.RemoteException;
    public java.lang.String getProvisionedStringValue(int p0) throws android.os.RemoteException;
    public int setProvisionedValue(int p0, int p1) throws android.os.RemoteException;
    public int setProvisionedStringValue(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void getFeatureValue(int p0, int p1, com.android.ims.ImsConfigListener p2) throws android.os.RemoteException;
    public void setFeatureValue(int p0, int p1, int p2, com.android.ims.ImsConfigListener p3) throws android.os.RemoteException;
    public boolean getVolteProvisioned() throws android.os.RemoteException;
    public void getVideoQuality(com.android.ims.ImsConfigListener p0) throws android.os.RemoteException;
    public void setVideoQuality(int p0, com.android.ims.ImsConfigListener p1) throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.IImsConfig {
        public Default() {}
        public int getProvisionedValue(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getProvisionedStringValue(int p0) throws android.os.RemoteException { return null; }
        public int setProvisionedValue(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int setProvisionedStringValue(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void getFeatureValue(int p0, int p1, com.android.ims.ImsConfigListener p2) throws android.os.RemoteException {}
        public void setFeatureValue(int p0, int p1, int p2, com.android.ims.ImsConfigListener p3) throws android.os.RemoteException {}
        public boolean getVolteProvisioned() throws android.os.RemoteException { return false; }
        public void getVideoQuality(com.android.ims.ImsConfigListener p0) throws android.os.RemoteException {}
        public void setVideoQuality(int p0, com.android.ims.ImsConfigListener p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsConfig {
        public static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsConfig";
        static final int TRANSACTION_getProvisionedValue = 1;
        static final int TRANSACTION_getProvisionedStringValue = 2;
        static final int TRANSACTION_setProvisionedValue = 3;
        static final int TRANSACTION_setProvisionedStringValue = 4;
        static final int TRANSACTION_getFeatureValue = 5;
        static final int TRANSACTION_setFeatureValue = 6;
        static final int TRANSACTION_getVolteProvisioned = 7;
        static final int TRANSACTION_getVideoQuality = 8;
        static final int TRANSACTION_setVideoQuality = 9;
        public Stub() { super(); }
        public static com.android.ims.internal.IImsConfig asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.ims.internal.IImsConfig p0) { return false; }
        public static com.android.ims.internal.IImsConfig getDefaultImpl() { return null; }

        private static class Proxy implements com.android.ims.internal.IImsConfig {
            private android.os.IBinder mRemote;
            public static com.android.ims.internal.IImsConfig sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int getProvisionedValue(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getProvisionedStringValue(int p0) throws android.os.RemoteException { return null; }
            public int setProvisionedValue(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int setProvisionedStringValue(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void getFeatureValue(int p0, int p1, com.android.ims.ImsConfigListener p2) throws android.os.RemoteException {}
            public void setFeatureValue(int p0, int p1, int p2, com.android.ims.ImsConfigListener p3) throws android.os.RemoteException {}
            public boolean getVolteProvisioned() throws android.os.RemoteException { return false; }
            public void getVideoQuality(com.android.ims.ImsConfigListener p0) throws android.os.RemoteException {}
            public void setVideoQuality(int p0, com.android.ims.ImsConfigListener p1) throws android.os.RemoteException {}
        }
    }
}
