package android.transition;

public abstract class Transition implements java.lang.Cloneable {
    private static final java.lang.String LOG_TAG = "Transition";
    static final boolean DBG = false;
    public static final int MATCH_INSTANCE = 1;
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_NAME = 2;
    public static final int MATCH_ID = 3;
    public static final int MATCH_ITEM_ID = 4;
    private static final int MATCH_LAST = 4;
    private static final java.lang.String MATCH_INSTANCE_STR = "instance";
    private static final java.lang.String MATCH_NAME_STR = "name";
    private static final java.lang.String MATCH_VIEW_NAME_STR = "viewName";
    private static final java.lang.String MATCH_ID_STR = "id";
    private static final java.lang.String MATCH_ITEM_ID_STR = "itemId";
    private static final int[] DEFAULT_MATCH_ORDER = null;
    private static final android.transition.PathMotion STRAIGHT_PATH_MOTION = null;
    private java.lang.String mName;
    long mStartDelay;
    long mDuration;
    android.animation.TimeInterpolator mInterpolator;
    java.util.ArrayList<java.lang.Integer> mTargetIds;
    java.util.ArrayList<android.view.View> mTargets;
    java.util.ArrayList<java.lang.String> mTargetNames;
    java.util.ArrayList<java.lang.Class> mTargetTypes;
    java.util.ArrayList<java.lang.Integer> mTargetIdExcludes;
    java.util.ArrayList<android.view.View> mTargetExcludes;
    java.util.ArrayList<java.lang.Class> mTargetTypeExcludes;
    java.util.ArrayList<java.lang.String> mTargetNameExcludes;
    java.util.ArrayList<java.lang.Integer> mTargetIdChildExcludes;
    java.util.ArrayList<android.view.View> mTargetChildExcludes;
    java.util.ArrayList<java.lang.Class> mTargetTypeChildExcludes;
    private android.transition.TransitionValuesMaps mStartValues;
    private android.transition.TransitionValuesMaps mEndValues;
    android.transition.TransitionSet mParent;
    int[] mMatchOrder;
    java.util.ArrayList<android.transition.TransitionValues> mStartValuesList;
    java.util.ArrayList<android.transition.TransitionValues> mEndValuesList;
    private static java.lang.ThreadLocal<android.util.ArrayMap<android.animation.Animator, android.transition.Transition.AnimationInfo>> sRunningAnimators;
    android.view.ViewGroup mSceneRoot;
    boolean mCanRemoveViews;
    private java.util.ArrayList<android.animation.Animator> mCurrentAnimators;
    int mNumInstances;
    boolean mPaused;
    private boolean mEnded;
    java.util.ArrayList<android.transition.Transition.TransitionListener> mListeners;
    java.util.ArrayList<android.animation.Animator> mAnimators;
    android.transition.TransitionPropagation mPropagation;
    android.transition.Transition.EpicenterCallback mEpicenterCallback;
    android.util.ArrayMap<java.lang.String, java.lang.String> mNameOverrides;
    android.transition.PathMotion mPathMotion;
    public Transition() {}
    public Transition(android.content.Context p0, android.util.AttributeSet p1) {}
    private static int[] parseMatchOrder(java.lang.String p0) { return null; }
    public android.transition.Transition setDuration(long p0) { return null; }
    public long getDuration() { return 0L; }
    public android.transition.Transition setStartDelay(long p0) { return null; }
    public long getStartDelay() { return 0L; }
    public android.transition.Transition setInterpolator(android.animation.TimeInterpolator p0) { return null; }
    public android.animation.TimeInterpolator getInterpolator() { return null; }
    public java.lang.String[] getTransitionProperties() { return null; }
    public android.animation.Animator createAnimator(android.view.ViewGroup p0, android.transition.TransitionValues p1, android.transition.TransitionValues p2) { return null; }
    public void setMatchOrder(int... p0) {}
    private static boolean isValidMatch(int p0) { return false; }
    private static boolean alreadyContains(int[] p0, int p1) { return false; }
    private void matchInstances(android.util.ArrayMap<android.view.View, android.transition.TransitionValues> p0, android.util.ArrayMap<android.view.View, android.transition.TransitionValues> p1) {}
    private void matchItemIds(android.util.ArrayMap<android.view.View, android.transition.TransitionValues> p0, android.util.ArrayMap<android.view.View, android.transition.TransitionValues> p1, android.util.LongSparseArray<android.view.View> p2, android.util.LongSparseArray<android.view.View> p3) {}
    private void matchIds(android.util.ArrayMap<android.view.View, android.transition.TransitionValues> p0, android.util.ArrayMap<android.view.View, android.transition.TransitionValues> p1, android.util.SparseArray<android.view.View> p2, android.util.SparseArray<android.view.View> p3) {}
    private void matchNames(android.util.ArrayMap<android.view.View, android.transition.TransitionValues> p0, android.util.ArrayMap<android.view.View, android.transition.TransitionValues> p1, android.util.ArrayMap<java.lang.String, android.view.View> p2, android.util.ArrayMap<java.lang.String, android.view.View> p3) {}
    private void addUnmatched(android.util.ArrayMap<android.view.View, android.transition.TransitionValues> p0, android.util.ArrayMap<android.view.View, android.transition.TransitionValues> p1) {}
    private void matchStartAndEnd(android.transition.TransitionValuesMaps p0, android.transition.TransitionValuesMaps p1) {}
    protected void createAnimators(android.view.ViewGroup p0, android.transition.TransitionValuesMaps p1, android.transition.TransitionValuesMaps p2, java.util.ArrayList<android.transition.TransitionValues> p3, java.util.ArrayList<android.transition.TransitionValues> p4) {}
    public boolean isValidTarget(android.view.View p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    private static android.util.ArrayMap<android.animation.Animator, android.transition.Transition.AnimationInfo> getRunningAnimators() { return null; }
    protected void runAnimators() {}
    private void runAnimator(android.animation.Animator p0, android.util.ArrayMap<android.animation.Animator, android.transition.Transition.AnimationInfo> p1) {}
    public abstract void captureStartValues(android.transition.TransitionValues p0);
    public abstract void captureEndValues(android.transition.TransitionValues p0);
    public android.transition.Transition addTarget(int p0) { return null; }
    public android.transition.Transition addTarget(java.lang.String p0) { return null; }
    public android.transition.Transition addTarget(java.lang.Class p0) { return null; }
    public android.transition.Transition removeTarget(int p0) { return null; }
    public android.transition.Transition removeTarget(java.lang.String p0) { return null; }
    public android.transition.Transition excludeTarget(int p0, boolean p1) { return null; }
    public android.transition.Transition excludeTarget(java.lang.String p0, boolean p1) { return null; }
    public android.transition.Transition excludeChildren(int p0, boolean p1) { return null; }
    public android.transition.Transition excludeTarget(android.view.View p0, boolean p1) { return null; }
    public android.transition.Transition excludeChildren(android.view.View p0, boolean p1) { return null; }
    private static <T extends java.lang.Object> java.util.ArrayList<T> excludeObject(java.util.ArrayList<T> p0, T p1, boolean p2) { return null; }
    public android.transition.Transition excludeTarget(java.lang.Class p0, boolean p1) { return null; }
    public android.transition.Transition excludeChildren(java.lang.Class p0, boolean p1) { return null; }
    public android.transition.Transition addTarget(android.view.View p0) { return null; }
    public android.transition.Transition removeTarget(android.view.View p0) { return null; }
    public android.transition.Transition removeTarget(java.lang.Class p0) { return null; }
    public java.util.List<java.lang.Integer> getTargetIds() { return null; }
    public java.util.List<android.view.View> getTargets() { return null; }
    public java.util.List<java.lang.String> getTargetNames() { return null; }
    public java.util.List<java.lang.String> getTargetViewNames() { return null; }
    public java.util.List<java.lang.Class> getTargetTypes() { return null; }
    void captureValues(android.view.ViewGroup p0, boolean p1) {}
    static void addViewValues(android.transition.TransitionValuesMaps p0, android.view.View p1, android.transition.TransitionValues p2) {}
    void clearValues(boolean p0) {}
    private void captureHierarchy(android.view.View p0, boolean p1) {}
    public android.transition.TransitionValues getTransitionValues(android.view.View p0, boolean p1) { return null; }
    android.transition.TransitionValues getMatchedTransitionValues(android.view.View p0, boolean p1) { return null; }
    public void pause(android.view.View p0) {}
    public void resume(android.view.View p0) {}
    void playTransition(android.view.ViewGroup p0) {}
    public boolean isTransitionRequired(android.transition.TransitionValues p0, android.transition.TransitionValues p1) { return false; }
    private static boolean isValueChanged(android.transition.TransitionValues p0, android.transition.TransitionValues p1, java.lang.String p2) { return false; }
    protected void animate(android.animation.Animator p0) {}
    protected void start() {}
    @android.annotation.UnsupportedAppUsage
    protected void end() {}
    void forceToEnd(android.view.ViewGroup p0) {}
    @android.annotation.UnsupportedAppUsage
    protected void cancel() {}
    public android.transition.Transition addListener(android.transition.Transition.TransitionListener p0) { return null; }
    public android.transition.Transition removeListener(android.transition.Transition.TransitionListener p0) { return null; }
    public void setEpicenterCallback(android.transition.Transition.EpicenterCallback p0) {}
    public android.transition.Transition.EpicenterCallback getEpicenterCallback() { return null; }
    public android.graphics.Rect getEpicenter() { return null; }
    public void setPathMotion(android.transition.PathMotion p0) {}
    public android.transition.PathMotion getPathMotion() { return null; }
    public void setPropagation(android.transition.TransitionPropagation p0) {}
    public android.transition.TransitionPropagation getPropagation() { return null; }
    void capturePropagationValues(android.transition.TransitionValues p0) {}
    android.transition.Transition setSceneRoot(android.view.ViewGroup p0) { return null; }
    void setCanRemoveViews(boolean p0) {}
    public boolean canRemoveViews() { return false; }
    public void setNameOverrides(android.util.ArrayMap<java.lang.String, java.lang.String> p0) {}
    public android.util.ArrayMap<java.lang.String, java.lang.String> getNameOverrides() { return null; }
    public java.lang.String toString() { return null; }
    public android.transition.Transition clone() { return null; }
    public java.lang.String getName() { return null; }
    java.lang.String toString(java.lang.String p0) { return null; }

    public static interface TransitionListener {
        public void onTransitionStart(android.transition.Transition p0);
        public void onTransitionEnd(android.transition.Transition p0);
        public void onTransitionCancel(android.transition.Transition p0);
        public void onTransitionPause(android.transition.Transition p0);
        public void onTransitionResume(android.transition.Transition p0);
    }

    public static abstract class EpicenterCallback {
        public EpicenterCallback() {}
        public abstract android.graphics.Rect onGetEpicenter(android.transition.Transition p0);
    }

    private static class ArrayListManager {
        private ArrayListManager() {}
        static <T extends java.lang.Object> java.util.ArrayList<T> add(java.util.ArrayList<T> p0, T p1) { return null; }
        static <T extends java.lang.Object> java.util.ArrayList<T> remove(java.util.ArrayList<T> p0, T p1) { return null; }
    }

    public static class AnimationInfo {
        public android.view.View view;
        java.lang.String name;
        android.transition.TransitionValues values;
        android.view.WindowId windowId;
        android.transition.Transition transition;
        AnimationInfo(android.view.View p0, java.lang.String p1, android.transition.Transition p2, android.view.WindowId p3, android.transition.TransitionValues p4) {}
    }
}
