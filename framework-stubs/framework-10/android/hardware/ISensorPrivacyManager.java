package android.hardware;

public interface ISensorPrivacyManager extends android.os.IInterface {
    public void addSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException;
    public void removeSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException;
    public boolean isSensorPrivacyEnabled() throws android.os.RemoteException;
    public void setSensorPrivacy(boolean p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.hardware.ISensorPrivacyManager {
        private static final java.lang.String DESCRIPTOR = "android.hardware.ISensorPrivacyManager";
        static final int TRANSACTION_addSensorPrivacyListener = 1;
        static final int TRANSACTION_removeSensorPrivacyListener = 2;
        static final int TRANSACTION_isSensorPrivacyEnabled = 3;
        static final int TRANSACTION_setSensorPrivacy = 4;
        public Stub() { super(); }
        public static android.hardware.ISensorPrivacyManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.ISensorPrivacyManager p0) { return false; }
        public static android.hardware.ISensorPrivacyManager getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.ISensorPrivacyManager {
            private android.os.IBinder mRemote;
            public static android.hardware.ISensorPrivacyManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException {}
            public void removeSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException {}
            public boolean isSensorPrivacyEnabled() throws android.os.RemoteException { return false; }
            public void setSensorPrivacy(boolean p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.hardware.ISensorPrivacyManager {
        public Default() {}
        public void addSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException {}
        public void removeSensorPrivacyListener(android.hardware.ISensorPrivacyListener p0) throws android.os.RemoteException {}
        public boolean isSensorPrivacyEnabled() throws android.os.RemoteException { return false; }
        public void setSensorPrivacy(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
