package com.android.internal.util;

public class Preconditions {
    public Preconditions() {}
    @android.annotation.UnsupportedAppUsage
    public static void checkArgument(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public static void checkArgument(boolean p0, java.lang.Object p1) {}
    public static void checkArgument(boolean p0, java.lang.String p1, java.lang.Object... p2) {}
    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(T p0) { return null; }
    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(T p0, java.lang.Object p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static <T extends java.lang.Object> T checkNotNull(T p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static <T extends java.lang.Object> T checkNotNull(T p0, java.lang.Object p1) { return null; }
    public static <T extends java.lang.Object> T checkNotNull(T p0, java.lang.String p1, java.lang.Object... p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static void checkState(boolean p0, java.lang.String p1) {}
    @android.annotation.UnsupportedAppUsage
    public static void checkState(boolean p0) {}
    public static int checkFlagsArgument(int p0, int p1) { return 0; }
    public static int checkArgumentNonnegative(int p0, java.lang.String p1) { return 0; }
    public static int checkArgumentNonnegative(int p0) { return 0; }
    public static long checkArgumentNonnegative(long p0) { return 0L; }
    public static long checkArgumentNonnegative(long p0, java.lang.String p1) { return 0L; }
    public static int checkArgumentPositive(int p0, java.lang.String p1) { return 0; }
    public static float checkArgumentNonNegative(float p0, java.lang.String p1) { return 0.0f; }
    public static float checkArgumentPositive(float p0, java.lang.String p1) { return 0.0f; }
    public static float checkArgumentFinite(float p0, java.lang.String p1) { return 0.0f; }
    public static float checkArgumentInRange(float p0, float p1, float p2, java.lang.String p3) { return 0.0f; }
    @android.annotation.UnsupportedAppUsage
    public static int checkArgumentInRange(int p0, int p1, int p2, java.lang.String p3) { return 0; }
    public static long checkArgumentInRange(long p0, long p1, long p2, java.lang.String p3) { return 0L; }
    public static <T extends java.lang.Object> T[] checkArrayElementsNotNull(T[] p0, java.lang.String p1) { return null; }
    public static <C extends java.util.Collection<T>, T extends java.lang.Object> C checkCollectionElementsNotNull(C p0, java.lang.String p1) { return null; }
    public static <T extends java.lang.Object> java.util.Collection<T> checkCollectionNotEmpty(java.util.Collection<T> p0, java.lang.String p1) { return null; }
    public static float[] checkArrayElementsInRange(float[] p0, float p1, float p2, java.lang.String p3) { return null; }
    public static int[] checkArrayElementsInRange(int[] p0, int p1, int p2, java.lang.String p3) { return null; }
}
