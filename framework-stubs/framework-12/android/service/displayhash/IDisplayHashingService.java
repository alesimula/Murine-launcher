package android.service.displayhash;

public interface IDisplayHashingService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.displayhash.IDisplayHashingService";
    public void generateDisplayHash(byte[] p0, android.hardware.HardwareBuffer p1, android.graphics.Rect p2, java.lang.String p3, android.os.RemoteCallback p4) throws android.os.RemoteException;
    public void verifyDisplayHash(byte[] p0, android.view.displayhash.DisplayHash p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    public void getDisplayHashAlgorithms(android.os.RemoteCallback p0) throws android.os.RemoteException;
    public void getIntervalBetweenRequestsMillis(android.os.RemoteCallback p0) throws android.os.RemoteException;

    public static class Default implements android.service.displayhash.IDisplayHashingService {
        public Default() {}
        public void generateDisplayHash(byte[] p0, android.hardware.HardwareBuffer p1, android.graphics.Rect p2, java.lang.String p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
        public void verifyDisplayHash(byte[] p0, android.view.displayhash.DisplayHash p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void getDisplayHashAlgorithms(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public void getIntervalBetweenRequestsMillis(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.displayhash.IDisplayHashingService {
        static final int TRANSACTION_generateDisplayHash = 1;
        static final int TRANSACTION_verifyDisplayHash = 2;
        static final int TRANSACTION_getDisplayHashAlgorithms = 3;
        static final int TRANSACTION_getIntervalBetweenRequestsMillis = 4;
        public Stub() { super(); }
        public static android.service.displayhash.IDisplayHashingService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.displayhash.IDisplayHashingService p0) { return false; }
        public static android.service.displayhash.IDisplayHashingService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.displayhash.IDisplayHashingService {
            private android.os.IBinder mRemote;
            public static android.service.displayhash.IDisplayHashingService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void generateDisplayHash(byte[] p0, android.hardware.HardwareBuffer p1, android.graphics.Rect p2, java.lang.String p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
            public void verifyDisplayHash(byte[] p0, android.view.displayhash.DisplayHash p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void getDisplayHashAlgorithms(android.os.RemoteCallback p0) throws android.os.RemoteException {}
            public void getIntervalBetweenRequestsMillis(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        }
    }
}
