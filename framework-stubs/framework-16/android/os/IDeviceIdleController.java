package android.os;

public interface IDeviceIdleController extends android.os.IInterface {
    public void addPowerSaveWhitelistApp(java.lang.String p0) throws android.os.RemoteException;
    public int addPowerSaveWhitelistApps(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public void removePowerSaveWhitelistApp(java.lang.String p0) throws android.os.RemoteException;
    public void removeSystemPowerWhitelistApp(java.lang.String p0) throws android.os.RemoteException;
    public void restoreSystemPowerWhitelistApp(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String[] getRemovedSystemPowerWhitelistApps() throws android.os.RemoteException;
    public java.lang.String[] getSystemPowerWhitelistExceptIdle() throws android.os.RemoteException;
    public java.lang.String[] getSystemPowerWhitelist() throws android.os.RemoteException;
    public java.lang.String[] getUserPowerWhitelist() throws android.os.RemoteException;
    public java.lang.String[] getFullPowerWhitelistExceptIdle() throws android.os.RemoteException;
    public java.lang.String[] getFullPowerWhitelist() throws android.os.RemoteException;
    public int[] getAppIdWhitelistExceptIdle() throws android.os.RemoteException;
    public int[] getAppIdWhitelist() throws android.os.RemoteException;
    public int[] getAppIdUserWhitelist() throws android.os.RemoteException;
    public int[] getAppIdTempWhitelist() throws android.os.RemoteException;
    public boolean isPowerSaveWhitelistExceptIdleApp(java.lang.String p0) throws android.os.RemoteException;
    public boolean isPowerSaveWhitelistApp(java.lang.String p0) throws android.os.RemoteException;
    public void addPowerSaveTempWhitelistApp(java.lang.String p0, long p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    public long addPowerSaveTempWhitelistAppForMms(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public long addPowerSaveTempWhitelistAppForSms(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public long whitelistAppTemporarily(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.DEVICE_POWER")
    public void exitIdle(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.os.IDeviceIdleController {
        public Default() {}
        public void addPowerSaveWhitelistApp(java.lang.String p0) throws android.os.RemoteException {}
        public int addPowerSaveWhitelistApps(java.util.List<java.lang.String> p0) throws android.os.RemoteException { return 0; }
        public void removePowerSaveWhitelistApp(java.lang.String p0) throws android.os.RemoteException {}
        public void removeSystemPowerWhitelistApp(java.lang.String p0) throws android.os.RemoteException {}
        public void restoreSystemPowerWhitelistApp(java.lang.String p0) throws android.os.RemoteException {}
        public java.lang.String[] getRemovedSystemPowerWhitelistApps() throws android.os.RemoteException { return null; }
        public java.lang.String[] getSystemPowerWhitelistExceptIdle() throws android.os.RemoteException { return null; }
        public java.lang.String[] getSystemPowerWhitelist() throws android.os.RemoteException { return null; }
        public java.lang.String[] getUserPowerWhitelist() throws android.os.RemoteException { return null; }
        public java.lang.String[] getFullPowerWhitelistExceptIdle() throws android.os.RemoteException { return null; }
        public java.lang.String[] getFullPowerWhitelist() throws android.os.RemoteException { return null; }
        public int[] getAppIdWhitelistExceptIdle() throws android.os.RemoteException { return null; }
        public int[] getAppIdWhitelist() throws android.os.RemoteException { return null; }
        public int[] getAppIdUserWhitelist() throws android.os.RemoteException { return null; }
        public int[] getAppIdTempWhitelist() throws android.os.RemoteException { return null; }
        public boolean isPowerSaveWhitelistExceptIdleApp(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isPowerSaveWhitelistApp(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void addPowerSaveTempWhitelistApp(java.lang.String p0, long p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
        public long addPowerSaveTempWhitelistAppForMms(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0L; }
        public long addPowerSaveTempWhitelistAppForSms(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0L; }
        public long whitelistAppTemporarily(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0L; }
        public void exitIdle(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IDeviceIdleController {
        public static final java.lang.String DESCRIPTOR = "android.os.IDeviceIdleController";
        static final int TRANSACTION_addPowerSaveWhitelistApp = 1;
        static final int TRANSACTION_addPowerSaveWhitelistApps = 2;
        static final int TRANSACTION_removePowerSaveWhitelistApp = 3;
        static final int TRANSACTION_removeSystemPowerWhitelistApp = 4;
        static final int TRANSACTION_restoreSystemPowerWhitelistApp = 5;
        static final int TRANSACTION_getRemovedSystemPowerWhitelistApps = 6;
        static final int TRANSACTION_getSystemPowerWhitelistExceptIdle = 7;
        static final int TRANSACTION_getSystemPowerWhitelist = 8;
        static final int TRANSACTION_getUserPowerWhitelist = 9;
        static final int TRANSACTION_getFullPowerWhitelistExceptIdle = 10;
        static final int TRANSACTION_getFullPowerWhitelist = 11;
        static final int TRANSACTION_getAppIdWhitelistExceptIdle = 12;
        static final int TRANSACTION_getAppIdWhitelist = 13;
        static final int TRANSACTION_getAppIdUserWhitelist = 14;
        static final int TRANSACTION_getAppIdTempWhitelist = 15;
        static final int TRANSACTION_isPowerSaveWhitelistExceptIdleApp = 16;
        static final int TRANSACTION_isPowerSaveWhitelistApp = 17;
        static final int TRANSACTION_addPowerSaveTempWhitelistApp = 18;
        static final int TRANSACTION_addPowerSaveTempWhitelistAppForMms = 19;
        static final int TRANSACTION_addPowerSaveTempWhitelistAppForSms = 20;
        static final int TRANSACTION_whitelistAppTemporarily = 21;
        static final int TRANSACTION_exitIdle = 22;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.os.IDeviceIdleController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void exitIdle_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IDeviceIdleController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addPowerSaveWhitelistApp(java.lang.String p0) throws android.os.RemoteException {}
            public int addPowerSaveWhitelistApps(java.util.List<java.lang.String> p0) throws android.os.RemoteException { return 0; }
            public void removePowerSaveWhitelistApp(java.lang.String p0) throws android.os.RemoteException {}
            public void removeSystemPowerWhitelistApp(java.lang.String p0) throws android.os.RemoteException {}
            public void restoreSystemPowerWhitelistApp(java.lang.String p0) throws android.os.RemoteException {}
            public java.lang.String[] getRemovedSystemPowerWhitelistApps() throws android.os.RemoteException { return null; }
            public java.lang.String[] getSystemPowerWhitelistExceptIdle() throws android.os.RemoteException { return null; }
            public java.lang.String[] getSystemPowerWhitelist() throws android.os.RemoteException { return null; }
            public java.lang.String[] getUserPowerWhitelist() throws android.os.RemoteException { return null; }
            public java.lang.String[] getFullPowerWhitelistExceptIdle() throws android.os.RemoteException { return null; }
            public java.lang.String[] getFullPowerWhitelist() throws android.os.RemoteException { return null; }
            public int[] getAppIdWhitelistExceptIdle() throws android.os.RemoteException { return null; }
            public int[] getAppIdWhitelist() throws android.os.RemoteException { return null; }
            public int[] getAppIdUserWhitelist() throws android.os.RemoteException { return null; }
            public int[] getAppIdTempWhitelist() throws android.os.RemoteException { return null; }
            public boolean isPowerSaveWhitelistExceptIdleApp(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isPowerSaveWhitelistApp(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void addPowerSaveTempWhitelistApp(java.lang.String p0, long p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
            public long addPowerSaveTempWhitelistAppForMms(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0L; }
            public long addPowerSaveTempWhitelistAppForSms(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0L; }
            public long whitelistAppTemporarily(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0L; }
            public void exitIdle(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
