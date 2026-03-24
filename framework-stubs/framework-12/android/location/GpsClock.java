package android.location;

@java.lang.Deprecated
@android.annotation.SystemApi
public class GpsClock implements android.os.Parcelable {
    public static final byte TYPE_UNKNOWN = 0;
    public static final byte TYPE_LOCAL_HW_TIME = 1;
    public static final byte TYPE_GPS_TIME = 2;
    private static final short HAS_NO_FLAGS = 0;
    private static final short HAS_LEAP_SECOND = 1;
    private static final short HAS_TIME_UNCERTAINTY = 2;
    private static final short HAS_FULL_BIAS = 4;
    private static final short HAS_BIAS = 8;
    private static final short HAS_BIAS_UNCERTAINTY = 16;
    private static final short HAS_DRIFT = 32;
    private static final short HAS_DRIFT_UNCERTAINTY = 64;
    private short mFlags;
    private short mLeapSecond;
    private byte mType;
    private long mTimeInNs;
    private double mTimeUncertaintyInNs;
    private long mFullBiasInNs;
    private double mBiasInNs;
    private double mBiasUncertaintyInNs;
    private double mDriftInNsPerSec;
    private double mDriftUncertaintyInNsPerSec;
    public static final android.os.Parcelable.Creator<android.location.GpsClock> CREATOR = null;
    GpsClock() {}
    public void set(android.location.GpsClock p0) {}
    public void reset() {}
    public byte getType() { return 0; }
    public void setType(byte p0) {}
    private java.lang.String getTypeString() { return null; }
    public boolean hasLeapSecond() { return false; }
    public short getLeapSecond() { return 0; }
    public void setLeapSecond(short p0) {}
    public void resetLeapSecond() {}
    public long getTimeInNs() { return 0L; }
    public void setTimeInNs(long p0) {}
    public boolean hasTimeUncertaintyInNs() { return false; }
    public double getTimeUncertaintyInNs() { return 0.0; }
    public void setTimeUncertaintyInNs(double p0) {}
    public void resetTimeUncertaintyInNs() {}
    public boolean hasFullBiasInNs() { return false; }
    public long getFullBiasInNs() { return 0L; }
    public void setFullBiasInNs(long p0) {}
    public void resetFullBiasInNs() {}
    public boolean hasBiasInNs() { return false; }
    public double getBiasInNs() { return 0.0; }
    public void setBiasInNs(double p0) {}
    public void resetBiasInNs() {}
    public boolean hasBiasUncertaintyInNs() { return false; }
    public double getBiasUncertaintyInNs() { return 0.0; }
    public void setBiasUncertaintyInNs(double p0) {}
    public void resetBiasUncertaintyInNs() {}
    public boolean hasDriftInNsPerSec() { return false; }
    public double getDriftInNsPerSec() { return 0.0; }
    public void setDriftInNsPerSec(double p0) {}
    public void resetDriftInNsPerSec() {}
    public boolean hasDriftUncertaintyInNsPerSec() { return false; }
    public double getDriftUncertaintyInNsPerSec() { return 0.0; }
    public void setDriftUncertaintyInNsPerSec(double p0) {}
    public void resetDriftUncertaintyInNsPerSec() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    private void initialize() {}
    private void setFlag(short p0) {}
    private void resetFlag(short p0) {}
    private boolean isFlagSet(short p0) { return false; }
}
