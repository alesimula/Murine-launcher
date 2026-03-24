package android.os;

public interface IThermalStatusListener extends android.os.IInterface {
    public void onStatusChange(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.IThermalStatusListener {
        private static final java.lang.String DESCRIPTOR = "android.os.IThermalStatusListener";
        static final int TRANSACTION_onStatusChange = 1;
        public Stub() { super(); }
        public static android.os.IThermalStatusListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IThermalStatusListener p0) { return false; }
        public static android.os.IThermalStatusListener getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IThermalStatusListener {
            private android.os.IBinder mRemote;
            public static android.os.IThermalStatusListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStatusChange(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.os.IThermalStatusListener {
        public Default() {}
        public void onStatusChange(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
