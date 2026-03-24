package android.hardware.radio.network;

public class CellIdentityGsm implements android.os.Parcelable {
    public java.lang.String mcc;
    public java.lang.String mnc;
    public int lac;
    public int cid;
    public int arfcn;
    public byte bsic;
    public android.hardware.radio.network.OperatorInfo operatorNames;
    public java.lang.String[] additionalPlmns;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.CellIdentityGsm> CREATOR = null;
    public CellIdentityGsm() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
