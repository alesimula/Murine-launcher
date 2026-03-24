package android.media;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public final class BluetoothProfileConnectionInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.BluetoothProfileConnectionInfo> CREATOR = null;
    public BluetoothProfileConnectionInfo(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public static android.media.BluetoothProfileConnectionInfo createA2dpInfo(boolean p0, int p1) { return null; }
    @android.annotation.NonNull
    public static android.media.BluetoothProfileConnectionInfo createA2dpSinkInfo(int p0) { return null; }
    @android.annotation.NonNull
    public static android.media.BluetoothProfileConnectionInfo createHearingAidInfo(boolean p0) { return null; }
    @android.annotation.NonNull
    public static android.media.BluetoothProfileConnectionInfo createLeAudioInfo(boolean p0, boolean p1) { return null; }
    @android.annotation.NonNull
    public static android.media.BluetoothProfileConnectionInfo createLeAudioOutputInfo(boolean p0, int p1) { return null; }
    public int getProfile() { return 0; }
    public boolean isSuppressNoisyIntent() { return false; }
    public int getVolume() { return 0; }
    public boolean isLeOutput() { return false; }
    @android.annotation.FlaggedApi("android.media.audio.sco_managed_by_audio")
    @android.annotation.NonNull
    public static android.media.BluetoothProfileConnectionInfo createHfpInfo() { return null; }
}
