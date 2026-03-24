package android.telephony;

public abstract class CellSignalStrength {
    public static final int SIGNAL_STRENGTH_NONE_OR_UNKNOWN = 0;
    public static final int SIGNAL_STRENGTH_POOR = 1;
    public static final int SIGNAL_STRENGTH_MODERATE = 2;
    public static final int SIGNAL_STRENGTH_GOOD = 3;
    public static final int SIGNAL_STRENGTH_GREAT = 4;
    public static final int NUM_SIGNAL_STRENGTH_BINS = 5;
    protected static final int NUM_SIGNAL_STRENGTH_THRESHOLDS = 4;
    protected CellSignalStrength() {}
    public abstract void setDefaultValues();
    public abstract int getLevel();
    public abstract int getAsuLevel();
    public abstract int getDbm();
    public abstract android.telephony.CellSignalStrength copy();
    public abstract boolean isValid();
    public abstract int hashCode();
    public abstract boolean equals(java.lang.Object p0);
    public abstract void updateLevel(android.os.PersistableBundle p0, android.telephony.ServiceState p1);
    protected static final int getRssiDbmFromAsu(int p0) { return 0; }
    protected static final int getAsuFromRssiDbm(int p0) { return 0; }
    protected static final int getRscpDbmFromAsu(int p0) { return 0; }
    protected static final int getAsuFromRscpDbm(int p0) { return 0; }
    protected static final int getEcNoDbFromAsu(int p0) { return 0; }
    protected static final int inRangeOrUnavailable(int p0, int p1, int p2) { return 0; }
    protected static final int inRangeOrUnavailable(int p0, int p1, int p2, int p3) { return 0; }
    public static final int getNumSignalStrengthLevels() { return 0; }
}
