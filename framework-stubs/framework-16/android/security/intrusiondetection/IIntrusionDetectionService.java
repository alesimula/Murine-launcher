package android.security.intrusiondetection;

public interface IIntrusionDetectionService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.intrusiondetection.IIntrusionDetectionService";
    @android.annotation.EnforcePermission("android.permission.READ_INTRUSION_DETECTION_STATE")
    public void addStateCallback(android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.READ_INTRUSION_DETECTION_STATE")
    public void removeStateCallback(android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_INTRUSION_DETECTION_STATE")
    public void enable(android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_INTRUSION_DETECTION_STATE")
    public void disable(android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback p0) throws android.os.RemoteException;

    public static class Default implements android.security.intrusiondetection.IIntrusionDetectionService {
        public Default() {}
        public void addStateCallback(android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback p0) throws android.os.RemoteException {}
        public void removeStateCallback(android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback p0) throws android.os.RemoteException {}
        public void enable(android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback p0) throws android.os.RemoteException {}
        public void disable(android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.intrusiondetection.IIntrusionDetectionService {
        static final int TRANSACTION_addStateCallback = 1;
        static final int TRANSACTION_removeStateCallback = 2;
        static final int TRANSACTION_enable = 3;
        static final int TRANSACTION_disable = 4;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.security.intrusiondetection.IIntrusionDetectionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void addStateCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void removeStateCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void enable_enforcePermission() throws java.lang.SecurityException {}
        protected void disable_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.intrusiondetection.IIntrusionDetectionService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addStateCallback(android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback p0) throws android.os.RemoteException {}
            public void removeStateCallback(android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback p0) throws android.os.RemoteException {}
            public void enable(android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback p0) throws android.os.RemoteException {}
            public void disable(android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback p0) throws android.os.RemoteException {}
        }
    }
}
