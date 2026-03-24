package com.android.internal.content;

public class InstallLocationUtils {
    public static final int RECOMMEND_INSTALL_INTERNAL = 1;
    public static final int RECOMMEND_INSTALL_EXTERNAL = 2;
    public static final int RECOMMEND_INSTALL_EPHEMERAL = 3;
    public static final int RECOMMEND_FAILED_INSUFFICIENT_STORAGE = -1;
    public static final int RECOMMEND_FAILED_INVALID_APK = -2;
    public static final int RECOMMEND_FAILED_INVALID_LOCATION = -3;
    public static final int RECOMMEND_FAILED_ALREADY_EXISTS = -4;
    public static final int RECOMMEND_MEDIA_UNAVAILABLE = -5;
    public static final int RECOMMEND_FAILED_INVALID_URI = -6;
    public static final int APP_INSTALL_AUTO = 0;
    public static final int APP_INSTALL_INTERNAL = 1;
    public static final int APP_INSTALL_EXTERNAL = 2;
    public InstallLocationUtils() {}
    public static android.os.storage.IStorageManager getStorageManager() throws android.os.RemoteException { return null; }
    @java.lang.Deprecated
    public static java.lang.String resolveInstallVolume(android.content.Context p0, java.lang.String p1, int p2, long p3, com.android.internal.content.InstallLocationUtils.TestableInterface p4) throws java.io.IOException { return null; }
    public static java.lang.String resolveInstallVolume(android.content.Context p0, android.content.pm.PackageInstaller.SessionParams p1) throws java.io.IOException { return null; }
    public static java.lang.String resolveInstallVolume(android.content.Context p0, android.content.pm.PackageInstaller.SessionParams p1, com.android.internal.content.InstallLocationUtils.TestableInterface p2) throws java.io.IOException { return null; }
    public static boolean fitsOnInternal(android.content.Context p0, android.content.pm.PackageInstaller.SessionParams p1) throws java.io.IOException { return false; }
    public static boolean fitsOnExternal(android.content.Context p0, android.content.pm.PackageInstaller.SessionParams p1) { return false; }
    public static int resolveInstallLocation(android.content.Context p0, android.content.pm.PackageInstaller.SessionParams p1) throws java.io.IOException { return 0; }
    @java.lang.Deprecated
    public static long calculateInstalledSize(android.content.pm.parsing.PackageLite p0, boolean p1, java.lang.String p2) throws java.io.IOException { return 0L; }
    public static long calculateInstalledSize(android.content.pm.parsing.PackageLite p0, java.lang.String p1) throws java.io.IOException { return 0L; }
    public static long calculateInstalledSize(android.content.pm.parsing.PackageLite p0, java.lang.String p1, java.io.FileDescriptor p2) throws java.io.IOException { return 0L; }
    @java.lang.Deprecated
    public static long calculateInstalledSize(android.content.pm.parsing.PackageLite p0, boolean p1, com.android.internal.content.NativeLibraryHelper.Handle p2, java.lang.String p3) throws java.io.IOException { return 0L; }
    public static long calculateInstalledSize(android.content.pm.parsing.PackageLite p0, com.android.internal.content.NativeLibraryHelper.Handle p1, java.lang.String p2) throws java.io.IOException { return 0L; }
    public static java.lang.String replaceEnd(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public static int translateAllocateFlags(int p0) { return 0; }
    public static int installLocationPolicy(int p0, int p1, int p2, boolean p3, boolean p4) { return 0; }
    public static int getInstallationErrorCode(int p0) { return 0; }

    public static abstract class TestableInterface {
        public TestableInterface() {}
        public abstract android.os.storage.StorageManager getStorageManager(android.content.Context p0);
        public abstract boolean getForceAllowOnExternalSetting(android.content.Context p0);
        public abstract boolean getAllow3rdPartyOnInternalConfig(android.content.Context p0);
        public abstract android.content.pm.ApplicationInfo getExistingAppInfo(android.content.Context p0, java.lang.String p1);
        public abstract java.io.File getDataDirectory();
    }
}
