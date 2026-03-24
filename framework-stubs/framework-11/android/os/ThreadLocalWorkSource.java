package android.os;

public final class ThreadLocalWorkSource {
    public static final int UID_NONE = -1;
    private static final java.lang.ThreadLocal<java.lang.Integer> sWorkSourceUid = null;
    public static int getUid() { return 0; }
    public static long setUid(int p0) { return 0L; }
    public static void restore(long p0) {}
    public static long clear() { return 0L; }
    private static int parseUidFromToken(long p0) { return 0; }
    private static long getToken() { return 0L; }
    private ThreadLocalWorkSource() {}
}
