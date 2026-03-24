package android.app;

public interface IUiModeManager extends android.os.IInterface {
    public void addCallback(android.app.IUiModeManagerCallback p0) throws android.os.RemoteException;
    public void enableCarMode(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void disableCarMode(int p0) throws android.os.RemoteException;
    public void disableCarModeByCallingPackage(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getCurrentModeType() throws android.os.RemoteException;
    public void setNightMode(int p0) throws android.os.RemoteException;
    public int getNightMode() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_DAY_NIGHT_MODE")
    @android.annotation.EnforcePermission("android.permission.MODIFY_DAY_NIGHT_MODE")
    public void setNightModeCustomType(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_DAY_NIGHT_MODE")
    @android.annotation.EnforcePermission("android.permission.MODIFY_DAY_NIGHT_MODE")
    public int getNightModeCustomType() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_DAY_NIGHT_MODE")
    @android.annotation.EnforcePermission("android.permission.MODIFY_DAY_NIGHT_MODE")
    public void setAttentionModeThemeOverlay(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_DAY_NIGHT_MODE")
    @android.annotation.EnforcePermission("android.permission.MODIFY_DAY_NIGHT_MODE")
    public int getAttentionModeThemeOverlay() throws android.os.RemoteException;
    public void setApplicationNightMode(int p0) throws android.os.RemoteException;
    public boolean isUiModeLocked() throws android.os.RemoteException;
    public boolean isNightModeLocked() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MODIFY_DAY_NIGHT_MODE")
    public boolean setNightModeActivatedForCustomMode(int p0, boolean p1) throws android.os.RemoteException;
    public boolean setNightModeActivated(boolean p0) throws android.os.RemoteException;
    public long getCustomNightModeStart() throws android.os.RemoteException;
    public void setCustomNightModeStart(long p0) throws android.os.RemoteException;
    public long getCustomNightModeEnd() throws android.os.RemoteException;
    public void setCustomNightModeEnd(long p0) throws android.os.RemoteException;
    public boolean requestProjection(android.os.IBinder p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean releaseProjection(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.READ_PROJECTION_STATE")
    public void addOnProjectionStateChangedListener(android.app.IOnProjectionStateChangedListener p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.READ_PROJECTION_STATE")
    public void removeOnProjectionStateChangedListener(android.app.IOnProjectionStateChangedListener p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.READ_PROJECTION_STATE")
    public java.util.List<java.lang.String> getProjectingPackages(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.READ_PROJECTION_STATE")
    public int getActiveProjectionTypes() throws android.os.RemoteException;
    public float getContrast() throws android.os.RemoteException;
    public int getForceInvertState() throws android.os.RemoteException;

    public static class Default implements android.app.IUiModeManager {
        public Default() {}
        public void addCallback(android.app.IUiModeManagerCallback p0) throws android.os.RemoteException {}
        public void enableCarMode(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void disableCarMode(int p0) throws android.os.RemoteException {}
        public void disableCarModeByCallingPackage(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public int getCurrentModeType() throws android.os.RemoteException { return 0; }
        public void setNightMode(int p0) throws android.os.RemoteException {}
        public int getNightMode() throws android.os.RemoteException { return 0; }
        public void setNightModeCustomType(int p0) throws android.os.RemoteException {}
        public int getNightModeCustomType() throws android.os.RemoteException { return 0; }
        public void setAttentionModeThemeOverlay(int p0) throws android.os.RemoteException {}
        public int getAttentionModeThemeOverlay() throws android.os.RemoteException { return 0; }
        public void setApplicationNightMode(int p0) throws android.os.RemoteException {}
        public boolean isUiModeLocked() throws android.os.RemoteException { return false; }
        public boolean isNightModeLocked() throws android.os.RemoteException { return false; }
        public boolean setNightModeActivatedForCustomMode(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean setNightModeActivated(boolean p0) throws android.os.RemoteException { return false; }
        public long getCustomNightModeStart() throws android.os.RemoteException { return 0L; }
        public void setCustomNightModeStart(long p0) throws android.os.RemoteException {}
        public long getCustomNightModeEnd() throws android.os.RemoteException { return 0L; }
        public void setCustomNightModeEnd(long p0) throws android.os.RemoteException {}
        public boolean requestProjection(android.os.IBinder p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean releaseProjection(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void addOnProjectionStateChangedListener(android.app.IOnProjectionStateChangedListener p0, int p1) throws android.os.RemoteException {}
        public void removeOnProjectionStateChangedListener(android.app.IOnProjectionStateChangedListener p0) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getProjectingPackages(int p0) throws android.os.RemoteException { return null; }
        public int getActiveProjectionTypes() throws android.os.RemoteException { return 0; }
        public float getContrast() throws android.os.RemoteException { return 0.0f; }
        public int getForceInvertState() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IUiModeManager {
        public static final java.lang.String DESCRIPTOR = "android.app.IUiModeManager";
        static final int TRANSACTION_addCallback = 1;
        static final int TRANSACTION_enableCarMode = 2;
        static final int TRANSACTION_disableCarMode = 3;
        static final int TRANSACTION_disableCarModeByCallingPackage = 4;
        static final int TRANSACTION_getCurrentModeType = 5;
        static final int TRANSACTION_setNightMode = 6;
        static final int TRANSACTION_getNightMode = 7;
        static final int TRANSACTION_setNightModeCustomType = 8;
        static final int TRANSACTION_getNightModeCustomType = 9;
        static final int TRANSACTION_setAttentionModeThemeOverlay = 10;
        static final int TRANSACTION_getAttentionModeThemeOverlay = 11;
        static final int TRANSACTION_setApplicationNightMode = 12;
        static final int TRANSACTION_isUiModeLocked = 13;
        static final int TRANSACTION_isNightModeLocked = 14;
        static final int TRANSACTION_setNightModeActivatedForCustomMode = 15;
        static final int TRANSACTION_setNightModeActivated = 16;
        static final int TRANSACTION_getCustomNightModeStart = 17;
        static final int TRANSACTION_setCustomNightModeStart = 18;
        static final int TRANSACTION_getCustomNightModeEnd = 19;
        static final int TRANSACTION_setCustomNightModeEnd = 20;
        static final int TRANSACTION_requestProjection = 21;
        static final int TRANSACTION_releaseProjection = 22;
        static final int TRANSACTION_addOnProjectionStateChangedListener = 23;
        static final int TRANSACTION_removeOnProjectionStateChangedListener = 24;
        static final int TRANSACTION_getProjectingPackages = 25;
        static final int TRANSACTION_getActiveProjectionTypes = 26;
        static final int TRANSACTION_getContrast = 27;
        static final int TRANSACTION_getForceInvertState = 28;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.app.IUiModeManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setNightModeCustomType_enforcePermission() throws java.lang.SecurityException {}
        protected void getNightModeCustomType_enforcePermission() throws java.lang.SecurityException {}
        protected void setAttentionModeThemeOverlay_enforcePermission() throws java.lang.SecurityException {}
        protected void getAttentionModeThemeOverlay_enforcePermission() throws java.lang.SecurityException {}
        protected void addOnProjectionStateChangedListener_enforcePermission() throws java.lang.SecurityException {}
        protected void removeOnProjectionStateChangedListener_enforcePermission() throws java.lang.SecurityException {}
        protected void getProjectingPackages_enforcePermission() throws java.lang.SecurityException {}
        protected void getActiveProjectionTypes_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.IUiModeManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addCallback(android.app.IUiModeManagerCallback p0) throws android.os.RemoteException {}
            public void enableCarMode(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void disableCarMode(int p0) throws android.os.RemoteException {}
            public void disableCarModeByCallingPackage(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public int getCurrentModeType() throws android.os.RemoteException { return 0; }
            public void setNightMode(int p0) throws android.os.RemoteException {}
            public int getNightMode() throws android.os.RemoteException { return 0; }
            public void setNightModeCustomType(int p0) throws android.os.RemoteException {}
            public int getNightModeCustomType() throws android.os.RemoteException { return 0; }
            public void setAttentionModeThemeOverlay(int p0) throws android.os.RemoteException {}
            public int getAttentionModeThemeOverlay() throws android.os.RemoteException { return 0; }
            public void setApplicationNightMode(int p0) throws android.os.RemoteException {}
            public boolean isUiModeLocked() throws android.os.RemoteException { return false; }
            public boolean isNightModeLocked() throws android.os.RemoteException { return false; }
            public boolean setNightModeActivatedForCustomMode(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean setNightModeActivated(boolean p0) throws android.os.RemoteException { return false; }
            public long getCustomNightModeStart() throws android.os.RemoteException { return 0L; }
            public void setCustomNightModeStart(long p0) throws android.os.RemoteException {}
            public long getCustomNightModeEnd() throws android.os.RemoteException { return 0L; }
            public void setCustomNightModeEnd(long p0) throws android.os.RemoteException {}
            public boolean requestProjection(android.os.IBinder p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean releaseProjection(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void addOnProjectionStateChangedListener(android.app.IOnProjectionStateChangedListener p0, int p1) throws android.os.RemoteException {}
            public void removeOnProjectionStateChangedListener(android.app.IOnProjectionStateChangedListener p0) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getProjectingPackages(int p0) throws android.os.RemoteException { return null; }
            public int getActiveProjectionTypes() throws android.os.RemoteException { return 0; }
            public float getContrast() throws android.os.RemoteException { return 0.0f; }
            public int getForceInvertState() throws android.os.RemoteException { return 0; }
        }
    }
}
