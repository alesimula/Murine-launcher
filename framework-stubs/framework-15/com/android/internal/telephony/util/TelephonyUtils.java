package com.android.internal.telephony.util;

public final class TelephonyUtils {
    public static boolean IS_USER;
    public static boolean IS_DEBUGGABLE;
    public static final java.util.concurrent.Executor DIRECT_EXECUTOR = null;
    public TelephonyUtils() {}
    public static boolean checkDumpPermission(android.content.Context p0, java.lang.String p1, java.io.PrintWriter p2) { return false; }
    public static java.lang.String emptyIfNull(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static <T extends java.lang.Object> java.util.List<T> emptyIfNull(java.util.List<T> p0) { return null; }
    public static android.content.pm.ComponentInfo getComponentInfo(android.content.pm.ResolveInfo p0) { return null; }
    public static void runWithCleanCallingIdentity(java.lang.Runnable p0) {}
    public static void runWithCleanCallingIdentity(java.lang.Runnable p0, java.util.concurrent.Executor p1) {}
    public static <T extends java.lang.Object> T runWithCleanCallingIdentity(java.util.function.Supplier<T> p0) { return null; }
    public static android.os.Bundle filterValues(android.os.Bundle p0) { return null; }
    public static void waitUntilReady(java.util.concurrent.CountDownLatch p0, long p1) {}
    public static java.lang.String dataStateToString(int p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String mobileDataPolicyToString(int p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String apnEditedStatusToString(int p0) { return null; }
    @android.annotation.Nullable
    public static android.os.UserHandle getSubscriptionUserHandle(android.content.Context p0, int p1) { return null; }
    public static void showSwitchToManagedProfileDialogIfAppropriate(android.content.Context p0, int p1, int p2, java.lang.String p3) {}
    public static boolean isValidCountryCode(java.lang.String p0) { return false; }
    public static boolean isValidPlmn(java.lang.String p0) { return false; }
    public static boolean isValidService(int p0) { return false; }
}
