package com.android.ims.internal;

public interface IImsMMTelFeature extends android.os.IInterface {
    public int startSession(android.app.PendingIntent p0, com.android.ims.internal.IImsRegistrationListener p1) throws android.os.RemoteException;
    public void endSession(int p0) throws android.os.RemoteException;
    public boolean isConnected(int p0, int p1) throws android.os.RemoteException;
    public boolean isOpened() throws android.os.RemoteException;
    public int getFeatureStatus() throws android.os.RemoteException;
    public void addRegistrationListener(com.android.ims.internal.IImsRegistrationListener p0) throws android.os.RemoteException;
    public void removeRegistrationListener(com.android.ims.internal.IImsRegistrationListener p0) throws android.os.RemoteException;
    public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1, int p2) throws android.os.RemoteException;
    public com.android.ims.internal.IImsCallSession createCallSession(int p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException;
    public com.android.ims.internal.IImsCallSession getPendingCallSession(int p0, java.lang.String p1) throws android.os.RemoteException;
    public com.android.ims.internal.IImsUt getUtInterface() throws android.os.RemoteException;
    public com.android.ims.internal.IImsConfig getConfigInterface() throws android.os.RemoteException;
    public void turnOnIms() throws android.os.RemoteException;
    public void turnOffIms() throws android.os.RemoteException;
    public com.android.ims.internal.IImsEcbm getEcbmInterface() throws android.os.RemoteException;
    public void setUiTTYMode(int p0, android.os.Message p1) throws android.os.RemoteException;
    public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface() throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.IImsMMTelFeature {
        public Default() {}
        public int startSession(android.app.PendingIntent p0, com.android.ims.internal.IImsRegistrationListener p1) throws android.os.RemoteException { return 0; }
        public void endSession(int p0) throws android.os.RemoteException {}
        public boolean isConnected(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isOpened() throws android.os.RemoteException { return false; }
        public int getFeatureStatus() throws android.os.RemoteException { return 0; }
        public void addRegistrationListener(com.android.ims.internal.IImsRegistrationListener p0) throws android.os.RemoteException {}
        public void removeRegistrationListener(com.android.ims.internal.IImsRegistrationListener p0) throws android.os.RemoteException {}
        public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.IImsCallSession createCallSession(int p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.IImsCallSession getPendingCallSession(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.IImsUt getUtInterface() throws android.os.RemoteException { return null; }
        public com.android.ims.internal.IImsConfig getConfigInterface() throws android.os.RemoteException { return null; }
        public void turnOnIms() throws android.os.RemoteException {}
        public void turnOffIms() throws android.os.RemoteException {}
        public com.android.ims.internal.IImsEcbm getEcbmInterface() throws android.os.RemoteException { return null; }
        public void setUiTTYMode(int p0, android.os.Message p1) throws android.os.RemoteException {}
        public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsMMTelFeature {
        private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsMMTelFeature";
        static final int TRANSACTION_startSession = 1;
        static final int TRANSACTION_endSession = 2;
        static final int TRANSACTION_isConnected = 3;
        static final int TRANSACTION_isOpened = 4;
        static final int TRANSACTION_getFeatureStatus = 5;
        static final int TRANSACTION_addRegistrationListener = 6;
        static final int TRANSACTION_removeRegistrationListener = 7;
        static final int TRANSACTION_createCallProfile = 8;
        static final int TRANSACTION_createCallSession = 9;
        static final int TRANSACTION_getPendingCallSession = 10;
        static final int TRANSACTION_getUtInterface = 11;
        static final int TRANSACTION_getConfigInterface = 12;
        static final int TRANSACTION_turnOnIms = 13;
        static final int TRANSACTION_turnOffIms = 14;
        static final int TRANSACTION_getEcbmInterface = 15;
        static final int TRANSACTION_setUiTTYMode = 16;
        static final int TRANSACTION_getMultiEndpointInterface = 17;
        public Stub() { super(); }
        public static com.android.ims.internal.IImsMMTelFeature asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.ims.internal.IImsMMTelFeature p0) { return false; }
        public static com.android.ims.internal.IImsMMTelFeature getDefaultImpl() { return null; }

        private static class Proxy implements com.android.ims.internal.IImsMMTelFeature {
            private android.os.IBinder mRemote;
            public static com.android.ims.internal.IImsMMTelFeature sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int startSession(android.app.PendingIntent p0, com.android.ims.internal.IImsRegistrationListener p1) throws android.os.RemoteException { return 0; }
            public void endSession(int p0) throws android.os.RemoteException {}
            public boolean isConnected(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isOpened() throws android.os.RemoteException { return false; }
            public int getFeatureStatus() throws android.os.RemoteException { return 0; }
            public void addRegistrationListener(com.android.ims.internal.IImsRegistrationListener p0) throws android.os.RemoteException {}
            public void removeRegistrationListener(com.android.ims.internal.IImsRegistrationListener p0) throws android.os.RemoteException {}
            public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.IImsCallSession createCallSession(int p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.IImsCallSession getPendingCallSession(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.IImsUt getUtInterface() throws android.os.RemoteException { return null; }
            public com.android.ims.internal.IImsConfig getConfigInterface() throws android.os.RemoteException { return null; }
            public void turnOnIms() throws android.os.RemoteException {}
            public void turnOffIms() throws android.os.RemoteException {}
            public com.android.ims.internal.IImsEcbm getEcbmInterface() throws android.os.RemoteException { return null; }
            public void setUiTTYMode(int p0, android.os.Message p1) throws android.os.RemoteException {}
            public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface() throws android.os.RemoteException { return null; }
        }
    }
}
