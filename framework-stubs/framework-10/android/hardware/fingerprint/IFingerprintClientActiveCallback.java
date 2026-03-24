package android.hardware.fingerprint;

public interface IFingerprintClientActiveCallback extends android.os.IInterface {
    public void onClientActiveChanged(boolean p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.hardware.fingerprint.IFingerprintClientActiveCallback {
        private static final java.lang.String DESCRIPTOR = "android.hardware.fingerprint.IFingerprintClientActiveCallback";
        static final int TRANSACTION_onClientActiveChanged = 1;
        public Stub() { super(); }
        public static android.hardware.fingerprint.IFingerprintClientActiveCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.fingerprint.IFingerprintClientActiveCallback p0) { return false; }
        public static android.hardware.fingerprint.IFingerprintClientActiveCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.fingerprint.IFingerprintClientActiveCallback {
            private android.os.IBinder mRemote;
            public static android.hardware.fingerprint.IFingerprintClientActiveCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onClientActiveChanged(boolean p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.hardware.fingerprint.IFingerprintClientActiveCallback {
        public Default() {}
        public void onClientActiveChanged(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
