package android.nfc;

public interface INfcUnlockHandler extends android.os.IInterface {
    public boolean onUnlockAttempted(android.nfc.Tag p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.nfc.INfcUnlockHandler {
        private static final java.lang.String DESCRIPTOR = "android.nfc.INfcUnlockHandler";
        static final int TRANSACTION_onUnlockAttempted = 1;
        public Stub() { super(); }
        public static android.nfc.INfcUnlockHandler asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.nfc.INfcUnlockHandler p0) { return false; }
        public static android.nfc.INfcUnlockHandler getDefaultImpl() { return null; }

        private static class Proxy implements android.nfc.INfcUnlockHandler {
            private android.os.IBinder mRemote;
            public static android.nfc.INfcUnlockHandler sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean onUnlockAttempted(android.nfc.Tag p0) throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements android.nfc.INfcUnlockHandler {
        public Default() {}
        public boolean onUnlockAttempted(android.nfc.Tag p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}
