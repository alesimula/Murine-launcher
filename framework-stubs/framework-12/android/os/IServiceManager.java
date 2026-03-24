package android.os;

public interface IServiceManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IServiceManager";
    public static final int DUMP_FLAG_PRIORITY_CRITICAL = 1;
    public static final int DUMP_FLAG_PRIORITY_HIGH = 2;
    public static final int DUMP_FLAG_PRIORITY_NORMAL = 4;
    public static final int DUMP_FLAG_PRIORITY_DEFAULT = 8;
    public static final int DUMP_FLAG_PRIORITY_ALL = 15;
    public static final int DUMP_FLAG_PROTO = 16;
    public android.os.IBinder getService(java.lang.String p0) throws android.os.RemoteException;
    public android.os.IBinder checkService(java.lang.String p0) throws android.os.RemoteException;
    public void addService(java.lang.String p0, android.os.IBinder p1, boolean p2, int p3) throws android.os.RemoteException;
    public java.lang.String[] listServices(int p0) throws android.os.RemoteException;
    public void registerForNotifications(java.lang.String p0, android.os.IServiceCallback p1) throws android.os.RemoteException;
    public void unregisterForNotifications(java.lang.String p0, android.os.IServiceCallback p1) throws android.os.RemoteException;
    public boolean isDeclared(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String[] getDeclaredInstances(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String updatableViaApex(java.lang.String p0) throws android.os.RemoteException;
    public void registerClientCallback(java.lang.String p0, android.os.IBinder p1, android.os.IClientCallback p2) throws android.os.RemoteException;
    public void tryUnregisterService(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public android.os.ServiceDebugInfo[] getServiceDebugInfo() throws android.os.RemoteException;

    public static class Default implements android.os.IServiceManager {
        public Default() {}
        public android.os.IBinder getService(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder checkService(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void addService(java.lang.String p0, android.os.IBinder p1, boolean p2, int p3) throws android.os.RemoteException {}
        public java.lang.String[] listServices(int p0) throws android.os.RemoteException { return null; }
        public void registerForNotifications(java.lang.String p0, android.os.IServiceCallback p1) throws android.os.RemoteException {}
        public void unregisterForNotifications(java.lang.String p0, android.os.IServiceCallback p1) throws android.os.RemoteException {}
        public boolean isDeclared(java.lang.String p0) throws android.os.RemoteException { return false; }
        public java.lang.String[] getDeclaredInstances(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String updatableViaApex(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void registerClientCallback(java.lang.String p0, android.os.IBinder p1, android.os.IClientCallback p2) throws android.os.RemoteException {}
        public void tryUnregisterService(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public android.os.ServiceDebugInfo[] getServiceDebugInfo() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IServiceManager {
        static final int TRANSACTION_getService = 1;
        static final int TRANSACTION_checkService = 2;
        static final int TRANSACTION_addService = 3;
        static final int TRANSACTION_listServices = 4;
        static final int TRANSACTION_registerForNotifications = 5;
        static final int TRANSACTION_unregisterForNotifications = 6;
        static final int TRANSACTION_isDeclared = 7;
        static final int TRANSACTION_getDeclaredInstances = 8;
        static final int TRANSACTION_updatableViaApex = 9;
        static final int TRANSACTION_registerClientCallback = 10;
        static final int TRANSACTION_tryUnregisterService = 11;
        static final int TRANSACTION_getServiceDebugInfo = 12;
        public Stub() { super(); }
        public static android.os.IServiceManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IServiceManager p0) { return false; }
        public static android.os.IServiceManager getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IServiceManager {
            private android.os.IBinder mRemote;
            public static android.os.IServiceManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.IBinder getService(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.os.IBinder checkService(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void addService(java.lang.String p0, android.os.IBinder p1, boolean p2, int p3) throws android.os.RemoteException {}
            public java.lang.String[] listServices(int p0) throws android.os.RemoteException { return null; }
            public void registerForNotifications(java.lang.String p0, android.os.IServiceCallback p1) throws android.os.RemoteException {}
            public void unregisterForNotifications(java.lang.String p0, android.os.IServiceCallback p1) throws android.os.RemoteException {}
            public boolean isDeclared(java.lang.String p0) throws android.os.RemoteException { return false; }
            public java.lang.String[] getDeclaredInstances(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String updatableViaApex(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void registerClientCallback(java.lang.String p0, android.os.IBinder p1, android.os.IClientCallback p2) throws android.os.RemoteException {}
            public void tryUnregisterService(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public android.os.ServiceDebugInfo[] getServiceDebugInfo() throws android.os.RemoteException { return null; }
        }
    }
}
