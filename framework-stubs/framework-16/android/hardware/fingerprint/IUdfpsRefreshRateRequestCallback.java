package android.hardware.fingerprint;

public interface IUdfpsRefreshRateRequestCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.fingerprint.IUdfpsRefreshRateRequestCallback";
    public void onRequestEnabled(int p0) throws android.os.RemoteException;
    public void onRequestDisabled(int p0) throws android.os.RemoteException;
    public void onAuthenticationPossible(int p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.fingerprint.IUdfpsRefreshRateRequestCallback {
        public Default() {}
        public void onRequestEnabled(int p0) throws android.os.RemoteException {}
        public void onRequestDisabled(int p0) throws android.os.RemoteException {}
        public void onAuthenticationPossible(int p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.fingerprint.IUdfpsRefreshRateRequestCallback {
        static final int TRANSACTION_onRequestEnabled = 1;
        static final int TRANSACTION_onRequestDisabled = 2;
        static final int TRANSACTION_onAuthenticationPossible = 3;
        public Stub() { super(); }
        public static android.hardware.fingerprint.IUdfpsRefreshRateRequestCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.fingerprint.IUdfpsRefreshRateRequestCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRequestEnabled(int p0) throws android.os.RemoteException {}
            public void onRequestDisabled(int p0) throws android.os.RemoteException {}
            public void onAuthenticationPossible(int p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
