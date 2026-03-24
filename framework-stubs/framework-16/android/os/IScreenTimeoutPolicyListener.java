package android.os;

public interface IScreenTimeoutPolicyListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IScreenTimeoutPolicyListener";
    public void onScreenTimeoutPolicyChanged(int p0) throws android.os.RemoteException;

    public static class Default implements android.os.IScreenTimeoutPolicyListener {
        public Default() {}
        public void onScreenTimeoutPolicyChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IScreenTimeoutPolicyListener {
        static final int TRANSACTION_onScreenTimeoutPolicyChanged = 1;
        public Stub() { super(); }
        public static android.os.IScreenTimeoutPolicyListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IScreenTimeoutPolicyListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onScreenTimeoutPolicyChanged(int p0) throws android.os.RemoteException {}
        }
    }
}
