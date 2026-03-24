package android.media.tv.extension.screenmode;

public interface IScreenModeSettings extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.screenmode.IScreenModeSettings";
    public void setScreenModeSettings(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int getOverScanIndex(java.lang.String p0) throws android.os.RemoteException;
    public boolean getSupportApplyOverScan(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.screenmode.IScreenModeSettings {
        public Default() {}
        public void setScreenModeSettings(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public int getOverScanIndex(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public boolean getSupportApplyOverScan(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.screenmode.IScreenModeSettings {
        static final int TRANSACTION_setScreenModeSettings = 1;
        static final int TRANSACTION_getOverScanIndex = 2;
        static final int TRANSACTION_getSupportApplyOverScan = 3;
        public Stub() { super(); }
        public static android.media.tv.extension.screenmode.IScreenModeSettings asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.screenmode.IScreenModeSettings {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setScreenModeSettings(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public int getOverScanIndex(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public boolean getSupportApplyOverScan(java.lang.String p0) throws android.os.RemoteException { return false; }
        }
    }
}
