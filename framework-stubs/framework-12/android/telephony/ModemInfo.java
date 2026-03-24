package android.telephony;

public class ModemInfo implements android.os.Parcelable {
    public final int modemId = 0;
    public final int rat = 0;
    public final boolean isVoiceSupported = false;
    public final boolean isDataSupported = false;
    public static final android.os.Parcelable.Creator<android.telephony.ModemInfo> CREATOR = null;
    public ModemInfo(int p0) {}
    public ModemInfo(int p0, int p1, boolean p2, boolean p3) {}
    public ModemInfo(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
