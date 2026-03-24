package android.content;

public abstract class BroadcastReceiver {
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
    public final void setPendingResult(android.content.BroadcastReceiver.PendingResult p0) {}
    public final android.content.BroadcastReceiver.PendingResult getPendingResult() { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public final android.os.UserHandle getSendingUser() { return null; }
    public int getSendingUserId() { return 0; }
    public int getSentFromUid() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getSentFromPackage() { return null; }
    public final void setDebugUnregister(boolean p0) {}
    public final boolean getDebugUnregister() { return false; }
    void checkSynchronousHint() {}

    public static class PendingResult {
        public static final int TYPE_COMPONENT = 0;
        public static final int TYPE_REGISTERED = 1;
        public static final int TYPE_UNREGISTERED = 2;
        final int mType = 0;
        final boolean mOrderedHint = false;
        final boolean mInitialStickyHint = false;
        final boolean mAssumeDeliveredHint = false;
        final android.os.IBinder mToken = null;
        final int mSendingUser = 0;
        final int mFlags = 0;
        int mResultCode;
        java.lang.String mResultData;
        android.os.Bundle mResultExtras;
        boolean mAbortBroadcast;
        boolean mFinished;
        java.lang.String mReceiverClassName;
        final int mSentFromUid = 0;
        final java.lang.String mSentFromPackage = null;
        public PendingResult(int p0, java.lang.String p1, android.os.Bundle p2, int p3, boolean p4, boolean p5, android.os.IBinder p6, int p7, int p8) {}
        public PendingResult(int p0, java.lang.String p1, android.os.Bundle p2, int p3, boolean p4, boolean p5, boolean p6, android.os.IBinder p7, int p8, int p9, int p10, java.lang.String p11) {}
        public static boolean guessAssumeDelivered(int p0, boolean p1) { return false; }
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
        public int getSentFromUid() { return 0; }
        public java.lang.String getSentFromPackage() { return null; }
        void checkSynchronousHint() {}
    }
}
