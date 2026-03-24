package android.hardware.fingerprint;

public interface IFingerprintServiceReceiver extends android.os.IInterface {
    public void onEnrollResult(long p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onAcquired(long p0, int p1, int p2) throws android.os.RemoteException;
    public void onAuthenticationSucceeded(long p0, android.hardware.fingerprint.Fingerprint p1, int p2, boolean p3) throws android.os.RemoteException;
    public void onFingerprintDetected(long p0, int p1, boolean p2) throws android.os.RemoteException;
    public void onAuthenticationFailed(long p0) throws android.os.RemoteException;
    public void onError(long p0, int p1, int p2) throws android.os.RemoteException;
    public void onRemoved(long p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onEnumerated(long p0, int p1, int p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.hardware.fingerprint.IFingerprintServiceReceiver {
        public Default() {}
        public void onEnrollResult(long p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onAcquired(long p0, int p1, int p2) throws android.os.RemoteException {}
        public void onAuthenticationSucceeded(long p0, android.hardware.fingerprint.Fingerprint p1, int p2, boolean p3) throws android.os.RemoteException {}
        public void onFingerprintDetected(long p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void onAuthenticationFailed(long p0) throws android.os.RemoteException {}
        public void onError(long p0, int p1, int p2) throws android.os.RemoteException {}
        public void onRemoved(long p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onEnumerated(long p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.fingerprint.IFingerprintServiceReceiver {
        private static final java.lang.String DESCRIPTOR = "android.hardware.fingerprint.IFingerprintServiceReceiver";
        static final int TRANSACTION_onEnrollResult = 1;
        static final int TRANSACTION_onAcquired = 2;
        static final int TRANSACTION_onAuthenticationSucceeded = 3;
        static final int TRANSACTION_onFingerprintDetected = 4;
        static final int TRANSACTION_onAuthenticationFailed = 5;
        static final int TRANSACTION_onError = 6;
        static final int TRANSACTION_onRemoved = 7;
        static final int TRANSACTION_onEnumerated = 8;
        public Stub() { super(); }
        public static android.hardware.fingerprint.IFingerprintServiceReceiver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.fingerprint.IFingerprintServiceReceiver p0) { return false; }
        public static android.hardware.fingerprint.IFingerprintServiceReceiver getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.fingerprint.IFingerprintServiceReceiver {
            private android.os.IBinder mRemote;
            public static android.hardware.fingerprint.IFingerprintServiceReceiver sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onEnrollResult(long p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onAcquired(long p0, int p1, int p2) throws android.os.RemoteException {}
            public void onAuthenticationSucceeded(long p0, android.hardware.fingerprint.Fingerprint p1, int p2, boolean p3) throws android.os.RemoteException {}
            public void onFingerprintDetected(long p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void onAuthenticationFailed(long p0) throws android.os.RemoteException {}
            public void onError(long p0, int p1, int p2) throws android.os.RemoteException {}
            public void onRemoved(long p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onEnumerated(long p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        }
    }
}
