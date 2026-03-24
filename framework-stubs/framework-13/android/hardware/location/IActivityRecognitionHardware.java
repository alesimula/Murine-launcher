package android.hardware.location;

public interface IActivityRecognitionHardware extends android.os.IInterface {
    public java.lang.String[] getSupportedActivities() throws android.os.RemoteException;
    public boolean isActivitySupported(java.lang.String p0) throws android.os.RemoteException;
    public boolean registerSink(android.hardware.location.IActivityRecognitionHardwareSink p0) throws android.os.RemoteException;
    public boolean unregisterSink(android.hardware.location.IActivityRecognitionHardwareSink p0) throws android.os.RemoteException;
    public boolean enableActivityEvent(java.lang.String p0, int p1, long p2) throws android.os.RemoteException;
    public boolean disableActivityEvent(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean flush() throws android.os.RemoteException;

    public static class Default implements android.hardware.location.IActivityRecognitionHardware {
        public Default() {}
        public java.lang.String[] getSupportedActivities() throws android.os.RemoteException { return null; }
        public boolean isActivitySupported(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean registerSink(android.hardware.location.IActivityRecognitionHardwareSink p0) throws android.os.RemoteException { return false; }
        public boolean unregisterSink(android.hardware.location.IActivityRecognitionHardwareSink p0) throws android.os.RemoteException { return false; }
        public boolean enableActivityEvent(java.lang.String p0, int p1, long p2) throws android.os.RemoteException { return false; }
        public boolean disableActivityEvent(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean flush() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.location.IActivityRecognitionHardware {
        public static final java.lang.String DESCRIPTOR = "android.hardware.location.IActivityRecognitionHardware";
        static final int TRANSACTION_getSupportedActivities = 1;
        static final int TRANSACTION_isActivitySupported = 2;
        static final int TRANSACTION_registerSink = 3;
        static final int TRANSACTION_unregisterSink = 4;
        static final int TRANSACTION_enableActivityEvent = 5;
        static final int TRANSACTION_disableActivityEvent = 6;
        static final int TRANSACTION_flush = 7;
        public Stub() { super(); }
        public static android.hardware.location.IActivityRecognitionHardware asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.location.IActivityRecognitionHardware {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String[] getSupportedActivities() throws android.os.RemoteException { return null; }
            public boolean isActivitySupported(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean registerSink(android.hardware.location.IActivityRecognitionHardwareSink p0) throws android.os.RemoteException { return false; }
            public boolean unregisterSink(android.hardware.location.IActivityRecognitionHardwareSink p0) throws android.os.RemoteException { return false; }
            public boolean enableActivityEvent(java.lang.String p0, int p1, long p2) throws android.os.RemoteException { return false; }
            public boolean disableActivityEvent(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean flush() throws android.os.RemoteException { return false; }
        }
    }
}
