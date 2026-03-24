package com.android.ims.internal;

public interface IImsService extends android.os.IInterface {
    public int open(int p0, int p1, android.app.PendingIntent p2, com.android.ims.internal.IImsRegistrationListener p3) throws android.os.RemoteException;
    public void close(int p0) throws android.os.RemoteException;
    public boolean isConnected(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isOpened(int p0) throws android.os.RemoteException;
    public void setRegistrationListener(int p0, com.android.ims.internal.IImsRegistrationListener p1) throws android.os.RemoteException;
    public void addRegistrationListener(int p0, int p1, com.android.ims.internal.IImsRegistrationListener p2) throws android.os.RemoteException;
    public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1, int p2) throws android.os.RemoteException;
    public com.android.ims.internal.IImsCallSession createCallSession(int p0, android.telephony.ims.ImsCallProfile p1, com.android.ims.internal.IImsCallSessionListener p2) throws android.os.RemoteException;
    public com.android.ims.internal.IImsCallSession getPendingCallSession(int p0, java.lang.String p1) throws android.os.RemoteException;
    public com.android.ims.internal.IImsUt getUtInterface(int p0) throws android.os.RemoteException;
    public com.android.ims.internal.IImsConfig getConfigInterface(int p0) throws android.os.RemoteException;
    public void turnOnIms(int p0) throws android.os.RemoteException;
    public void turnOffIms(int p0) throws android.os.RemoteException;
    public com.android.ims.internal.IImsEcbm getEcbmInterface(int p0) throws android.os.RemoteException;
    public void setUiTTYMode(int p0, int p1, android.os.Message p2) throws android.os.RemoteException;
    public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface(int p0) throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.IImsService {
        public Default() {}
        public int open(int p0, int p1, android.app.PendingIntent p2, com.android.ims.internal.IImsRegistrationListener p3) throws android.os.RemoteException { return 0; }
        public void close(int p0) throws android.os.RemoteException {}
        public boolean isConnected(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isOpened(int p0) throws android.os.RemoteException { return false; }
        public void setRegistrationListener(int p0, com.android.ims.internal.IImsRegistrationListener p1) throws android.os.RemoteException {}
        public void addRegistrationListener(int p0, int p1, com.android.ims.internal.IImsRegistrationListener p2) throws android.os.RemoteException {}
        public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.IImsCallSession createCallSession(int p0, android.telephony.ims.ImsCallProfile p1, com.android.ims.internal.IImsCallSessionListener p2) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.IImsCallSession getPendingCallSession(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.IImsUt getUtInterface(int p0) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.IImsConfig getConfigInterface(int p0) throws android.os.RemoteException { return null; }
        public void turnOnIms(int p0) throws android.os.RemoteException {}
        public void turnOffIms(int p0) throws android.os.RemoteException {}
        public com.android.ims.internal.IImsEcbm getEcbmInterface(int p0) throws android.os.RemoteException { return null; }
        public void setUiTTYMode(int p0, int p1, android.os.Message p2) throws android.os.RemoteException {}
        public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsService {
        public static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsService";
        static final int TRANSACTION_open = 1;
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_isConnected = 3;
        static final int TRANSACTION_isOpened = 4;
        static final int TRANSACTION_setRegistrationListener = 5;
        static final int TRANSACTION_addRegistrationListener = 6;
        static final int TRANSACTION_createCallProfile = 7;
        static final int TRANSACTION_createCallSession = 8;
        static final int TRANSACTION_getPendingCallSession = 9;
        static final int TRANSACTION_getUtInterface = 10;
        static final int TRANSACTION_getConfigInterface = 11;
        static final int TRANSACTION_turnOnIms = 12;
        static final int TRANSACTION_turnOffIms = 13;
        static final int TRANSACTION_getEcbmInterface = 14;
        static final int TRANSACTION_setUiTTYMode = 15;
        static final int TRANSACTION_getMultiEndpointInterface = 16;
        public Stub() { super(); }
        public static com.android.ims.internal.IImsService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.ims.internal.IImsService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int open(int p0, int p1, android.app.PendingIntent p2, com.android.ims.internal.IImsRegistrationListener p3) throws android.os.RemoteException { return 0; }
            public void close(int p0) throws android.os.RemoteException {}
            public boolean isConnected(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isOpened(int p0) throws android.os.RemoteException { return false; }
            public void setRegistrationListener(int p0, com.android.ims.internal.IImsRegistrationListener p1) throws android.os.RemoteException {}
            public void addRegistrationListener(int p0, int p1, com.android.ims.internal.IImsRegistrationListener p2) throws android.os.RemoteException {}
            public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.IImsCallSession createCallSession(int p0, android.telephony.ims.ImsCallProfile p1, com.android.ims.internal.IImsCallSessionListener p2) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.IImsCallSession getPendingCallSession(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.IImsUt getUtInterface(int p0) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.IImsConfig getConfigInterface(int p0) throws android.os.RemoteException { return null; }
            public void turnOnIms(int p0) throws android.os.RemoteException {}
            public void turnOffIms(int p0) throws android.os.RemoteException {}
            public com.android.ims.internal.IImsEcbm getEcbmInterface(int p0) throws android.os.RemoteException { return null; }
            public void setUiTTYMode(int p0, int p1, android.os.Message p2) throws android.os.RemoteException {}
            public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface(int p0) throws android.os.RemoteException { return null; }
        }
    }
}
