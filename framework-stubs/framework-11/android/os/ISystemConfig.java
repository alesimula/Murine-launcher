package android.os;

public interface ISystemConfig extends android.os.IInterface {
    public java.util.List<java.lang.String> getDisabledUntilUsedPreinstalledCarrierApps() throws android.os.RemoteException;
    public java.util.Map getDisabledUntilUsedPreinstalledCarrierAssociatedApps() throws android.os.RemoteException;
    public java.util.Map getDisabledUntilUsedPreinstalledCarrierAssociatedAppEntries() throws android.os.RemoteException;

    public static class Default implements android.os.ISystemConfig {
        public Default() {}
        public java.util.List<java.lang.String> getDisabledUntilUsedPreinstalledCarrierApps() throws android.os.RemoteException { return null; }
        public java.util.Map getDisabledUntilUsedPreinstalledCarrierAssociatedApps() throws android.os.RemoteException { return null; }
        public java.util.Map getDisabledUntilUsedPreinstalledCarrierAssociatedAppEntries() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.ISystemConfig {
        private static final java.lang.String DESCRIPTOR = "android.os.ISystemConfig";
        static final int TRANSACTION_getDisabledUntilUsedPreinstalledCarrierApps = 1;
        static final int TRANSACTION_getDisabledUntilUsedPreinstalledCarrierAssociatedApps = 2;
        static final int TRANSACTION_getDisabledUntilUsedPreinstalledCarrierAssociatedAppEntries = 3;
        public Stub() { super(); }
        public static android.os.ISystemConfig asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.ISystemConfig p0) { return false; }
        public static android.os.ISystemConfig getDefaultImpl() { return null; }

        private static class Proxy implements android.os.ISystemConfig {
            private android.os.IBinder mRemote;
            public static android.os.ISystemConfig sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<java.lang.String> getDisabledUntilUsedPreinstalledCarrierApps() throws android.os.RemoteException { return null; }
            public java.util.Map getDisabledUntilUsedPreinstalledCarrierAssociatedApps() throws android.os.RemoteException { return null; }
            public java.util.Map getDisabledUntilUsedPreinstalledCarrierAssociatedAppEntries() throws android.os.RemoteException { return null; }
        }
    }
}
