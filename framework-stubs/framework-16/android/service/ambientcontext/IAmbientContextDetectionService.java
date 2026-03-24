package android.service.ambientcontext;

public interface IAmbientContextDetectionService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.ambientcontext.IAmbientContextDetectionService";
    public void startDetection(android.app.ambientcontext.AmbientContextEventRequest p0, java.lang.String p1, android.os.RemoteCallback p2, android.os.RemoteCallback p3) throws android.os.RemoteException;
    public void stopDetection(java.lang.String p0) throws android.os.RemoteException;
    public void queryServiceStatus(int[] p0, java.lang.String p1, android.os.RemoteCallback p2) throws android.os.RemoteException;

    public static class Default implements android.service.ambientcontext.IAmbientContextDetectionService {
        public Default() {}
        public void startDetection(android.app.ambientcontext.AmbientContextEventRequest p0, java.lang.String p1, android.os.RemoteCallback p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        public void stopDetection(java.lang.String p0) throws android.os.RemoteException {}
        public void queryServiceStatus(int[] p0, java.lang.String p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.ambientcontext.IAmbientContextDetectionService {
        static final int TRANSACTION_startDetection = 1;
        static final int TRANSACTION_stopDetection = 2;
        static final int TRANSACTION_queryServiceStatus = 3;
        public Stub() { super(); }
        public static android.service.ambientcontext.IAmbientContextDetectionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.ambientcontext.IAmbientContextDetectionService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startDetection(android.app.ambientcontext.AmbientContextEventRequest p0, java.lang.String p1, android.os.RemoteCallback p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
            public void stopDetection(java.lang.String p0) throws android.os.RemoteException {}
            public void queryServiceStatus(int[] p0, java.lang.String p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        }
    }
}
