package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class DownloadSettings extends android.media.tv.tuner.filter.Settings {
    private final int mDownloadId = 0;
    private DownloadSettings(int p0, int p1) { super(0); }
    public int getDownloadId() { return 0; }
    public static android.media.tv.tuner.filter.DownloadSettings.Builder builder(int p0) { return null; }

    public static class Builder {
        private final int mMainType = 0;
        private int mDownloadId;
        private Builder(int p0) {}
        public android.media.tv.tuner.filter.DownloadSettings.Builder setDownloadId(int p0) { return null; }
        public android.media.tv.tuner.filter.DownloadSettings build() { return null; }
    }
}
