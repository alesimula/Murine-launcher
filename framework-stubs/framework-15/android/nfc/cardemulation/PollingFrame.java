package android.nfc.cardemulation;

public final class PollingFrame implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nfc.cardemulation.PollingFrame> CREATOR = null;
    public static final int POLLING_LOOP_TYPE_A = 65;
    public static final int POLLING_LOOP_TYPE_B = 66;
    public static final int POLLING_LOOP_TYPE_F = 70;
    public static final int POLLING_LOOP_TYPE_OFF = 88;
    public static final int POLLING_LOOP_TYPE_ON = 79;
    public static final int POLLING_LOOP_TYPE_UNKNOWN = 85;
    PollingFrame() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public byte[] getData() { return null; }
    public long getTimestamp() { return 0L; }
    public boolean getTriggeredAutoTransact() { return false; }
    public int getType() { return 0; }
    public int getVendorSpecificGain() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
