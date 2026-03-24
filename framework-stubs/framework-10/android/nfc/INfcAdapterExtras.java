package android.nfc;

public interface INfcAdapterExtras extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public android.os.Bundle open(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.os.Bundle close(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.os.Bundle transceive(java.lang.String p0, byte[] p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getCardEmulationRoute(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setCardEmulationRoute(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void authenticate(java.lang.String p0, byte[] p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getDriverName(java.lang.String p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.nfc.INfcAdapterExtras {
        private static final java.lang.String DESCRIPTOR = "android.nfc.INfcAdapterExtras";
        static final int TRANSACTION_open = 1;
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_transceive = 3;
        static final int TRANSACTION_getCardEmulationRoute = 4;
        static final int TRANSACTION_setCardEmulationRoute = 5;
        static final int TRANSACTION_authenticate = 6;
        static final int TRANSACTION_getDriverName = 7;
        public Stub() { super(); }
        public static android.nfc.INfcAdapterExtras asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.nfc.INfcAdapterExtras p0) { return false; }
        public static android.nfc.INfcAdapterExtras getDefaultImpl() { return null; }

        private static class Proxy implements android.nfc.INfcAdapterExtras {
            private android.os.IBinder mRemote;
            public static android.nfc.INfcAdapterExtras sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.Bundle open(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
            public android.os.Bundle close(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
            public android.os.Bundle transceive(java.lang.String p0, byte[] p1) throws android.os.RemoteException { return null; }
            public int getCardEmulationRoute(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public void setCardEmulationRoute(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void authenticate(java.lang.String p0, byte[] p1) throws android.os.RemoteException {}
            public java.lang.String getDriverName(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.nfc.INfcAdapterExtras {
        public Default() {}
        public android.os.Bundle open(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
        public android.os.Bundle close(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
        public android.os.Bundle transceive(java.lang.String p0, byte[] p1) throws android.os.RemoteException { return null; }
        public int getCardEmulationRoute(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void setCardEmulationRoute(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void authenticate(java.lang.String p0, byte[] p1) throws android.os.RemoteException {}
        public java.lang.String getDriverName(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
