package com.android.internal.os;

public class BinderDeathDispatcher<T extends android.os.IInterface> {
    private static final java.lang.String TAG = "BinderDeathDispatcher";
    private final java.lang.Object mLock = null;
    private final android.util.ArrayMap<android.os.IBinder, com.android.internal.os.BinderDeathDispatcher<T>.RecipientsInfo> mTargets = null;
    public BinderDeathDispatcher() {}
    public int linkToDeath(T p0, android.os.IBinder.DeathRecipient p1) { return 0; }
    public void unlinkToDeath(T p0, android.os.IBinder.DeathRecipient p1) {}
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public android.util.ArrayMap<android.os.IBinder, com.android.internal.os.BinderDeathDispatcher<T>.RecipientsInfo> getTargetsForTest() { return null; }

    class RecipientsInfo implements android.os.IBinder.DeathRecipient {
        final android.os.IBinder mTarget = null;
        android.util.ArraySet<android.os.IBinder.DeathRecipient> mRecipients;
        private RecipientsInfo(com.android.internal.os.BinderDeathDispatcher p0, android.os.IBinder p1) {}
        public void binderDied() {}
    }
}
