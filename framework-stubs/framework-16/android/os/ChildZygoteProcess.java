package android.os;

public class ChildZygoteProcess extends android.os.ZygoteProcess {
    ChildZygoteProcess(android.net.LocalSocketAddress p0, int p1, int p2) { super(); }
    public int getPid() { return 0; }
    public boolean isDead() { return false; }
}
