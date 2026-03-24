package android.debug;

public interface IAdbTransport extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.debug.IAdbTransport";
    public void onAdbEnabled(boolean p0, byte p1) throws android.os.RemoteException;

    public static class Default implements android.debug.IAdbTransport {
        public Default() {}
        public void onAdbEnabled(boolean p0, byte p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.debug.IAdbTransport {
        static final int TRANSACTION_onAdbEnabled = 1;
        public Stub() { super(); }
        public static android.debug.IAdbTransport asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.debug.IAdbTransport {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAdbEnabled(boolean p0, byte p1) throws android.os.RemoteException {}
        }
    }
}
