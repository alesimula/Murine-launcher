package android.bluetooth;

public final class BluetoothAvrcpPlayerSettings implements android.os.Parcelable {
    public static final java.lang.String TAG = "BluetoothAvrcpPlayerSettings";
    public static final int SETTING_EQUALIZER = 1;
    public static final int SETTING_REPEAT = 2;
    public static final int SETTING_SHUFFLE = 4;
    public static final int SETTING_SCAN = 8;
    public static final int STATE_INVALID = -1;
    public static final int STATE_OFF = 0;
    public static final int STATE_ON = 1;
    public static final int STATE_SINGLE_TRACK = 2;
    public static final int STATE_ALL_TRACK = 3;
    public static final int STATE_GROUP = 4;
    private int mSettings;
    private java.util.Map<java.lang.Integer, java.lang.Integer> mSettingsValue;
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothAvrcpPlayerSettings> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private BluetoothAvrcpPlayerSettings(android.os.Parcel p0) {}
    public BluetoothAvrcpPlayerSettings(int p0) {}
    public int getSettings() { return 0; }
    public void addSettingValue(int p0, int p1) {}
    public int getSettingValue(int p0) { return 0; }
}
