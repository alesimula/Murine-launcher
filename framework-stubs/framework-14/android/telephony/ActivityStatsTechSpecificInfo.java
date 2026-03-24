package android.telephony;

public final class ActivityStatsTechSpecificInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.ActivityStatsTechSpecificInfo> CREATOR = null;
    public ActivityStatsTechSpecificInfo(int p0, int p1, int[] p2, int p3) {}
    public int getRat() { return 0; }
    public int getFrequencyRange() { return 0; }
    public long getTransmitTimeMillis(int p0) { return 0L; }
    public int[] getTransmitTimeMillis() { return null; }
    public long getReceiveTimeMillis() { return 0L; }
    public void setRat(int p0) {}
    public void setFrequencyRange(int p0) {}
    public void setReceiveTimeMillis(int p0) {}
    public void setReceiveTimeMillis(long p0) {}
    public void setTransmitTimeMillis(int[] p0) {}
    public boolean isTxPowerValid() { return false; }
    public boolean isRxPowerValid() { return false; }
    public boolean isTxPowerEmpty() { return false; }
    public boolean isRxPowerEmpty() { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
