package android.hardware.face;

public interface IFaceServiceReceiver extends android.os.IInterface {
    public void onEnrollResult(long p0, int p1, int p2) throws android.os.RemoteException;
    public void onAcquired(long p0, int p1, int p2) throws android.os.RemoteException;
    public void onAuthenticationSucceeded(long p0, android.hardware.face.Face p1, int p2, boolean p3) throws android.os.RemoteException;
    public void onAuthenticationFailed(long p0) throws android.os.RemoteException;
    public void onError(long p0, int p1, int p2) throws android.os.RemoteException;
    public void onRemoved(long p0, int p1, int p2) throws android.os.RemoteException;
    public void onEnumerated(long p0, int p1, int p2) throws android.os.RemoteException;
    public void onFeatureSet(boolean p0, int p1) throws android.os.RemoteException;
    public void onFeatureGet(boolean p0, int p1, boolean p2) throws android.os.RemoteException;

    public static class Default implements android.hardware.face.IFaceServiceReceiver {
        public Default() {}
        public void onEnrollResult(long p0, int p1, int p2) throws android.os.RemoteException {}
        public void onAcquired(long p0, int p1, int p2) throws android.os.RemoteException {}
        public void onAuthenticationSucceeded(long p0, android.hardware.face.Face p1, int p2, boolean p3) throws android.os.RemoteException {}
        public void onAuthenticationFailed(long p0) throws android.os.RemoteException {}
        public void onError(long p0, int p1, int p2) throws android.os.RemoteException {}
        public void onRemoved(long p0, int p1, int p2) throws android.os.RemoteException {}
        public void onEnumerated(long p0, int p1, int p2) throws android.os.RemoteException {}
        public void onFeatureSet(boolean p0, int p1) throws android.os.RemoteException {}
        public void onFeatureGet(boolean p0, int p1, boolean p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.face.IFaceServiceReceiver {
        private static final java.lang.String DESCRIPTOR = "android.hardware.face.IFaceServiceReceiver";
        static final int TRANSACTION_onEnrollResult = 1;
        static final int TRANSACTION_onAcquired = 2;
        static final int TRANSACTION_onAuthenticationSucceeded = 3;
        static final int TRANSACTION_onAuthenticationFailed = 4;
        static final int TRANSACTION_onError = 5;
        static final int TRANSACTION_onRemoved = 6;
        static final int TRANSACTION_onEnumerated = 7;
        static final int TRANSACTION_onFeatureSet = 8;
        static final int TRANSACTION_onFeatureGet = 9;
        public Stub() { super(); }
        public static android.hardware.face.IFaceServiceReceiver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.face.IFaceServiceReceiver p0) { return false; }
        public static android.hardware.face.IFaceServiceReceiver getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.face.IFaceServiceReceiver {
            private android.os.IBinder mRemote;
            public static android.hardware.face.IFaceServiceReceiver sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onEnrollResult(long p0, int p1, int p2) throws android.os.RemoteException {}
            public void onAcquired(long p0, int p1, int p2) throws android.os.RemoteException {}
            public void onAuthenticationSucceeded(long p0, android.hardware.face.Face p1, int p2, boolean p3) throws android.os.RemoteException {}
            public void onAuthenticationFailed(long p0) throws android.os.RemoteException {}
            public void onError(long p0, int p1, int p2) throws android.os.RemoteException {}
            public void onRemoved(long p0, int p1, int p2) throws android.os.RemoteException {}
            public void onEnumerated(long p0, int p1, int p2) throws android.os.RemoteException {}
            public void onFeatureSet(boolean p0, int p1) throws android.os.RemoteException {}
            public void onFeatureGet(boolean p0, int p1, boolean p2) throws android.os.RemoteException {}
        }
    }
}
