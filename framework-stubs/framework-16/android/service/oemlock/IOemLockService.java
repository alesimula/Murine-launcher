package android.service.oemlock;

public interface IOemLockService extends android.os.IInterface {
    @android.annotation.EnforcePermission("android.permission.MANAGE_CARRIER_OEM_UNLOCK_STATE")
    public java.lang.String getLockName() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_CARRIER_OEM_UNLOCK_STATE")
    public void setOemUnlockAllowedByCarrier(boolean p0, byte[] p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_CARRIER_OEM_UNLOCK_STATE")
    public boolean isOemUnlockAllowedByCarrier() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_USER_OEM_UNLOCK_STATE")
    public void setOemUnlockAllowedByUser(boolean p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_USER_OEM_UNLOCK_STATE")
    public boolean isOemUnlockAllowedByUser() throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.READ_OEM_UNLOCK_STATE", "android.permission.OEM_UNLOCK_STATE"})
    public boolean isOemUnlockAllowed() throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.READ_OEM_UNLOCK_STATE", "android.permission.OEM_UNLOCK_STATE"})
    public boolean isDeviceOemUnlocked() throws android.os.RemoteException;

    public static class Default implements android.service.oemlock.IOemLockService {
        public Default() {}
        public java.lang.String getLockName() throws android.os.RemoteException { return null; }
        public void setOemUnlockAllowedByCarrier(boolean p0, byte[] p1) throws android.os.RemoteException {}
        public boolean isOemUnlockAllowedByCarrier() throws android.os.RemoteException { return false; }
        public void setOemUnlockAllowedByUser(boolean p0) throws android.os.RemoteException {}
        public boolean isOemUnlockAllowedByUser() throws android.os.RemoteException { return false; }
        public boolean isOemUnlockAllowed() throws android.os.RemoteException { return false; }
        public boolean isDeviceOemUnlocked() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.oemlock.IOemLockService {
        public static final java.lang.String DESCRIPTOR = "android.service.oemlock.IOemLockService";
        static final int TRANSACTION_getLockName = 1;
        static final int TRANSACTION_setOemUnlockAllowedByCarrier = 2;
        static final int TRANSACTION_isOemUnlockAllowedByCarrier = 3;
        static final int TRANSACTION_setOemUnlockAllowedByUser = 4;
        static final int TRANSACTION_isOemUnlockAllowedByUser = 5;
        static final int TRANSACTION_isOemUnlockAllowed = 6;
        static final java.lang.String[] PERMISSIONS_isOemUnlockAllowed = null;
        static final int TRANSACTION_isDeviceOemUnlocked = 7;
        static final java.lang.String[] PERMISSIONS_isDeviceOemUnlocked = null;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.service.oemlock.IOemLockService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void getLockName_enforcePermission() throws java.lang.SecurityException {}
        protected void setOemUnlockAllowedByCarrier_enforcePermission() throws java.lang.SecurityException {}
        protected void isOemUnlockAllowedByCarrier_enforcePermission() throws java.lang.SecurityException {}
        protected void setOemUnlockAllowedByUser_enforcePermission() throws java.lang.SecurityException {}
        protected void isOemUnlockAllowedByUser_enforcePermission() throws java.lang.SecurityException {}
        protected void isOemUnlockAllowed_enforcePermission() throws java.lang.SecurityException {}
        protected void isDeviceOemUnlocked_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.oemlock.IOemLockService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getLockName() throws android.os.RemoteException { return null; }
            public void setOemUnlockAllowedByCarrier(boolean p0, byte[] p1) throws android.os.RemoteException {}
            public boolean isOemUnlockAllowedByCarrier() throws android.os.RemoteException { return false; }
            public void setOemUnlockAllowedByUser(boolean p0) throws android.os.RemoteException {}
            public boolean isOemUnlockAllowedByUser() throws android.os.RemoteException { return false; }
            public boolean isOemUnlockAllowed() throws android.os.RemoteException { return false; }
            public boolean isDeviceOemUnlocked() throws android.os.RemoteException { return false; }
        }
    }
}
