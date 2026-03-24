package com.android.internal.os;

public class FuseAppLoop implements android.os.Handler.Callback {
    public static final int ROOT_INODE = 1;
    public FuseAppLoop(int p0, android.os.ParcelFileDescriptor p1, java.util.concurrent.ThreadFactory p2) {}
    public int registerCallback(android.os.ProxyFileDescriptorCallback p0, android.os.Handler p1) throws com.android.internal.os.FuseUnavailableMountException { return 0; }
    public void unregisterCallback(int p0) {}
    public int getMountPointId() { return 0; }
    public boolean handleMessage(android.os.Message p0) { return false; }
    native long native_new(int p0);
    native void native_delete(long p0);
    native void native_start(long p0);
    native void native_replySimple(long p0, long p1, int p2);
    native void native_replyOpen(long p0, long p1, long p2);
    native void native_replyLookup(long p0, long p1, long p2, long p3);
    native void native_replyGetAttr(long p0, long p1, long p2, long p3);
    native void native_replyWrite(long p0, long p1, int p2);
    native void native_replyRead(long p0, long p1, int p2, byte[] p3);

    private static class Args {
        long unique;
        long inode;
        long offset;
        int size;
        byte[] data;
        com.android.internal.os.FuseAppLoop.CallbackEntry entry;
    }

    private static class BytesMap {
        final java.util.Map<java.lang.Long, com.android.internal.os.FuseAppLoop.BytesMapEntry> mEntries = null;
        byte[] startUsing(long p0) { return null; }
        void stopUsing(long p0) {}
        void clear() {}
    }

    private static class BytesMapEntry {
        int counter;
        byte[] bytes;
    }

    private static class CallbackEntry {
        final android.os.ProxyFileDescriptorCallback callback = null;
        final android.os.Handler handler = null;
        boolean opened;
        CallbackEntry(android.os.ProxyFileDescriptorCallback p0, android.os.Handler p1) {}
        long getThreadId() { return 0L; }
    }

    public static class UnmountedException extends java.lang.Exception {
        public UnmountedException() { super(); }
    }
}
