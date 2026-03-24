package android.app;

final class BackStackRecord extends android.app.FragmentTransaction implements android.app.FragmentManager.BackStackEntry, android.app.FragmentManagerImpl.OpGenerator {
    static final java.lang.String TAG = "FragmentManager";
    final android.app.FragmentManagerImpl mManager = null;
    static final int OP_NULL = 0;
    static final int OP_ADD = 1;
    static final int OP_REPLACE = 2;
    static final int OP_REMOVE = 3;
    static final int OP_HIDE = 4;
    static final int OP_SHOW = 5;
    static final int OP_DETACH = 6;
    static final int OP_ATTACH = 7;
    static final int OP_SET_PRIMARY_NAV = 8;
    static final int OP_UNSET_PRIMARY_NAV = 9;
    java.util.ArrayList<android.app.BackStackRecord.Op> mOps;
    int mEnterAnim;
    int mExitAnim;
    int mPopEnterAnim;
    int mPopExitAnim;
    int mTransition;
    int mTransitionStyle;
    boolean mAddToBackStack;
    boolean mAllowAddToBackStack;
    java.lang.String mName;
    boolean mCommitted;
    int mIndex;
    boolean mReorderingAllowed;
    java.util.ArrayList<java.lang.Runnable> mCommitRunnables;
    int mBreadCrumbTitleRes;
    java.lang.CharSequence mBreadCrumbTitleText;
    int mBreadCrumbShortTitleRes;
    java.lang.CharSequence mBreadCrumbShortTitleText;
    java.util.ArrayList<java.lang.String> mSharedElementSourceNames;
    java.util.ArrayList<java.lang.String> mSharedElementTargetNames;
    public java.lang.String toString() { return null; }
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    void dump(java.lang.String p0, java.io.PrintWriter p1, boolean p2) {}
    public BackStackRecord(android.app.FragmentManagerImpl p0) { super(); }
    public int getId() { return 0; }
    public int getBreadCrumbTitleRes() { return 0; }
    public int getBreadCrumbShortTitleRes() { return 0; }
    public java.lang.CharSequence getBreadCrumbTitle() { return null; }
    public java.lang.CharSequence getBreadCrumbShortTitle() { return null; }
    void addOp(android.app.BackStackRecord.Op p0) {}
    public android.app.FragmentTransaction add(android.app.Fragment p0, java.lang.String p1) { return null; }
    public android.app.FragmentTransaction add(int p0, android.app.Fragment p1) { return null; }
    public android.app.FragmentTransaction add(int p0, android.app.Fragment p1, java.lang.String p2) { return null; }
    private void doAddOp(int p0, android.app.Fragment p1, java.lang.String p2, int p3) {}
    public android.app.FragmentTransaction replace(int p0, android.app.Fragment p1) { return null; }
    public android.app.FragmentTransaction replace(int p0, android.app.Fragment p1, java.lang.String p2) { return null; }
    public android.app.FragmentTransaction remove(android.app.Fragment p0) { return null; }
    public android.app.FragmentTransaction hide(android.app.Fragment p0) { return null; }
    public android.app.FragmentTransaction show(android.app.Fragment p0) { return null; }
    public android.app.FragmentTransaction detach(android.app.Fragment p0) { return null; }
    public android.app.FragmentTransaction attach(android.app.Fragment p0) { return null; }
    public android.app.FragmentTransaction setPrimaryNavigationFragment(android.app.Fragment p0) { return null; }
    public android.app.FragmentTransaction setCustomAnimations(int p0, int p1) { return null; }
    public android.app.FragmentTransaction setCustomAnimations(int p0, int p1, int p2, int p3) { return null; }
    public android.app.FragmentTransaction setTransition(int p0) { return null; }
    public android.app.FragmentTransaction addSharedElement(android.view.View p0, java.lang.String p1) { return null; }
    public android.app.FragmentTransaction setTransitionStyle(int p0) { return null; }
    public android.app.FragmentTransaction addToBackStack(java.lang.String p0) { return null; }
    public boolean isAddToBackStackAllowed() { return false; }
    public android.app.FragmentTransaction disallowAddToBackStack() { return null; }
    public android.app.FragmentTransaction setBreadCrumbTitle(int p0) { return null; }
    public android.app.FragmentTransaction setBreadCrumbTitle(java.lang.CharSequence p0) { return null; }
    public android.app.FragmentTransaction setBreadCrumbShortTitle(int p0) { return null; }
    public android.app.FragmentTransaction setBreadCrumbShortTitle(java.lang.CharSequence p0) { return null; }
    void bumpBackStackNesting(int p0) {}
    public android.app.FragmentTransaction runOnCommit(java.lang.Runnable p0) { return null; }
    public void runOnCommitRunnables() {}
    public int commit() { return 0; }
    public int commitAllowingStateLoss() { return 0; }
    public void commitNow() {}
    public void commitNowAllowingStateLoss() {}
    public android.app.FragmentTransaction setReorderingAllowed(boolean p0) { return null; }
    int commitInternal(boolean p0) { return 0; }
    public boolean generateOps(java.util.ArrayList<android.app.BackStackRecord> p0, java.util.ArrayList<java.lang.Boolean> p1) { return false; }
    boolean interactsWith(int p0) { return false; }
    boolean interactsWith(java.util.ArrayList<android.app.BackStackRecord> p0, int p1, int p2) { return false; }
    void executeOps() {}
    void executePopOps(boolean p0) {}
    android.app.Fragment expandOps(java.util.ArrayList<android.app.Fragment> p0, android.app.Fragment p1) { return null; }
    void trackAddedFragmentsInPop(java.util.ArrayList<android.app.Fragment> p0) {}
    boolean isPostponed() { return false; }
    void setOnStartPostponedListener(android.app.Fragment.OnStartEnterTransitionListener p0) {}
    private static boolean isFragmentPostponed(android.app.BackStackRecord.Op p0) { return false; }
    public java.lang.String getName() { return null; }
    public int getTransition() { return 0; }
    public int getTransitionStyle() { return 0; }
    public boolean isEmpty() { return false; }

    static final class Op {
        int cmd;
        android.app.Fragment fragment;
        int enterAnim;
        int exitAnim;
        int popEnterAnim;
        int popExitAnim;
        Op() {}
        Op(int p0, android.app.Fragment p1) {}
    }
}
