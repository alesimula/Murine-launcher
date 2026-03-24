package android.app;

final class FragmentManagerImpl extends android.app.FragmentManager implements android.view.LayoutInflater.Factory2 {
    static boolean DEBUG;
    static final java.lang.String TAG = "FragmentManager";
    static final java.lang.String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
    static final java.lang.String TARGET_STATE_TAG = "android:target_state";
    static final java.lang.String VIEW_STATE_TAG = "android:view_state";
    static final java.lang.String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
    java.util.ArrayList<android.app.FragmentManagerImpl.OpGenerator> mPendingActions;
    boolean mExecutingActions;
    int mNextFragmentIndex;
    android.util.SparseArray<android.app.Fragment> mActive;
    final java.util.ArrayList<android.app.Fragment> mAdded = null;
    java.util.ArrayList<android.app.BackStackRecord> mBackStack;
    java.util.ArrayList<android.app.Fragment> mCreatedMenus;
    java.util.ArrayList<android.app.BackStackRecord> mBackStackIndices;
    java.util.ArrayList<java.lang.Integer> mAvailBackStackIndices;
    java.util.ArrayList<android.app.FragmentManager.OnBackStackChangedListener> mBackStackChangeListeners;
    final java.util.concurrent.CopyOnWriteArrayList<android.util.Pair<android.app.FragmentManager.FragmentLifecycleCallbacks, java.lang.Boolean>> mLifecycleCallbacks = null;
    int mCurState;
    android.app.FragmentHostCallback<?> mHost;
    android.app.FragmentContainer mContainer;
    android.app.Fragment mParent;
    android.app.Fragment mPrimaryNav;
    boolean mNeedMenuInvalidate;
    boolean mStateSaved;
    boolean mDestroyed;
    java.lang.String mNoTransactionsBecause;
    boolean mHavePendingDeferredStart;
    java.util.ArrayList<android.app.BackStackRecord> mTmpRecords;
    java.util.ArrayList<java.lang.Boolean> mTmpIsPop;
    java.util.ArrayList<android.app.Fragment> mTmpAddedFragments;
    android.os.Bundle mStateBundle;
    android.util.SparseArray<android.os.Parcelable> mStateArray;
    java.util.ArrayList<android.app.FragmentManagerImpl.StartEnterTransitionListener> mPostponedTransactions;
    boolean mAllowOldReentrantBehavior;
    android.app.FragmentManagerNonConfig mSavedNonConfig;
    java.lang.Runnable mExecCommit;
    FragmentManagerImpl() { super(); }
    static boolean modifiesAlpha(android.animation.Animator p0) { return false; }
    static boolean shouldRunOnHWLayer(android.view.View p0, android.animation.Animator p1) { return false; }
    public android.app.FragmentTransaction beginTransaction() { return null; }
    public boolean executePendingTransactions() { return false; }
    public void popBackStack() {}
    public boolean popBackStackImmediate() { return false; }
    public void popBackStack(java.lang.String p0, int p1) {}
    public boolean popBackStackImmediate(java.lang.String p0, int p1) { return false; }
    public void popBackStack(int p0, int p1) {}
    public boolean popBackStackImmediate(int p0, int p1) { return false; }
    public int getBackStackEntryCount() { return 0; }
    public android.app.FragmentManager.BackStackEntry getBackStackEntryAt(int p0) { return null; }
    public void addOnBackStackChangedListener(android.app.FragmentManager.OnBackStackChangedListener p0) {}
    public void removeOnBackStackChangedListener(android.app.FragmentManager.OnBackStackChangedListener p0) {}
    public void putFragment(android.os.Bundle p0, java.lang.String p1, android.app.Fragment p2) {}
    public android.app.Fragment getFragment(android.os.Bundle p0, java.lang.String p1) { return null; }
    public java.util.List<android.app.Fragment> getFragments() { return null; }
    public android.app.Fragment.SavedState saveFragmentInstanceState(android.app.Fragment p0) { return null; }
    public boolean isDestroyed() { return false; }
    public java.lang.String toString() { return null; }
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    android.animation.Animator loadAnimator(android.app.Fragment p0, int p1, boolean p2, int p3) { return null; }
    public void performPendingDeferredStart(android.app.Fragment p0) {}
    boolean isStateAtLeast(int p0) { return false; }
    void moveToState(android.app.Fragment p0, int p1, int p2, int p3, boolean p4) {}
    void moveToState(android.app.Fragment p0) {}
    void ensureInflatedFragmentView(android.app.Fragment p0) {}
    void completeShowHideFragment(android.app.Fragment p0) {}
    void moveFragmentToExpectedState(android.app.Fragment p0) {}
    void moveToState(int p0, boolean p1) {}
    void startPendingDeferredFragments() {}
    void makeActive(android.app.Fragment p0) {}
    void makeInactive(android.app.Fragment p0) {}
    public void addFragment(android.app.Fragment p0, boolean p1) {}
    public void removeFragment(android.app.Fragment p0) {}
    public void hideFragment(android.app.Fragment p0) {}
    public void showFragment(android.app.Fragment p0) {}
    public void detachFragment(android.app.Fragment p0) {}
    public void attachFragment(android.app.Fragment p0) {}
    public android.app.Fragment findFragmentById(int p0) { return null; }
    public android.app.Fragment findFragmentByTag(java.lang.String p0) { return null; }
    public android.app.Fragment findFragmentByWho(java.lang.String p0) { return null; }
    public boolean isStateSaved() { return false; }
    public void enqueueAction(android.app.FragmentManagerImpl.OpGenerator p0, boolean p1) {}
    public int allocBackStackIndex(android.app.BackStackRecord p0) { return 0; }
    public void setBackStackIndex(int p0, android.app.BackStackRecord p1) {}
    public void freeBackStackIndex(int p0) {}
    public void execSingleAction(android.app.FragmentManagerImpl.OpGenerator p0, boolean p1) {}
    public boolean execPendingActions() { return false; }
    void doPendingDeferredStart() {}
    void reportBackStackChanged() {}
    void addBackStackState(android.app.BackStackRecord p0) {}
    boolean popBackStackState(java.util.ArrayList<android.app.BackStackRecord> p0, java.util.ArrayList<java.lang.Boolean> p1, java.lang.String p2, int p3, int p4) { return false; }
    android.app.FragmentManagerNonConfig retainNonConfig() { return null; }
    void saveNonConfig() {}
    void saveFragmentViewState(android.app.Fragment p0) {}
    android.os.Bundle saveFragmentBasicState(android.app.Fragment p0) { return null; }
    android.os.Parcelable saveAllState() { return null; }
    void restoreAllState(android.os.Parcelable p0, android.app.FragmentManagerNonConfig p1) {}
    public void attachController(android.app.FragmentHostCallback<?> p0, android.app.FragmentContainer p1, android.app.Fragment p2) {}
    int getTargetSdk() { return 0; }
    public void noteStateNotSaved() {}
    public void dispatchCreate() {}
    public void dispatchActivityCreated() {}
    public void dispatchStart() {}
    public void dispatchResume() {}
    public void dispatchPause() {}
    public void dispatchStop() {}
    public void dispatchDestroyView() {}
    public void dispatchDestroy() {}
    @java.lang.Deprecated
    public void dispatchMultiWindowModeChanged(boolean p0) {}
    public void dispatchMultiWindowModeChanged(boolean p0, android.content.res.Configuration p1) {}
    @java.lang.Deprecated
    public void dispatchPictureInPictureModeChanged(boolean p0) {}
    public void dispatchPictureInPictureModeChanged(boolean p0, android.content.res.Configuration p1) {}
    public void dispatchConfigurationChanged(android.content.res.Configuration p0) {}
    public void dispatchLowMemory() {}
    public void dispatchTrimMemory(int p0) {}
    public boolean dispatchCreateOptionsMenu(android.view.Menu p0, android.view.MenuInflater p1) { return false; }
    public boolean dispatchPrepareOptionsMenu(android.view.Menu p0) { return false; }
    public boolean dispatchOptionsItemSelected(android.view.MenuItem p0) { return false; }
    public boolean dispatchContextItemSelected(android.view.MenuItem p0) { return false; }
    public void dispatchOptionsMenuClosed(android.view.Menu p0) {}
    public void setPrimaryNavigationFragment(android.app.Fragment p0) {}
    public android.app.Fragment getPrimaryNavigationFragment() { return null; }
    public void registerFragmentLifecycleCallbacks(android.app.FragmentManager.FragmentLifecycleCallbacks p0, boolean p1) {}
    public void unregisterFragmentLifecycleCallbacks(android.app.FragmentManager.FragmentLifecycleCallbacks p0) {}
    void dispatchOnFragmentPreAttached(android.app.Fragment p0, android.content.Context p1, boolean p2) {}
    void dispatchOnFragmentAttached(android.app.Fragment p0, android.content.Context p1, boolean p2) {}
    void dispatchOnFragmentPreCreated(android.app.Fragment p0, android.os.Bundle p1, boolean p2) {}
    void dispatchOnFragmentCreated(android.app.Fragment p0, android.os.Bundle p1, boolean p2) {}
    void dispatchOnFragmentActivityCreated(android.app.Fragment p0, android.os.Bundle p1, boolean p2) {}
    void dispatchOnFragmentViewCreated(android.app.Fragment p0, android.view.View p1, android.os.Bundle p2, boolean p3) {}
    void dispatchOnFragmentStarted(android.app.Fragment p0, boolean p1) {}
    void dispatchOnFragmentResumed(android.app.Fragment p0, boolean p1) {}
    void dispatchOnFragmentPaused(android.app.Fragment p0, boolean p1) {}
    void dispatchOnFragmentStopped(android.app.Fragment p0, boolean p1) {}
    void dispatchOnFragmentSaveInstanceState(android.app.Fragment p0, android.os.Bundle p1, boolean p2) {}
    void dispatchOnFragmentViewDestroyed(android.app.Fragment p0, boolean p1) {}
    void dispatchOnFragmentDestroyed(android.app.Fragment p0, boolean p1) {}
    void dispatchOnFragmentDetached(android.app.Fragment p0, boolean p1) {}
    public void invalidateOptionsMenu() {}
    public static int reverseTransit(int p0) { return 0; }
    public static int transitToStyleIndex(int p0, boolean p1) { return 0; }
    public android.view.View onCreateView(android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3) { return null; }
    public android.view.View onCreateView(java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2) { return null; }
    android.view.LayoutInflater.Factory2 getLayoutInflaterFactory() { return null; }

    static class AnimateOnHWLayerIfNeededListener implements android.animation.Animator.AnimatorListener {
        public AnimateOnHWLayerIfNeededListener(android.view.View p0) {}
        public void onAnimationStart(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationRepeat(android.animation.Animator p0) {}
    }

    static interface OpGenerator {
        public boolean generateOps(java.util.ArrayList<android.app.BackStackRecord> p0, java.util.ArrayList<java.lang.Boolean> p1);
    }

    private class PopBackStackState implements android.app.FragmentManagerImpl.OpGenerator {
        final java.lang.String mName = null;
        final int mId = 0;
        final int mFlags = 0;
        public PopBackStackState(android.app.FragmentManagerImpl p0, java.lang.String p1, int p2, int p3) {}
        public boolean generateOps(java.util.ArrayList<android.app.BackStackRecord> p0, java.util.ArrayList<java.lang.Boolean> p1) { return false; }
    }

    static class StartEnterTransitionListener implements android.app.Fragment.OnStartEnterTransitionListener {
        public StartEnterTransitionListener(android.app.BackStackRecord p0, boolean p1) {}
        public void onStartEnterTransition() {}
        public void startListening() {}
        public boolean isReady() { return false; }
        public void completeTransaction() {}
        public void cancelTransaction() {}
    }
}
