package android.service.euicc;

public interface IGetEidCallback extends android.os.IInterface {
    public void onSuccess(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.service.euicc.IGetEidCallback {
        public Default() {}
        public void onSuccess(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.euicc.IGetEidCallback {
        public static final java.lang.String DESCRIPTOR = "android.service.euicc.IGetEidCallback";
        static final int TRANSACTION_onSuccess = 1;
        public Stub() { super(); }
        public static android.service.euicc.IGetEidCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.euicc.IGetEidCallback p0) { return false; }
        public static android.service.euicc.IGetEidCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.service.euicc.IGetEidCallback {
            private android.os.IBinder mRemote;
            public static android.service.euicc.IGetEidCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSuccess(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
