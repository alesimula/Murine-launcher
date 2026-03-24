package android.util;

public interface Dumpable {
    @android.annotation.NonNull
    default public java.lang.String getDumpableName() { return null; }
    public void dump(java.io.PrintWriter p0, java.lang.String[] p1);
}
