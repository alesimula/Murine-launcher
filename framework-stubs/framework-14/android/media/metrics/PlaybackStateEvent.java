package android.media.metrics;

public final class PlaybackStateEvent extends android.media.metrics.Event implements android.os.Parcelable {
    public static final int STATE_NOT_STARTED = 0;
    public static final int STATE_JOINING_BACKGROUND = 1;
    public static final int STATE_JOINING_FOREGROUND = 2;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_PAUSED = 4;
    public static final int STATE_SEEKING = 5;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_PAUSED_BUFFERING = 7;
    public static final int STATE_SUPPRESSED = 9;
    public static final int STATE_SUPPRESSED_BUFFERING = 10;
    public static final int STATE_ENDED = 11;
    public static final int STATE_STOPPED = 12;
    public static final int STATE_FAILED = 13;
    public static final int STATE_INTERRUPTED_BY_AD = 14;
    public static final int STATE_ABANDONED = 15;
    public static final android.os.Parcelable.Creator<android.media.metrics.PlaybackStateEvent> CREATOR = null;
    public static java.lang.String stateToString(int p0) { return null; }
    public int getState() { return 0; }
    public long getTimeSinceCreatedMillis() { return 0L; }
    public android.os.Bundle getMetricsBundle() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder() {}
        public android.media.metrics.PlaybackStateEvent.Builder setState(int p0) { return null; }
        public android.media.metrics.PlaybackStateEvent.Builder setTimeSinceCreatedMillis(long p0) { return null; }
        public android.media.metrics.PlaybackStateEvent.Builder setMetricsBundle(android.os.Bundle p0) { return null; }
        public android.media.metrics.PlaybackStateEvent build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
