package android.service.vr;

public interface IVrManager extends android.os.IInterface {
    public void registerListener(android.service.vr.IVrStateCallbacks p0) throws android.os.RemoteException;
    public void unregisterListener(android.service.vr.IVrStateCallbacks p0) throws android.os.RemoteException;
    public void registerPersistentVrStateListener(android.service.vr.IPersistentVrStateCallbacks p0) throws android.os.RemoteException;
    public void unregisterPersistentVrStateListener(android.service.vr.IPersistentVrStateCallbacks p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean getVrModeState() throws android.os.RemoteException;
    public boolean getPersistentVrModeEnabled() throws android.os.RemoteException;
    public void setPersistentVrModeEnabled(boolean p0) throws android.os.RemoteException;
    public void setVr2dDisplayProperties(android.app.Vr2dDisplayProperties p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getVr2dDisplayId() throws android.os.RemoteException;
    public void setAndBindCompositor(java.lang.String p0) throws android.os.RemoteException;
    public void setStandbyEnabled(boolean p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.vr.IVrManager {
        private static final java.lang.String DESCRIPTOR = "android.service.vr.IVrManager";
        static final int TRANSACTION_registerListener = 1;
        static final int TRANSACTION_unregisterListener = 2;
        static final int TRANSACTION_registerPersistentVrStateListener = 3;
        static final int TRANSACTION_unregisterPersistentVrStateListener = 4;
        static final int TRANSACTION_getVrModeState = 5;
        static final int TRANSACTION_getPersistentVrModeEnabled = 6;
        static final int TRANSACTION_setPersistentVrModeEnabled = 7;
        static final int TRANSACTION_setVr2dDisplayProperties = 8;
        static final int TRANSACTION_getVr2dDisplayId = 9;
        static final int TRANSACTION_setAndBindCompositor = 10;
        static final int TRANSACTION_setStandbyEnabled = 11;
        public Stub() { super(); }
        public static android.service.vr.IVrManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.vr.IVrManager p0) { return false; }
        public static android.service.vr.IVrManager getDefaultImpl() { return null; }

        private static class Proxy implements android.service.vr.IVrManager {
            private android.os.IBinder mRemote;
            public static android.service.vr.IVrManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerListener(android.service.vr.IVrStateCallbacks p0) throws android.os.RemoteException {}
            public void unregisterListener(android.service.vr.IVrStateCallbacks p0) throws android.os.RemoteException {}
            public void registerPersistentVrStateListener(android.service.vr.IPersistentVrStateCallbacks p0) throws android.os.RemoteException {}
            public void unregisterPersistentVrStateListener(android.service.vr.IPersistentVrStateCallbacks p0) throws android.os.RemoteException {}
            public boolean getVrModeState() throws android.os.RemoteException { return false; }
            public boolean getPersistentVrModeEnabled() throws android.os.RemoteException { return false; }
            public void setPersistentVrModeEnabled(boolean p0) throws android.os.RemoteException {}
            public void setVr2dDisplayProperties(android.app.Vr2dDisplayProperties p0) throws android.os.RemoteException {}
            public int getVr2dDisplayId() throws android.os.RemoteException { return 0; }
            public void setAndBindCompositor(java.lang.String p0) throws android.os.RemoteException {}
            public void setStandbyEnabled(boolean p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.service.vr.IVrManager {
        public Default() {}
        public void registerListener(android.service.vr.IVrStateCallbacks p0) throws android.os.RemoteException {}
        public void unregisterListener(android.service.vr.IVrStateCallbacks p0) throws android.os.RemoteException {}
        public void registerPersistentVrStateListener(android.service.vr.IPersistentVrStateCallbacks p0) throws android.os.RemoteException {}
        public void unregisterPersistentVrStateListener(android.service.vr.IPersistentVrStateCallbacks p0) throws android.os.RemoteException {}
        public boolean getVrModeState() throws android.os.RemoteException { return false; }
        public boolean getPersistentVrModeEnabled() throws android.os.RemoteException { return false; }
        public void setPersistentVrModeEnabled(boolean p0) throws android.os.RemoteException {}
        public void setVr2dDisplayProperties(android.app.Vr2dDisplayProperties p0) throws android.os.RemoteException {}
        public int getVr2dDisplayId() throws android.os.RemoteException { return 0; }
        public void setAndBindCompositor(java.lang.String p0) throws android.os.RemoteException {}
        public void setStandbyEnabled(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
