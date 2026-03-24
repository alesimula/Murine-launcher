package com.android.net.module.util;

public final class CollectionUtils {
    public static <T extends java.lang.Object> boolean isEmpty(T[] p0) { return false; }
    public static <T extends java.lang.Object> boolean isEmpty(java.util.Collection<T> p0) { return false; }
    @android.annotation.NonNull
    public static java.util.Set<java.lang.Integer> intArrayToSet(int[] p0) { return null; }
    @android.annotation.NonNull
    public static int[] toIntArray(java.util.Collection<java.lang.Integer> p0) { return null; }
    @android.annotation.NonNull
    public static long[] toLongArray(java.util.Collection<java.lang.Long> p0) { return null; }
    public static <T extends java.lang.Object> boolean all(java.util.Collection<T> p0, java.util.function.Predicate<T> p1) { return false; }
    public static <T extends java.lang.Object> boolean any(java.util.Collection<T> p0, java.util.function.Predicate<T> p1) { return false; }
    public static <T extends java.lang.Object> int indexOf(java.util.Collection<T> p0, java.util.function.Predicate<? super T> p1) { return 0; }
    public static <T extends java.lang.Object> boolean any(android.util.SparseArray<T> p0, java.util.function.Predicate<T> p1) { return false; }
    public static boolean contains(short[] p0, short p1) { return false; }
    public static boolean contains(int[] p0, int p1) { return false; }
    public static <T extends java.lang.Object> boolean contains(T[] p0, T p1) { return false; }
    public static <T extends java.lang.Object> int indexOf(T[] p0, T p1) { return 0; }
    public static int indexOfSubArray(byte[] p0, byte[] p1) { return 0; }
    @android.annotation.NonNull
    public static <T extends java.lang.Object> java.util.ArrayList<T> filter(java.util.Collection<T> p0, java.util.function.Predicate<T> p1) { return null; }
    public static long total(long[] p0) { return 0L; }
    public static <T extends java.lang.Object> boolean containsAny(java.util.Collection<T> p0, java.util.Collection<? extends T> p1) { return false; }
    public static <T extends java.lang.Object> boolean containsAll(java.util.Collection<T> p0, java.util.Collection<? extends T> p1) { return false; }
    @android.annotation.Nullable
    public static <T extends java.lang.Object> T findFirst(java.util.Collection<T> p0, java.util.function.Predicate<? super T> p1) { return null; }
    @android.annotation.Nullable
    public static <T extends java.lang.Object> T findLast(java.util.List<T> p0, java.util.function.Predicate<? super T> p1) { return null; }
    public static <T extends java.lang.Object> boolean contains(java.util.Collection<T> p0, java.util.function.Predicate<? super T> p1) { return false; }
    @android.annotation.NonNull
    public static <T extends java.lang.Object, R extends java.lang.Object> java.util.ArrayList<R> map(java.util.Collection<T> p0, java.util.function.Function<? super T, ? extends R> p1) { return null; }
    @android.annotation.NonNull
    public static <T extends java.lang.Object, R extends java.lang.Object> java.util.ArrayList<android.util.Pair<T, R>> zip(java.util.List<T> p0, java.util.List<R> p1) { return null; }
    @android.annotation.NonNull
    public static <T extends java.lang.Object, R extends java.lang.Object> android.util.ArrayMap<T, R> assoc(java.util.List<T> p0, java.util.List<R> p1) { return null; }
    public static <T extends java.lang.Object> int getIndexForValue(android.util.SparseArray<T> p0, T p1) { return 0; }
    public static byte[] concatArrays(byte[]... p0) { return null; }
    public static <T extends java.lang.Object> T[] concatArrays(java.lang.Class<T> p0, T[]... p1) { return null; }
    public static byte[] prependArray(byte[] p0, byte... p1) { return null; }
    public static <T extends java.lang.Object> T[] prependArray(java.lang.Class<T> p0, T[] p1, T... p2) { return null; }
    public static byte[] appendArray(byte[] p0, byte... p1) { return null; }
    public static <T extends java.lang.Object> T[] appendArray(java.lang.Class<T> p0, T[] p1, T... p2) { return null; }
}
