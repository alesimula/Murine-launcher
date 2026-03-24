package android.hardware;

public interface ISensorPrivacyListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.ISensorPrivacyListener";
    public void onSensorPrivacyChanged(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.ISensorPrivacyListener {
        public Default() {}
        public void onSensorPrivacyChanged(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.ISensorPrivacyListener {
        static final int TRANSACTION_onSensorPrivacyChanged = 1;
        public Stub() { super(); }
        public static android.hardware.ISensorPrivacyListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.ISensorPrivacyListener p0) { return false; }
        public static android.hardware.ISensorPrivacyListener getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.ISensorPrivacyListener {
            private android.os.IBinder mRemote;
            public static android.hardware.ISensorPrivacyListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSensorPrivacyChanged(boolean p0) throws android.os.RemoteException {}
        }
    }
}
