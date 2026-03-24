package android.bluetooth;

public final class BluetoothCodecType implements android.os.Parcelable {
    public static final long CODEC_ID_AAC = 2L;
    public static final long CODEC_ID_APTX = 16797695L;
    public static final long CODEC_ID_APTX_HD = 604035071L;
    public static final long CODEC_ID_LDAC = -1442763265L;
    public static final long CODEC_ID_OPUS = 16834815L;
    public static final long CODEC_ID_SBC = 0L;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothCodecType> CREATOR = null;
    public BluetoothCodecType(int p0, long p1, java.lang.String p2) {}
    public int describeContents() { return 0; }
    public long getCodecId() { return 0L; }
    @android.annotation.NonNull
    public java.lang.String getCodecName() { return null; }
    public boolean isMandatoryCodec() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.Nullable
    public static android.bluetooth.BluetoothCodecType createFromType(int p0) { return null; }
}
