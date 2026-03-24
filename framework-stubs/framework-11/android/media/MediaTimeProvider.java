package android.media;

public interface MediaTimeProvider {
    public static final long NO_TIME = -1L;
    public void notifyAt(long p0, android.media.MediaTimeProvider.OnMediaTimeListener p1);
    public void scheduleUpdate(android.media.MediaTimeProvider.OnMediaTimeListener p0);
    public void cancelNotifications(android.media.MediaTimeProvider.OnMediaTimeListener p0);
    public long getCurrentTimeUs(boolean p0, boolean p1) throws java.lang.IllegalStateException;

    public static interface OnMediaTimeListener {
        public void onTimedEvent(long p0);
        public void onSeek(long p0);
        public void onStop();
    }
}
