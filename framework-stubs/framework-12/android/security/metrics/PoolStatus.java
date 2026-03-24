package android.security.metrics;

public @interface PoolStatus {
    public static final int EXPIRING = 1;
    public static final int UNASSIGNED = 2;
    public static final int ATTESTED = 3;
    public static final int TOTAL = 4;
}
