package android.media.tv.tuner;

@android.annotation.SystemApi
public class Descrambler implements java.lang.AutoCloseable {
    public static final int PID_TYPE_T = 1;
    public static final int PID_TYPE_MMTP = 2;
    public int addPid(int p0, int p1, android.media.tv.tuner.filter.Filter p2) { return 0; }
    public int removePid(int p0, int p1, android.media.tv.tuner.filter.Filter p2) { return 0; }
    public int setKeyToken(byte[] p0) { return 0; }
    public static boolean isValidKeyToken(byte[] p0) { return false; }
    public void close() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PidType {
    }
}
