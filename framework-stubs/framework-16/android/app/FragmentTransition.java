package android.app;

class FragmentTransition {
    FragmentTransition() {}
    static void startTransitions(android.app.FragmentManagerImpl p0, java.util.ArrayList<android.app.BackStackRecord> p1, java.util.ArrayList<java.lang.Boolean> p2, int p3, int p4, boolean p5) {}
    public static void replaceTargets(android.transition.Transition p0, java.util.ArrayList<android.view.View> p1, java.util.ArrayList<android.view.View> p2) {}
    public static void addTargets(android.transition.Transition p0, java.util.ArrayList<android.view.View> p1) {}
    public static void calculateFragments(android.app.BackStackRecord p0, android.util.SparseArray<android.app.FragmentTransition.FragmentContainerTransition> p1, boolean p2) {}
    public static void calculatePopFragments(android.app.BackStackRecord p0, android.util.SparseArray<android.app.FragmentTransition.FragmentContainerTransition> p1, boolean p2) {}

    public static class FragmentContainerTransition {
        public android.app.Fragment lastIn;
        public boolean lastInIsPop;
        public android.app.BackStackRecord lastInTransaction;
        public android.app.Fragment firstOut;
        public boolean firstOutIsPop;
        public android.app.BackStackRecord firstOutTransaction;
        public FragmentContainerTransition() {}
    }
}
