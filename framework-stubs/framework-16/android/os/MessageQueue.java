package android.os;

public final class MessageQueue {
    android.os.Message mMessages;
    MessageQueue(boolean p0) {}
    static boolean getUseConcurrent() { return false; }
    protected void finalize() throws java.lang.Throwable {}
    static int compareMessages(android.os.Message p0, android.os.Message p1) { return 0; }
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
    @android.annotation.SuppressLint("VisiblySynchronized")
    java.lang.Long peekWhenForTest() { return null; }
    @android.annotation.SuppressLint("VisiblySynchronized")
    @android.annotation.Nullable
    android.os.Message pollForTest() { return null; }
    boolean isBlockedOnSyncBarrier() { return false; }
    boolean hasMessages(android.os.Handler p0, int p1, java.lang.Object p2) { return false; }
    boolean hasEqualMessages(android.os.Handler p0, int p1, java.lang.Object p2) { return false; }
    boolean hasMessages(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) { return false; }
    boolean hasMessages(android.os.Handler p0) { return false; }
    void removeMessages(android.os.Handler p0, int p1, java.lang.Object p2) {}
    void removeEqualMessages(android.os.Handler p0, int p1, java.lang.Object p2) {}
    void removeMessages(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) {}
    void removeEqualMessages(android.os.Handler p0, java.lang.Runnable p1, java.lang.Object p2) {}
    void removeCallbacksAndMessages(android.os.Handler p0, java.lang.Object p1) {}
    void removeCallbacksAndEqualMessagesConcurrent(android.os.Handler p0, java.lang.Object p1) {}
    void removeCallbacksAndEqualMessagesLegacy(android.os.Handler p0, java.lang.Object p1) {}
    void removeCallbacksAndEqualMessages(android.os.Handler p0, java.lang.Object p1) {}
    void dump(android.util.Printer p0, java.lang.String p1, android.os.Handler p2) {}
    void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}

    static final class EnqueueOrder implements java.util.Comparator<android.os.Message> {
        EnqueueOrder() {}
        public int compare(android.os.Message p0, android.os.Message p1) { return 0; }
    }

    static final class FileDescriptorRecord {
        public final java.io.FileDescriptor mDescriptor = null;
        public int mEvents;
        public android.os.MessageQueue.OnFileDescriptorEventListener mListener;
        public int mSeq;
        public FileDescriptorRecord(java.io.FileDescriptor p0, int p1, android.os.MessageQueue.OnFileDescriptorEventListener p2) {}
    }

    public static interface IdleHandler {
        public boolean queueIdle();
    }

    static final class MatchAllFutureMessages extends android.os.MessageQueue.MessageCompare {
        MatchAllFutureMessages() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchAllMessages extends android.os.MessageQueue.MessageCompare {
        MatchAllMessages() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchBarrierToken extends android.os.MessageQueue.MessageCompare {
        int mBarrierToken;
        MatchBarrierToken(int p0) { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchDeliverableMessages extends android.os.MessageQueue.MessageCompare {
        MatchDeliverableMessages() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchHandler extends android.os.MessageQueue.MessageCompare {
        MatchHandler() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchHandlerAndObject extends android.os.MessageQueue.MessageCompare {
        MatchHandlerAndObject() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchHandlerAndObjectEquals extends android.os.MessageQueue.MessageCompare {
        MatchHandlerAndObjectEquals() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchHandlerRunnableAndObject extends android.os.MessageQueue.MessageCompare {
        MatchHandlerRunnableAndObject() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchHandlerRunnableAndObjectEquals extends android.os.MessageQueue.MessageCompare {
        MatchHandlerRunnableAndObjectEquals() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchHandlerWhatAndObject extends android.os.MessageQueue.MessageCompare {
        MatchHandlerWhatAndObject() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static final class MatchHandlerWhatAndObjectEquals extends android.os.MessageQueue.MessageCompare {
        MatchHandlerWhatAndObjectEquals() { super(); }
        public boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5) { return false; }
    }

    static abstract class MessageCompare {
        MessageCompare() {}
        public abstract boolean compareMessage(android.os.Message p0, android.os.Handler p1, int p2, java.lang.Object p3, java.lang.Runnable p4, long p5);
    }

    static final class MessageCounts {
        MessageCounts() {}
        public void incrementQueued() {}
        public boolean incrementCancelled() { return false; }
        public void clearCounts() {}
    }

    static final class MessageNode extends android.os.MessageQueue.StackNode {
        final android.os.Message mMessage = null;
        volatile android.os.MessageQueue.StackNode mNext;
        android.os.MessageQueue.StateNode mBottomOfStack;
        boolean mWokeUp;
        MessageNode(android.os.Message p0) { super(0); }
        boolean removeFromStack() { return false; }
    }

    public static interface OnFileDescriptorEventListener {
        public static final int EVENT_INPUT = 1;
        public static final int EVENT_OUTPUT = 2;
        public static final int EVENT_ERROR = 4;
        public int onFileDescriptorEvents(java.io.FileDescriptor p0, int p1);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Events {
        }
    }

    static final class QuittingNode extends android.os.MessageQueue.StackNode {
        volatile android.os.MessageQueue.StackNode mNext;
        android.os.MessageQueue.StateNode mBottomOfStack;
        final boolean mRemoveAll = false;
        final long mTS = 0L;
        QuittingNode(boolean p0) { super(0); }
    }

    static class StackNode {
        StackNode(int p0) {}
        final int getNodeType() { return 0; }
        final boolean isMessageNode() { return false; }
        final boolean isQuittingNode() { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface StackNodeType {
    }

    static class StateNode extends android.os.MessageQueue.StackNode {
        StateNode(int p0) { super(0); }
    }

    static final class TimedParkStateNode extends android.os.MessageQueue.StateNode {
        long mWhenToWake;
        TimedParkStateNode() { super(0); }
    }
}
