package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class SectionEvent extends android.media.tv.tuner.filter.FilterEvent {
    public int getTableId() { return 0; }
    public int getVersion() { return 0; }
    public int getSectionNumber() { return 0; }
    @java.lang.Deprecated
    public int getDataLength() { return 0; }
    public long getDataLengthLong() { return 0L; }
}
