package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class MediaEvent extends android.media.tv.tuner.filter.FilterEvent {
    public int getStreamId() { return 0; }
    public boolean isPtsPresent() { return false; }
    public long getPts() { return 0L; }
    public boolean isDtsPresent() { return false; }
    public long getDts() { return 0L; }
    public long getDataLength() { return 0L; }
    public long getOffset() { return 0L; }
    public android.media.MediaCodec.LinearBlock getLinearBlock() { return null; }
    public boolean isSecureMemory() { return false; }
    public long getAvDataId() { return 0L; }
    public long getAudioHandle() { return 0L; }
    public int getMpuSequenceNumber() { return 0; }
    public boolean isPrivateData() { return false; }
    public int getScIndexMask() { return 0; }
    public android.media.tv.tuner.filter.AudioDescriptor getExtraMetaData() { return null; }
    public java.util.List<android.media.AudioPresentation> getAudioPresentations() { return null; }
    protected void finalize() {}
    public void release() {}
}
