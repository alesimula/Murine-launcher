package android.app;

@java.lang.Deprecated
public abstract class FragmentManager {
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    public FragmentManager() {}
    public abstract android.app.FragmentTransaction beginTransaction();
    @java.lang.Deprecated
    public android.app.FragmentTransaction openTransaction() { return null; }
    public abstract boolean executePendingTransactions();
    public abstract android.app.Fragment findFragmentById(int p0);
    public abstract android.app.Fragment findFragmentByTag(java.lang.String p0);
    public abstract void popBackStack();
    public abstract boolean popBackStackImmediate();
    public abstract void popBackStack(java.lang.String p0, int p1);
    public abstract boolean popBackStackImmediate(java.lang.String p0, int p1);
    public abstract void popBackStack(int p0, int p1);
    public abstract boolean popBackStackImmediate(int p0, int p1);
    public abstract int getBackStackEntryCount();
    public abstract android.app.FragmentManager.BackStackEntry getBackStackEntryAt(int p0);
    public abstract void addOnBackStackChangedListener(android.app.FragmentManager.OnBackStackChangedListener p0);
    public abstract void removeOnBackStackChangedListener(android.app.FragmentManager.OnBackStackChangedListener p0);
    public abstract void putFragment(android.os.Bundle p0, java.lang.String p1, android.app.Fragment p2);
    public abstract android.app.Fragment getFragment(android.os.Bundle p0, java.lang.String p1);
    public abstract java.util.List<android.app.Fragment> getFragments();
    public abstract android.app.Fragment.SavedState saveFragmentInstanceState(android.app.Fragment p0);
    public abstract boolean isDestroyed();
    public abstract void registerFragmentLifecycleCallbacks(android.app.FragmentManager.FragmentLifecycleCallbacks p0, boolean p1);
    public abstract void unregisterFragmentLifecycleCallbacks(android.app.FragmentManager.FragmentLifecycleCallbacks p0);
    public abstract android.app.Fragment getPrimaryNavigationFragment();
    public abstract void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3);
    public static void enableDebugLogging(boolean p0) {}
    public void invalidateOptionsMenu() {}
    public abstract boolean isStateSaved();

    @java.lang.Deprecated
    public static abstract class FragmentLifecycleCallbacks {
        public FragmentLifecycleCallbacks() {}
        public void onFragmentPreAttached(android.app.FragmentManager p0, android.app.Fragment p1, android.content.Context p2) {}
        public void onFragmentAttached(android.app.FragmentManager p0, android.app.Fragment p1, android.content.Context p2) {}
        public void onFragmentPreCreated(android.app.FragmentManager p0, android.app.Fragment p1, android.os.Bundle p2) {}
        public void onFragmentCreated(android.app.FragmentManager p0, android.app.Fragment p1, android.os.Bundle p2) {}
        public void onFragmentActivityCreated(android.app.FragmentManager p0, android.app.Fragment p1, android.os.Bundle p2) {}
        public void onFragmentViewCreated(android.app.FragmentManager p0, android.app.Fragment p1, android.view.View p2, android.os.Bundle p3) {}
        public void onFragmentStarted(android.app.FragmentManager p0, android.app.Fragment p1) {}
        public void onFragmentResumed(android.app.FragmentManager p0, android.app.Fragment p1) {}
        public void onFragmentPaused(android.app.FragmentManager p0, android.app.Fragment p1) {}
        public void onFragmentStopped(android.app.FragmentManager p0, android.app.Fragment p1) {}
        public void onFragmentSaveInstanceState(android.app.FragmentManager p0, android.app.Fragment p1, android.os.Bundle p2) {}
        public void onFragmentViewDestroyed(android.app.FragmentManager p0, android.app.Fragment p1) {}
        public void onFragmentDestroyed(android.app.FragmentManager p0, android.app.Fragment p1) {}
        public void onFragmentDetached(android.app.FragmentManager p0, android.app.Fragment p1) {}
    }

    @java.lang.Deprecated
    public static interface OnBackStackChangedListener {
        public void onBackStackChanged();
    }

    @java.lang.Deprecated
    public static interface BackStackEntry {
        public int getId();
        public java.lang.String getName();
        public int getBreadCrumbTitleRes();
        public int getBreadCrumbShortTitleRes();
        public java.lang.CharSequence getBreadCrumbTitle();
        public java.lang.CharSequence getBreadCrumbShortTitle();
    }
}
