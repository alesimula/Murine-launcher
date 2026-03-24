package android.os;

public interface IDumpstate extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IDumpstate";
    public static final int BUGREPORT_MODE_FULL = 0;
    public static final int BUGREPORT_MODE_INTERACTIVE = 1;
    public static final int BUGREPORT_MODE_REMOTE = 2;
    public static final int BUGREPORT_MODE_WEAR = 3;
    public static final int BUGREPORT_MODE_TELEPHONY = 4;
    public static final int BUGREPORT_MODE_WIFI = 5;
    public static final int BUGREPORT_MODE_DEFAULT = 6;
    public static final int BUGREPORT_MODE_ONBOARDING = 7;
    public static final int BUGREPORT_FLAG_USE_PREDUMPED_UI_DATA = 1;
    public static final int BUGREPORT_FLAG_DEFER_CONSENT = 2;
    public static final int BUGREPORT_FLAG_KEEP_BUGREPORT_ON_RETRIEVAL = 4;
    public static final int BUGREPORT_FLAG_CAPTURE_MULTI_DISPLAY_SCREENSHOT = 8;
    public void preDumpUiData(java.lang.String p0) throws android.os.RemoteException;
    public void startBugreport(int p0, java.lang.String p1, java.io.FileDescriptor p2, java.io.FileDescriptor p3, int p4, int p5, android.os.IDumpstateListener p6, boolean p7, boolean p8) throws android.os.RemoteException;
    public void cancelBugreport(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void retrieveBugreport(int p0, java.lang.String p1, int p2, java.io.FileDescriptor p3, java.lang.String p4, boolean p5, boolean p6, android.os.IDumpstateListener p7) throws android.os.RemoteException;

    public static class Default implements android.os.IDumpstate {
        public Default() {}
        public void preDumpUiData(java.lang.String p0) throws android.os.RemoteException {}
        public void startBugreport(int p0, java.lang.String p1, java.io.FileDescriptor p2, java.io.FileDescriptor p3, int p4, int p5, android.os.IDumpstateListener p6, boolean p7, boolean p8) throws android.os.RemoteException {}
        public void cancelBugreport(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void retrieveBugreport(int p0, java.lang.String p1, int p2, java.io.FileDescriptor p3, java.lang.String p4, boolean p5, boolean p6, android.os.IDumpstateListener p7) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IDumpstate {
        static final int TRANSACTION_preDumpUiData = 1;
        static final int TRANSACTION_startBugreport = 2;
        static final int TRANSACTION_cancelBugreport = 3;
        static final int TRANSACTION_retrieveBugreport = 4;
        public Stub() { super(); }
        public static android.os.IDumpstate asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IDumpstate {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void preDumpUiData(java.lang.String p0) throws android.os.RemoteException {}
            public void startBugreport(int p0, java.lang.String p1, java.io.FileDescriptor p2, java.io.FileDescriptor p3, int p4, int p5, android.os.IDumpstateListener p6, boolean p7, boolean p8) throws android.os.RemoteException {}
            public void cancelBugreport(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void retrieveBugreport(int p0, java.lang.String p1, int p2, java.io.FileDescriptor p3, java.lang.String p4, boolean p5, boolean p6, android.os.IDumpstateListener p7) throws android.os.RemoteException {}
        }
    }
}
