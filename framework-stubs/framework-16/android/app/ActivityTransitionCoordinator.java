package android.app;

abstract class ActivityTransitionCoordinator extends android.os.ResultReceiver {
    static final java.lang.String KEY_REMOTE_RECEIVER = "android:remoteReceiver";
    protected static final java.lang.String KEY_SCREEN_LEFT = "shared_element:screenLeft";
    protected static final java.lang.String KEY_SCREEN_TOP = "shared_element:screenTop";
    protected static final java.lang.String KEY_SCREEN_RIGHT = "shared_element:screenRight";
    protected static final java.lang.String KEY_SCREEN_BOTTOM = "shared_element:screenBottom";
    protected static final java.lang.String KEY_TRANSLATION_Z = "shared_element:translationZ";
    protected static final java.lang.String KEY_SNAPSHOT = "shared_element:bitmap";
    protected static final java.lang.String KEY_SCALE_TYPE = "shared_element:scaleType";
    protected static final java.lang.String KEY_IMAGE_MATRIX = "shared_element:imageMatrix";
    protected static final java.lang.String KEY_ELEVATION = "shared_element:elevation";
    protected static final android.widget.ImageView.ScaleType[] SCALE_TYPE_VALUES = null;
    public static final int MSG_SET_REMOTE_RECEIVER = 100;
    public static final int MSG_HIDE_SHARED_ELEMENTS = 101;
    public static final int MSG_TAKE_SHARED_ELEMENTS = 103;
    public static final int MSG_EXIT_TRANSITION_COMPLETE = 104;
    public static final int MSG_START_EXIT_TRANSITION = 105;
    public static final int MSG_CANCEL = 106;
    public static final int MSG_SHARED_ELEMENT_DESTINATION = 107;
    public static final int MSG_ALLOW_RETURN_TRANSITION = 108;
    protected final java.util.ArrayList<java.lang.String> mAllSharedElementNames = null;
    protected final java.util.ArrayList<android.view.View> mSharedElements = null;
    protected final java.util.ArrayList<java.lang.String> mSharedElementNames = null;
    protected java.util.ArrayList<android.view.View> mTransitioningViews;
    protected android.app.SharedElementCallback mListener;
    protected android.os.ResultReceiver mResultReceiver;
    protected final boolean mIsReturning = false;
    public ActivityTransitionCoordinator(android.view.Window p0, java.util.ArrayList<java.lang.String> p1, android.app.SharedElementCallback p2, boolean p3) { super((android.os.Handler)null); }
    protected void viewsReady(android.util.ArrayMap<java.lang.String, android.view.View> p0) {}
    protected void stripOffscreenViews() {}
    protected android.view.Window getWindow() { return null; }
    public android.view.ViewGroup getDecor() { return null; }
    protected void setEpicenter() {}
    public java.util.ArrayList<java.lang.String> getAcceptedNames() { return null; }
    public java.util.ArrayList<java.lang.String> getMappedNames() { return null; }
    public java.util.ArrayList<android.view.View> copyMappedViews() { return null; }
    protected android.transition.Transition setTargets(android.transition.Transition p0, boolean p1) { return null; }
    protected android.transition.Transition configureTransition(android.transition.Transition p0, boolean p1) { return null; }
    protected static void removeExcludedViews(android.transition.Transition p0, java.util.ArrayList<android.view.View> p1) {}
    protected static android.transition.Transition mergeTransitions(android.transition.Transition p0, android.transition.Transition p1) { return null; }
    protected android.util.ArrayMap<java.lang.String, android.view.View> mapSharedElements(java.util.ArrayList<java.lang.String> p0, java.util.ArrayList<android.view.View> p1) { return null; }
    protected void setResultReceiver(android.os.ResultReceiver p0) {}
    protected abstract android.transition.Transition getViewsTransition();
    protected java.util.ArrayList<android.app.ActivityTransitionCoordinator.SharedElementOriginalState> setSharedElementState(android.os.Bundle p0, java.util.ArrayList<android.view.View> p1) { return null; }
    protected void notifySharedElementEnd(java.util.ArrayList<android.view.View> p0) {}
    protected void scheduleSetSharedElementEnd(java.util.ArrayList<android.view.View> p0) {}
    protected java.util.ArrayList<android.view.View> createSnapshots(android.os.Bundle p0, java.util.Collection<java.lang.String> p1) { return null; }
    protected static void setOriginalSharedElementState(java.util.ArrayList<android.view.View> p0, java.util.ArrayList<android.app.ActivityTransitionCoordinator.SharedElementOriginalState> p1) {}
    protected android.os.Bundle captureSharedElementState() { return null; }
    protected void clearState() {}
    protected long getFadeDuration() { return 0L; }
    protected void hideViews(java.util.ArrayList<android.view.View> p0) {}
    protected void showViews(java.util.ArrayList<android.view.View> p0, boolean p1) {}
    protected void captureSharedElementState(android.view.View p0, java.lang.String p1, android.os.Bundle p2, android.graphics.Matrix p3, android.graphics.RectF p4) {}
    protected void startTransition(java.lang.Runnable p0) {}
    protected void transitionStarted() {}
    protected boolean cancelPendingTransitions() { return false; }
    protected void moveSharedElementsToOverlay() {}
    protected boolean moveSharedElementWithParent() { return false; }
    public static boolean isInTransitionGroup(android.view.ViewParent p0, android.view.ViewGroup p1) { return false; }
    protected void moveSharedElementsFromOverlay() {}
    protected void setGhostVisibility(int p0) {}
    protected void scheduleGhostVisibilityChange(int p0) {}
    protected boolean isViewsTransitionComplete() { return false; }
    protected void viewsTransitionComplete() {}
    protected void backgroundAnimatorComplete() {}
    protected void sharedElementTransitionComplete() {}
    protected void pauseInput() {}
    protected void onTransitionsComplete() {}
    protected void setTransitioningViewsVisiblity(int p0, boolean p1) {}
    public boolean isTransitionRunning() { return false; }

    protected class ContinueTransitionListener extends android.transition.TransitionListenerAdapter {
        protected ContinueTransitionListener(android.app.ActivityTransitionCoordinator p0) { super(); }
        public void onTransitionStart(android.transition.Transition p0) {}
        public void onTransitionEnd(android.transition.Transition p0) {}
    }

    private static class FixedEpicenterCallback extends android.transition.Transition.EpicenterCallback {
        public void setEpicenter(android.graphics.Rect p0) {}
        public android.graphics.Rect onGetEpicenter(android.transition.Transition p0) { return null; }
    }

    private static class GhostViewListeners implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
        public GhostViewListeners(android.view.View p0, android.view.View p1, android.view.ViewGroup p2) {}
        public android.view.View getView() { return null; }
        public boolean onPreDraw() { return false; }
        public void removeListener() {}
        public void onViewAttachedToWindow(android.view.View p0) {}
        public void onViewDetachedFromWindow(android.view.View p0) {}
    }

    static class SharedElementOriginalState {
        int mLeft;
        int mTop;
        int mRight;
        int mBottom;
        int mMeasuredWidth;
        int mMeasuredHeight;
        android.widget.ImageView.ScaleType mScaleType;
        android.graphics.Matrix mMatrix;
        float mTranslationZ;
        float mElevation;
        SharedElementOriginalState() {}
    }
}
