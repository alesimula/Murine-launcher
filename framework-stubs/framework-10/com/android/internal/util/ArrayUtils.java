package com.android.internal.util;

public class ArrayUtils {
    private static final int CACHE_SIZE = 73;
    private static java.lang.Object[] sCache;
    public static final java.io.File[] EMPTY_FILE = null;
    private ArrayUtils() {}
    public static byte[] newUnpaddedByteArray(int p0) { return null; }
    public static char[] newUnpaddedCharArray(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static int[] newUnpaddedIntArray(int p0) { return null; }
    public static boolean[] newUnpaddedBooleanArray(int p0) { return null; }
    public static long[] newUnpaddedLongArray(int p0) { return null; }
    public static float[] newUnpaddedFloatArray(int p0) { return null; }
    public static java.lang.Object[] newUnpaddedObjectArray(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static <T extends java.lang.Object> T[] newUnpaddedArray(java.lang.Class<T> p0, int p1) { return null; }
    public static boolean equals(byte[] p0, byte[] p1, int p2) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static <T extends java.lang.Object> T[] emptyArray(java.lang.Class<T> p0) { return null; }
    public static boolean isEmpty(java.util.Collection<?> p0) { return false; }
    public static boolean isEmpty(java.util.Map<?, ?> p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static <T extends java.lang.Object> boolean isEmpty(T[] p0) { return false; }
    public static boolean isEmpty(int[] p0) { return false; }
    public static boolean isEmpty(long[] p0) { return false; }
    public static boolean isEmpty(byte[] p0) { return false; }
    public static boolean isEmpty(boolean[] p0) { return false; }
    public static int size(java.lang.Object[] p0) { return 0; }
    public static int size(java.util.Collection<?> p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static <T extends java.lang.Object> boolean contains(T[] p0, T p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static <T extends java.lang.Object> int indexOf(T[] p0, T p1) { return 0; }
    public static <T extends java.lang.Object> boolean containsAll(T[] p0, T[] p1) { return false; }
    public static <T extends java.lang.Object> boolean containsAny(T[] p0, T[] p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean contains(int[] p0, int p1) { return false; }
    public static boolean contains(long[] p0, long p1) { return false; }
    public static boolean contains(char[] p0, char p1) { return false; }
    public static <T extends java.lang.Object> boolean containsAll(char[] p0, char[] p1) { return false; }
    public static long total(long[] p0) { return 0L; }
    public static int[] convertToIntArray(java.util.List<java.lang.Integer> p0) { return null; }
    public static long[] convertToLongArray(int[] p0) { return null; }
    public static <T extends java.lang.Object> T[] concatElements(java.lang.Class<T> p0, T[] p1, T[] p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static <T extends java.lang.Object> T[] appendElement(java.lang.Class<T> p0, T[] p1, T p2) { return null; }
    public static <T extends java.lang.Object> T[] appendElement(java.lang.Class<T> p0, T[] p1, T p2, boolean p3) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static <T extends java.lang.Object> T[] removeElement(java.lang.Class<T> p0, T[] p1, T p2) { return null; }
    public static int[] appendInt(int[] p0, int p1, boolean p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static int[] appendInt(int[] p0, int p1) { return null; }
    public static int[] removeInt(int[] p0, int p1) { return null; }
    public static java.lang.String[] removeString(java.lang.String[] p0, java.lang.String p1) { return null; }
    public static long[] appendLong(long[] p0, long p1, boolean p2) { return null; }
    public static long[] appendLong(long[] p0, long p1) { return null; }
    public static long[] removeLong(long[] p0, long p1) { return null; }
    public static long[] cloneOrNull(long[] p0) { return null; }
    public static <T extends java.lang.Object> T[] cloneOrNull(T[] p0) { return null; }
    public static <T extends java.lang.Object> android.util.ArraySet<T> cloneOrNull(android.util.ArraySet<T> p0) { return null; }
    public static <T extends java.lang.Object> android.util.ArraySet<T> add(android.util.ArraySet<T> p0, T p1) { return null; }
    public static <T extends java.lang.Object> android.util.ArraySet<T> remove(android.util.ArraySet<T> p0, T p1) { return null; }
    public static <T extends java.lang.Object> java.util.ArrayList<T> add(java.util.ArrayList<T> p0, T p1) { return null; }
    public static <T extends java.lang.Object> java.util.ArrayList<T> remove(java.util.ArrayList<T> p0, T p1) { return null; }
    public static <T extends java.lang.Object> boolean contains(java.util.Collection<T> p0, T p1) { return false; }
    public static <T extends java.lang.Object> T[] trimToSize(T[] p0, int p1) { return null; }
    public static <T extends java.lang.Object> boolean referenceEquals(java.util.ArrayList<T> p0, java.util.ArrayList<T> p1) { return false; }
    public static <T extends java.lang.Object> int unstableRemoveIf(java.util.ArrayList<T> p0, java.util.function.Predicate<T> p1) { return 0; }
    public static int[] defeatNullable(int[] p0) { return null; }
    public static java.lang.String[] defeatNullable(java.lang.String[] p0) { return null; }
    public static java.io.File[] defeatNullable(java.io.File[] p0) { return null; }
    public static void checkBounds(int p0, int p1) {}
    public static <T extends java.lang.Object> T[] filterNotNull(T[] p0, java.util.function.IntFunction<T[]> p1) { return null; }
    public static boolean startsWith(byte[] p0, byte[] p1) { return false; }
    public static <T extends java.lang.Object> T find(T[] p0, java.util.function.Predicate<T> p1) { return null; }
    public static java.lang.String deepToString(java.lang.Object p0) { return null; }
    public static <T extends java.lang.Object> T firstOrNull(T[] p0) { return null; }
}
