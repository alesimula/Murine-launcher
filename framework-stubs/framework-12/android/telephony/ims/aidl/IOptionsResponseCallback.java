package android.telephony.ims.aidl;

public interface IOptionsResponseCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IOptionsResponseCallback";
    public void onCommandError(int p0) throws android.os.RemoteException;
    public void onNetworkResponse(int p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IOptionsResponseCallback {
        public Default() {}
        public void onCommandError(int p0) throws android.os.RemoteException {}
        public void onNetworkResponse(int p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IOptionsResponseCallback {
        static final int TRANSACTION_onCommandError = 1;
        static final int TRANSACTION_onNetworkResponse = 2;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IOptionsResponseCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.IOptionsResponseCallback p0) { return false; }
        public static android.telephony.ims.aidl.IOptionsResponseCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.IOptionsResponseCallback {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.IOptionsResponseCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCommandError(int p0) throws android.os.RemoteException {}
            public void onNetworkResponse(int p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
        }
    }
}
