package android.telephony;

public interface ICellInfoCallback extends android.os.IInterface {
    public void onCellInfo(java.util.List<android.telephony.CellInfo> p0) throws android.os.RemoteException;
    public void onError(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;

    public static class Default implements android.telephony.ICellInfoCallback {
        public Default() {}
        public void onCellInfo(java.util.List<android.telephony.CellInfo> p0) throws android.os.RemoteException {}
        public void onError(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ICellInfoCallback {
        private static final java.lang.String DESCRIPTOR = "android.telephony.ICellInfoCallback";
        static final int TRANSACTION_onCellInfo = 1;
        static final int TRANSACTION_onError = 2;
        public Stub() { super(); }
        public static android.telephony.ICellInfoCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ICellInfoCallback p0) { return false; }
        public static android.telephony.ICellInfoCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ICellInfoCallback {
            private android.os.IBinder mRemote;
            public static android.telephony.ICellInfoCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCellInfo(java.util.List<android.telephony.CellInfo> p0) throws android.os.RemoteException {}
            public void onError(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        }
    }
}
