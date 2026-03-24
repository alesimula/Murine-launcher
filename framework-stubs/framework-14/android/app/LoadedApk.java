package android.app;

public final class LoadedApk {
    static final java.lang.String TAG = "LoadedApk";
    static final boolean DEBUG = false;
    final java.lang.String mPackageName = null;
    android.content.res.Resources mResources;
    android.app.Application getApplication() { return null; }
    public LoadedApk(android.app.ActivityThread p0, android.content.pm.ApplicationInfo p1, android.content.res.CompatibilityInfo p2, java.lang.ClassLoader p3, boolean p4, boolean p5, boolean p6) {}
    LoadedApk(android.app.ActivityThread p0) {}
    void installSystemApplicationInfo(android.content.pm.ApplicationInfo p0, java.lang.ClassLoader p1) {}
    public android.app.AppComponentFactory getAppFactory() { return null; }
    public java.lang.String getPackageName() { return null; }
    public android.content.pm.ApplicationInfo getApplicationInfo() { return null; }
    public int getTargetSdkVersion() { return 0; }
    public boolean isSecurityViolation() { return false; }
    public android.content.res.CompatibilityInfo getCompatibilityInfo() { return null; }
    public void setCompatibilityInfo(android.content.res.CompatibilityInfo p0) {}
    public void updateApplicationInfo(android.content.pm.ApplicationInfo p0, java.util.List<java.lang.String> p1) {}
    void setSdkSandboxStorage(java.lang.String p0, java.lang.String p1) {}
    public static void makePaths(android.app.ActivityThread p0, android.content.pm.ApplicationInfo p1, java.util.List<java.lang.String> p2) {}
    public static void makePaths(android.app.ActivityThread p0, boolean p1, android.content.pm.ApplicationInfo p2, java.util.List<java.lang.String> p3, java.util.List<java.lang.String> p4) {}
    java.lang.ClassLoader getSplitClassLoader(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    java.lang.String[] getSplitPaths(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    java.lang.ClassLoader createSharedLibraryLoader(android.content.pm.SharedLibraryInfo p0, boolean p1, java.lang.String p2, java.lang.String p3) { return null; }
    public java.lang.ClassLoader getClassLoader() { return null; }
    public java.lang.String getAppDir() { return null; }
    public java.lang.String getLibDir() { return null; }
    public java.lang.String getResDir() { return null; }
    public java.lang.String[] getSplitAppDirs() { return null; }
    public java.lang.String[] getSplitResDirs() { return null; }
    public java.lang.String[] getOverlayDirs() { return null; }
    public java.lang.String[] getOverlayPaths() { return null; }
    public java.lang.String getDataDir() { return null; }
    public java.io.File getDataDirFile() { return null; }
    public java.io.File getDeviceProtectedDataDirFile() { return null; }
    public java.io.File getCredentialProtectedDataDirFile() { return null; }
    public android.content.res.AssetManager getAssets() { return null; }
    public android.content.res.Resources getResources() { return null; }
    public android.app.Application makeApplication(boolean p0, android.app.Instrumentation p1) { return null; }
    public android.app.Application makeApplicationInner(boolean p0, android.app.Instrumentation p1) { return null; }
    public void removeContextRegistrations(android.content.Context p0, java.lang.String p1, java.lang.String p2) {}
    public android.content.IIntentReceiver getReceiverDispatcher(android.content.BroadcastReceiver p0, android.content.Context p1, android.os.Handler p2, android.app.Instrumentation p3, boolean p4) { return null; }
    public android.content.IIntentReceiver forgetReceiverDispatcher(android.content.Context p0, android.content.BroadcastReceiver p1) { return null; }
    public final android.app.IServiceConnection getServiceDispatcher(android.content.ServiceConnection p0, android.content.Context p1, android.os.Handler p2, long p3) { return null; }
    public final android.app.IServiceConnection getServiceDispatcher(android.content.ServiceConnection p0, android.content.Context p1, java.util.concurrent.Executor p2, long p3) { return null; }
    public android.app.IServiceConnection lookupServiceDispatcher(android.content.ServiceConnection p0, android.content.Context p1) { return null; }
    public final android.app.IServiceConnection forgetServiceDispatcher(android.content.Context p0, android.content.ServiceConnection p1) { return null; }
    public static void checkAndUpdateApkPaths(android.content.pm.ApplicationInfo p0) {}

    static final class ReceiverDispatcher {
        final android.app.IApplicationThread mAppThread = null;
        final android.content.IIntentReceiver.Stub mIIntentReceiver = null;
        final android.content.BroadcastReceiver mReceiver = null;
        final android.content.Context mContext = null;
        final android.os.Handler mActivityThread = null;
        final android.app.Instrumentation mInstrumentation = null;
        final boolean mRegistered = false;
        final android.app.IntentReceiverLeaked mLocation = null;
        java.lang.RuntimeException mUnregisterLocation;
        boolean mForgotten;
        ReceiverDispatcher(android.app.IApplicationThread p0, android.content.BroadcastReceiver p1, android.content.Context p2, android.os.Handler p3, android.app.Instrumentation p4, boolean p5) {}
        void validate(android.content.Context p0, android.os.Handler p1) {}
        android.app.IntentReceiverLeaked getLocation() { return null; }
        android.content.BroadcastReceiver getIntentReceiver() { return null; }
        android.content.IIntentReceiver getIIntentReceiver() { return null; }
        void setUnregisterLocation(java.lang.RuntimeException p0) {}
        java.lang.RuntimeException getUnregisterLocation() { return null; }
        public void performReceive(android.content.Intent p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, boolean p5, boolean p6, int p7, int p8, java.lang.String p9) {}

        final class Args extends android.content.BroadcastReceiver.PendingResult {
            public Args(android.app.LoadedApk.ReceiverDispatcher p0, android.content.Intent p1, int p2, java.lang.String p3, android.os.Bundle p4, boolean p5, boolean p6, boolean p7, int p8, int p9, java.lang.String p10) { super(0, (java.lang.String)null, (android.os.Bundle)null, 0, false, false, (android.os.IBinder)null, 0, 0); }
            public final java.lang.Runnable getRunnable() { return null; }
        }

        static final class InnerReceiver extends android.content.IIntentReceiver.Stub {
            final android.app.IApplicationThread mApplicationThread = null;
            final java.lang.ref.WeakReference<android.app.LoadedApk.ReceiverDispatcher> mDispatcher = null;
            final android.app.LoadedApk.ReceiverDispatcher mStrongRef = null;
            InnerReceiver(android.app.IApplicationThread p0, android.app.LoadedApk.ReceiverDispatcher p1, boolean p2) { super(); }
            public void performReceive(android.content.Intent p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, boolean p5, int p6) {}
            public void performReceive(android.content.Intent p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, boolean p5, boolean p6, int p7, int p8, java.lang.String p9) {}
        }
    }

    static final class ServiceDispatcher {
        ServiceDispatcher(android.content.ServiceConnection p0, android.content.Context p1, android.os.Handler p2, long p3) {}
        ServiceDispatcher(android.content.ServiceConnection p0, android.content.Context p1, java.util.concurrent.Executor p2, long p3) {}
        void validate(android.content.Context p0, android.os.Handler p1, java.util.concurrent.Executor p2) {}
        void doForget() {}
        android.app.ServiceConnectionLeaked getLocation() { return null; }
        android.content.ServiceConnection getServiceConnection() { return null; }
        android.app.IServiceConnection getIServiceConnection() { return null; }
        long getFlags() { return 0L; }
        void setUnbindLocation(java.lang.RuntimeException p0) {}
        java.lang.RuntimeException getUnbindLocation() { return null; }
        public void connected(android.content.ComponentName p0, android.os.IBinder p1, boolean p2) {}
        public void death(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void doConnected(android.content.ComponentName p0, android.os.IBinder p1, boolean p2) {}
        public void doDeath(android.content.ComponentName p0, android.os.IBinder p1) {}

        private static class ConnectionInfo {
            android.os.IBinder binder;
            android.os.IBinder.DeathRecipient deathMonitor;
        }

        private final class DeathMonitor implements android.os.IBinder.DeathRecipient {
            final android.content.ComponentName mName = null;
            final android.os.IBinder mService = null;
            DeathMonitor(android.app.LoadedApk.ServiceDispatcher p0, android.content.ComponentName p1, android.os.IBinder p2) {}
            public void binderDied() {}
        }

        private static class InnerConnection extends android.app.IServiceConnection.Stub {
            final java.lang.ref.WeakReference<android.app.LoadedApk.ServiceDispatcher> mDispatcher = null;
            InnerConnection(android.app.LoadedApk.ServiceDispatcher p0) { super(); }
            public void connected(android.content.ComponentName p0, android.os.IBinder p1, boolean p2) throws android.os.RemoteException {}
        }

        private final class RunConnection implements java.lang.Runnable {
            final android.content.ComponentName mName = null;
            final android.os.IBinder mService = null;
            final int mCommand = 0;
            final boolean mDead = false;
            RunConnection(android.app.LoadedApk.ServiceDispatcher p0, android.content.ComponentName p1, android.os.IBinder p2, int p3, boolean p4) {}
            public void run() {}
        }
    }

    private class SplitDependencyLoaderImpl extends android.content.pm.split.SplitDependencyLoader<android.content.pm.PackageManager.NameNotFoundException> {
        SplitDependencyLoaderImpl(android.util.SparseArray<int[]> p0) { super(null); }
        protected boolean isSplitCached(int p0) { return false; }
        protected void constructSplit(int p0, int[] p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException {}
        java.lang.ClassLoader getClassLoaderForSplit(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
        java.lang.String[] getSplitPathsForSplit(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    }

    private static class WarningContextClassLoader extends java.lang.ClassLoader {
        public java.net.URL getResource(java.lang.String p0) { return null; }
        public java.util.Enumeration<java.net.URL> getResources(java.lang.String p0) throws java.io.IOException { return null; }
        public java.io.InputStream getResourceAsStream(java.lang.String p0) { return null; }
        public java.lang.Class<?> loadClass(java.lang.String p0) throws java.lang.ClassNotFoundException { return null; }
        public void setClassAssertionStatus(java.lang.String p0, boolean p1) {}
        public void setPackageAssertionStatus(java.lang.String p0, boolean p1) {}
        public void setDefaultAssertionStatus(boolean p0) {}
        public void clearAssertionStatus() {}
    }
}
