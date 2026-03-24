package android.app.time;

public interface ITimeZoneDetectorListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.time.ITimeZoneDetectorListener";
    public void onChange() throws android.os.RemoteException;

    public static class Default implements android.app.time.ITimeZoneDetectorListener {
        public Default() {}
        public void onChange() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.time.ITimeZoneDetectorListener {
        static final int TRANSACTION_onChange = 1;
        public Stub() { super(); }
        public static android.app.time.ITimeZoneDetectorListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.time.ITimeZoneDetectorListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onChange() throws android.os.RemoteException {}
        }
    }
}
