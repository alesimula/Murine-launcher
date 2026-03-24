package com.android.internal.compat;

public interface IPlatformCompat extends android.os.IInterface {
    public void reportChange(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException;
    public void reportChangeByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void reportChangeByUid(long p0, int p1) throws android.os.RemoteException;
    public boolean isChangeEnabled(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException;
    public boolean isChangeEnabledByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean isChangeEnabledByUid(long p0, int p1) throws android.os.RemoteException;
    public void setOverrides(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException;
    public void setOverridesForTest(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean clearOverride(long p0, java.lang.String p1) throws android.os.RemoteException;
    public int enableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int disableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void clearOverrides(java.lang.String p0) throws android.os.RemoteException;
    public void clearOverridesForTest(java.lang.String p0) throws android.os.RemoteException;
    public com.android.internal.compat.CompatibilityChangeConfig getAppConfig(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException;
    public com.android.internal.compat.CompatibilityChangeInfo[] listAllChanges() throws android.os.RemoteException;
    public com.android.internal.compat.CompatibilityChangeInfo[] listUIChanges() throws android.os.RemoteException;
    public com.android.internal.compat.IOverrideValidator getOverrideValidator() throws android.os.RemoteException;

    public static class Default implements com.android.internal.compat.IPlatformCompat {
        public Default() {}
        public void reportChange(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException {}
        public void reportChangeByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void reportChangeByUid(long p0, int p1) throws android.os.RemoteException {}
        public boolean isChangeEnabled(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException { return false; }
        public boolean isChangeEnabledByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isChangeEnabledByUid(long p0, int p1) throws android.os.RemoteException { return false; }
        public void setOverrides(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setOverridesForTest(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean clearOverride(long p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public int enableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int disableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public void clearOverrides(java.lang.String p0) throws android.os.RemoteException {}
        public void clearOverridesForTest(java.lang.String p0) throws android.os.RemoteException {}
        public com.android.internal.compat.CompatibilityChangeConfig getAppConfig(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException { return null; }
        public com.android.internal.compat.CompatibilityChangeInfo[] listAllChanges() throws android.os.RemoteException { return null; }
        public com.android.internal.compat.CompatibilityChangeInfo[] listUIChanges() throws android.os.RemoteException { return null; }
        public com.android.internal.compat.IOverrideValidator getOverrideValidator() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.compat.IPlatformCompat {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.compat.IPlatformCompat";
        static final int TRANSACTION_reportChange = 1;
        static final int TRANSACTION_reportChangeByPackageName = 2;
        static final int TRANSACTION_reportChangeByUid = 3;
        static final int TRANSACTION_isChangeEnabled = 4;
        static final int TRANSACTION_isChangeEnabledByPackageName = 5;
        static final int TRANSACTION_isChangeEnabledByUid = 6;
        static final int TRANSACTION_setOverrides = 7;
        static final int TRANSACTION_setOverridesForTest = 8;
        static final int TRANSACTION_clearOverride = 9;
        static final int TRANSACTION_enableTargetSdkChanges = 10;
        static final int TRANSACTION_disableTargetSdkChanges = 11;
        static final int TRANSACTION_clearOverrides = 12;
        static final int TRANSACTION_clearOverridesForTest = 13;
        static final int TRANSACTION_getAppConfig = 14;
        static final int TRANSACTION_listAllChanges = 15;
        static final int TRANSACTION_listUIChanges = 16;
        static final int TRANSACTION_getOverrideValidator = 17;
        public Stub() { super(); }
        public static com.android.internal.compat.IPlatformCompat asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.compat.IPlatformCompat p0) { return false; }
        public static com.android.internal.compat.IPlatformCompat getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.compat.IPlatformCompat {
            private android.os.IBinder mRemote;
            public static com.android.internal.compat.IPlatformCompat sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void reportChange(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException {}
            public void reportChangeByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void reportChangeByUid(long p0, int p1) throws android.os.RemoteException {}
            public boolean isChangeEnabled(long p0, android.content.pm.ApplicationInfo p1) throws android.os.RemoteException { return false; }
            public boolean isChangeEnabledByPackageName(long p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isChangeEnabledByUid(long p0, int p1) throws android.os.RemoteException { return false; }
            public void setOverrides(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setOverridesForTest(com.android.internal.compat.CompatibilityChangeConfig p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean clearOverride(long p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public int enableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int disableTargetSdkChanges(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public void clearOverrides(java.lang.String p0) throws android.os.RemoteException {}
            public void clearOverridesForTest(java.lang.String p0) throws android.os.RemoteException {}
            public com.android.internal.compat.CompatibilityChangeConfig getAppConfig(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException { return null; }
            public com.android.internal.compat.CompatibilityChangeInfo[] listAllChanges() throws android.os.RemoteException { return null; }
            public com.android.internal.compat.CompatibilityChangeInfo[] listUIChanges() throws android.os.RemoteException { return null; }
            public com.android.internal.compat.IOverrideValidator getOverrideValidator() throws android.os.RemoteException { return null; }
        }
    }
}
