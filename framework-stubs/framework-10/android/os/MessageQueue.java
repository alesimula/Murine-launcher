package android.os;

public final class MessageQueue {
    private static final java.lang.String TAG = "MessageQueue";
    private static final boolean DEBUG = false;
    @android.annotation.UnsupportedAppUsage
    private final boolean mQuitAllowed = false;
    @android.annotation.UnsupportedAppUsage
    private long mPtr;
    @android.annotation.UnsupportedAppUsage
    android.os.Message mMessages;
    @android.annotation.UnsupportedAppUsage
    private final java.util.ArrayList<android.os.MessageQueue.IdleHandler> mIdleHandlers = null;
    private android.util.SparseArray<android.os.MessageQueue.FileDescriptorRecord> mFileDescriptorRecords;
    private android.os.MessageQueue.IdleHandler[] mPendingIdleHandlers;
    private boolean mQuitting;
    private boolean mBlocked;
    @android.annotation.UnsupportedAppUsage
    private int mNextBarrierToken;
    private static native long nativeInit();
    private static native void nativeDestroy(long p0);
    @android.annotation.UnsupportedAppUsage
    private native void nativePollOnce(long p0, int p1);
    private static native void nativeWake(long p0);
    private static native boolean nativeIsPolling(long p0);
    private static native void nativeSetFileDescriptorEvents(long p0, int p1, int p2);
    MessageQueue(boolean p0) {}
    protected void finalize() throws java.lang.Throwable {}
    private void dispose() {}
    public boolean isIdle() { return false; }
    public void addIdleHandler(android.os.MessageQueue.IdleHandler p0) {}
    public void removeIdleHandler(android.os.MessageQueue.IdleHandler p0) {}
    public boolean isPolling() { return false; }
    private boolean isPollingLocked() { return false; }
    public void addOnFileDescriptorEventListener(java.io.FileDescriptor p0, int p1, android.os.MessageQueue.OnFileDescriptorEventListener p2) {}
    public void removeOnFileDescriptorEventListener(java.io.FileDescriptor p0) {}
    private void updateOnFileDescriptorEventListenerLocked(java.io.FileDescriptor p0, int p1, android.os.MessageQueue.OnFileDescriptorEventListener p2) {}
    @android.annotation.UnsupportedAppUsage
    private int dispatchEvents(int p0, int p1) { return 0; }
    @android.annotation.UnsupportedAppUsage
    android.os.Message next() { return null; }
    void quit(boolean p0) {}
    public int postSyncBarrier() { return 0; }
    private int postSyncBarrier(long p0) { return 0; }
    public void removeSyncBarrier(int p0) {}
    boolean enqueueMessage(android.os.Message p0, long p1) { return false; }
    boolean hasMessages(android.os.Handler p0, int p1, java.lang.Object p2) { return false; }
    @android.annotation.UnsupportedAppUsage
    boolean hasMessages(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) { return false; }
    boolean hasMessages(android.os.Handler p0) { return false; }
    void removeMessages(android.os.Handler p0, int p1, java.lang.Object p2) {}
    void removeMessages(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) {}
    void removeCallbacksAndMessages(android.os.Handler p0, java.lang.Object p1) {}
    private void removeAllMessagesLocked() {}
    private void removeAllFutureMessagesLocked() {}
    void dump(android.util.Printer p0, java.lang.String p1, android.os.Handler p2) {}
    void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}

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
