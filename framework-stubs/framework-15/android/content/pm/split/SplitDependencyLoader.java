package android.content.pm.split;

public abstract class SplitDependencyLoader<E extends java.lang.Exception> {
    protected SplitDependencyLoader(android.util.SparseArray<int[]> p0) {}
    protected void loadDependenciesForSplit(int p0) throws E {}
    protected abstract boolean isSplitCached(int p0);
    protected abstract void constructSplit(int p0, int[] p1, int p2) throws E;
    @android.annotation.NonNull
    public static android.util.SparseArray<int[]> createDependenciesFromPackage(android.content.pm.parsing.PackageLite p0) throws android.content.pm.split.SplitDependencyLoader.IllegalDependencyException { return null; }

    public static class IllegalDependencyException extends java.lang.Exception {
    }
}
