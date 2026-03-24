package android.os;

public final class Message implements android.os.Parcelable {
    public int what;
    public int arg1;
    public int arg2;
    public java.lang.Object obj;
    public android.os.Messenger replyTo;
    public static final int UID_NONE = -1;
    public int sendingUid;
    public int workSourceUid;
    static final int FLAG_IN_USE = 1;
    static final int FLAG_ASYNCHRONOUS = 2;
    static final int FLAGS_TO_CLEAR_ON_COPY_FROM = 1;
    int flags;
    public long when;
    android.os.Bundle data;
    android.os.Handler target;
    java.lang.Runnable callback;
    android.os.Message next;
    public static final java.lang.Object sPoolSync = null;
    private static android.os.Message sPool;
    private static int sPoolSize;
    private static final int MAX_POOL_SIZE = 50;
    private static boolean gCheckRecycle;
    public static final android.os.Parcelable.Creator<android.os.Message> CREATOR = null;
    public static android.os.Message obtain() { return null; }
    public static android.os.Message obtain(android.os.Message p0) { return null; }
    public static android.os.Message obtain(android.os.Handler p0) { return null; }
    public static android.os.Message obtain(android.os.Handler p0, java.lang.Runnable p1) { return null; }
    public static android.os.Message obtain(android.os.Handler p0, int p1) { return null; }
    public static android.os.Message obtain(android.os.Handler p0, int p1, java.lang.Object p2) { return null; }
    public static android.os.Message obtain(android.os.Handler p0, int p1, int p2, int p3) { return null; }
    public static android.os.Message obtain(android.os.Handler p0, int p1, int p2, int p3, java.lang.Object p4) { return null; }
    public static void updateCheckRecycle(int p0) {}
    public void recycle() {}
    void recycleUnchecked() {}
    public void copyFrom(android.os.Message p0) {}
    public long getWhen() { return 0L; }
    public void setTarget(android.os.Handler p0) {}
    public android.os.Handler getTarget() { return null; }
    public java.lang.Runnable getCallback() { return null; }
    public android.os.Message setCallback(java.lang.Runnable p0) { return null; }
    public android.os.Bundle getData() { return null; }
    public android.os.Bundle peekData() { return null; }
    public void setData(android.os.Bundle p0) {}
    public android.os.Message setWhat(int p0) { return null; }
    public void sendToTarget() {}
    public boolean isAsynchronous() { return false; }
    public void setAsynchronous(boolean p0) {}
    boolean isInUse() { return false; }
    void markInUse() {}
    public Message() {}
    public java.lang.String toString() { return null; }
    java.lang.String toString(long p0) { return null; }
    void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private void readFromParcel(android.os.Parcel p0) {}
}
