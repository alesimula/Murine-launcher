package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public final class TsFilterConfiguration extends android.media.tv.tuner.filter.FilterConfiguration {
    TsFilterConfiguration() { super(null); }
    public int getType() { return 0; }
    public int getTpid() { return 0; }
    public static android.media.tv.tuner.filter.TsFilterConfiguration.Builder builder() { return null; }

    public static final class Builder {
        public android.media.tv.tuner.filter.TsFilterConfiguration.Builder setTpid(int p0) { return null; }
        public android.media.tv.tuner.filter.TsFilterConfiguration.Builder setSettings(android.media.tv.tuner.filter.Settings p0) { return null; }
        public android.media.tv.tuner.filter.TsFilterConfiguration build() { return null; }
    }
}
