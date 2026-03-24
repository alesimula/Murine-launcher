package android.security.authenticationpolicy;

public interface IAuthenticationPolicyService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.authenticationpolicy.IAuthenticationPolicyService";
    @android.annotation.EnforcePermission("android.permission.MANAGE_SECURE_LOCK_DEVICE")
    public int enableSecureLockDevice(android.os.UserHandle p0, android.security.authenticationpolicy.EnableSecureLockDeviceParams p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_SECURE_LOCK_DEVICE")
    public int disableSecureLockDevice(android.os.UserHandle p0, android.security.authenticationpolicy.DisableSecureLockDeviceParams p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_SECURE_LOCK_DEVICE")
    public int isSecureLockDeviceAvailable(android.os.UserHandle p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_SECURE_LOCK_DEVICE")
    public boolean isSecureLockDeviceEnabled() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_SECURE_LOCK_DEVICE")
    public void registerSecureLockDeviceStatusListener(android.os.UserHandle p0, android.security.authenticationpolicy.ISecureLockDeviceStatusListener p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_SECURE_LOCK_DEVICE")
    public void unregisterSecureLockDeviceStatusListener(android.security.authenticationpolicy.ISecureLockDeviceStatusListener p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void startWatchRangingForIdentityCheck(long p0, android.proximity.IProximityResultCallback p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void cancelWatchRangingForRequestId(long p0) throws android.os.RemoteException;

    public static class Default implements android.security.authenticationpolicy.IAuthenticationPolicyService {
        public Default() {}
        public int enableSecureLockDevice(android.os.UserHandle p0, android.security.authenticationpolicy.EnableSecureLockDeviceParams p1) throws android.os.RemoteException { return 0; }
        public int disableSecureLockDevice(android.os.UserHandle p0, android.security.authenticationpolicy.DisableSecureLockDeviceParams p1) throws android.os.RemoteException { return 0; }
        public int isSecureLockDeviceAvailable(android.os.UserHandle p0) throws android.os.RemoteException { return 0; }
        public boolean isSecureLockDeviceEnabled() throws android.os.RemoteException { return false; }
        public void registerSecureLockDeviceStatusListener(android.os.UserHandle p0, android.security.authenticationpolicy.ISecureLockDeviceStatusListener p1) throws android.os.RemoteException {}
        public void unregisterSecureLockDeviceStatusListener(android.security.authenticationpolicy.ISecureLockDeviceStatusListener p0) throws android.os.RemoteException {}
        public void startWatchRangingForIdentityCheck(long p0, android.proximity.IProximityResultCallback p1) throws android.os.RemoteException {}
        public void cancelWatchRangingForRequestId(long p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.authenticationpolicy.IAuthenticationPolicyService {
        static final int TRANSACTION_enableSecureLockDevice = 1;
        static final int TRANSACTION_disableSecureLockDevice = 2;
        static final int TRANSACTION_isSecureLockDeviceAvailable = 3;
        static final int TRANSACTION_isSecureLockDeviceEnabled = 4;
        static final int TRANSACTION_registerSecureLockDeviceStatusListener = 5;
        static final int TRANSACTION_unregisterSecureLockDeviceStatusListener = 6;
        static final int TRANSACTION_startWatchRangingForIdentityCheck = 7;
        static final int TRANSACTION_cancelWatchRangingForRequestId = 8;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.security.authenticationpolicy.IAuthenticationPolicyService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void enableSecureLockDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void disableSecureLockDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void isSecureLockDeviceAvailable_enforcePermission() throws java.lang.SecurityException {}
        protected void isSecureLockDeviceEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void registerSecureLockDeviceStatusListener_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterSecureLockDeviceStatusListener_enforcePermission() throws java.lang.SecurityException {}
        protected void startWatchRangingForIdentityCheck_enforcePermission() throws java.lang.SecurityException {}
        protected void cancelWatchRangingForRequestId_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.authenticationpolicy.IAuthenticationPolicyService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int enableSecureLockDevice(android.os.UserHandle p0, android.security.authenticationpolicy.EnableSecureLockDeviceParams p1) throws android.os.RemoteException { return 0; }
            public int disableSecureLockDevice(android.os.UserHandle p0, android.security.authenticationpolicy.DisableSecureLockDeviceParams p1) throws android.os.RemoteException { return 0; }
            public int isSecureLockDeviceAvailable(android.os.UserHandle p0) throws android.os.RemoteException { return 0; }
            public boolean isSecureLockDeviceEnabled() throws android.os.RemoteException { return false; }
            public void registerSecureLockDeviceStatusListener(android.os.UserHandle p0, android.security.authenticationpolicy.ISecureLockDeviceStatusListener p1) throws android.os.RemoteException {}
            public void unregisterSecureLockDeviceStatusListener(android.security.authenticationpolicy.ISecureLockDeviceStatusListener p0) throws android.os.RemoteException {}
            public void startWatchRangingForIdentityCheck(long p0, android.proximity.IProximityResultCallback p1) throws android.os.RemoteException {}
            public void cancelWatchRangingForRequestId(long p0) throws android.os.RemoteException {}
        }
    }
}
