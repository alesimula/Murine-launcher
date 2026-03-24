package android.service.carrier;

public interface ICarrierMessagingCallback extends android.os.IInterface {
    public void onFilterComplete(int p0) throws android.os.RemoteException;
    public void onSendSmsComplete(int p0, int p1) throws android.os.RemoteException;
    public void onSendMultipartSmsComplete(int p0, int[] p1) throws android.os.RemoteException;
    public void onSendMmsComplete(int p0, byte[] p1) throws android.os.RemoteException;
    public void onDownloadMmsComplete(int p0) throws android.os.RemoteException;

    public static class Default implements android.service.carrier.ICarrierMessagingCallback {
        public Default() {}
        public void onFilterComplete(int p0) throws android.os.RemoteException {}
        public void onSendSmsComplete(int p0, int p1) throws android.os.RemoteException {}
        public void onSendMultipartSmsComplete(int p0, int[] p1) throws android.os.RemoteException {}
        public void onSendMmsComplete(int p0, byte[] p1) throws android.os.RemoteException {}
        public void onDownloadMmsComplete(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.carrier.ICarrierMessagingCallback {
        public static final java.lang.String DESCRIPTOR = "android.service.carrier.ICarrierMessagingCallback";
        static final int TRANSACTION_onFilterComplete = 1;
        static final int TRANSACTION_onSendSmsComplete = 2;
        static final int TRANSACTION_onSendMultipartSmsComplete = 3;
        static final int TRANSACTION_onSendMmsComplete = 4;
        static final int TRANSACTION_onDownloadMmsComplete = 5;
        public Stub() { super(); }
        public static android.service.carrier.ICarrierMessagingCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.carrier.ICarrierMessagingCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onFilterComplete(int p0) throws android.os.RemoteException {}
            public void onSendSmsComplete(int p0, int p1) throws android.os.RemoteException {}
            public void onSendMultipartSmsComplete(int p0, int[] p1) throws android.os.RemoteException {}
            public void onSendMmsComplete(int p0, byte[] p1) throws android.os.RemoteException {}
            public void onDownloadMmsComplete(int p0) throws android.os.RemoteException {}
        }
    }
}
