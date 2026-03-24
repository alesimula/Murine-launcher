package android.hardware.location;

public interface IActivityRecognitionHardwareClient extends android.os.IInterface {
    public void onAvailabilityChanged(boolean p0, android.hardware.location.IActivityRecognitionHardware p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.location.IActivityRecognitionHardwareClient {
        public Default() {}
        public void onAvailabilityChanged(boolean p0, android.hardware.location.IActivityRecognitionHardware p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.location.IActivityRecognitionHardwareClient {
        public static final java.lang.String DESCRIPTOR = "android.hardware.location.IActivityRecognitionHardwareClient";
        static final int TRANSACTION_onAvailabilityChanged = 1;
        public Stub() { super(); }
        public static android.hardware.location.IActivityRecognitionHardwareClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.location.IActivityRecognitionHardwareClient p0) { return false; }
        public static android.hardware.location.IActivityRecognitionHardwareClient getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.location.IActivityRecognitionHardwareClient {
            private android.os.IBinder mRemote;
            public static android.hardware.location.IActivityRecognitionHardwareClient sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAvailabilityChanged(boolean p0, android.hardware.location.IActivityRecognitionHardware p1) throws android.os.RemoteException {}
        }
    }
}
