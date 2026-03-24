package android.hardware.face;

public interface IFaceServiceReceiver extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.face.IFaceServiceReceiver";
    public void onEnrollResult(android.hardware.face.Face p0, int p1) throws android.os.RemoteException;
    public void onAcquired(int p0, int p1) throws android.os.RemoteException;
    public void onAuthenticationSucceeded(android.hardware.face.Face p0, int p1, boolean p2) throws android.os.RemoteException;
    public void onFaceDetected(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void onAuthenticationFailed() throws android.os.RemoteException;
    public void onError(int p0, int p1) throws android.os.RemoteException;
    public void onRemoved(android.hardware.face.Face p0, int p1) throws android.os.RemoteException;
    public void onFeatureSet(boolean p0, int p1) throws android.os.RemoteException;
    public void onFeatureGet(boolean p0, int[] p1, boolean[] p2) throws android.os.RemoteException;
    public void onChallengeGenerated(int p0, int p1, long p2) throws android.os.RemoteException;
    public void onAuthenticationFrame(android.hardware.face.FaceAuthenticationFrame p0) throws android.os.RemoteException;
    public void onEnrollmentFrame(android.hardware.face.FaceEnrollFrame p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.face.IFaceServiceReceiver {
        public Default() {}
        public void onEnrollResult(android.hardware.face.Face p0, int p1) throws android.os.RemoteException {}
        public void onAcquired(int p0, int p1) throws android.os.RemoteException {}
        public void onAuthenticationSucceeded(android.hardware.face.Face p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void onFaceDetected(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void onAuthenticationFailed() throws android.os.RemoteException {}
        public void onError(int p0, int p1) throws android.os.RemoteException {}
        public void onRemoved(android.hardware.face.Face p0, int p1) throws android.os.RemoteException {}
        public void onFeatureSet(boolean p0, int p1) throws android.os.RemoteException {}
        public void onFeatureGet(boolean p0, int[] p1, boolean[] p2) throws android.os.RemoteException {}
        public void onChallengeGenerated(int p0, int p1, long p2) throws android.os.RemoteException {}
        public void onAuthenticationFrame(android.hardware.face.FaceAuthenticationFrame p0) throws android.os.RemoteException {}
        public void onEnrollmentFrame(android.hardware.face.FaceEnrollFrame p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.face.IFaceServiceReceiver {
        static final int TRANSACTION_onEnrollResult = 1;
        static final int TRANSACTION_onAcquired = 2;
        static final int TRANSACTION_onAuthenticationSucceeded = 3;
        static final int TRANSACTION_onFaceDetected = 4;
        static final int TRANSACTION_onAuthenticationFailed = 5;
        static final int TRANSACTION_onError = 6;
        static final int TRANSACTION_onRemoved = 7;
        static final int TRANSACTION_onFeatureSet = 8;
        static final int TRANSACTION_onFeatureGet = 9;
        static final int TRANSACTION_onChallengeGenerated = 10;
        static final int TRANSACTION_onAuthenticationFrame = 11;
        static final int TRANSACTION_onEnrollmentFrame = 12;
        public Stub() { super(); }
        public static android.hardware.face.IFaceServiceReceiver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.face.IFaceServiceReceiver {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onEnrollResult(android.hardware.face.Face p0, int p1) throws android.os.RemoteException {}
            public void onAcquired(int p0, int p1) throws android.os.RemoteException {}
            public void onAuthenticationSucceeded(android.hardware.face.Face p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void onFaceDetected(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void onAuthenticationFailed() throws android.os.RemoteException {}
            public void onError(int p0, int p1) throws android.os.RemoteException {}
            public void onRemoved(android.hardware.face.Face p0, int p1) throws android.os.RemoteException {}
            public void onFeatureSet(boolean p0, int p1) throws android.os.RemoteException {}
            public void onFeatureGet(boolean p0, int[] p1, boolean[] p2) throws android.os.RemoteException {}
            public void onChallengeGenerated(int p0, int p1, long p2) throws android.os.RemoteException {}
            public void onAuthenticationFrame(android.hardware.face.FaceAuthenticationFrame p0) throws android.os.RemoteException {}
            public void onEnrollmentFrame(android.hardware.face.FaceEnrollFrame p0) throws android.os.RemoteException {}
        }
    }
}
