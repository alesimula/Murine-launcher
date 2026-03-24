package android.app.trust;

public interface IStrongAuthTracker extends android.os.IInterface {
    public void onStrongAuthRequiredChanged(int p0, int p1) throws android.os.RemoteException;
    public void onIsNonStrongBiometricAllowedChanged(boolean p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.app.trust.IStrongAuthTracker {
        public Default() {}
        public void onStrongAuthRequiredChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onIsNonStrongBiometricAllowedChanged(boolean p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.trust.IStrongAuthTracker {
        public static final java.lang.String DESCRIPTOR = "android.app.trust.IStrongAuthTracker";
        static final int TRANSACTION_onStrongAuthRequiredChanged = 1;
        static final int TRANSACTION_onIsNonStrongBiometricAllowedChanged = 2;
        public Stub() { super(); }
        public static android.app.trust.IStrongAuthTracker asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.trust.IStrongAuthTracker p0) { return false; }
        public static android.app.trust.IStrongAuthTracker getDefaultImpl() { return null; }

        private static class Proxy implements android.app.trust.IStrongAuthTracker {
            private android.os.IBinder mRemote;
            public static android.app.trust.IStrongAuthTracker sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStrongAuthRequiredChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onIsNonStrongBiometricAllowedChanged(boolean p0, int p1) throws android.os.RemoteException {}
        }
    }
}
