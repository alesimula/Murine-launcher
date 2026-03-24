package com.android.internal.util;

public class AsyncChannel {
    private static final java.lang.String TAG = "AsyncChannel";
    private static final boolean DBG = false;
    private static final int BASE = 69632;
    @android.annotation.UnsupportedAppUsage
    public static final int CMD_CHANNEL_HALF_CONNECTED = 69632;
    @android.annotation.UnsupportedAppUsage
    public static final int CMD_CHANNEL_FULL_CONNECTION = 69633;
    public static final int CMD_CHANNEL_FULLY_CONNECTED = 69634;
    public static final int CMD_CHANNEL_DISCONNECT = 69635;
    public static final int CMD_CHANNEL_DISCONNECTED = 69636;
    private static final int CMD_TO_STRING_COUNT = 5;
    private static java.lang.String[] sCmdToString;
    @android.annotation.UnsupportedAppUsage
    public static final int STATUS_SUCCESSFUL = 0;
    public static final int STATUS_BINDING_UNSUCCESSFUL = 1;
    public static final int STATUS_SEND_UNSUCCESSFUL = 2;
    public static final int STATUS_FULL_CONNECTION_REFUSED_ALREADY_CONNECTED = 3;
    public static final int STATUS_REMOTE_DISCONNECTION = 4;
    private com.android.internal.util.AsyncChannel.AsyncChannelConnection mConnection;
    private android.content.Context mSrcContext;
    private android.os.Handler mSrcHandler;
    private android.os.Messenger mSrcMessenger;
    private android.os.Messenger mDstMessenger;
    private com.android.internal.util.AsyncChannel.DeathMonitor mDeathMonitor;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    protected static java.lang.String cmdToString(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public AsyncChannel() {}
    public int connectSrcHandlerToPackageSync(android.content.Context p0, android.os.Handler p1, java.lang.String p2, java.lang.String p3) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int connectSync(android.content.Context p0, android.os.Handler p1, android.os.Messenger p2) { return 0; }
    public int connectSync(android.content.Context p0, android.os.Handler p1, android.os.Handler p2) { return 0; }
    public int fullyConnectSync(android.content.Context p0, android.os.Handler p1, android.os.Handler p2) { return 0; }
    public void connect(android.content.Context p0, android.os.Handler p1, java.lang.String p2, java.lang.String p3) {}
    public void connect(android.content.Context p0, android.os.Handler p1, java.lang.Class<?> p2) {}
    @android.annotation.UnsupportedAppUsage
    public void connect(android.content.Context p0, android.os.Handler p1, android.os.Messenger p2) {}
    @android.annotation.UnsupportedAppUsage
    public void connected(android.content.Context p0, android.os.Handler p1, android.os.Messenger p2) {}
    public void connect(android.content.Context p0, android.os.Handler p1, android.os.Handler p2) {}
    public void connect(com.android.internal.util.AsyncService p0, android.os.Messenger p1) {}
    public void disconnected() {}
    @android.annotation.UnsupportedAppUsage
    public void disconnect() {}
    @android.annotation.UnsupportedAppUsage
    public void sendMessage(android.os.Message p0) {}
    @android.annotation.UnsupportedAppUsage
    public void sendMessage(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void sendMessage(int p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public void sendMessage(int p0, int p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    public void sendMessage(int p0, int p1, int p2, java.lang.Object p3) {}
    public void sendMessage(int p0, java.lang.Object p1) {}
    @android.annotation.UnsupportedAppUsage
    public void replyToMessage(android.os.Message p0, android.os.Message p1) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void replyToMessage(android.os.Message p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public void replyToMessage(android.os.Message p0, int p1, int p2) {}
    public void replyToMessage(android.os.Message p0, int p1, int p2, int p3) {}
    @android.annotation.UnsupportedAppUsage
    public void replyToMessage(android.os.Message p0, int p1, int p2, int p3, java.lang.Object p4) {}
    @android.annotation.UnsupportedAppUsage
    public void replyToMessage(android.os.Message p0, int p1, java.lang.Object p2) {}
    @android.annotation.UnsupportedAppUsage
    public android.os.Message sendMessageSynchronously(android.os.Message p0) { return null; }
    public android.os.Message sendMessageSynchronously(int p0) { return null; }
    public android.os.Message sendMessageSynchronously(int p0, int p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.os.Message sendMessageSynchronously(int p0, int p1, int p2) { return null; }
    public android.os.Message sendMessageSynchronously(int p0, int p1, int p2, java.lang.Object p3) { return null; }
    public android.os.Message sendMessageSynchronously(int p0, java.lang.Object p1) { return null; }
    private void replyHalfConnected(int p0) {}
    private boolean linkToDeathMonitor() { return false; }
    private void replyDisconnected(int p0) {}
    private static void log(java.lang.String p0) {}

    private static class SyncMessenger {
        private static java.util.Stack<com.android.internal.util.AsyncChannel.SyncMessenger> sStack;
        private static int sCount;
        private android.os.HandlerThread mHandlerThread;
        private com.android.internal.util.AsyncChannel.SyncMessenger.SyncHandler mHandler;
        private android.os.Messenger mMessenger;
        private SyncMessenger() {}
        private static com.android.internal.util.AsyncChannel.SyncMessenger obtain() { return null; }
        private void recycle() {}
        private static android.os.Message sendMessageSynchronously(android.os.Messenger p0, android.os.Message p1) { return null; }

        private class SyncHandler extends android.os.Handler {
            private java.lang.Object mLockObject;
            private android.os.Message mResultMsg;
            private SyncHandler(com.android.internal.util.AsyncChannel.SyncMessenger p0, android.os.Looper p1) { super(); }
            public void handleMessage(android.os.Message p0) {}
        }
    }

    private final class DeathMonitor implements android.os.IBinder.DeathRecipient {
        DeathMonitor(com.android.internal.util.AsyncChannel p0) {}
        public void binderDied() {}
    }

    class AsyncChannelConnection implements android.content.ServiceConnection {
        AsyncChannelConnection(com.android.internal.util.AsyncChannel p0) {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
    }
}
