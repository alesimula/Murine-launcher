package android.os;

public class TestLooperManager {
    public TestLooperManager(android.os.Looper p0) {}
    public android.os.MessageQueue getMessageQueue() { return null; }
    @java.lang.Deprecated
    public android.os.MessageQueue getQueue() { return null; }
    public android.os.Message next() { return null; }
    public void release() {}
    public void execute(android.os.Message p0) {}
    public void recycle(android.os.Message p0) {}
    public boolean hasMessages(android.os.Handler p0, java.lang.Object p1, int p2) { return false; }
    public boolean hasMessages(android.os.Handler p0, java.lang.Object p1, java.lang.Runnable p2) { return false; }

    private class LooperHolder implements java.lang.Runnable {
        public void run() {}
    }

    private static class MessageExecution {
    }
}
