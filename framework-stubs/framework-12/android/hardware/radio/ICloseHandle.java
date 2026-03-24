package android.hardware.radio;

public interface ICloseHandle extends android.os.IInterface {
    public void close() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.ICloseHandle {
        public Default() {}
        public void close() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.ICloseHandle {
        public static final java.lang.String DESCRIPTOR = "android.hardware.radio.ICloseHandle";
        static final int TRANSACTION_close = 1;
        public Stub() { super(); }
        public static android.hardware.radio.ICloseHandle asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.radio.ICloseHandle p0) { return false; }
        public static android.hardware.radio.ICloseHandle getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.radio.ICloseHandle {
            private android.os.IBinder mRemote;
            public static android.hardware.radio.ICloseHandle sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void close() throws android.os.RemoteException {}
        }
    }
}
