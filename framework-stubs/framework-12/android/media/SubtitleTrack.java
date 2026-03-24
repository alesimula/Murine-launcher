package android.media;

public abstract class SubtitleTrack implements android.media.MediaTimeProvider.OnMediaTimeListener {
    private static final java.lang.String TAG = "SubtitleTrack";
    private long mLastUpdateTimeMs;
    private long mLastTimeMs;
    private java.lang.Runnable mRunnable;
    protected final android.util.LongSparseArray<android.media.SubtitleTrack.Run> mRunsByEndTime = null;
    protected final android.util.LongSparseArray<android.media.SubtitleTrack.Run> mRunsByID = null;
    protected android.media.SubtitleTrack.CueList mCues;
    protected final java.util.Vector<android.media.SubtitleTrack.Cue> mActiveCues = null;
    protected boolean mVisible;
    public boolean DEBUG;
    protected android.os.Handler mHandler;
    private android.media.MediaFormat mFormat;
    private long mNextScheduledTimeMs;
    protected android.media.MediaTimeProvider mTimeProvider;
    public SubtitleTrack(android.media.MediaFormat p0) {}
    public final android.media.MediaFormat getFormat() { return null; }
    protected void onData(android.media.SubtitleData p0) {}
    public abstract void onData(byte[] p0, boolean p1, long p2);
    public abstract android.media.SubtitleTrack.RenderingWidget getRenderingWidget();
    public abstract void updateView(java.util.Vector<android.media.SubtitleTrack.Cue> p0);
    protected synchronized void updateActiveCues(boolean p0, long p1) {}
    private void removeRunsByEndTimeIndex(int p0) {}
    protected void finalize() throws java.lang.Throwable {}
    private synchronized void takeTime(long p0) {}
    protected synchronized void clearActiveCues() {}
    protected void scheduleTimedEvents() {}
    public void onTimedEvent(long p0) {}
    public void onSeek(long p0) {}
    public void onStop() {}
    public void show() {}
    public void hide() {}
    protected synchronized boolean addCue(android.media.SubtitleTrack.Cue p0) { return false; }
    public synchronized void setTimeProvider(android.media.MediaTimeProvider p0) {}
    protected void finishedRun(long p0) {}
    public void setRunDiscardTimeMs(long p0, long p1) {}
    public int getTrackType() { return 0; }

    public static class Cue {
        public long mStartTimeMs;
        public long mEndTimeMs;
        public long[] mInnerTimesMs;
        public long mRunID;
        public android.media.SubtitleTrack.Cue mNextInRun;
        public Cue() {}
        public void onTime(long p0) {}
    }

    static class CueList {
        private static final java.lang.String TAG = "CueList";
        private java.util.SortedMap<java.lang.Long, java.util.Vector<android.media.SubtitleTrack.Cue>> mCues;
        public boolean DEBUG;
        private boolean addEvent(android.media.SubtitleTrack.Cue p0, long p1) { return false; }
        private void removeEvent(android.media.SubtitleTrack.Cue p0, long p1) {}
        public void add(android.media.SubtitleTrack.Cue p0) {}
        public void remove(android.media.SubtitleTrack.Cue p0) {}
        public java.lang.Iterable<android.util.Pair<java.lang.Long, android.media.SubtitleTrack.Cue>> entriesBetween(long p0, long p1) { return null; }
        public long nextTimeAfter(long p0) { return 0L; }
        CueList() {}

        class EntryIterator implements java.util.Iterator<android.util.Pair<java.lang.Long, android.media.SubtitleTrack.Cue>> {
            private long mCurrentTimeMs;
            private java.util.Iterator<android.media.SubtitleTrack.Cue> mListIterator;
            private boolean mDone;
            private java.util.SortedMap<java.lang.Long, java.util.Vector<android.media.SubtitleTrack.Cue>> mRemainingCues;
            private java.util.Iterator<android.media.SubtitleTrack.Cue> mLastListIterator;
            private android.util.Pair<java.lang.Long, android.media.SubtitleTrack.Cue> mLastEntry;
            public boolean hasNext() { return false; }
            public android.util.Pair<java.lang.Long, android.media.SubtitleTrack.Cue> next() { return null; }
            public void remove() {}
            public EntryIterator(java.util.SortedMap<java.lang.Long, java.util.Vector<android.media.SubtitleTrack.Cue>> p0) {}
            private void nextKey() {}
        }
    }

    public static interface RenderingWidget {
        public void setOnChangedListener(android.media.SubtitleTrack.RenderingWidget.OnChangedListener p0);
        public void setSize(int p0, int p1);
        public void setVisible(boolean p0);
        public void draw(android.graphics.Canvas p0);
        public void onAttachedToWindow();
        public void onDetachedFromWindow();

        public static interface OnChangedListener {
            public void onChanged(android.media.SubtitleTrack.RenderingWidget p0);
        }
    }

    private static class Run {
        public android.media.SubtitleTrack.Cue mFirstCue;
        public android.media.SubtitleTrack.Run mNextRunAtEndTimeMs;
        public android.media.SubtitleTrack.Run mPrevRunAtEndTimeMs;
        public long mEndTimeMs;
        public long mRunID;
        private long mStoredEndTimeMs;
        private Run() {}
        public void storeByEndTimeMs(android.util.LongSparseArray<android.media.SubtitleTrack.Run> p0) {}
        public void removeAtEndTimeMs() {}
    }
}
