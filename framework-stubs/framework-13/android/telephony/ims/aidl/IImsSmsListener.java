package android.telephony.ims.aidl;

public interface IImsSmsListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsSmsListener";
    public void onSendSmsResult(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void onSmsStatusReportReceived(int p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException;
    public void onSmsReceived(int p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IImsSmsListener {
        public Default() {}
        public void onSendSmsResult(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void onSmsStatusReportReceived(int p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException {}
        public void onSmsReceived(int p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsSmsListener {
        static final int TRANSACTION_onSendSmsResult = 1;
        static final int TRANSACTION_onSmsStatusReportReceived = 2;
        static final int TRANSACTION_onSmsReceived = 3;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsSmsListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.ims.aidl.IImsSmsListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSendSmsResult(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void onSmsStatusReportReceived(int p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException {}
            public void onSmsReceived(int p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException {}
        }
    }
}
