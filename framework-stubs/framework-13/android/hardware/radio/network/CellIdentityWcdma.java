package android.hardware.radio.network;

public class CellIdentityWcdma implements android.os.Parcelable {
    public java.lang.String mcc;
    public java.lang.String mnc;
    public int lac;
    public int cid;
    public int psc;
    public int uarfcn;
    public android.hardware.radio.network.OperatorInfo operatorNames;
    public java.lang.String[] additionalPlmns;
    public android.hardware.radio.network.ClosedSubscriberGroupInfo csgInfo;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.CellIdentityWcdma> CREATOR = null;
    public CellIdentityWcdma() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
