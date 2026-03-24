package android.service.euicc;

public interface IGetEuiccInfoCallback extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public void onSuccess(android.telephony.euicc.EuiccInfo p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.euicc.IGetEuiccInfoCallback {
        private static final java.lang.String DESCRIPTOR = "android.service.euicc.IGetEuiccInfoCallback";
        static final int TRANSACTION_onSuccess = 1;
        public Stub() { super(); }
        public static android.service.euicc.IGetEuiccInfoCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.euicc.IGetEuiccInfoCallback p0) { return false; }
        public static android.service.euicc.IGetEuiccInfoCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.service.euicc.IGetEuiccInfoCallback {
            private android.os.IBinder mRemote;
            public static android.service.euicc.IGetEuiccInfoCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSuccess(android.telephony.euicc.EuiccInfo p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.service.euicc.IGetEuiccInfoCallback {
        public Default() {}
        public void onSuccess(android.telephony.euicc.EuiccInfo p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
