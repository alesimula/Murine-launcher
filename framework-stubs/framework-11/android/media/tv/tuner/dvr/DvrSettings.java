package android.media.tv.tuner.dvr;

@android.annotation.SystemApi
public class DvrSettings {
    public static final int DATA_FORMAT_TS = 0;
    public static final int DATA_FORMAT_PES = 1;
    public static final int DATA_FORMAT_ES = 2;
    public static final int DATA_FORMAT_SHV_TLV = 3;
    private final int mStatusMask = 0;
    private final long mLowThreshold = 0L;
    private final long mHighThreshold = 0L;
    private final long mPacketSize = 0L;
    private final int mDataFormat = 0;
    private DvrSettings(int p0, long p1, long p2, long p3, int p4) {}
    public int getStatusMask() { return 0; }
    public long getLowThreshold() { return 0L; }
    public long getHighThreshold() { return 0L; }
    public long getPacketSize() { return 0L; }
    public int getDataFormat() { return 0; }
    public static android.media.tv.tuner.dvr.DvrSettings.Builder builder() { return null; }

    public static final class Builder {
        private int mStatusMask;
        private long mLowThreshold;
        private long mHighThreshold;
        private long mPacketSize;
        private int mDataFormat;
        public Builder() {}
        public android.media.tv.tuner.dvr.DvrSettings.Builder setStatusMask(int p0) { return null; }
        public android.media.tv.tuner.dvr.DvrSettings.Builder setLowThreshold(long p0) { return null; }
        public android.media.tv.tuner.dvr.DvrSettings.Builder setHighThreshold(long p0) { return null; }
        public android.media.tv.tuner.dvr.DvrSettings.Builder setPacketSize(long p0) { return null; }
        public android.media.tv.tuner.dvr.DvrSettings.Builder setDataFormat(int p0) { return null; }
        public android.media.tv.tuner.dvr.DvrSettings build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataFormat {
    }
}
