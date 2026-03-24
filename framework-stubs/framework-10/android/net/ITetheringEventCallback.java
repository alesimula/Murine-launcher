package android.net;

public interface ITetheringEventCallback extends android.os.IInterface {
    public void onUpstreamChanged(android.net.Network p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.ITetheringEventCallback {
        private static final java.lang.String DESCRIPTOR = "android.net.ITetheringEventCallback";
        static final int TRANSACTION_onUpstreamChanged = 1;
        public Stub() { super(); }
        public static android.net.ITetheringEventCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.ITetheringEventCallback p0) { return false; }
        public static android.net.ITetheringEventCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.ITetheringEventCallback {
            private android.os.IBinder mRemote;
            public static android.net.ITetheringEventCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onUpstreamChanged(android.net.Network p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.net.ITetheringEventCallback {
        public Default() {}
        public void onUpstreamChanged(android.net.Network p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
