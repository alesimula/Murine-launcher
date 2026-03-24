package android.content;

public abstract class BroadcastReceiver {
    @android.annotation.UnsupportedAppUsage
    private android.content.BroadcastReceiver.PendingResult mPendingResult;
    private boolean mDebugUnregister;
    public BroadcastReceiver() {}
    public abstract void onReceive(android.content.Context p0, android.content.Intent p1);
    public final android.content.BroadcastReceiver.PendingResult goAsync() { return null; }
    public android.os.IBinder peekService(android.content.Context p0, android.content.Intent p1) { return null; }
    public final void setResultCode(int p0) {}
    public final int getResultCode() { return 0; }
    public final void setResultData(java.lang.String p0) {}
    public final java.lang.String getResultData() { return null; }
    public final void setResultExtras(android.os.Bundle p0) {}
    public final android.os.Bundle getResultExtras(boolean p0) { return null; }
    public final void setResult(int p0, java.lang.String p1, android.os.Bundle p2) {}
    public final boolean getAbortBroadcast() { return false; }
    public final void abortBroadcast() {}
    public final void clearAbortBroadcast() {}
    public final boolean isOrderedBroadcast() { return false; }
    public final boolean isInitialStickyBroadcast() { return false; }
    public final void setOrderedHint(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public final void setPendingResult(android.content.BroadcastReceiver.PendingResult p0) {}
    @android.annotation.UnsupportedAppUsage
    public final android.content.BroadcastReceiver.PendingResult getPendingResult() { return null; }
    public int getSendingUserId() { return 0; }
    public final void setDebugUnregister(boolean p0) {}
    public final boolean getDebugUnregister() { return false; }
    void checkSynchronousHint() {}

    public static class PendingResult {
        public static final int TYPE_COMPONENT = 0;
        public static final int TYPE_REGISTERED = 1;
        public static final int TYPE_UNREGISTERED = 2;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        final int mType = 0;
        @android.annotation.UnsupportedAppUsage
        final boolean mOrderedHint = false;
        @android.annotation.UnsupportedAppUsage
        final boolean mInitialStickyHint = false;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        final android.os.IBinder mToken = null;
        @android.annotation.UnsupportedAppUsage
        final int mSendingUser = 0;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        final int mFlags = 0;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        int mResultCode;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        java.lang.String mResultData;
        @android.annotation.UnsupportedAppUsage
        android.os.Bundle mResultExtras;
        @android.annotation.UnsupportedAppUsage
        boolean mAbortBroadcast;
        @android.annotation.UnsupportedAppUsage
        boolean mFinished;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        public PendingResult(int p0, java.lang.String p1, android.os.Bundle p2, int p3, boolean p4, boolean p5, android.os.IBinder p6, int p7, int p8) {}
        public final void setResultCode(int p0) {}
        public final int getResultCode() { return 0; }
        public final void setResultData(java.lang.String p0) {}
        public final java.lang.String getResultData() { return null; }
        public final void setResultExtras(android.os.Bundle p0) {}
        public final android.os.Bundle getResultExtras(boolean p0) { return null; }
        public final void setResult(int p0, java.lang.String p1, android.os.Bundle p2) {}
        public final boolean getAbortBroadcast() { return false; }
        public final void abortBroadcast() {}
        public final void clearAbortBroadcast() {}
        public final void finish() {}
        public void setExtrasClassLoader(java.lang.ClassLoader p0) {}
        public void sendFinished(android.app.IActivityManager p0) {}
        public int getSendingUserId() { return 0; }
        void checkSynchronousHint() {}
    }
}
