package android.hardware.radio.network;

public class CellIdentityLte implements android.os.Parcelable {
    public java.lang.String mcc;
    public java.lang.String mnc;
    public int ci;
    public int pci;
    public int tac;
    public int earfcn;
    public android.hardware.radio.network.OperatorInfo operatorNames;
    public int bandwidth;
    public java.lang.String[] additionalPlmns;
    public android.hardware.radio.network.ClosedSubscriberGroupInfo csgInfo;
    public int[] bands;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.CellIdentityLte> CREATOR = null;
    public CellIdentityLte() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
