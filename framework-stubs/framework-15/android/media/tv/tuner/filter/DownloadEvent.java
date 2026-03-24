package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class DownloadEvent extends android.media.tv.tuner.filter.FilterEvent {
    public int getItemId() { return 0; }
    public int getDownloadId() { return 0; }
    public int getMpuSequenceNumber() { return 0; }
    public int getItemFragmentIndex() { return 0; }
    public int getLastItemFragmentIndex() { return 0; }
    public int getDataLength() { return 0; }
}
