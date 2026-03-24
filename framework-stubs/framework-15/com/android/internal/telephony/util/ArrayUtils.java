package com.android.internal.telephony.util;

public final class ArrayUtils {
    @android.annotation.NonNull
    public static <T extends java.lang.Object> T[] appendElement(java.lang.Class<T> p0, T[] p1, T p2) { return null; }
    @android.annotation.NonNull
    public static <T extends java.lang.Object> T[] appendElement(java.lang.Class<T> p0, T[] p1, T p2, boolean p3) { return null; }
    @android.annotation.NonNull
    public static <T extends java.lang.Object> T[] concatElements(java.lang.Class<T> p0, T[]... p1) { return null; }
    public static boolean contains(char[] p0, char p1) { return false; }
    public static <T extends java.lang.Object> boolean contains(java.util.Collection<T> p0, T p1) { return false; }
    public static boolean contains(int[] p0, int p1) { return false; }
    public static boolean contains(long[] p0, long p1) { return false; }
    public static <T extends java.lang.Object> boolean contains(T[] p0, T p1) { return false; }
    public static <T extends java.lang.Object> int indexOf(T[] p0, T p1) { return 0; }
    public static boolean isEmpty(java.util.Collection<?> p0) { return false; }
    public static boolean isEmpty(java.util.Map<?, ?> p0) { return false; }
    public static <T extends java.lang.Object> boolean isEmpty(T[] p0) { return false; }
    public static boolean isEmpty(int[] p0) { return false; }
    public static boolean isEmpty(long[] p0) { return false; }
    public static boolean isEmpty(byte[] p0) { return false; }
    public static boolean isEmpty(boolean[] p0) { return false; }

    private static final class EmptyArray {
        public static final java.lang.Object[] OBJECT = null;
        public static final java.lang.String[] STRING = null;
    }
}
