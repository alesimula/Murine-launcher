package android.content.res;

abstract class ThemedResourceCache<T extends java.lang.Object> {
    ThemedResourceCache() {}
    public void put(long p0, android.content.res.Resources.Theme p1, T p2) {}
    public void put(long p0, android.content.res.Resources.Theme p1, T p2, boolean p3) {}
    public T get(long p0, android.content.res.Resources.Theme p1) { return null; }
    public void onConfigurationChange(int p0) {}
    protected abstract boolean shouldInvalidateEntry(T p0, int p1);
    public synchronized void clear() {}
}
