package android.os;

public class Broadcaster {
    private android.os.Broadcaster.Registration mReg;
    @android.annotation.UnsupportedAppUsage
    public Broadcaster() {}
    @android.annotation.UnsupportedAppUsage
    public void request(int p0, android.os.Handler p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    public void cancelRequest(int p0, android.os.Handler p1, int p2) {}
    public void dumpRegistrations() {}
    @android.annotation.UnsupportedAppUsage
    public void broadcast(android.os.Message p0) {}

    private class Registration {
        android.os.Broadcaster.Registration next;
        android.os.Broadcaster.Registration prev;
        int senderWhat;
        android.os.Handler[] targets;
        int[] targetWhats;
        private Registration(android.os.Broadcaster p0) {}
    }
}
