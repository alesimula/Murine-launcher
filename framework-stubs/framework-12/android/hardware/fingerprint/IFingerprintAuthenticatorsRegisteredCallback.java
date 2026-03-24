package android.hardware.fingerprint;

public interface IFingerprintAuthenticatorsRegisteredCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback";
    public void onAllAuthenticatorsRegistered(java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback {
        public Default() {}
        public void onAllAuthenticatorsRegistered(java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback {
        static final int TRANSACTION_onAllAuthenticatorsRegistered = 1;
        public Stub() { super(); }
        public static android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback p0) { return false; }
        public static android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback {
            private android.os.IBinder mRemote;
            public static android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAllAuthenticatorsRegistered(java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> p0) throws android.os.RemoteException {}
        }
    }
}
