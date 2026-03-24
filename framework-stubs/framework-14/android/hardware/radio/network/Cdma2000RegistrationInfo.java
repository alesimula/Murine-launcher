package android.hardware.radio.network;

public class Cdma2000RegistrationInfo implements android.os.Parcelable {
    public boolean cssSupported;
    public int roamingIndicator;
    public int systemIsInPrl;
    public int defaultRoamingIndicator;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.Cdma2000RegistrationInfo> CREATOR = null;
    public static final int PRL_INDICATOR_NOT_REGISTERED = -1;
    public static final int PRL_INDICATOR_NOT_IN_PRL = 0;
    public static final int PRL_INDICATOR_IN_PRL = 1;
    public Cdma2000RegistrationInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
