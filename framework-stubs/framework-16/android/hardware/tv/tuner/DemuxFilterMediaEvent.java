package android.hardware.tv.tuner;

public class DemuxFilterMediaEvent implements android.os.Parcelable {
    public int streamId;
    public boolean isPtsPresent;
    public long pts;
    public boolean isDtsPresent;
    public long dts;
    public long dataLength;
    public long offset;
    public android.hardware.common.NativeHandle avMemory;
    public boolean isSecureMemory;
    public long avDataId;
    public int mpuSequenceNumber;
    public boolean isPesPrivateData;
    public android.hardware.tv.tuner.DemuxFilterMediaEventExtraMetaData extraMetaData;
    public android.hardware.tv.tuner.DemuxFilterScIndexMask scIndexMask;
    public int numDataPieces;
    public int indexInDataGroup;
    public int dataGroupId;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterMediaEvent> CREATOR = null;
    public DemuxFilterMediaEvent() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
