package android.nfc;

public interface ITagRemovedCallback extends android.os.IInterface {
    public void onTagRemoved() throws android.os.RemoteException;

    public static class Default implements android.nfc.ITagRemovedCallback {
        public Default() {}
        public void onTagRemoved() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.nfc.ITagRemovedCallback {
        private static final java.lang.String DESCRIPTOR = "android.nfc.ITagRemovedCallback";
        static final int TRANSACTION_onTagRemoved = 1;
        public Stub() { super(); }
        public static android.nfc.ITagRemovedCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.nfc.ITagRemovedCallback p0) { return false; }
        public static android.nfc.ITagRemovedCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.nfc.ITagRemovedCallback {
            private android.os.IBinder mRemote;
            public static android.nfc.ITagRemovedCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onTagRemoved() throws android.os.RemoteException {}
        }
    }
}
