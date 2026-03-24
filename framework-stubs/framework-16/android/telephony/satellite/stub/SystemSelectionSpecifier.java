package android.telephony.satellite.stub;

public class SystemSelectionSpecifier implements android.os.Parcelable {
    public java.lang.String mMccMnc;
    public int[] mBands;
    public int[] mEarfcs;
    public android.telephony.satellite.stub.SatelliteInfo[] satelliteInfos;
    public int[] tagIds;
    public static final android.os.Parcelable.Creator<android.telephony.satellite.stub.SystemSelectionSpecifier> CREATOR = null;
    public SystemSelectionSpecifier() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
