package com.android.modules.utils.ravenwood;

public class RavenwoodHelper {
    public static boolean isRunningOnRavenwood() { return false; }
    public static java.lang.String getRavenwoodRuntimePath() { return null; }
    public static java.lang.String getRavenwoodAconfigStoragePath() { return null; }

    public static class RavenwoodInternal {
        public static final java.lang.String RAVENWOOD_VERSION_JAVA_SYSPROP = "android.ravenwood.version";
        public static final java.lang.String RAVENWOOD_RUNTIME_PATH_JAVA_SYSPROP = "android.ravenwood.runtime_path";
    }
}
