package android.media.session;

public final class PlaybackState implements android.os.Parcelable {
    public static final long ACTION_STOP = 1L;
    public static final long ACTION_PAUSE = 2L;
    public static final long ACTION_PLAY = 4L;
    public static final long ACTION_REWIND = 8L;
    public static final long ACTION_SKIP_TO_PREVIOUS = 16L;
    public static final long ACTION_SKIP_TO_NEXT = 32L;
    public static final long ACTION_FAST_FORWARD = 64L;
    public static final long ACTION_SET_RATING = 128L;
    public static final long ACTION_SEEK_TO = 256L;
    public static final long ACTION_PLAY_PAUSE = 512L;
    public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024L;
    public static final long ACTION_PLAY_FROM_SEARCH = 2048L;
    public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096L;
    public static final long ACTION_PLAY_FROM_URI = 8192L;
    public static final long ACTION_PREPARE = 16384L;
    public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768L;
    public static final long ACTION_PREPARE_FROM_SEARCH = 65536L;
    public static final long ACTION_PREPARE_FROM_URI = 131072L;
    public static final long ACTION_SET_PLAYBACK_SPEED = 4194304L;
    public static final int STATE_NONE = 0;
    public static final int STATE_STOPPED = 1;
    public static final int STATE_PAUSED = 2;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_FAST_FORWARDING = 4;
    public static final int STATE_REWINDING = 5;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_ERROR = 7;
    public static final int STATE_CONNECTING = 8;
    public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
    public static final int STATE_SKIPPING_TO_NEXT = 10;
    public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
    public static final long PLAYBACK_POSITION_UNKNOWN = -1L;
    public static final android.os.Parcelable.Creator<android.media.session.PlaybackState> CREATOR = null;
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getState() { return 0; }
    public long getPosition() { return 0L; }
    public long getBufferedPosition() { return 0L; }
    public float getPlaybackSpeed() { return 0.0f; }
    public long getActions() { return 0L; }
    public java.util.List<android.media.session.PlaybackState.CustomAction> getCustomActions() { return null; }
    public java.lang.CharSequence getErrorMessage() { return null; }
    public long getLastPositionUpdateTime() { return 0L; }
    public long getActiveQueueItemId() { return 0L; }
    public android.os.Bundle getExtras() { return null; }
    public boolean isActive() { return false; }

    public static final class CustomAction implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.session.PlaybackState.CustomAction> CREATOR = null;
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public java.lang.String getAction() { return null; }
        public java.lang.CharSequence getName() { return null; }
        public int getIcon() { return 0; }
        public android.os.Bundle getExtras() { return null; }
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder(java.lang.String p0, java.lang.CharSequence p1, int p2) {}
            public android.media.session.PlaybackState.CustomAction.Builder setExtras(android.os.Bundle p0) { return null; }
            public android.media.session.PlaybackState.CustomAction build() { return null; }
        }
    }

    public static final class Builder {
        public Builder() {}
        public Builder(android.media.session.PlaybackState p0) {}
        public android.media.session.PlaybackState.Builder setState(int p0, long p1, float p2, long p3) { return null; }
        public android.media.session.PlaybackState.Builder setState(int p0, long p1, float p2) { return null; }
        public android.media.session.PlaybackState.Builder setActions(long p0) { return null; }
        public android.media.session.PlaybackState.Builder addCustomAction(java.lang.String p0, java.lang.String p1, int p2) { return null; }
        public android.media.session.PlaybackState.Builder addCustomAction(android.media.session.PlaybackState.CustomAction p0) { return null; }
        public android.media.session.PlaybackState.Builder setBufferedPosition(long p0) { return null; }
        public android.media.session.PlaybackState.Builder setActiveQueueItemId(long p0) { return null; }
        public android.media.session.PlaybackState.Builder setErrorMessage(java.lang.CharSequence p0) { return null; }
        public android.media.session.PlaybackState.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.media.session.PlaybackState build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Actions {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
