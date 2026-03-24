package android.net.wifi;

@android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
public final class SoftApState implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.SoftApState> CREATOR = null;
    SoftApState() {}
    public int describeContents() { return 0; }
    public int getFailureReason() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getIface() { return null; }
    public int getState() { return 0; }
    @android.annotation.Nullable
    public android.net.TetheringManager.TetheringRequest getTetheringRequest() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
