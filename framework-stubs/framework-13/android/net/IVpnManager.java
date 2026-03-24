package android.net;

public interface IVpnManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.IVpnManager";
    public boolean prepareVpn(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setVpnPackageAuthorization(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor establishVpn(com.android.internal.net.VpnConfig p0) throws android.os.RemoteException;
    public boolean addVpnAddress(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean removeVpnAddress(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean setUnderlyingNetworksForVpn(android.net.Network[] p0) throws android.os.RemoteException;
    public boolean provisionVpnProfile(com.android.internal.net.VpnProfile p0, java.lang.String p1) throws android.os.RemoteException;
    public void deleteVpnProfile(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String startVpnProfile(java.lang.String p0) throws android.os.RemoteException;
    public void stopVpnProfile(java.lang.String p0) throws android.os.RemoteException;
    public android.net.VpnProfileState getProvisionedVpnProfileState(java.lang.String p0) throws android.os.RemoteException;
    public boolean setAppExclusionList(int p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAppExclusionList(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isAlwaysOnVpnPackageSupported(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setAlwaysOnVpnPackage(int p0, java.lang.String p1, boolean p2, java.util.List<java.lang.String> p3) throws android.os.RemoteException;
    public java.lang.String getAlwaysOnVpnPackage(int p0) throws android.os.RemoteException;
    public boolean isVpnLockdownEnabled(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getVpnLockdownAllowlist(int p0) throws android.os.RemoteException;
    public boolean isCallerCurrentAlwaysOnVpnApp() throws android.os.RemoteException;
    public boolean isCallerCurrentAlwaysOnVpnLockdownApp() throws android.os.RemoteException;
    public void startLegacyVpn(com.android.internal.net.VpnProfile p0) throws android.os.RemoteException;
    public com.android.internal.net.LegacyVpnInfo getLegacyVpnInfo(int p0) throws android.os.RemoteException;
    public com.android.internal.net.VpnProfile[] getAllLegacyVpns() throws android.os.RemoteException;
    public boolean updateLockdownVpn() throws android.os.RemoteException;
    public com.android.internal.net.VpnConfig getVpnConfig(int p0) throws android.os.RemoteException;
    public void factoryReset() throws android.os.RemoteException;

    public static class Default implements android.net.IVpnManager {
        public Default() {}
        public boolean prepareVpn(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public void setVpnPackageAuthorization(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public android.os.ParcelFileDescriptor establishVpn(com.android.internal.net.VpnConfig p0) throws android.os.RemoteException { return null; }
        public boolean addVpnAddress(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean removeVpnAddress(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean setUnderlyingNetworksForVpn(android.net.Network[] p0) throws android.os.RemoteException { return false; }
        public boolean provisionVpnProfile(com.android.internal.net.VpnProfile p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void deleteVpnProfile(java.lang.String p0) throws android.os.RemoteException {}
        public java.lang.String startVpnProfile(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void stopVpnProfile(java.lang.String p0) throws android.os.RemoteException {}
        public android.net.VpnProfileState getProvisionedVpnProfileState(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean setAppExclusionList(int p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getAppExclusionList(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean isAlwaysOnVpnPackageSupported(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean setAlwaysOnVpnPackage(int p0, java.lang.String p1, boolean p2, java.util.List<java.lang.String> p3) throws android.os.RemoteException { return false; }
        public java.lang.String getAlwaysOnVpnPackage(int p0) throws android.os.RemoteException { return null; }
        public boolean isVpnLockdownEnabled(int p0) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getVpnLockdownAllowlist(int p0) throws android.os.RemoteException { return null; }
        public boolean isCallerCurrentAlwaysOnVpnApp() throws android.os.RemoteException { return false; }
        public boolean isCallerCurrentAlwaysOnVpnLockdownApp() throws android.os.RemoteException { return false; }
        public void startLegacyVpn(com.android.internal.net.VpnProfile p0) throws android.os.RemoteException {}
        public com.android.internal.net.LegacyVpnInfo getLegacyVpnInfo(int p0) throws android.os.RemoteException { return null; }
        public com.android.internal.net.VpnProfile[] getAllLegacyVpns() throws android.os.RemoteException { return null; }
        public boolean updateLockdownVpn() throws android.os.RemoteException { return false; }
        public com.android.internal.net.VpnConfig getVpnConfig(int p0) throws android.os.RemoteException { return null; }
        public void factoryReset() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.IVpnManager {
        static final int TRANSACTION_prepareVpn = 1;
        static final int TRANSACTION_setVpnPackageAuthorization = 2;
        static final int TRANSACTION_establishVpn = 3;
        static final int TRANSACTION_addVpnAddress = 4;
        static final int TRANSACTION_removeVpnAddress = 5;
        static final int TRANSACTION_setUnderlyingNetworksForVpn = 6;
        static final int TRANSACTION_provisionVpnProfile = 7;
        static final int TRANSACTION_deleteVpnProfile = 8;
        static final int TRANSACTION_startVpnProfile = 9;
        static final int TRANSACTION_stopVpnProfile = 10;
        static final int TRANSACTION_getProvisionedVpnProfileState = 11;
        static final int TRANSACTION_setAppExclusionList = 12;
        static final int TRANSACTION_getAppExclusionList = 13;
        static final int TRANSACTION_isAlwaysOnVpnPackageSupported = 14;
        static final int TRANSACTION_setAlwaysOnVpnPackage = 15;
        static final int TRANSACTION_getAlwaysOnVpnPackage = 16;
        static final int TRANSACTION_isVpnLockdownEnabled = 17;
        static final int TRANSACTION_getVpnLockdownAllowlist = 18;
        static final int TRANSACTION_isCallerCurrentAlwaysOnVpnApp = 19;
        static final int TRANSACTION_isCallerCurrentAlwaysOnVpnLockdownApp = 20;
        static final int TRANSACTION_startLegacyVpn = 21;
        static final int TRANSACTION_getLegacyVpnInfo = 22;
        static final int TRANSACTION_getAllLegacyVpns = 23;
        static final int TRANSACTION_updateLockdownVpn = 24;
        static final int TRANSACTION_getVpnConfig = 25;
        static final int TRANSACTION_factoryReset = 26;
        public Stub() { super(); }
        public static android.net.IVpnManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.net.IVpnManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean prepareVpn(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public void setVpnPackageAuthorization(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public android.os.ParcelFileDescriptor establishVpn(com.android.internal.net.VpnConfig p0) throws android.os.RemoteException { return null; }
            public boolean addVpnAddress(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean removeVpnAddress(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean setUnderlyingNetworksForVpn(android.net.Network[] p0) throws android.os.RemoteException { return false; }
            public boolean provisionVpnProfile(com.android.internal.net.VpnProfile p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void deleteVpnProfile(java.lang.String p0) throws android.os.RemoteException {}
            public java.lang.String startVpnProfile(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void stopVpnProfile(java.lang.String p0) throws android.os.RemoteException {}
            public android.net.VpnProfileState getProvisionedVpnProfileState(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean setAppExclusionList(int p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getAppExclusionList(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean isAlwaysOnVpnPackageSupported(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean setAlwaysOnVpnPackage(int p0, java.lang.String p1, boolean p2, java.util.List<java.lang.String> p3) throws android.os.RemoteException { return false; }
            public java.lang.String getAlwaysOnVpnPackage(int p0) throws android.os.RemoteException { return null; }
            public boolean isVpnLockdownEnabled(int p0) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getVpnLockdownAllowlist(int p0) throws android.os.RemoteException { return null; }
            public boolean isCallerCurrentAlwaysOnVpnApp() throws android.os.RemoteException { return false; }
            public boolean isCallerCurrentAlwaysOnVpnLockdownApp() throws android.os.RemoteException { return false; }
            public void startLegacyVpn(com.android.internal.net.VpnProfile p0) throws android.os.RemoteException {}
            public com.android.internal.net.LegacyVpnInfo getLegacyVpnInfo(int p0) throws android.os.RemoteException { return null; }
            public com.android.internal.net.VpnProfile[] getAllLegacyVpns() throws android.os.RemoteException { return null; }
            public boolean updateLockdownVpn() throws android.os.RemoteException { return false; }
            public com.android.internal.net.VpnConfig getVpnConfig(int p0) throws android.os.RemoteException { return null; }
            public void factoryReset() throws android.os.RemoteException {}
        }
    }
}
