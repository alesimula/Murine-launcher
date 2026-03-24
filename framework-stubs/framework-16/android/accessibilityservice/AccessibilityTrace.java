package android.accessibilityservice;

public interface AccessibilityTrace {
    public static final java.lang.String NAME_ACCESSIBILITY_SERVICE_CONNECTION = "IAccessibilityServiceConnection";
    public static final java.lang.String NAME_ACCESSIBILITY_SERVICE_CLIENT = "IAccessibilityServiceClient";
    public static final java.lang.String NAME_ACCESSIBILITY_MANAGER = "IAccessibilityManager";
    public static final java.lang.String NAME_ACCESSIBILITY_MANAGER_CLIENT = "IAccessibilityManagerClient";
    public static final java.lang.String NAME_ACCESSIBILITY_INTERACTION_CONNECTION = "IAccessibilityInteractionConnection";
    public static final java.lang.String NAME_ACCESSIBILITY_INTERACTION_CONNECTION_CALLBACK = "IAccessibilityInteractionConnectionCallback";
    public static final java.lang.String NAME_REMOTE_MAGNIFICATION_ANIMATION_CALLBACK = "IRemoteMagnificationAnimationCallback";
    public static final java.lang.String NAME_MAGNIFICATION_CONNECTION = "IMagnificationConnection";
    public static final java.lang.String NAME_MAGNIFICATION_CONNECTION_CALLBACK = "IMagnificationConnectionCallback";
    public static final java.lang.String NAME_WINDOW_MANAGER_INTERNAL = "WindowManagerInternal";
    public static final java.lang.String NAME_WINDOWS_FOR_ACCESSIBILITY_CALLBACK = "WindowsForAccessibilityCallback";
    public static final java.lang.String NAME_MAGNIFICATION_CALLBACK = "MagnificationCallbacks";
    public static final java.lang.String NAME_INPUT_FILTER = "InputFilter";
    public static final java.lang.String NAME_GESTURE = "Gesture";
    public static final java.lang.String NAME_ACCESSIBILITY_SERVICE = "AccessibilityService";
    public static final java.lang.String NAME_PACKAGE_BROADCAST_RECEIVER = "PMBroadcastReceiver";
    public static final java.lang.String NAME_USER_BROADCAST_RECEIVER = "UserBroadcastReceiver";
    public static final java.lang.String NAME_FINGERPRINT = "FingerprintGesture";
    public static final java.lang.String NAME_ACCESSIBILITY_INTERACTION_CLIENT = "AccessibilityInteractionClient";
    public static final java.lang.String NAME_ALL_LOGGINGS = "AllLoggings";
    public static final java.lang.String NAME_NONE = "None";
    public static final long FLAGS_ACCESSIBILITY_SERVICE_CONNECTION = 1L;
    public static final long FLAGS_ACCESSIBILITY_SERVICE_CLIENT = 2L;
    public static final long FLAGS_ACCESSIBILITY_MANAGER = 4L;
    public static final long FLAGS_ACCESSIBILITY_MANAGER_CLIENT = 8L;
    public static final long FLAGS_ACCESSIBILITY_INTERACTION_CONNECTION = 16L;
    public static final long FLAGS_ACCESSIBILITY_INTERACTION_CONNECTION_CALLBACK = 32L;
    public static final long FLAGS_REMOTE_MAGNIFICATION_ANIMATION_CALLBACK = 64L;
    public static final long FLAGS_MAGNIFICATION_CONNECTION = 128L;
    public static final long FLAGS_MAGNIFICATION_CONNECTION_CALLBACK = 256L;
    public static final long FLAGS_WINDOW_MANAGER_INTERNAL = 512L;
    public static final long FLAGS_WINDOWS_FOR_ACCESSIBILITY_CALLBACK = 1024L;
    public static final long FLAGS_MAGNIFICATION_CALLBACK = 2048L;
    public static final long FLAGS_INPUT_FILTER = 4096L;
    public static final long FLAGS_GESTURE = 8192L;
    public static final long FLAGS_ACCESSIBILITY_SERVICE = 16384L;
    public static final long FLAGS_PACKAGE_BROADCAST_RECEIVER = 32768L;
    public static final long FLAGS_USER_BROADCAST_RECEIVER = 65536L;
    public static final long FLAGS_FINGERPRINT = 131072L;
    public static final long FLAGS_ACCESSIBILITY_INTERACTION_CLIENT = 262144L;
    public static final long FLAGS_LOGGING_NONE = 0L;
    public static final long FLAGS_LOGGING_ALL = -1L;
    public static final long FLAGS_ACCESSIBILITY_MANAGER_CLIENT_STATES = 278576L;
    public static final java.util.Map<java.lang.String, java.lang.Long> sNamesToFlags = null;
    public static long getLoggingFlagsFromNames(java.util.List<java.lang.String> p0) { return 0L; }
    public static java.util.List<java.lang.String> getNamesOfLoggingTypes(long p0) { return null; }
    public boolean isA11yTracingEnabled();
    public boolean isA11yTracingEnabledForTypes(long p0);
    public int getTraceStateForAccessibilityManagerClientState();
    public void startTrace(long p0);
    public void stopTrace();
    public void logTrace(java.lang.String p0, long p1);
    public void logTrace(java.lang.String p0, long p1, java.lang.String p2);
    public void logTrace(long p0, java.lang.String p1, long p2, java.lang.String p3, int p4, long p5, int p6, java.lang.StackTraceElement[] p7, java.util.Set<java.lang.String> p8);
}
