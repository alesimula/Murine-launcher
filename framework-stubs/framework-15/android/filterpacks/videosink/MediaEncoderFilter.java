package android.filterpacks.videosink;

public class MediaEncoderFilter extends android.filterfw.core.Filter {
    public MediaEncoderFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void open(android.filterfw.core.FilterContext p0) {}
    public boolean skipFrameAndModifyTimestamp(long p0) { return false; }
    public void process(android.filterfw.core.FilterContext p0) {}
    public void close(android.filterfw.core.FilterContext p0) {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}

    public static interface OnRecordingDoneListener {
        public void onRecordingDone();
    }
}
