package android.hardware.radio.network;

public class CellIdentityNr implements android.os.Parcelable {
    public java.lang.String mcc;
    public java.lang.String mnc;
    public long nci;
    public int pci;
    public int tac;
    public int nrarfcn;
    public android.hardware.radio.network.OperatorInfo operatorNames;
    public java.lang.String[] additionalPlmns;
    public int[] bands;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.CellIdentityNr> CREATOR = null;
    public CellIdentityNr() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
