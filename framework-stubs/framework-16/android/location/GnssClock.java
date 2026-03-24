package android.location;

public final class GnssClock implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GnssClock> CREATOR = null;
    public GnssClock() {}
    public void set(android.location.GnssClock p0) {}
    public void reset() {}
    public boolean hasLeapSecond() { return false; }
    public int getLeapSecond() { return 0; }
    public void setLeapSecond(int p0) {}
    public void resetLeapSecond() {}
    public long getTimeNanos() { return 0L; }
    public void setTimeNanos(long p0) {}
    public boolean hasTimeUncertaintyNanos() { return false; }
    public double getTimeUncertaintyNanos() { return 0.0; }
    public void setTimeUncertaintyNanos(double p0) {}
    public void resetTimeUncertaintyNanos() {}
    public boolean hasFullBiasNanos() { return false; }
    public long getFullBiasNanos() { return 0L; }
    public void setFullBiasNanos(long p0) {}
    public void resetFullBiasNanos() {}
    public boolean hasBiasNanos() { return false; }
    public double getBiasNanos() { return 0.0; }
    public void setBiasNanos(double p0) {}
    public void resetBiasNanos() {}
    public boolean hasBiasUncertaintyNanos() { return false; }
    public double getBiasUncertaintyNanos() { return 0.0; }
    public void setBiasUncertaintyNanos(double p0) {}
    public void resetBiasUncertaintyNanos() {}
    public boolean hasDriftNanosPerSecond() { return false; }
    public double getDriftNanosPerSecond() { return 0.0; }
    public void setDriftNanosPerSecond(double p0) {}
    public void resetDriftNanosPerSecond() {}
    public boolean hasDriftUncertaintyNanosPerSecond() { return false; }
    public double getDriftUncertaintyNanosPerSecond() { return 0.0; }
    public void setDriftUncertaintyNanosPerSecond(double p0) {}
    public void resetDriftUncertaintyNanosPerSecond() {}
    public boolean hasElapsedRealtimeNanos() { return false; }
    public long getElapsedRealtimeNanos() { return 0L; }
    public void setElapsedRealtimeNanos(long p0) {}
    public void resetElapsedRealtimeNanos() {}
    public boolean hasElapsedRealtimeUncertaintyNanos() { return false; }
    public double getElapsedRealtimeUncertaintyNanos() { return 0.0; }
    public void setElapsedRealtimeUncertaintyNanos(double p0) {}
    public void resetElapsedRealtimeUncertaintyNanos() {}
    public boolean hasReferenceConstellationTypeForIsb() { return false; }
    public int getReferenceConstellationTypeForIsb() { return 0; }
    public void setReferenceConstellationTypeForIsb(int p0) {}
    public void resetReferenceConstellationTypeForIsb() {}
    public boolean hasReferenceCarrierFrequencyHzForIsb() { return false; }
    public double getReferenceCarrierFrequencyHzForIsb() { return 0.0; }
    public void setReferenceCarrierFrequencyHzForIsb(double p0) {}
    public void resetReferenceCarrierFrequencyHzForIsb() {}
    public boolean hasReferenceCodeTypeForIsb() { return false; }
    @android.annotation.NonNull
    public java.lang.String getReferenceCodeTypeForIsb() { return null; }
    public void setReferenceCodeTypeForIsb(java.lang.String p0) {}
    public void resetReferenceCodeTypeForIsb() {}
    public int getHardwareClockDiscontinuityCount() { return 0; }
    public void setHardwareClockDiscontinuityCount(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
}
