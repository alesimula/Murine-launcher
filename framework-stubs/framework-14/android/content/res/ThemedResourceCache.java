package android.content.res;

abstract class ThemedResourceCache<T extends java.lang.Object> {
    public static final int UNDEFINED_GENERATION = -1;
    ThemedResourceCache() {}
    public void put(long p0, android.content.res.Resources.Theme p1, T p2, int p3) {}
    public void put(long p0, android.content.res.Resources.Theme p1, T p2, int p3, boolean p4) {}
    public int getGeneration() { return 0; }
    public T get(long p0, android.content.res.Resources.Theme p1) { return null; }
    public void onConfigurationChange(int p0) {}
    protected abstract boolean shouldInvalidateEntry(T p0, int p1);
    public synchronized void clear() {}
}
