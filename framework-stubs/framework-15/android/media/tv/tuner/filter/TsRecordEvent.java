package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class TsRecordEvent extends android.media.tv.tuner.filter.FilterEvent {
    public int getPacketId() { return 0; }
    public int getTsIndexMask() { return 0; }
    public int getScIndexMask() { return 0; }
    public long getDataLength() { return 0L; }
    public long getPts() { return 0L; }
    public int getFirstMacroblockInSlice() { return 0; }
}
