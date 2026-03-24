package android.nfc;

@android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
public final class OemLogItems implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nfc.OemLogItems> CREATOR = null;
    public static final int EVENT_DISABLE = 2;
    public static final int EVENT_ENABLE = 1;
    public static final int EVENT_UNSET = 0;
    public static final int LOG_ACTION_HCE_DATA = 516;
    public static final int LOG_ACTION_NFC_TOGGLE = 513;
    public static final int LOG_ACTION_RF_FIELD_STATE_CHANGED = 1;
    public static final int LOG_ACTION_SCREEN_STATE_CHANGED = 518;
    public static final int LOG_ACTION_TAG_DETECTED = 3;
    OemLogItems() {}
    public int describeContents() { return 0; }
    public int getAction() { return 0; }
    public int getCallingPid() { return 0; }
    @android.annotation.Nullable
    public byte[] getCommandApdu() { return null; }
    public int getEvent() { return 0; }
    @android.annotation.Nullable
    public byte[] getResponseApdu() { return null; }
    @android.annotation.Nullable
    public java.time.Instant getRfFieldEventTimeMillis() { return null; }
    @android.annotation.Nullable
    public android.nfc.Tag getTag() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
