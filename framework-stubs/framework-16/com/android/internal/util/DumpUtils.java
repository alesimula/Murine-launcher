package com.android.internal.util;

public final class DumpUtils {
    public static final android.content.ComponentName[] CRITICAL_SECTION_COMPONENTS = null;
    public static void dumpAsync(android.os.Handler p0, com.android.internal.util.DumpUtils.Dump p1, java.io.PrintWriter p2, java.lang.String p3, long p4) {}
    public static boolean checkDumpPermission(android.content.Context p0, java.lang.String p1, java.io.PrintWriter p2) { return false; }
    public static boolean checkUsageStatsPermission(android.content.Context p0, java.lang.String p1, java.io.PrintWriter p2) { return false; }
    public static boolean checkDumpAndUsageStatsPermission(android.content.Context p0, java.lang.String p1, java.io.PrintWriter p2) { return false; }
    public static boolean isPlatformPackage(java.lang.String p0) { return false; }
    public static boolean isPlatformPackage(android.content.ComponentName p0) { return false; }
    public static boolean isPlatformPackage(android.content.ComponentName.WithComponentName p0) { return false; }
    public static boolean isNonPlatformPackage(java.lang.String p0) { return false; }
    public static boolean isNonPlatformPackage(android.content.ComponentName p0) { return false; }
    public static boolean isNonPlatformPackage(android.content.ComponentName.WithComponentName p0) { return false; }
    public static boolean isPlatformCriticalPackage(android.content.ComponentName.WithComponentName p0) { return false; }
    public static boolean isPlatformNonCriticalPackage(android.content.ComponentName.WithComponentName p0) { return false; }
    public static <TRec extends android.content.ComponentName.WithComponentName> java.util.function.Predicate<TRec> filterRecord(java.lang.String p0) { return null; }
    public static void dumpSparseArray(java.io.PrintWriter p0, java.lang.String p1, android.util.SparseArray<?> p2, java.lang.String p3) {}
    public static <T extends java.lang.Object> void dumpSparseArrayValues(java.io.PrintWriter p0, java.lang.String p1, android.util.SparseArray<T> p2, java.lang.String p3) {}
    public static <T extends java.lang.Object> void dumpSparseArray(java.io.PrintWriter p0, java.lang.String p1, android.util.SparseArray<T> p2, java.lang.String p3, com.android.internal.util.DumpUtils.KeyDumper p4, com.android.internal.util.DumpUtils.ValueDumper<T> p5) {}

    public static interface Dump {
        public void dump(java.io.PrintWriter p0, java.lang.String p1);
    }

    public static interface KeyDumper {
        public void dump(int p0, int p1);
    }

    public static interface ValueDumper<T extends java.lang.Object> {
        public void dump(T p0);
    }
}
