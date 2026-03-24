package android.os;

public interface IServiceManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IServiceManager";
    public static final int DUMP_FLAG_PRIORITY_CRITICAL = 1;
    public static final int DUMP_FLAG_PRIORITY_HIGH = 2;
    public static final int DUMP_FLAG_PRIORITY_NORMAL = 4;
    public static final int DUMP_FLAG_PRIORITY_DEFAULT = 8;
    public static final int DUMP_FLAG_PRIORITY_ALL = 15;
    public static final int FLAG_IS_LAZY_SERVICE = 1073741824;
    public static final int DUMP_FLAG_PROTO = 16;
    @java.lang.Deprecated
    public android.os.IBinder getService(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Service getService2(java.lang.String p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public android.os.IBinder checkService(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Service checkService2(java.lang.String p0) throws android.os.RemoteException;
    public void addService(java.lang.String p0, android.os.IBinder p1, boolean p2, int p3) throws android.os.RemoteException;
    public java.lang.String[] listServices(int p0) throws android.os.RemoteException;
    public void registerForNotifications(java.lang.String p0, android.os.IServiceCallback p1) throws android.os.RemoteException;
    public void unregisterForNotifications(java.lang.String p0, android.os.IServiceCallback p1) throws android.os.RemoteException;
    public boolean isDeclared(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String[] getDeclaredInstances(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String updatableViaApex(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String[] getUpdatableNames(java.lang.String p0) throws android.os.RemoteException;
    public android.os.ConnectionInfo getConnectionInfo(java.lang.String p0) throws android.os.RemoteException;
    public void registerClientCallback(java.lang.String p0, android.os.IBinder p1, android.os.IClientCallback p2) throws android.os.RemoteException;
    public void tryUnregisterService(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public android.os.ServiceDebugInfo[] getServiceDebugInfo() throws android.os.RemoteException;
    public boolean checkServiceAccess(android.os.IServiceManager.CallerContext p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;

    public static class CallerContext implements android.os.Parcelable {
        public java.lang.String sidName;
        public int debugPid;
        public int uid;
        public static final android.os.Parcelable.Creator<android.os.IServiceManager.CallerContext> CREATOR = null;
        public CallerContext() {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static class Default implements android.os.IServiceManager {
        public Default() {}
        public android.os.IBinder getService(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.Service getService2(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder checkService(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.Service checkService2(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void addService(java.lang.String p0, android.os.IBinder p1, boolean p2, int p3) throws android.os.RemoteException {}
        public java.lang.String[] listServices(int p0) throws android.os.RemoteException { return null; }
        public void registerForNotifications(java.lang.String p0, android.os.IServiceCallback p1) throws android.os.RemoteException {}
        public void unregisterForNotifications(java.lang.String p0, android.os.IServiceCallback p1) throws android.os.RemoteException {}
        public boolean isDeclared(java.lang.String p0) throws android.os.RemoteException { return false; }
        public java.lang.String[] getDeclaredInstances(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String updatableViaApex(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] getUpdatableNames(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.ConnectionInfo getConnectionInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void registerClientCallback(java.lang.String p0, android.os.IBinder p1, android.os.IClientCallback p2) throws android.os.RemoteException {}
        public void tryUnregisterService(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public android.os.ServiceDebugInfo[] getServiceDebugInfo() throws android.os.RemoteException { return null; }
        public boolean checkServiceAccess(android.os.IServiceManager.CallerContext p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IServiceManager {
        static final int TRANSACTION_getService = 1;
        static final int TRANSACTION_getService2 = 2;
        static final int TRANSACTION_checkService = 3;
        static final int TRANSACTION_checkService2 = 4;
        static final int TRANSACTION_addService = 5;
        static final int TRANSACTION_listServices = 6;
        static final int TRANSACTION_registerForNotifications = 7;
        static final int TRANSACTION_unregisterForNotifications = 8;
        static final int TRANSACTION_isDeclared = 9;
        static final int TRANSACTION_getDeclaredInstances = 10;
        static final int TRANSACTION_updatableViaApex = 11;
        static final int TRANSACTION_getUpdatableNames = 12;
        static final int TRANSACTION_getConnectionInfo = 13;
        static final int TRANSACTION_registerClientCallback = 14;
        static final int TRANSACTION_tryUnregisterService = 15;
        static final int TRANSACTION_getServiceDebugInfo = 16;
        static final int TRANSACTION_checkServiceAccess = 17;
        public Stub() { super(); }
        public static android.os.IServiceManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IServiceManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.IBinder getService(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.os.Service getService2(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.os.IBinder checkService(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.os.Service checkService2(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void addService(java.lang.String p0, android.os.IBinder p1, boolean p2, int p3) throws android.os.RemoteException {}
            public java.lang.String[] listServices(int p0) throws android.os.RemoteException { return null; }
            public void registerForNotifications(java.lang.String p0, android.os.IServiceCallback p1) throws android.os.RemoteException {}
            public void unregisterForNotifications(java.lang.String p0, android.os.IServiceCallback p1) throws android.os.RemoteException {}
            public boolean isDeclared(java.lang.String p0) throws android.os.RemoteException { return false; }
            public java.lang.String[] getDeclaredInstances(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String updatableViaApex(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] getUpdatableNames(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.os.ConnectionInfo getConnectionInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void registerClientCallback(java.lang.String p0, android.os.IBinder p1, android.os.IClientCallback p2) throws android.os.RemoteException {}
            public void tryUnregisterService(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public android.os.ServiceDebugInfo[] getServiceDebugInfo() throws android.os.RemoteException { return null; }
            public boolean checkServiceAccess(android.os.IServiceManager.CallerContext p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        }
    }
}
