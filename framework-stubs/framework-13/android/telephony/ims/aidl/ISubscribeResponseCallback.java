package android.telephony.ims.aidl;

public interface ISubscribeResponseCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.ISubscribeResponseCallback";
    public void onCommandError(int p0) throws android.os.RemoteException;
    public void onNetworkResponse(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onNetworkRespHeader(int p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void onNotifyCapabilitiesUpdate(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public void onResourceTerminated(java.util.List<android.telephony.ims.RcsContactTerminatedReason> p0) throws android.os.RemoteException;
    public void onTerminated(java.lang.String p0, long p1) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.ISubscribeResponseCallback {
        public Default() {}
        public void onCommandError(int p0) throws android.os.RemoteException {}
        public void onNetworkResponse(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onNetworkRespHeader(int p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void onNotifyCapabilitiesUpdate(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public void onResourceTerminated(java.util.List<android.telephony.ims.RcsContactTerminatedReason> p0) throws android.os.RemoteException {}
        public void onTerminated(java.lang.String p0, long p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.ISubscribeResponseCallback {
        static final int TRANSACTION_onCommandError = 1;
        static final int TRANSACTION_onNetworkResponse = 2;
        static final int TRANSACTION_onNetworkRespHeader = 3;
        static final int TRANSACTION_onNotifyCapabilitiesUpdate = 4;
        static final int TRANSACTION_onResourceTerminated = 5;
        static final int TRANSACTION_onTerminated = 6;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.ISubscribeResponseCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.ims.aidl.ISubscribeResponseCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCommandError(int p0) throws android.os.RemoteException {}
            public void onNetworkResponse(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onNetworkRespHeader(int p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void onNotifyCapabilitiesUpdate(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public void onResourceTerminated(java.util.List<android.telephony.ims.RcsContactTerminatedReason> p0) throws android.os.RemoteException {}
            public void onTerminated(java.lang.String p0, long p1) throws android.os.RemoteException {}
        }
    }
}
