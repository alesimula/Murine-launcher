package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class AvSettings extends android.media.tv.tuner.filter.Settings {
    private final boolean mIsPassthrough = false;
    private AvSettings(int p0, boolean p1, boolean p2) { super(0); }
    public boolean isPassthrough() { return false; }
    public static android.media.tv.tuner.filter.AvSettings.Builder builder(int p0, boolean p1) { return null; }

    public static class Builder {
        private final int mMainType = 0;
        private final boolean mIsAudio = false;
        private boolean mIsPassthrough;
        private Builder(int p0, boolean p1) {}
        public android.media.tv.tuner.filter.AvSettings.Builder setPassthrough(boolean p0) { return null; }
        public android.media.tv.tuner.filter.AvSettings build() { return null; }
    }
}
