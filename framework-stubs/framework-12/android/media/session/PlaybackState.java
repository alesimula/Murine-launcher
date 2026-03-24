package android.media.session;

public final class PlaybackState implements android.os.Parcelable {
    private static final java.lang.String TAG = "PlaybackState";
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
    private final int mState = 0;
    private final long mPosition = 0L;
    private final long mBufferedPosition = 0L;
    private final float mSpeed = 0.0f;
    private final long mActions = 0L;
    private java.util.List<android.media.session.PlaybackState.CustomAction> mCustomActions;
    private final java.lang.CharSequence mErrorMessage = null;
    private final long mUpdateTime = 0L;
    private final long mActiveItemId = 0L;
    private final android.os.Bundle mExtras = null;
    public static final android.os.Parcelable.Creator<android.media.session.PlaybackState> CREATOR = null;
    private PlaybackState(int p0, long p1, long p2, float p3, long p4, long p5, java.util.List<android.media.session.PlaybackState.CustomAction> p6, long p7, java.lang.CharSequence p8, android.os.Bundle p9) {}
    private PlaybackState(android.os.Parcel p0) {}
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

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Actions {
    }

    public static final class Builder {
        private final java.util.List<android.media.session.PlaybackState.CustomAction> mCustomActions = null;
        private int mState;
        private long mPosition;
        private long mBufferedPosition;
        private float mSpeed;
        private long mActions;
        private java.lang.CharSequence mErrorMessage;
        private long mUpdateTime;
        private long mActiveItemId;
        private android.os.Bundle mExtras;
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

    public static final class CustomAction implements android.os.Parcelable {
        private final java.lang.String mAction = null;
        private final java.lang.CharSequence mName = null;
        private final int mIcon = 0;
        private final android.os.Bundle mExtras = null;
        public static final android.os.Parcelable.Creator<android.media.session.PlaybackState.CustomAction> CREATOR = null;
        private CustomAction(java.lang.String p0, java.lang.CharSequence p1, int p2, android.os.Bundle p3) {}
        private CustomAction(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public java.lang.String getAction() { return null; }
        public java.lang.CharSequence getName() { return null; }
        public int getIcon() { return 0; }
        public android.os.Bundle getExtras() { return null; }
        public java.lang.String toString() { return null; }

        public static final class Builder {
            private final java.lang.String mAction = null;
            private final java.lang.CharSequence mName = null;
            private final int mIcon = 0;
            private android.os.Bundle mExtras;
            public Builder(java.lang.String p0, java.lang.CharSequence p1, int p2) {}
            public android.media.session.PlaybackState.CustomAction.Builder setExtras(android.os.Bundle p0) { return null; }
            public android.media.session.PlaybackState.CustomAction build() { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
