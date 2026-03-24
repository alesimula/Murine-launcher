package android.net.sntp;

public final class Timestamp64 {
    public static final android.net.sntp.Timestamp64 ZERO = null;
    static final int SUB_MILLIS_BITS_TO_RANDOMIZE = 22;
    static final long OFFSET_1900_TO_1970 = 2208988800L;
    static final long MAX_SECONDS_IN_ERA = 4294967295L;
    static final long SECONDS_IN_ERA = 4294967296L;
    static final int NANOS_PER_SECOND = 1000000000;
    public static android.net.sntp.Timestamp64 fromComponents(long p0, int p1) { return null; }
    public static android.net.sntp.Timestamp64 fromString(java.lang.String p0) { return null; }
    public static android.net.sntp.Timestamp64 fromInstant(java.time.Instant p0) { return null; }
    public long getEraSeconds() { return 0L; }
    public int getFractionBits() { return 0; }
    public java.lang.String toString() { return null; }
    public java.time.Instant toInstant(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    static int fractionBitsToNanos(int p0) { return 0; }
    static int nanosToFractionBits(long p0) { return 0; }
    public android.net.sntp.Timestamp64 randomizeSubMillis(java.util.Random p0) { return null; }
    public static int randomizeLowestBits(java.util.Random p0, int p1, int p2) { return 0; }
}
