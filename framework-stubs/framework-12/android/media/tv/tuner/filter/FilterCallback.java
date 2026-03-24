package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public interface FilterCallback {
    public void onFilterEvent(android.media.tv.tuner.filter.Filter p0, android.media.tv.tuner.filter.FilterEvent[] p1);
    public void onFilterStatusChanged(android.media.tv.tuner.filter.Filter p0, int p1);
}
