package android.hardware.location;

public interface IActivityRecognitionHardwareSink extends android.os.IInterface {
    public void onActivityChanged(android.hardware.location.ActivityChangedEvent p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.hardware.location.IActivityRecognitionHardwareSink {
        private static final java.lang.String DESCRIPTOR = "android.hardware.location.IActivityRecognitionHardwareSink";
        static final int TRANSACTION_onActivityChanged = 1;
        public Stub() { super(); }
        public static android.hardware.location.IActivityRecognitionHardwareSink asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.location.IActivityRecognitionHardwareSink p0) { return false; }
        public static android.hardware.location.IActivityRecognitionHardwareSink getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.location.IActivityRecognitionHardwareSink {
            private android.os.IBinder mRemote;
            public static android.hardware.location.IActivityRecognitionHardwareSink sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onActivityChanged(android.hardware.location.ActivityChangedEvent p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.hardware.location.IActivityRecognitionHardwareSink {
        public Default() {}
        public void onActivityChanged(android.hardware.location.ActivityChangedEvent p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
