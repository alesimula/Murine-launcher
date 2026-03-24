package android.app;

@java.lang.Deprecated
public abstract class FragmentTransaction {
    public static final int TRANSIT_ENTER_MASK = 4096;
    public static final int TRANSIT_EXIT_MASK = 8192;
    public static final int TRANSIT_UNSET = -1;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_FRAGMENT_OPEN = 4097;
    public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
    public static final int TRANSIT_FRAGMENT_FADE = 4099;
    public FragmentTransaction() {}
    public abstract android.app.FragmentTransaction add(android.app.Fragment p0, java.lang.String p1);
    public abstract android.app.FragmentTransaction add(int p0, android.app.Fragment p1);
    public abstract android.app.FragmentTransaction add(int p0, android.app.Fragment p1, java.lang.String p2);
    public abstract android.app.FragmentTransaction replace(int p0, android.app.Fragment p1);
    public abstract android.app.FragmentTransaction replace(int p0, android.app.Fragment p1, java.lang.String p2);
    public abstract android.app.FragmentTransaction remove(android.app.Fragment p0);
    public abstract android.app.FragmentTransaction hide(android.app.Fragment p0);
    public abstract android.app.FragmentTransaction show(android.app.Fragment p0);
    public abstract android.app.FragmentTransaction detach(android.app.Fragment p0);
    public abstract android.app.FragmentTransaction attach(android.app.Fragment p0);
    public abstract android.app.FragmentTransaction setPrimaryNavigationFragment(android.app.Fragment p0);
    public abstract boolean isEmpty();
    public abstract android.app.FragmentTransaction setCustomAnimations(int p0, int p1);
    public abstract android.app.FragmentTransaction setCustomAnimations(int p0, int p1, int p2, int p3);
    public abstract android.app.FragmentTransaction setTransition(int p0);
    public abstract android.app.FragmentTransaction addSharedElement(android.view.View p0, java.lang.String p1);
    public abstract android.app.FragmentTransaction setTransitionStyle(int p0);
    public abstract android.app.FragmentTransaction addToBackStack(java.lang.String p0);
    public abstract boolean isAddToBackStackAllowed();
    public abstract android.app.FragmentTransaction disallowAddToBackStack();
    public abstract android.app.FragmentTransaction setBreadCrumbTitle(int p0);
    public abstract android.app.FragmentTransaction setBreadCrumbTitle(java.lang.CharSequence p0);
    public abstract android.app.FragmentTransaction setBreadCrumbShortTitle(int p0);
    public abstract android.app.FragmentTransaction setBreadCrumbShortTitle(java.lang.CharSequence p0);
    public abstract android.app.FragmentTransaction setReorderingAllowed(boolean p0);
    public abstract android.app.FragmentTransaction runOnCommit(java.lang.Runnable p0);
    public abstract int commit();
    public abstract int commitAllowingStateLoss();
    public abstract void commitNow();
    public abstract void commitNowAllowingStateLoss();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Transit {
    }
}
