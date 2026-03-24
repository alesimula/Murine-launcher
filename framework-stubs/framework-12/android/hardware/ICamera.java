package android.hardware;

public interface ICamera extends android.os.IInterface {
    public void disconnect() throws android.os.RemoteException;

    public static class Default implements android.hardware.ICamera {
        public Default() {}
        public void disconnect() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.ICamera {
        public static final java.lang.String DESCRIPTOR = "android.hardware.ICamera";
        static final int TRANSACTION_disconnect = 1;
        public Stub() { super(); }
        public static android.hardware.ICamera asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.ICamera p0) { return false; }
        public static android.hardware.ICamera getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.ICamera {
            private android.os.IBinder mRemote;
            public static android.hardware.ICamera sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void disconnect() throws android.os.RemoteException {}
        }
    }
}
