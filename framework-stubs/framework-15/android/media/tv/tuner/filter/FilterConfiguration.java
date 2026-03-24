package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public abstract class FilterConfiguration {
    @android.annotation.Nullable
    final android.media.tv.tuner.filter.Settings mSettings = null;
    FilterConfiguration(android.media.tv.tuner.filter.Settings p0) {}
    public abstract int getType();
    @android.annotation.Nullable
    public android.media.tv.tuner.filter.Settings getSettings() { return null; }
}
