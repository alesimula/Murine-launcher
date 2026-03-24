package com.android.internal.os;

public class BinderDeathDispatcher<T extends android.os.IInterface> {
    public BinderDeathDispatcher() {}
    public int linkToDeath(T p0, android.os.IBinder.DeathRecipient p1) { return 0; }
    public void unlinkToDeath(T p0, android.os.IBinder.DeathRecipient p1) {}
    public void dump(android.util.IndentingPrintWriter p0) {}
    public android.util.ArrayMap<android.os.IBinder, com.android.internal.os.BinderDeathDispatcher<T>.RecipientsInfo> getTargetsForTest() { return null; }

    class RecipientsInfo implements android.os.IBinder.DeathRecipient {
        final android.os.IBinder mTarget = null;
        @android.annotation.Nullable
        android.util.ArraySet<android.os.IBinder.DeathRecipient> mRecipients;
        public void binderDied() {}
        public void binderDied(android.os.IBinder p0) {}
    }
}
