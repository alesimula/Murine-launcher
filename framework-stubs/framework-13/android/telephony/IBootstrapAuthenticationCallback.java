package android.telephony;

public interface IBootstrapAuthenticationCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.IBootstrapAuthenticationCallback";
    public void onKeysAvailable(int p0, byte[] p1, java.lang.String p2) throws android.os.RemoteException;
    public void onAuthenticationFailure(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.telephony.IBootstrapAuthenticationCallback {
        public Default() {}
        public void onKeysAvailable(int p0, byte[] p1, java.lang.String p2) throws android.os.RemoteException {}
        public void onAuthenticationFailure(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.IBootstrapAuthenticationCallback {
        static final int TRANSACTION_onKeysAvailable = 1;
        static final int TRANSACTION_onAuthenticationFailure = 2;
        public Stub() { super(); }
        public static android.telephony.IBootstrapAuthenticationCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.IBootstrapAuthenticationCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onKeysAvailable(int p0, byte[] p1, java.lang.String p2) throws android.os.RemoteException {}
            public void onAuthenticationFailure(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}
