package android.nfc;

public interface INfcDta extends android.os.IInterface {
    public void enableDta() throws android.os.RemoteException;
    public void disableDta() throws android.os.RemoteException;
    public boolean enableServer(java.lang.String p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void disableServer() throws android.os.RemoteException;
    public boolean enableClient(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void disableClient() throws android.os.RemoteException;
    public boolean registerMessageService(java.lang.String p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.nfc.INfcDta {
        private static final java.lang.String DESCRIPTOR = "android.nfc.INfcDta";
        static final int TRANSACTION_enableDta = 1;
        static final int TRANSACTION_disableDta = 2;
        static final int TRANSACTION_enableServer = 3;
        static final int TRANSACTION_disableServer = 4;
        static final int TRANSACTION_enableClient = 5;
        static final int TRANSACTION_disableClient = 6;
        static final int TRANSACTION_registerMessageService = 7;
        public Stub() { super(); }
        public static android.nfc.INfcDta asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.nfc.INfcDta p0) { return false; }
        public static android.nfc.INfcDta getDefaultImpl() { return null; }

        private static class Proxy implements android.nfc.INfcDta {
            private android.os.IBinder mRemote;
            public static android.nfc.INfcDta sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void enableDta() throws android.os.RemoteException {}
            public void disableDta() throws android.os.RemoteException {}
            public boolean enableServer(java.lang.String p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException { return false; }
            public void disableServer() throws android.os.RemoteException {}
            public boolean enableClient(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public void disableClient() throws android.os.RemoteException {}
            public boolean registerMessageService(java.lang.String p0) throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements android.nfc.INfcDta {
        public Default() {}
        public void enableDta() throws android.os.RemoteException {}
        public void disableDta() throws android.os.RemoteException {}
        public boolean enableServer(java.lang.String p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException { return false; }
        public void disableServer() throws android.os.RemoteException {}
        public boolean enableClient(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public void disableClient() throws android.os.RemoteException {}
        public boolean registerMessageService(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}
