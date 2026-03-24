package android.os;

public class Broadcaster {
    private android.os.Broadcaster.Registration mReg;
    public Broadcaster() {}
    public void request(int p0, android.os.Handler p1, int p2) {}
    public void cancelRequest(int p0, android.os.Handler p1, int p2) {}
    public void dumpRegistrations() {}
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
