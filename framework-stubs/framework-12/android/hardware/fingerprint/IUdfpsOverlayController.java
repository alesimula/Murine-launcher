package android.hardware.fingerprint;

public interface IUdfpsOverlayController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.fingerprint.IUdfpsOverlayController";
    public static final int REASON_UNKNOWN = 0;
    public static final int REASON_ENROLL_FIND_SENSOR = 1;
    public static final int REASON_ENROLL_ENROLLING = 2;
    public static final int REASON_AUTH_BP = 3;
    public static final int REASON_AUTH_FPM_KEYGUARD = 4;
    public static final int REASON_AUTH_FPM_OTHER = 5;
    public void showUdfpsOverlay(int p0, int p1, android.hardware.fingerprint.IUdfpsOverlayControllerCallback p2) throws android.os.RemoteException;
    public void hideUdfpsOverlay(int p0) throws android.os.RemoteException;
    public void onAcquiredGood(int p0) throws android.os.RemoteException;
    public void onEnrollmentProgress(int p0, int p1) throws android.os.RemoteException;
    public void onEnrollmentHelp(int p0) throws android.os.RemoteException;
    public void setDebugMessage(int p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.fingerprint.IUdfpsOverlayController {
        public Default() {}
        public void showUdfpsOverlay(int p0, int p1, android.hardware.fingerprint.IUdfpsOverlayControllerCallback p2) throws android.os.RemoteException {}
        public void hideUdfpsOverlay(int p0) throws android.os.RemoteException {}
        public void onAcquiredGood(int p0) throws android.os.RemoteException {}
        public void onEnrollmentProgress(int p0, int p1) throws android.os.RemoteException {}
        public void onEnrollmentHelp(int p0) throws android.os.RemoteException {}
        public void setDebugMessage(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.fingerprint.IUdfpsOverlayController {
        static final int TRANSACTION_showUdfpsOverlay = 1;
        static final int TRANSACTION_hideUdfpsOverlay = 2;
        static final int TRANSACTION_onAcquiredGood = 3;
        static final int TRANSACTION_onEnrollmentProgress = 4;
        static final int TRANSACTION_onEnrollmentHelp = 5;
        static final int TRANSACTION_setDebugMessage = 6;
        public Stub() { super(); }
        public static android.hardware.fingerprint.IUdfpsOverlayController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.fingerprint.IUdfpsOverlayController p0) { return false; }
        public static android.hardware.fingerprint.IUdfpsOverlayController getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.fingerprint.IUdfpsOverlayController {
            private android.os.IBinder mRemote;
            public static android.hardware.fingerprint.IUdfpsOverlayController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void showUdfpsOverlay(int p0, int p1, android.hardware.fingerprint.IUdfpsOverlayControllerCallback p2) throws android.os.RemoteException {}
            public void hideUdfpsOverlay(int p0) throws android.os.RemoteException {}
            public void onAcquiredGood(int p0) throws android.os.RemoteException {}
            public void onEnrollmentProgress(int p0, int p1) throws android.os.RemoteException {}
            public void onEnrollmentHelp(int p0) throws android.os.RemoteException {}
            public void setDebugMessage(int p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
