package android.app;

public interface IUiModeManager extends android.os.IInterface {
    public void enableCarMode(int p0) throws android.os.RemoteException;
    public void disableCarMode(int p0) throws android.os.RemoteException;
    public int getCurrentModeType() throws android.os.RemoteException;
    public void setNightMode(int p0) throws android.os.RemoteException;
    public int getNightMode() throws android.os.RemoteException;
    public boolean isUiModeLocked() throws android.os.RemoteException;
    public boolean isNightModeLocked() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.IUiModeManager {
        private static final java.lang.String DESCRIPTOR = "android.app.IUiModeManager";
        static final int TRANSACTION_enableCarMode = 1;
        static final int TRANSACTION_disableCarMode = 2;
        static final int TRANSACTION_getCurrentModeType = 3;
        static final int TRANSACTION_setNightMode = 4;
        static final int TRANSACTION_getNightMode = 5;
        static final int TRANSACTION_isUiModeLocked = 6;
        static final int TRANSACTION_isNightModeLocked = 7;
        public Stub() { super(); }
        public static android.app.IUiModeManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IUiModeManager p0) { return false; }
        public static android.app.IUiModeManager getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IUiModeManager {
            private android.os.IBinder mRemote;
            public static android.app.IUiModeManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void enableCarMode(int p0) throws android.os.RemoteException {}
            public void disableCarMode(int p0) throws android.os.RemoteException {}
            public int getCurrentModeType() throws android.os.RemoteException { return 0; }
            public void setNightMode(int p0) throws android.os.RemoteException {}
            public int getNightMode() throws android.os.RemoteException { return 0; }
            public boolean isUiModeLocked() throws android.os.RemoteException { return false; }
            public boolean isNightModeLocked() throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements android.app.IUiModeManager {
        public Default() {}
        public void enableCarMode(int p0) throws android.os.RemoteException {}
        public void disableCarMode(int p0) throws android.os.RemoteException {}
        public int getCurrentModeType() throws android.os.RemoteException { return 0; }
        public void setNightMode(int p0) throws android.os.RemoteException {}
        public int getNightMode() throws android.os.RemoteException { return 0; }
        public boolean isUiModeLocked() throws android.os.RemoteException { return false; }
        public boolean isNightModeLocked() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}
