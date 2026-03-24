package android.app.appsearch.ast.operators;

@android.annotation.FlaggedApi("com.android.appsearch.flags.enable_abstract_syntax_trees")
public final class ComparatorNode implements android.app.appsearch.ast.Node {
    public static final int EQUALS = 0;
    public static final int GREATER_EQUALS = 4;
    public static final int GREATER_THAN = 3;
    public static final int LESS_EQUALS = 2;
    public static final int LESS_THAN = 1;
    public ComparatorNode(int p0, android.app.appsearch.PropertyPath p1, long p2) {}
    public int getComparator() { return 0; }
    @android.annotation.NonNull
    public android.app.appsearch.PropertyPath getPropertyPath() { return null; }
    public long getValue() { return 0L; }
    public void setComparator(int p0) {}
    public void setPropertyPath(android.app.appsearch.PropertyPath p0) {}
    public void setValue(long p0) {}
}
