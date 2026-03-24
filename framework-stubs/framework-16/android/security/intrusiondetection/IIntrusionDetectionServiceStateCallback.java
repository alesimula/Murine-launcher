package android.security.intrusiondetection;

public interface IIntrusionDetectionServiceStateCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback";
    public void onStateChange(int p0) throws android.os.RemoteException;

    public static class Default implements android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback {
        public Default() {}
        public void onStateChange(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static @interface State {
        public static final int UNKNOWN = 0;
        public static final int DISABLED = 1;
        public static final int ENABLED = 2;
    }

    public static abstract class Stub extends android.os.Binder implements android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback {
        static final int TRANSACTION_onStateChange = 1;
        public Stub() { super(); }
        public static android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStateChange(int p0) throws android.os.RemoteException {}
        }
    }
}
