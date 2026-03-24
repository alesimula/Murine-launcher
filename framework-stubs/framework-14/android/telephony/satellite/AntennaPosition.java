package android.telephony.satellite;

public final class AntennaPosition implements android.os.Parcelable {
    android.telephony.satellite.AntennaDirection mAntennaDirection;
    int mSuggestedHoldPosition;
    public static final android.os.Parcelable.Creator<android.telephony.satellite.AntennaPosition> CREATOR = null;
    public AntennaPosition(android.telephony.satellite.AntennaDirection p0, int p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public android.telephony.satellite.AntennaDirection getAntennaDirection() { return null; }
    public int getSuggestedHoldPosition() { return 0; }
}
