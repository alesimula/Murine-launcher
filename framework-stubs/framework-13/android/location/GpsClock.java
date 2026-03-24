package android.location;

@java.lang.Deprecated
@android.annotation.SystemApi
public class GpsClock implements android.os.Parcelable {
    public static final byte TYPE_UNKNOWN = 0;
    public static final byte TYPE_LOCAL_HW_TIME = 1;
    public static final byte TYPE_GPS_TIME = 2;
    public static final android.os.Parcelable.Creator<android.location.GpsClock> CREATOR = null;
    GpsClock() {}
    public void set(android.location.GpsClock p0) {}
    public void reset() {}
    public byte getType() { return 0; }
    public void setType(byte p0) {}
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
}
