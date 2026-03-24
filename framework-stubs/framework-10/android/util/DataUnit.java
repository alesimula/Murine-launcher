package android.util;

public enum DataUnit {
    KILOBYTES,
    MEGABYTES,
    GIGABYTES,
    KIBIBYTES,
    MEBIBYTES,
    GIBIBYTES;
    private DataUnit() {}
    public long toBytes(long p0) { return 0L; }
}
