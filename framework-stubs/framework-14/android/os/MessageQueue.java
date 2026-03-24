package android.os;

public final class MessageQueue {
    android.os.Message mMessages;
    MessageQueue(boolean p0) {}
    protected void finalize() throws java.lang.Throwable {}
    public boolean isIdle() { return false; }
    public void addIdleHandler(android.os.MessageQueue.IdleHandler p0) {}
    public void removeIdleHandler(android.os.MessageQueue.IdleHandler p0) {}
    public boolean isPolling() { return false; }
    public void addOnFileDescriptorEventListener(java.io.FileDescriptor p0, int p1, android.os.MessageQueue.OnFileDescriptorEventListener p2) {}
    public void removeOnFileDescriptorEventListener(java.io.FileDescriptor p0) {}
    android.os.Message next() { return null; }
    void quit(boolean p0) {}
    public int postSyncBarrier() { return 0; }
    public void removeSyncBarrier(int p0) {}
    boolean enqueueMessage(android.os.Message p0, long p1) { return false; }
    boolean hasMessages(android.os.Handler p0, int p1, java.lang.Object p2) { return false; }
    boolean hasEqualMessages(android.os.Handler p0, int p1, java.lang.Object p2) { return false; }
    boolean hasMessages(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) { return false; }
    boolean hasMessages(android.os.Handler p0) { return false; }
    void removeMessages(android.os.Handler p0, int p1, java.lang.Object p2) {}
    void removeEqualMessages(android.os.Handler p0, int p1, java.lang.Object p2) {}
    void removeMessages(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) {}
    void removeEqualMessages(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) {}
    void removeCallbacksAndMessages(android.os.Handler p0, java.lang.Object p1) {}
    void removeCallbacksAndEqualMessages(android.os.Handler p0, java.lang.Object p1) {}
    void dump(android.util.Printer p0, java.lang.String p1, android.os.Handler p2) {}
    void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}

    public static interface OnFileDescriptorEventListener {
        public static final int EVENT_INPUT = 1;
        public static final int EVENT_OUTPUT = 2;
        public static final int EVENT_ERROR = 4;
        public int onFileDescriptorEvents(java.io.FileDescriptor p0, int p1);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Events {
        }
    }

    public static interface IdleHandler {
        public boolean queueIdle();
    }

    private static final class FileDescriptorRecord {
        public final java.io.FileDescriptor mDescriptor = null;
        public int mEvents;
        public android.os.MessageQueue.OnFileDescriptorEventListener mListener;
        public int mSeq;
        public FileDescriptorRecord(java.io.FileDescriptor p0, int p1, android.os.MessageQueue.OnFileDescriptorEventListener p2) {}
    }
}
