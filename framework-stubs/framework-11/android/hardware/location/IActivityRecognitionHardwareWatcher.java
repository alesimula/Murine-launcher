package android.hardware.location;

public interface IActivityRecognitionHardwareWatcher extends android.os.IInterface {
    public void onInstanceChanged(android.hardware.location.IActivityRecognitionHardware p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.location.IActivityRecognitionHardwareWatcher {
        public Default() {}
        public void onInstanceChanged(android.hardware.location.IActivityRecognitionHardware p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.location.IActivityRecognitionHardwareWatcher {
        private static final java.lang.String DESCRIPTOR = "android.hardware.location.IActivityRecognitionHardwareWatcher";
        static final int TRANSACTION_onInstanceChanged = 1;
        public Stub() { super(); }
        public static android.hardware.location.IActivityRecognitionHardwareWatcher asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.location.IActivityRecognitionHardwareWatcher p0) { return false; }
        public static android.hardware.location.IActivityRecognitionHardwareWatcher getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.location.IActivityRecognitionHardwareWatcher {
            private android.os.IBinder mRemote;
            public static android.hardware.location.IActivityRecognitionHardwareWatcher sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onInstanceChanged(android.hardware.location.IActivityRecognitionHardware p0) throws android.os.RemoteException {}
        }
    }
}
