package android.os;

public class GraphicsEnvironment {
    private static final android.os.GraphicsEnvironment sInstance = null;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "GraphicsEnvironment";
    private static final java.lang.String SYSTEM_DRIVER_NAME = "system";
    private static final java.lang.String SYSTEM_DRIVER_VERSION_NAME = "";
    private static final long SYSTEM_DRIVER_VERSION_CODE = 0L;
    private static final java.lang.String PROPERTY_GFX_DRIVER = "ro.gfx.driver.0";
    private static final java.lang.String PROPERTY_GFX_DRIVER_PRERELEASE = "ro.gfx.driver.1";
    private static final java.lang.String PROPERTY_GFX_DRIVER_BUILD_TIME = "ro.gfx.driver_build_time";
    private static final java.lang.String METADATA_DRIVER_BUILD_TIME = "com.android.gamedriver.build_time";
    private static final java.lang.String ANGLE_RULES_FILE = "a4a_rules.json";
    private static final java.lang.String ANGLE_TEMP_RULES = "debug.angle.rules";
    private static final java.lang.String ACTION_ANGLE_FOR_ANDROID = "android.app.action.ANGLE_FOR_ANDROID";
    private static final java.lang.String ACTION_ANGLE_FOR_ANDROID_TOAST_MESSAGE = "android.app.action.ANGLE_FOR_ANDROID_TOAST_MESSAGE";
    private static final java.lang.String INTENT_KEY_A4A_TOAST_MESSAGE = "A4A Toast Message";
    private static final java.lang.String GAME_DRIVER_WHITELIST_ALL = "*";
    private static final java.lang.String GAME_DRIVER_SPHAL_LIBRARIES_FILENAME = "sphal_libraries.txt";
    private static final int VULKAN_1_0 = 4194304;
    private static final int VULKAN_1_1 = 4198400;
    private static final int GAME_DRIVER_GLOBAL_OPT_IN_DEFAULT = 0;
    private static final int GAME_DRIVER_GLOBAL_OPT_IN_GAME_DRIVER = 1;
    private static final int GAME_DRIVER_GLOBAL_OPT_IN_PRERELEASE_DRIVER = 2;
    private static final int GAME_DRIVER_GLOBAL_OPT_IN_OFF = 3;
    private java.lang.ClassLoader mClassLoader;
    private java.lang.String mLayerPath;
    private java.lang.String mDebugLayerPath;
    private static final java.util.Map<android.os.GraphicsEnvironment.OpenGlDriverChoice, java.lang.String> sDriverMap = null;
    public GraphicsEnvironment() {}
    public static android.os.GraphicsEnvironment getInstance() { return null; }
    public void setup(android.content.Context p0, android.os.Bundle p1) {}
    public static native void hintActivityLaunch();
    public static boolean shouldUseAngle(android.content.Context p0, android.os.Bundle p1, java.lang.String p2) { return false; }
    private static int getVulkanVersion(android.content.pm.PackageManager p0) { return 0; }
    private static boolean isDebuggable(android.content.Context p0) { return false; }
    public void setLayerPaths(java.lang.ClassLoader p0, java.lang.String p1, java.lang.String p2) {}
    private static java.lang.String getDebugLayerAppPaths(android.content.pm.PackageManager p0, java.lang.String p1) { return null; }
    private void setupGpuLayers(android.content.Context p0, android.os.Bundle p1, android.content.pm.PackageManager p2, java.lang.String p3) {}
    private static java.util.Map<android.os.GraphicsEnvironment.OpenGlDriverChoice, java.lang.String> buildMap() { return null; }
    private static java.util.List<java.lang.String> getGlobalSettingsString(android.content.ContentResolver p0, android.os.Bundle p1, java.lang.String p2) { return null; }
    private static int getGlobalSettingsPkgIndex(java.lang.String p0, java.util.List<java.lang.String> p1) { return 0; }
    private static java.lang.String getDriverForPkg(android.content.Context p0, android.os.Bundle p1, java.lang.String p2) { return null; }
    private java.lang.String getAnglePackageName(android.content.pm.PackageManager p0) { return null; }
    private java.lang.String getAngleDebugPackage(android.content.Context p0, android.os.Bundle p1) { return null; }
    private static boolean setupAngleWithTempRulesFile(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return false; }
    private static boolean setupAngleRulesApk(java.lang.String p0, android.content.pm.ApplicationInfo p1, android.content.pm.PackageManager p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) { return false; }
    private static boolean checkAngleWhitelist(android.content.Context p0, android.os.Bundle p1, java.lang.String p2) { return false; }
    public boolean setupAngle(android.content.Context p0, android.os.Bundle p1, android.content.pm.PackageManager p2, java.lang.String p3) { return false; }
    private boolean shouldShowAngleInUseDialogBox(android.content.Context p0) { return false; }
    private boolean setupAndUseAngle(android.content.Context p0, java.lang.String p1) { return false; }
    public void showAngleInUseDialogBox(android.content.Context p0) {}
    private static java.lang.String chooseDriverInternal(android.content.Context p0, android.os.Bundle p1) { return null; }
    private static boolean chooseDriver(android.content.Context p0, android.os.Bundle p1, android.content.pm.PackageManager p2, java.lang.String p3) { return false; }
    private static java.lang.String chooseAbi(android.content.pm.ApplicationInfo p0) { return null; }
    private static java.lang.String getSphalLibraries(android.content.Context p0, java.lang.String p1) { return null; }
    private static native int getCanLoadSystemLibraries();
    private static native void setLayerPaths(java.lang.ClassLoader p0, java.lang.String p1);
    private static native void setDebugLayers(java.lang.String p0);
    private static native void setDebugLayersGLES(java.lang.String p0);
    private static native void setDriverPathAndSphalLibraries(java.lang.String p0, java.lang.String p1);
    private static native void setGpuStats(java.lang.String p0, java.lang.String p1, long p2, long p3, java.lang.String p4, int p5);
    private static native void setAngleInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.io.FileDescriptor p3, long p4, long p5);
    private static native boolean getShouldUseAngle(java.lang.String p0);

    static enum OpenGlDriverChoice {
        DEFAULT,
        NATIVE,
        ANGLE;
        private OpenGlDriverChoice() {}
    }
}
