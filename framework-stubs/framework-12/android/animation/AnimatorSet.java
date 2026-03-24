package android.animation;

public final class AnimatorSet extends android.animation.Animator implements android.animation.AnimationHandler.AnimationFrameCallback {
    private static final java.lang.String TAG = "AnimatorSet";
    private java.util.ArrayList<android.animation.AnimatorSet.Node> mPlayingSet;
    private android.util.ArrayMap<android.animation.Animator, android.animation.AnimatorSet.Node> mNodeMap;
    private java.util.ArrayList<android.animation.AnimatorSet.AnimationEvent> mEvents;
    private java.util.ArrayList<android.animation.AnimatorSet.Node> mNodes;
    private boolean mDependencyDirty;
    private boolean mStarted;
    private long mStartDelay;
    private android.animation.ValueAnimator mDelayAnim;
    private android.animation.AnimatorSet.Node mRootNode;
    private long mDuration;
    private android.animation.TimeInterpolator mInterpolator;
    private long mTotalDuration;
    private final boolean mShouldIgnoreEndWithoutStart = false;
    private final boolean mShouldResetValuesAtStart = false;
    private final boolean mEndCanBeCalled = false;
    private long mLastFrameTime;
    private long mFirstFrame;
    private int mLastEventId;
    private boolean mReversing;
    private boolean mSelfPulse;
    private android.animation.AnimatorSet.SeekState mSeekState;
    private boolean mChildrenInitialized;
    private long mPauseTime;
    private android.animation.AnimatorListenerAdapter mAnimationEndListener;
    public AnimatorSet() { super(); }
    public void playTogether(android.animation.Animator... p0) {}
    public void playTogether(java.util.Collection<android.animation.Animator> p0) {}
    public void playSequentially(android.animation.Animator... p0) {}
    public void playSequentially(java.util.List<android.animation.Animator> p0) {}
    public java.util.ArrayList<android.animation.Animator> getChildAnimations() { return null; }
    public void setTarget(java.lang.Object p0) {}
    public int getChangingConfigurations() { return 0; }
    public void setInterpolator(android.animation.TimeInterpolator p0) {}
    public android.animation.TimeInterpolator getInterpolator() { return null; }
    public android.animation.AnimatorSet.Builder play(android.animation.Animator p0) { return null; }
    public void cancel() {}
    private void forceToEnd() {}
    public void end() {}
    public boolean isRunning() { return false; }
    public boolean isStarted() { return false; }
    public long getStartDelay() { return 0L; }
    public void setStartDelay(long p0) {}
    public long getDuration() { return 0L; }
    public android.animation.AnimatorSet setDuration(long p0) { return null; }
    public void setupStartValues() {}
    public void setupEndValues() {}
    public void pause() {}
    public void resume() {}
    public void start() {}
    void startWithoutPulsing(boolean p0) {}
    private void initAnimation() {}
    private void start(boolean p0, boolean p1) {}
    private static boolean isEmptySet(android.animation.AnimatorSet p0) { return false; }
    private void updateAnimatorsDuration() {}
    void skipToEndValue(boolean p0) {}
    void animateBasedOnPlayTime(long p0, long p1, boolean p2) {}
    boolean isInitialized() { return false; }
    private void skipToStartValue(boolean p0) {}
    public void setCurrentPlayTime(long p0) {}
    public long getCurrentPlayTime() { return 0L; }
    private void initChildren() {}
    public boolean doAnimationFrame(long p0) { return false; }
    public void commitAnimationFrame(long p0) {}
    boolean pulseAnimationFrame(long p0) { return false; }
    private void handleAnimationEvents(int p0, int p1, long p2) {}
    private void pulseFrame(android.animation.AnimatorSet.Node p0, long p1) {}
    private long getPlayTimeForNode(long p0, android.animation.AnimatorSet.Node p1) { return 0L; }
    private long getPlayTimeForNode(long p0, android.animation.AnimatorSet.Node p1, boolean p2) { return 0L; }
    private void startAnimation() {}
    private void addAnimationEndListener() {}
    private void removeAnimationEndListener() {}
    private int findLatestEventIdForTime(long p0) { return 0; }
    private void endAnimation() {}
    private void removeAnimationCallback() {}
    private void addAnimationCallback(long p0) {}
    public android.animation.AnimatorSet clone() { return null; }
    public boolean canReverse() { return false; }
    public void reverse() {}
    public java.lang.String toString() { return null; }
    private void printChildCount() {}
    private void createDependencyGraph() {}
    private void sortAnimationEvents() {}
    private void updatePlayTime(android.animation.AnimatorSet.Node p0, java.util.ArrayList<android.animation.AnimatorSet.Node> p1) {}
    private void findSiblings(android.animation.AnimatorSet.Node p0, java.util.ArrayList<android.animation.AnimatorSet.Node> p1) {}
    public boolean shouldPlayTogether() { return false; }
    public long getTotalDuration() { return 0L; }
    private android.animation.AnimatorSet.Node getNodeForAnimation(android.animation.Animator p0) { return null; }

    private static class AnimationEvent {
        static final int ANIMATION_START = 0;
        static final int ANIMATION_DELAY_ENDED = 1;
        static final int ANIMATION_END = 2;
        final android.animation.AnimatorSet.Node mNode = null;
        final int mEvent = 0;
        AnimationEvent(android.animation.AnimatorSet.Node p0, int p1) {}
        long getTime() { return 0L; }
        public java.lang.String toString() { return null; }
    }

    public class Builder {
        private android.animation.AnimatorSet.Node mCurrentNode;
        Builder(android.animation.AnimatorSet p0, android.animation.Animator p1) {}
        public android.animation.AnimatorSet.Builder with(android.animation.Animator p0) { return null; }
        public android.animation.AnimatorSet.Builder before(android.animation.Animator p0) { return null; }
        public android.animation.AnimatorSet.Builder after(android.animation.Animator p0) { return null; }
        public android.animation.AnimatorSet.Builder after(long p0) { return null; }
    }

    private static class Node implements java.lang.Cloneable {
        android.animation.Animator mAnimation;
        java.util.ArrayList<android.animation.AnimatorSet.Node> mChildNodes;
        boolean mEnded;
        java.util.ArrayList<android.animation.AnimatorSet.Node> mSiblings;
        java.util.ArrayList<android.animation.AnimatorSet.Node> mParents;
        android.animation.AnimatorSet.Node mLatestParent;
        boolean mParentsAdded;
        long mStartTime;
        long mEndTime;
        long mTotalDuration;
        public Node(android.animation.Animator p0) {}
        public android.animation.AnimatorSet.Node clone() { return null; }
        void addChild(android.animation.AnimatorSet.Node p0) {}
        public void addSibling(android.animation.AnimatorSet.Node p0) {}
        public void addParent(android.animation.AnimatorSet.Node p0) {}
        public void addParents(java.util.ArrayList<android.animation.AnimatorSet.Node> p0) {}
    }

    private class SeekState {
        private long mPlayTime;
        private boolean mSeekingInReverse;
        private SeekState(android.animation.AnimatorSet p0) {}
        void reset() {}
        void setPlayTime(long p0, boolean p1) {}
        void updateSeekDirection(boolean p0) {}
        long getPlayTime() { return 0L; }
        long getPlayTimeNormalized() { return 0L; }
        boolean isActive() { return false; }
    }
}
