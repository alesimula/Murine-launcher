package android.nfc;

public interface INfcControllerAlwaysOnListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.nfc.INfcControllerAlwaysOnListener";
    public void onControllerAlwaysOnChanged(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.nfc.INfcControllerAlwaysOnListener {
        public Default() {}
        public void onControllerAlwaysOnChanged(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.nfc.INfcControllerAlwaysOnListener {
        static final int TRANSACTION_onControllerAlwaysOnChanged = 1;
        public Stub() { super(); }
        public static android.nfc.INfcControllerAlwaysOnListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.nfc.INfcControllerAlwaysOnListener p0) { return false; }
        public static android.nfc.INfcControllerAlwaysOnListener getDefaultImpl() { return null; }

        private static class Proxy implements android.nfc.INfcControllerAlwaysOnListener {
            private android.os.IBinder mRemote;
            public static android.nfc.INfcControllerAlwaysOnListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onControllerAlwaysOnChanged(boolean p0) throws android.os.RemoteException {}
        }
    }
}
