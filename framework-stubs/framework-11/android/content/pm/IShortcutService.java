package android.content.pm;

public interface IShortcutService extends android.os.IInterface {
    public boolean setDynamicShortcuts(java.lang.String p0, android.content.pm.ParceledListSlice p1, int p2) throws android.os.RemoteException;
    public boolean addDynamicShortcuts(java.lang.String p0, android.content.pm.ParceledListSlice p1, int p2) throws android.os.RemoteException;
    public void removeDynamicShortcuts(java.lang.String p0, java.util.List p1, int p2) throws android.os.RemoteException;
    public void removeAllDynamicShortcuts(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean updateShortcuts(java.lang.String p0, android.content.pm.ParceledListSlice p1, int p2) throws android.os.RemoteException;
    public boolean requestPinShortcut(java.lang.String p0, android.content.pm.ShortcutInfo p1, android.content.IntentSender p2, int p3) throws android.os.RemoteException;
    public android.content.Intent createShortcutResultIntent(java.lang.String p0, android.content.pm.ShortcutInfo p1, int p2) throws android.os.RemoteException;
    public void disableShortcuts(java.lang.String p0, java.util.List p1, java.lang.CharSequence p2, int p3, int p4) throws android.os.RemoteException;
    public void enableShortcuts(java.lang.String p0, java.util.List p1, int p2) throws android.os.RemoteException;
    public int getMaxShortcutCountPerActivity(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getRemainingCallCount(java.lang.String p0, int p1) throws android.os.RemoteException;
    public long getRateLimitResetTime(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getIconMaxDimensions(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void reportShortcutUsed(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void resetThrottling() throws android.os.RemoteException;
    public void onApplicationActive(java.lang.String p0, int p1) throws android.os.RemoteException;
    public byte[] getBackupPayload(int p0) throws android.os.RemoteException;
    public void applyRestore(byte[] p0, int p1) throws android.os.RemoteException;
    public boolean isRequestPinItemSupported(int p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getShareTargets(java.lang.String p0, android.content.IntentFilter p1, int p2) throws android.os.RemoteException;
    public boolean hasShareTargets(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void removeLongLivedShortcuts(java.lang.String p0, java.util.List p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getShortcuts(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void pushDynamicShortcut(java.lang.String p0, android.content.pm.ShortcutInfo p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.content.pm.IShortcutService {
        public Default() {}
        public boolean setDynamicShortcuts(java.lang.String p0, android.content.pm.ParceledListSlice p1, int p2) throws android.os.RemoteException { return false; }
        public boolean addDynamicShortcuts(java.lang.String p0, android.content.pm.ParceledListSlice p1, int p2) throws android.os.RemoteException { return false; }
        public void removeDynamicShortcuts(java.lang.String p0, java.util.List p1, int p2) throws android.os.RemoteException {}
        public void removeAllDynamicShortcuts(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean updateShortcuts(java.lang.String p0, android.content.pm.ParceledListSlice p1, int p2) throws android.os.RemoteException { return false; }
        public boolean requestPinShortcut(java.lang.String p0, android.content.pm.ShortcutInfo p1, android.content.IntentSender p2, int p3) throws android.os.RemoteException { return false; }
        public android.content.Intent createShortcutResultIntent(java.lang.String p0, android.content.pm.ShortcutInfo p1, int p2) throws android.os.RemoteException { return null; }
        public void disableShortcuts(java.lang.String p0, java.util.List p1, java.lang.CharSequence p2, int p3, int p4) throws android.os.RemoteException {}
        public void enableShortcuts(java.lang.String p0, java.util.List p1, int p2) throws android.os.RemoteException {}
        public int getMaxShortcutCountPerActivity(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int getRemainingCallCount(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public long getRateLimitResetTime(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
        public int getIconMaxDimensions(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public void reportShortcutUsed(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void resetThrottling() throws android.os.RemoteException {}
        public void onApplicationActive(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public byte[] getBackupPayload(int p0) throws android.os.RemoteException { return null; }
        public void applyRestore(byte[] p0, int p1) throws android.os.RemoteException {}
        public boolean isRequestPinItemSupported(int p0, int p1) throws android.os.RemoteException { return false; }
        public android.content.pm.ParceledListSlice getShareTargets(java.lang.String p0, android.content.IntentFilter p1, int p2) throws android.os.RemoteException { return null; }
        public boolean hasShareTargets(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public void removeLongLivedShortcuts(java.lang.String p0, java.util.List p1, int p2) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getShortcuts(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public void pushDynamicShortcut(java.lang.String p0, android.content.pm.ShortcutInfo p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IShortcutService {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.IShortcutService";
        static final int TRANSACTION_setDynamicShortcuts = 1;
        static final int TRANSACTION_addDynamicShortcuts = 2;
        static final int TRANSACTION_removeDynamicShortcuts = 3;
        static final int TRANSACTION_removeAllDynamicShortcuts = 4;
        static final int TRANSACTION_updateShortcuts = 5;
        static final int TRANSACTION_requestPinShortcut = 6;
        static final int TRANSACTION_createShortcutResultIntent = 7;
        static final int TRANSACTION_disableShortcuts = 8;
        static final int TRANSACTION_enableShortcuts = 9;
        static final int TRANSACTION_getMaxShortcutCountPerActivity = 10;
        static final int TRANSACTION_getRemainingCallCount = 11;
        static final int TRANSACTION_getRateLimitResetTime = 12;
        static final int TRANSACTION_getIconMaxDimensions = 13;
        static final int TRANSACTION_reportShortcutUsed = 14;
        static final int TRANSACTION_resetThrottling = 15;
        static final int TRANSACTION_onApplicationActive = 16;
        static final int TRANSACTION_getBackupPayload = 17;
        static final int TRANSACTION_applyRestore = 18;
        static final int TRANSACTION_isRequestPinItemSupported = 19;
        static final int TRANSACTION_getShareTargets = 20;
        static final int TRANSACTION_hasShareTargets = 21;
        static final int TRANSACTION_removeLongLivedShortcuts = 22;
        static final int TRANSACTION_getShortcuts = 23;
        static final int TRANSACTION_pushDynamicShortcut = 24;
        public Stub() { super(); }
        public static android.content.pm.IShortcutService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IShortcutService p0) { return false; }
        public static android.content.pm.IShortcutService getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IShortcutService {
            private android.os.IBinder mRemote;
            public static android.content.pm.IShortcutService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean setDynamicShortcuts(java.lang.String p0, android.content.pm.ParceledListSlice p1, int p2) throws android.os.RemoteException { return false; }
            public boolean addDynamicShortcuts(java.lang.String p0, android.content.pm.ParceledListSlice p1, int p2) throws android.os.RemoteException { return false; }
            public void removeDynamicShortcuts(java.lang.String p0, java.util.List p1, int p2) throws android.os.RemoteException {}
            public void removeAllDynamicShortcuts(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean updateShortcuts(java.lang.String p0, android.content.pm.ParceledListSlice p1, int p2) throws android.os.RemoteException { return false; }
            public boolean requestPinShortcut(java.lang.String p0, android.content.pm.ShortcutInfo p1, android.content.IntentSender p2, int p3) throws android.os.RemoteException { return false; }
            public android.content.Intent createShortcutResultIntent(java.lang.String p0, android.content.pm.ShortcutInfo p1, int p2) throws android.os.RemoteException { return null; }
            public void disableShortcuts(java.lang.String p0, java.util.List p1, java.lang.CharSequence p2, int p3, int p4) throws android.os.RemoteException {}
            public void enableShortcuts(java.lang.String p0, java.util.List p1, int p2) throws android.os.RemoteException {}
            public int getMaxShortcutCountPerActivity(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int getRemainingCallCount(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public long getRateLimitResetTime(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
            public int getIconMaxDimensions(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public void reportShortcutUsed(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void resetThrottling() throws android.os.RemoteException {}
            public void onApplicationActive(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public byte[] getBackupPayload(int p0) throws android.os.RemoteException { return null; }
            public void applyRestore(byte[] p0, int p1) throws android.os.RemoteException {}
            public boolean isRequestPinItemSupported(int p0, int p1) throws android.os.RemoteException { return false; }
            public android.content.pm.ParceledListSlice getShareTargets(java.lang.String p0, android.content.IntentFilter p1, int p2) throws android.os.RemoteException { return null; }
            public boolean hasShareTargets(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public void removeLongLivedShortcuts(java.lang.String p0, java.util.List p1, int p2) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getShortcuts(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public void pushDynamicShortcut(java.lang.String p0, android.content.pm.ShortcutInfo p1, int p2) throws android.os.RemoteException {}
        }
    }
}
