package android.net.apf;

public final class ApfCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.apf.ApfCapabilities> CREATOR = null;
    public final int apfPacketFormat = 0;
    public final int apfVersionSupported = 0;
    public final int maximumApfProgramSize = 0;
    public ApfCapabilities(int p0, int p1, int p2) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean hasDataAccess() { return false; }
    public static boolean getApfDrop8023Frames() { return false; }
    @android.annotation.NonNull
    public static int[] getApfEtherTypeBlackList() { return null; }
}
