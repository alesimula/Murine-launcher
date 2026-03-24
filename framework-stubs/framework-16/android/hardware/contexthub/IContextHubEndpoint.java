package android.hardware.contexthub;

public interface IContextHubEndpoint extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.contexthub.IContextHubEndpoint";
    public android.hardware.contexthub.HubEndpointInfo getAssignedHubEndpointInfo() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public int openSession(android.hardware.contexthub.HubEndpointInfo p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public void closeSession(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public void openSessionRequestComplete(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public void unregister() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public void sendMessage(int p0, android.hardware.contexthub.HubMessage p1, android.hardware.location.IContextHubTransactionCallback p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public void sendMessageDeliveryStatus(int p0, int p1, byte p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_CONTEXT_HUB")
    public void onCallbackFinished() throws android.os.RemoteException;

    public static class Default implements android.hardware.contexthub.IContextHubEndpoint {
        public Default() {}
        public android.hardware.contexthub.HubEndpointInfo getAssignedHubEndpointInfo() throws android.os.RemoteException { return null; }
        public int openSession(android.hardware.contexthub.HubEndpointInfo p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void closeSession(int p0, int p1) throws android.os.RemoteException {}
        public void openSessionRequestComplete(int p0) throws android.os.RemoteException {}
        public void unregister() throws android.os.RemoteException {}
        public void sendMessage(int p0, android.hardware.contexthub.HubMessage p1, android.hardware.location.IContextHubTransactionCallback p2) throws android.os.RemoteException {}
        public void sendMessageDeliveryStatus(int p0, int p1, byte p2) throws android.os.RemoteException {}
        public void onCallbackFinished() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.contexthub.IContextHubEndpoint {
        static final int TRANSACTION_getAssignedHubEndpointInfo = 1;
        static final int TRANSACTION_openSession = 2;
        static final int TRANSACTION_closeSession = 3;
        static final int TRANSACTION_openSessionRequestComplete = 4;
        static final int TRANSACTION_unregister = 5;
        static final int TRANSACTION_sendMessage = 6;
        static final int TRANSACTION_sendMessageDeliveryStatus = 7;
        static final int TRANSACTION_onCallbackFinished = 8;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.hardware.contexthub.IContextHubEndpoint asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void openSession_enforcePermission() throws java.lang.SecurityException {}
        protected void closeSession_enforcePermission() throws java.lang.SecurityException {}
        protected void openSessionRequestComplete_enforcePermission() throws java.lang.SecurityException {}
        protected void unregister_enforcePermission() throws java.lang.SecurityException {}
        protected void sendMessage_enforcePermission() throws java.lang.SecurityException {}
        protected void sendMessageDeliveryStatus_enforcePermission() throws java.lang.SecurityException {}
        protected void onCallbackFinished_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.contexthub.IContextHubEndpoint {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.contexthub.HubEndpointInfo getAssignedHubEndpointInfo() throws android.os.RemoteException { return null; }
            public int openSession(android.hardware.contexthub.HubEndpointInfo p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void closeSession(int p0, int p1) throws android.os.RemoteException {}
            public void openSessionRequestComplete(int p0) throws android.os.RemoteException {}
            public void unregister() throws android.os.RemoteException {}
            public void sendMessage(int p0, android.hardware.contexthub.HubMessage p1, android.hardware.location.IContextHubTransactionCallback p2) throws android.os.RemoteException {}
            public void sendMessageDeliveryStatus(int p0, int p1, byte p2) throws android.os.RemoteException {}
            public void onCallbackFinished() throws android.os.RemoteException {}
        }
    }
}
