package android.service.euicc;

@android.annotation.SystemApi
public final class GetEuiccProfileInfoListResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.euicc.GetEuiccProfileInfoListResult> CREATOR = null;
    @java.lang.Deprecated
    public final int result = 0;
    public int getResult() { return 0; }
    public java.util.List<android.service.euicc.EuiccProfileInfo> getProfiles() { return null; }
    public boolean getIsRemovable() { return false; }
    public GetEuiccProfileInfoListResult(int p0, android.service.euicc.EuiccProfileInfo[] p1, boolean p2) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
