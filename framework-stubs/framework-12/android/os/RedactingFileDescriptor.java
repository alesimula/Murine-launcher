package android.os;

public class RedactingFileDescriptor {
    private static final java.lang.String TAG = "RedactingFileDescriptor";
    private static final boolean DEBUG = true;
    private volatile long[] mRedactRanges;
    private volatile long[] mFreeOffsets;
    private java.io.FileDescriptor mInner;
    private android.os.ParcelFileDescriptor mOuter;
    private final android.os.ProxyFileDescriptorCallback mCallback = null;
    private RedactingFileDescriptor(android.content.Context p0, java.io.File p1, int p2, long[] p3, long[] p4) throws java.io.IOException {}
    private static long[] checkRangesArgument(long[] p0) { return null; }
    public static android.os.ParcelFileDescriptor open(android.content.Context p0, java.io.File p1, int p2, long[] p3, long[] p4) throws java.io.IOException { return null; }
    public static long[] removeRange(long[] p0, long p1, long p2) { return null; }
}
