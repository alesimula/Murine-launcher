package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public final class TsFilterConfiguration extends android.media.tv.tuner.filter.FilterConfiguration {
    TsFilterConfiguration() { super(null); }
    public int getType() { return 0; }
    public int getTpid() { return 0; }
    @android.annotation.NonNull
    public static android.media.tv.tuner.filter.TsFilterConfiguration.Builder builder() { return null; }

    public static final class Builder {
        @android.annotation.NonNull
        public android.media.tv.tuner.filter.TsFilterConfiguration.Builder setTpid(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.filter.TsFilterConfiguration.Builder setSettings(android.media.tv.tuner.filter.Settings p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.filter.TsFilterConfiguration build() { return null; }
    }
}
