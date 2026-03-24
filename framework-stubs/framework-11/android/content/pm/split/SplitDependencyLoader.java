package android.content.pm.split;

public abstract class SplitDependencyLoader<E extends java.lang.Exception> {
    private final android.util.SparseArray<int[]> mDependencies = null;
    protected SplitDependencyLoader(android.util.SparseArray<int[]> p0) {}
    protected void loadDependenciesForSplit(int p0) throws E {}
    private int[] collectConfigSplitIndices(int p0) { return null; }
    protected abstract boolean isSplitCached(int p0);
    protected abstract void constructSplit(int p0, int[] p1, int p2) throws E;
    private static int[] append(int[] p0, int p1) { return null; }
    public static android.util.SparseArray<int[]> createDependenciesFromPackage(android.content.pm.PackageParser.PackageLite p0) throws android.content.pm.split.SplitDependencyLoader.IllegalDependencyException { return null; }

    public static class IllegalDependencyException extends java.lang.Exception {
        private IllegalDependencyException(java.lang.String p0) { super(); }
    }
}
