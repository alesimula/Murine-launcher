package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public interface SharedFilterCallback {
    public void onFilterEvent(android.media.tv.tuner.filter.SharedFilter p0, android.media.tv.tuner.filter.FilterEvent[] p1);
    public void onFilterStatusChanged(android.media.tv.tuner.filter.SharedFilter p0, int p1);
}
