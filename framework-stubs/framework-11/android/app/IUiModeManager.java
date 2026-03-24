package android.app;

public interface IUiModeManager extends android.os.IInterface {
    public void enableCarMode(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void disableCarMode(int p0) throws android.os.RemoteException;
    public void disableCarModeByCallingPackage(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getCurrentModeType() throws android.os.RemoteException;
    public void setNightMode(int p0) throws android.os.RemoteException;
    public int getNightMode() throws android.os.RemoteException;
    public boolean isUiModeLocked() throws android.os.RemoteException;
    public boolean isNightModeLocked() throws android.os.RemoteException;
    public boolean setNightModeActivated(boolean p0) throws android.os.RemoteException;
    public long getCustomNightModeStart() throws android.os.RemoteException;
    public void setCustomNightModeStart(long p0) throws android.os.RemoteException;
    public long getCustomNightModeEnd() throws android.os.RemoteException;
    public void setCustomNightModeEnd(long p0) throws android.os.RemoteException;

    public static class Default implements android.app.IUiModeManager {
        public Default() {}
        public void enableCarMode(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void disableCarMode(int p0) throws android.os.RemoteException {}
        public void disableCarModeByCallingPackage(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public int getCurrentModeType() throws android.os.RemoteException { return 0; }
        public void setNightMode(int p0) throws android.os.RemoteException {}
        public int getNightMode() throws android.os.RemoteException { return 0; }
        public boolean isUiModeLocked() throws android.os.RemoteException { return false; }
        public boolean isNightModeLocked() throws android.os.RemoteException { return false; }
        public boolean setNightModeActivated(boolean p0) throws android.os.RemoteException { return false; }
        public long getCustomNightModeStart() throws android.os.RemoteException { return 0L; }
        public void setCustomNightModeStart(long p0) throws android.os.RemoteException {}
        public long getCustomNightModeEnd() throws android.os.RemoteException { return 0L; }
        public void setCustomNightModeEnd(long p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IUiModeManager {
        private static final java.lang.String DESCRIPTOR = "android.app.IUiModeManager";
        static final int TRANSACTION_enableCarMode = 1;
        static final int TRANSACTION_disableCarMode = 2;
        static final int TRANSACTION_disableCarModeByCallingPackage = 3;
        static final int TRANSACTION_getCurrentModeType = 4;
        static final int TRANSACTION_setNightMode = 5;
        static final int TRANSACTION_getNightMode = 6;
        static final int TRANSACTION_isUiModeLocked = 7;
        static final int TRANSACTION_isNightModeLocked = 8;
        static final int TRANSACTION_setNightModeActivated = 9;
        static final int TRANSACTION_getCustomNightModeStart = 10;
        static final int TRANSACTION_setCustomNightModeStart = 11;
        static final int TRANSACTION_getCustomNightModeEnd = 12;
        static final int TRANSACTION_setCustomNightModeEnd = 13;
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
            public void enableCarMode(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void disableCarMode(int p0) throws android.os.RemoteException {}
            public void disableCarModeByCallingPackage(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public int getCurrentModeType() throws android.os.RemoteException { return 0; }
            public void setNightMode(int p0) throws android.os.RemoteException {}
            public int getNightMode() throws android.os.RemoteException { return 0; }
            public boolean isUiModeLocked() throws android.os.RemoteException { return false; }
            public boolean isNightModeLocked() throws android.os.RemoteException { return false; }
            public boolean setNightModeActivated(boolean p0) throws android.os.RemoteException { return false; }
            public long getCustomNightModeStart() throws android.os.RemoteException { return 0L; }
            public void setCustomNightModeStart(long p0) throws android.os.RemoteException {}
            public long getCustomNightModeEnd() throws android.os.RemoteException { return 0L; }
            public void setCustomNightModeEnd(long p0) throws android.os.RemoteException {}
        }
    }
}
