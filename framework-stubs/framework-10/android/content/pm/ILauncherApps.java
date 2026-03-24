package android.content.pm;

public interface ILauncherApps extends android.os.IInterface {
    public void addOnAppsChangedListener(java.lang.String p0, android.content.pm.IOnAppsChangedListener p1) throws android.os.RemoteException;
    public void removeOnAppsChangedListener(android.content.pm.IOnAppsChangedListener p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getLauncherActivities(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public android.content.pm.ActivityInfo resolveActivity(java.lang.String p0, android.content.ComponentName p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void startSessionDetailsActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.pm.PackageInstaller.SessionInfo p2, android.graphics.Rect p3, android.os.Bundle p4, android.os.UserHandle p5) throws android.os.RemoteException;
    public void startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.ComponentName p2, android.graphics.Rect p3, android.os.Bundle p4, android.os.UserHandle p5) throws android.os.RemoteException;
    public void showAppDetailsAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.ComponentName p2, android.graphics.Rect p3, android.os.Bundle p4, android.os.UserHandle p5) throws android.os.RemoteException;
    public boolean isPackageEnabled(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public android.os.Bundle getSuspendedPackageLauncherExtras(java.lang.String p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public boolean isActivityEnabled(java.lang.String p0, android.content.ComponentName p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, java.lang.String p1, int p2, android.os.UserHandle p3) throws android.os.RemoteException;
    public android.content.pm.LauncherApps.AppUsageLimit getAppUsageLimit(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getShortcuts(java.lang.String p0, long p1, java.lang.String p2, java.util.List p3, android.content.ComponentName p4, int p5, android.os.UserHandle p6) throws android.os.RemoteException;
    public void pinShortcuts(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2, android.os.UserHandle p3) throws android.os.RemoteException;
    public boolean startShortcut(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.graphics.Rect p3, android.os.Bundle p4, int p5) throws android.os.RemoteException;
    public int getShortcutIconResId(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getShortcutIconFd(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public boolean hasShortcutHostPermission(java.lang.String p0) throws android.os.RemoteException;
    public boolean shouldHideFromSuggestions(java.lang.String p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getShortcutConfigActivities(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public android.content.IntentSender getShortcutConfigActivityIntent(java.lang.String p0, android.content.ComponentName p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void registerPackageInstallerCallback(java.lang.String p0, android.content.pm.IPackageInstallerCallback p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAllSessions(java.lang.String p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.content.pm.ILauncherApps {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.ILauncherApps";
        static final int TRANSACTION_addOnAppsChangedListener = 1;
        static final int TRANSACTION_removeOnAppsChangedListener = 2;
        static final int TRANSACTION_getLauncherActivities = 3;
        static final int TRANSACTION_resolveActivity = 4;
        static final int TRANSACTION_startSessionDetailsActivityAsUser = 5;
        static final int TRANSACTION_startActivityAsUser = 6;
        static final int TRANSACTION_showAppDetailsAsUser = 7;
        static final int TRANSACTION_isPackageEnabled = 8;
        static final int TRANSACTION_getSuspendedPackageLauncherExtras = 9;
        static final int TRANSACTION_isActivityEnabled = 10;
        static final int TRANSACTION_getApplicationInfo = 11;
        static final int TRANSACTION_getAppUsageLimit = 12;
        static final int TRANSACTION_getShortcuts = 13;
        static final int TRANSACTION_pinShortcuts = 14;
        static final int TRANSACTION_startShortcut = 15;
        static final int TRANSACTION_getShortcutIconResId = 16;
        static final int TRANSACTION_getShortcutIconFd = 17;
        static final int TRANSACTION_hasShortcutHostPermission = 18;
        static final int TRANSACTION_shouldHideFromSuggestions = 19;
        static final int TRANSACTION_getShortcutConfigActivities = 20;
        static final int TRANSACTION_getShortcutConfigActivityIntent = 21;
        static final int TRANSACTION_registerPackageInstallerCallback = 22;
        static final int TRANSACTION_getAllSessions = 23;
        public Stub() { super(); }
        public static android.content.pm.ILauncherApps asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.ILauncherApps p0) { return false; }
        public static android.content.pm.ILauncherApps getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.ILauncherApps {
            private android.os.IBinder mRemote;
            public static android.content.pm.ILauncherApps sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addOnAppsChangedListener(java.lang.String p0, android.content.pm.IOnAppsChangedListener p1) throws android.os.RemoteException {}
            public void removeOnAppsChangedListener(android.content.pm.IOnAppsChangedListener p0) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getLauncherActivities(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ActivityInfo resolveActivity(java.lang.String p0, android.content.ComponentName p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
            public void startSessionDetailsActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.pm.PackageInstaller.SessionInfo p2, android.graphics.Rect p3, android.os.Bundle p4, android.os.UserHandle p5) throws android.os.RemoteException {}
            public void startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.ComponentName p2, android.graphics.Rect p3, android.os.Bundle p4, android.os.UserHandle p5) throws android.os.RemoteException {}
            public void showAppDetailsAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.ComponentName p2, android.graphics.Rect p3, android.os.Bundle p4, android.os.UserHandle p5) throws android.os.RemoteException {}
            public boolean isPackageEnabled(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return false; }
            public android.os.Bundle getSuspendedPackageLauncherExtras(java.lang.String p0, android.os.UserHandle p1) throws android.os.RemoteException { return null; }
            public boolean isActivityEnabled(java.lang.String p0, android.content.ComponentName p1, android.os.UserHandle p2) throws android.os.RemoteException { return false; }
            public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, java.lang.String p1, int p2, android.os.UserHandle p3) throws android.os.RemoteException { return null; }
            public android.content.pm.LauncherApps.AppUsageLimit getAppUsageLimit(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getShortcuts(java.lang.String p0, long p1, java.lang.String p2, java.util.List p3, android.content.ComponentName p4, int p5, android.os.UserHandle p6) throws android.os.RemoteException { return null; }
            public void pinShortcuts(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2, android.os.UserHandle p3) throws android.os.RemoteException {}
            public boolean startShortcut(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.graphics.Rect p3, android.os.Bundle p4, int p5) throws android.os.RemoteException { return false; }
            public int getShortcutIconResId(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
            public android.os.ParcelFileDescriptor getShortcutIconFd(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return null; }
            public boolean hasShortcutHostPermission(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean shouldHideFromSuggestions(java.lang.String p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
            public android.content.pm.ParceledListSlice getShortcutConfigActivities(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
            public android.content.IntentSender getShortcutConfigActivityIntent(java.lang.String p0, android.content.ComponentName p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
            public void registerPackageInstallerCallback(java.lang.String p0, android.content.pm.IPackageInstallerCallback p1) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getAllSessions(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.content.pm.ILauncherApps {
        public Default() {}
        public void addOnAppsChangedListener(java.lang.String p0, android.content.pm.IOnAppsChangedListener p1) throws android.os.RemoteException {}
        public void removeOnAppsChangedListener(android.content.pm.IOnAppsChangedListener p0) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getLauncherActivities(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ActivityInfo resolveActivity(java.lang.String p0, android.content.ComponentName p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
        public void startSessionDetailsActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.pm.PackageInstaller.SessionInfo p2, android.graphics.Rect p3, android.os.Bundle p4, android.os.UserHandle p5) throws android.os.RemoteException {}
        public void startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.ComponentName p2, android.graphics.Rect p3, android.os.Bundle p4, android.os.UserHandle p5) throws android.os.RemoteException {}
        public void showAppDetailsAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.ComponentName p2, android.graphics.Rect p3, android.os.Bundle p4, android.os.UserHandle p5) throws android.os.RemoteException {}
        public boolean isPackageEnabled(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return false; }
        public android.os.Bundle getSuspendedPackageLauncherExtras(java.lang.String p0, android.os.UserHandle p1) throws android.os.RemoteException { return null; }
        public boolean isActivityEnabled(java.lang.String p0, android.content.ComponentName p1, android.os.UserHandle p2) throws android.os.RemoteException { return false; }
        public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, java.lang.String p1, int p2, android.os.UserHandle p3) throws android.os.RemoteException { return null; }
        public android.content.pm.LauncherApps.AppUsageLimit getAppUsageLimit(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getShortcuts(java.lang.String p0, long p1, java.lang.String p2, java.util.List p3, android.content.ComponentName p4, int p5, android.os.UserHandle p6) throws android.os.RemoteException { return null; }
        public void pinShortcuts(java.lang.String p0, java.lang.String p1, java.util.List<java.lang.String> p2, android.os.UserHandle p3) throws android.os.RemoteException {}
        public boolean startShortcut(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.graphics.Rect p3, android.os.Bundle p4, int p5) throws android.os.RemoteException { return false; }
        public int getShortcutIconResId(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
        public android.os.ParcelFileDescriptor getShortcutIconFd(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return null; }
        public boolean hasShortcutHostPermission(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean shouldHideFromSuggestions(java.lang.String p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
        public android.content.pm.ParceledListSlice getShortcutConfigActivities(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
        public android.content.IntentSender getShortcutConfigActivityIntent(java.lang.String p0, android.content.ComponentName p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
        public void registerPackageInstallerCallback(java.lang.String p0, android.content.pm.IPackageInstallerCallback p1) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getAllSessions(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
