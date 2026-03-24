package libcore.io;

public class ForwardingOs {
    public ForwardingOs(libcore.io.Os p0) {}
    public boolean access(java.lang.String p0, int p1) { return false; }
    public java.io.FileDescriptor open(java.lang.String p0, int p1, int p2) { return null; }
    public android.system.StructStat stat(java.lang.String p0) { return null; }
    public void unlink(java.lang.String p0) {}
    public void remove(java.lang.String p0) {}
    public void rename(java.lang.String p0, java.lang.String p1) {}
}
