package android.os;

public class ChildZygoteProcess extends android.os.ZygoteProcess {
    private final int mPid = 0;
    ChildZygoteProcess(android.net.LocalSocketAddress p0, int p1) { super(); }
    public int getPid() { return 0; }
}
