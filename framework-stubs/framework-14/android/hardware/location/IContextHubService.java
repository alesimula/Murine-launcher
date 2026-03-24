package android.hardware.location;

public interface IContextHubService extends android.os.IInterface {
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public int registerCallback(android.hardware.location.IContextHubCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public int[] getContextHubHandles() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.ContextHubInfo getContextHubInfo(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public int loadNanoApp(int p0, android.hardware.location.NanoApp p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public int unloadNanoApp(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.NanoAppInstanceInfo getNanoAppInstanceInfo(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public int[] findNanoAppOnHub(int p0, android.hardware.location.NanoAppFilter p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public int sendMessage(int p0, int p1, android.hardware.location.ContextHubMessage p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.IContextHubClient createClient(int p0, android.hardware.location.IContextHubClientCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.IContextHubClient createPendingIntentClient(int p0, android.app.PendingIntent p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public java.util.List<android.hardware.location.ContextHubInfo> getContextHubs() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public void loadNanoAppOnHub(int p0, android.hardware.location.IContextHubTransactionCallback p1, android.hardware.location.NanoAppBinary p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public void unloadNanoAppFromHub(int p0, android.hardware.location.IContextHubTransactionCallback p1, long p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public void enableNanoApp(int p0, android.hardware.location.IContextHubTransactionCallback p1, long p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public void disableNanoApp(int p0, android.hardware.location.IContextHubTransactionCallback p1, long p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public void queryNanoApps(int p0, android.hardware.location.IContextHubTransactionCallback p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public long[] getPreloadedNanoAppIds(android.hardware.location.ContextHubInfo p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public boolean setTestMode(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.location.IContextHubService {
        public Default() {}
        public int registerCallback(android.hardware.location.IContextHubCallback p0) throws android.os.RemoteException { return 0; }
        public int[] getContextHubHandles() throws android.os.RemoteException { return null; }
        public android.hardware.location.ContextHubInfo getContextHubInfo(int p0) throws android.os.RemoteException { return null; }
        public int loadNanoApp(int p0, android.hardware.location.NanoApp p1) throws android.os.RemoteException { return 0; }
        public int unloadNanoApp(int p0) throws android.os.RemoteException { return 0; }
        public android.hardware.location.NanoAppInstanceInfo getNanoAppInstanceInfo(int p0) throws android.os.RemoteException { return null; }
        public int[] findNanoAppOnHub(int p0, android.hardware.location.NanoAppFilter p1) throws android.os.RemoteException { return null; }
        public int sendMessage(int p0, int p1, android.hardware.location.ContextHubMessage p2) throws android.os.RemoteException { return 0; }
        public android.hardware.location.IContextHubClient createClient(int p0, android.hardware.location.IContextHubClientCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.hardware.location.IContextHubClient createPendingIntentClient(int p0, android.app.PendingIntent p1, long p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.location.ContextHubInfo> getContextHubs() throws android.os.RemoteException { return null; }
        public void loadNanoAppOnHub(int p0, android.hardware.location.IContextHubTransactionCallback p1, android.hardware.location.NanoAppBinary p2) throws android.os.RemoteException {}
        public void unloadNanoAppFromHub(int p0, android.hardware.location.IContextHubTransactionCallback p1, long p2) throws android.os.RemoteException {}
        public void enableNanoApp(int p0, android.hardware.location.IContextHubTransactionCallback p1, long p2) throws android.os.RemoteException {}
        public void disableNanoApp(int p0, android.hardware.location.IContextHubTransactionCallback p1, long p2) throws android.os.RemoteException {}
        public void queryNanoApps(int p0, android.hardware.location.IContextHubTransactionCallback p1) throws android.os.RemoteException {}
        public long[] getPreloadedNanoAppIds(android.hardware.location.ContextHubInfo p0) throws android.os.RemoteException { return null; }
        public boolean setTestMode(boolean p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.location.IContextHubService {
        public static final java.lang.String DESCRIPTOR = "android.hardware.location.IContextHubService";
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_getContextHubHandles = 2;
        static final int TRANSACTION_getContextHubInfo = 3;
        static final int TRANSACTION_loadNanoApp = 4;
        static final int TRANSACTION_unloadNanoApp = 5;
        static final int TRANSACTION_getNanoAppInstanceInfo = 6;
        static final int TRANSACTION_findNanoAppOnHub = 7;
        static final int TRANSACTION_sendMessage = 8;
        static final int TRANSACTION_createClient = 9;
        static final int TRANSACTION_createPendingIntentClient = 10;
        static final int TRANSACTION_getContextHubs = 11;
        static final int TRANSACTION_loadNanoAppOnHub = 12;
        static final int TRANSACTION_unloadNanoAppFromHub = 13;
        static final int TRANSACTION_enableNanoApp = 14;
        static final int TRANSACTION_disableNanoApp = 15;
        static final int TRANSACTION_queryNanoApps = 16;
        static final int TRANSACTION_getPreloadedNanoAppIds = 17;
        static final int TRANSACTION_setTestMode = 18;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.hardware.location.IContextHubService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void registerCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void getContextHubHandles_enforcePermission() throws java.lang.SecurityException {}
        protected void getContextHubInfo_enforcePermission() throws java.lang.SecurityException {}
        protected void loadNanoApp_enforcePermission() throws java.lang.SecurityException {}
        protected void unloadNanoApp_enforcePermission() throws java.lang.SecurityException {}
        protected void getNanoAppInstanceInfo_enforcePermission() throws java.lang.SecurityException {}
        protected void findNanoAppOnHub_enforcePermission() throws java.lang.SecurityException {}
        protected void sendMessage_enforcePermission() throws java.lang.SecurityException {}
        protected void createClient_enforcePermission() throws java.lang.SecurityException {}
        protected void createPendingIntentClient_enforcePermission() throws java.lang.SecurityException {}
        protected void getContextHubs_enforcePermission() throws java.lang.SecurityException {}
        protected void loadNanoAppOnHub_enforcePermission() throws java.lang.SecurityException {}
        protected void unloadNanoAppFromHub_enforcePermission() throws java.lang.SecurityException {}
        protected void enableNanoApp_enforcePermission() throws java.lang.SecurityException {}
        protected void disableNanoApp_enforcePermission() throws java.lang.SecurityException {}
        protected void queryNanoApps_enforcePermission() throws java.lang.SecurityException {}
        protected void getPreloadedNanoAppIds_enforcePermission() throws java.lang.SecurityException {}
        protected void setTestMode_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.location.IContextHubService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int registerCallback(android.hardware.location.IContextHubCallback p0) throws android.os.RemoteException { return 0; }
            public int[] getContextHubHandles() throws android.os.RemoteException { return null; }
            public android.hardware.location.ContextHubInfo getContextHubInfo(int p0) throws android.os.RemoteException { return null; }
            public int loadNanoApp(int p0, android.hardware.location.NanoApp p1) throws android.os.RemoteException { return 0; }
            public int unloadNanoApp(int p0) throws android.os.RemoteException { return 0; }
            public android.hardware.location.NanoAppInstanceInfo getNanoAppInstanceInfo(int p0) throws android.os.RemoteException { return null; }
            public int[] findNanoAppOnHub(int p0, android.hardware.location.NanoAppFilter p1) throws android.os.RemoteException { return null; }
            public int sendMessage(int p0, int p1, android.hardware.location.ContextHubMessage p2) throws android.os.RemoteException { return 0; }
            public android.hardware.location.IContextHubClient createClient(int p0, android.hardware.location.IContextHubClientCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.hardware.location.IContextHubClient createPendingIntentClient(int p0, android.app.PendingIntent p1, long p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.location.ContextHubInfo> getContextHubs() throws android.os.RemoteException { return null; }
            public void loadNanoAppOnHub(int p0, android.hardware.location.IContextHubTransactionCallback p1, android.hardware.location.NanoAppBinary p2) throws android.os.RemoteException {}
            public void unloadNanoAppFromHub(int p0, android.hardware.location.IContextHubTransactionCallback p1, long p2) throws android.os.RemoteException {}
            public void enableNanoApp(int p0, android.hardware.location.IContextHubTransactionCallback p1, long p2) throws android.os.RemoteException {}
            public void disableNanoApp(int p0, android.hardware.location.IContextHubTransactionCallback p1, long p2) throws android.os.RemoteException {}
            public void queryNanoApps(int p0, android.hardware.location.IContextHubTransactionCallback p1) throws android.os.RemoteException {}
            public long[] getPreloadedNanoAppIds(android.hardware.location.ContextHubInfo p0) throws android.os.RemoteException { return null; }
            public boolean setTestMode(boolean p0) throws android.os.RemoteException { return false; }
        }
    }
}
