package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class PesSettings extends android.media.tv.tuner.filter.Settings {
    PesSettings() { super(0); }
    public int getStreamId() { return 0; }
    public boolean isRaw() { return false; }
    public static android.media.tv.tuner.filter.PesSettings.Builder builder(int p0) { return null; }

    public static class Builder {
        public android.media.tv.tuner.filter.PesSettings.Builder setStreamId(int p0) { return null; }
        public android.media.tv.tuner.filter.PesSettings.Builder setRaw(boolean p0) { return null; }
        public android.media.tv.tuner.filter.PesSettings build() { return null; }
    }
}
