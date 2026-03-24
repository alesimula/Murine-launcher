package android.hardware.radio.network;

public class RegStateResult implements android.os.Parcelable {
    public int regState;
    public int rat;
    public int reasonForDenial;
    public android.hardware.radio.network.CellIdentity cellIdentity;
    public java.lang.String registeredPlmn;
    public android.hardware.radio.network.AccessTechnologySpecificInfo accessTechnologySpecificInfo;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.RegStateResult> CREATOR = null;
    public RegStateResult() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
