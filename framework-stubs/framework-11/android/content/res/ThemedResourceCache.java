package android.content.res;

abstract class ThemedResourceCache<T extends java.lang.Object> {
    private android.util.ArrayMap<android.content.res.Resources.ThemeKey, android.util.LongSparseArray<java.lang.ref.WeakReference<T>>> mThemedEntries;
    private android.util.LongSparseArray<java.lang.ref.WeakReference<T>> mUnthemedEntries;
    private android.util.LongSparseArray<java.lang.ref.WeakReference<T>> mNullThemedEntries;
    ThemedResourceCache() {}
    public void put(long p0, android.content.res.Resources.Theme p1, T p2) {}
    public void put(long p0, android.content.res.Resources.Theme p1, T p2, boolean p3) {}
    public T get(long p0, android.content.res.Resources.Theme p1) { return null; }
    public void onConfigurationChange(int p0) {}
    protected abstract boolean shouldInvalidateEntry(T p0, int p1);
    private android.util.LongSparseArray<java.lang.ref.WeakReference<T>> getThemedLocked(android.content.res.Resources.Theme p0, boolean p1) { return null; }
    private android.util.LongSparseArray<java.lang.ref.WeakReference<T>> getUnthemedLocked(boolean p0) { return null; }
    private boolean prune(int p0) { return false; }
    private boolean pruneEntriesLocked(android.util.LongSparseArray<java.lang.ref.WeakReference<T>> p0, int p1) { return false; }
    private boolean pruneEntryLocked(T p0, int p1) { return false; }
    public synchronized void clear() {}
}
