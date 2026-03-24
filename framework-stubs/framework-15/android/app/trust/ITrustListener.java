package android.app.trust;

public interface ITrustListener extends android.os.IInterface {
    public void onEnabledTrustAgentsChanged(int p0) throws android.os.RemoteException;
    public void onTrustChanged(boolean p0, boolean p1, int p2, int p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException;
    public void onTrustManagedChanged(boolean p0, int p1) throws android.os.RemoteException;
    public void onTrustError(java.lang.CharSequence p0) throws android.os.RemoteException;
    public void onIsActiveUnlockRunningChanged(boolean p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.app.trust.ITrustListener {
        public Default() {}
        public void onEnabledTrustAgentsChanged(int p0) throws android.os.RemoteException {}
        public void onTrustChanged(boolean p0, boolean p1, int p2, int p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException {}
        public void onTrustManagedChanged(boolean p0, int p1) throws android.os.RemoteException {}
        public void onTrustError(java.lang.CharSequence p0) throws android.os.RemoteException {}
        public void onIsActiveUnlockRunningChanged(boolean p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.trust.ITrustListener {
        public static final java.lang.String DESCRIPTOR = "android.app.trust.ITrustListener";
        static final int TRANSACTION_onEnabledTrustAgentsChanged = 1;
        static final int TRANSACTION_onTrustChanged = 2;
        static final int TRANSACTION_onTrustManagedChanged = 3;
        static final int TRANSACTION_onTrustError = 4;
        static final int TRANSACTION_onIsActiveUnlockRunningChanged = 5;
        public Stub() { super(); }
        public static android.app.trust.ITrustListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.trust.ITrustListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onEnabledTrustAgentsChanged(int p0) throws android.os.RemoteException {}
            public void onTrustChanged(boolean p0, boolean p1, int p2, int p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException {}
            public void onTrustManagedChanged(boolean p0, int p1) throws android.os.RemoteException {}
            public void onTrustError(java.lang.CharSequence p0) throws android.os.RemoteException {}
            public void onIsActiveUnlockRunningChanged(boolean p0, int p1) throws android.os.RemoteException {}
        }
    }
}
