package android.telephony;

public final class RadioAccessSpecifier implements android.os.Parcelable {
    private int mRadioAccessNetwork;
    private int[] mBands;
    private int[] mChannels;
    public static final android.os.Parcelable.Creator<android.telephony.RadioAccessSpecifier> CREATOR = null;
    public RadioAccessSpecifier(int p0, int[] p1, int[] p2) {}
    public int getRadioAccessNetwork() { return 0; }
    public int[] getBands() { return null; }
    public int[] getChannels() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private RadioAccessSpecifier(android.os.Parcel p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
