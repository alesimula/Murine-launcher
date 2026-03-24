package android.ranging.uwb;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class UwbAddress implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.uwb.UwbAddress> CREATOR = null;
    public static final int EXTENDED_ADDRESS_BYTE_LENGTH = 8;
    public static final int SHORT_ADDRESS_BYTE_LENGTH = 2;
    UwbAddress() {}
    @android.annotation.NonNull
    public static android.ranging.uwb.UwbAddress createRandomShortAddress() { return null; }
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public static android.ranging.uwb.UwbAddress fromBytes(byte[] p0) { return null; }
    @android.annotation.NonNull
    public byte[] getAddressBytes() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
