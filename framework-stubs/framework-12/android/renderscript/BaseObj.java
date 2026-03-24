package android.renderscript;

@java.lang.Deprecated
public class BaseObj {
    private long mID;
    private boolean mDestroyed;
    private java.lang.String mName;
    android.renderscript.RenderScript mRS;
    BaseObj(long p0, android.renderscript.RenderScript p1) {}
    void setID(long p0) {}
    long getID(android.renderscript.RenderScript p0) { return 0L; }
    void checkValid() {}
    public void setName(java.lang.String p0) {}
    public java.lang.String getName() { return null; }
    private void helpDestroy() {}
    protected void finalize() throws java.lang.Throwable {}
    public void destroy() {}
    void updateFromNative() {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
}
