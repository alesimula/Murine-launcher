package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class DownloadSettings extends android.media.tv.tuner.filter.Settings {
    DownloadSettings() { super(0); }
    public int getDownloadId() { return 0; }
    public boolean useDownloadId() { return false; }
    public static android.media.tv.tuner.filter.DownloadSettings.Builder builder(int p0) { return null; }

    public static class Builder {
        public android.media.tv.tuner.filter.DownloadSettings.Builder setUseDownloadId(boolean p0) { return null; }
        public android.media.tv.tuner.filter.DownloadSettings.Builder setDownloadId(int p0) { return null; }
        public android.media.tv.tuner.filter.DownloadSettings build() { return null; }
    }
}
