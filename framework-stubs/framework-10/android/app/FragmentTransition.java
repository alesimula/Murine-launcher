package android.app;

class FragmentTransition {
    private static final int[] INVERSE_OPS = null;
    FragmentTransition() {}
    static void startTransitions(android.app.FragmentManagerImpl p0, java.util.ArrayList<android.app.BackStackRecord> p1, java.util.ArrayList<java.lang.Boolean> p2, int p3, int p4, boolean p5) {}
    private static android.util.ArrayMap<java.lang.String, java.lang.String> calculateNameOverrides(int p0, java.util.ArrayList<android.app.BackStackRecord> p1, java.util.ArrayList<java.lang.Boolean> p2, int p3, int p4) { return null; }
    private static void configureTransitionsReordered(android.app.FragmentManagerImpl p0, int p1, android.app.FragmentTransition.FragmentContainerTransition p2, android.view.View p3, android.util.ArrayMap<java.lang.String, java.lang.String> p4) {}
    private static void configureTransitionsOrdered(android.app.FragmentManagerImpl p0, int p1, android.app.FragmentTransition.FragmentContainerTransition p2, android.view.View p3, android.util.ArrayMap<java.lang.String, java.lang.String> p4) {}
    private static void replaceHide(android.transition.Transition p0, android.app.Fragment p1, java.util.ArrayList<android.view.View> p2) {}
    private static void scheduleTargetChange(android.view.ViewGroup p0, android.app.Fragment p1, android.view.View p2, java.util.ArrayList<android.view.View> p3, android.transition.Transition p4, java.util.ArrayList<android.view.View> p5, android.transition.Transition p6, java.util.ArrayList<android.view.View> p7) {}
    private static android.transition.TransitionSet getSharedElementTransition(android.app.Fragment p0, android.app.Fragment p1, boolean p2) { return null; }
    private static android.transition.Transition getEnterTransition(android.app.Fragment p0, boolean p1) { return null; }
    private static android.transition.Transition getExitTransition(android.app.Fragment p0, boolean p1) { return null; }
    private static android.transition.Transition cloneTransition(android.transition.Transition p0) { return null; }
    private static android.transition.TransitionSet configureSharedElementsReordered(android.view.ViewGroup p0, android.view.View p1, android.util.ArrayMap<java.lang.String, java.lang.String> p2, android.app.FragmentTransition.FragmentContainerTransition p3, java.util.ArrayList<android.view.View> p4, java.util.ArrayList<android.view.View> p5, android.transition.Transition p6, android.transition.Transition p7) { return null; }
    private static void addSharedElementsWithMatchingNames(java.util.ArrayList<android.view.View> p0, android.util.ArrayMap<java.lang.String, android.view.View> p1, java.util.Collection<java.lang.String> p2) {}
    private static android.transition.TransitionSet configureSharedElementsOrdered(android.view.ViewGroup p0, android.view.View p1, android.util.ArrayMap<java.lang.String, java.lang.String> p2, android.app.FragmentTransition.FragmentContainerTransition p3, java.util.ArrayList<android.view.View> p4, java.util.ArrayList<android.view.View> p5, android.transition.Transition p6, android.transition.Transition p7) { return null; }
    private static android.util.ArrayMap<java.lang.String, android.view.View> captureOutSharedElements(android.util.ArrayMap<java.lang.String, java.lang.String> p0, android.transition.TransitionSet p1, android.app.FragmentTransition.FragmentContainerTransition p2) { return null; }
    private static android.util.ArrayMap<java.lang.String, android.view.View> captureInSharedElements(android.util.ArrayMap<java.lang.String, java.lang.String> p0, android.transition.TransitionSet p1, android.app.FragmentTransition.FragmentContainerTransition p2) { return null; }
    private static java.lang.String findKeyForValue(android.util.ArrayMap<java.lang.String, java.lang.String> p0, java.lang.String p1) { return null; }
    private static android.view.View getInEpicenterView(android.util.ArrayMap<java.lang.String, android.view.View> p0, android.app.FragmentTransition.FragmentContainerTransition p1, android.transition.Transition p2, boolean p3) { return null; }
    private static void setOutEpicenter(android.transition.TransitionSet p0, android.transition.Transition p1, android.util.ArrayMap<java.lang.String, android.view.View> p2, boolean p3, android.app.BackStackRecord p4) {}
    private static void setEpicenter(android.transition.Transition p0, android.view.View p1) {}
    private static void retainValues(android.util.ArrayMap<java.lang.String, java.lang.String> p0, android.util.ArrayMap<java.lang.String, android.view.View> p1) {}
    private static void callSharedElementStartEnd(android.app.Fragment p0, android.app.Fragment p1, boolean p2, android.util.ArrayMap<java.lang.String, android.view.View> p3, boolean p4) {}
    private static void setSharedElementTargets(android.transition.TransitionSet p0, android.view.View p1, java.util.ArrayList<android.view.View> p2) {}
    private static void bfsAddViewChildren(java.util.List<android.view.View> p0, android.view.View p1) {}
    private static boolean containedBeforeIndex(java.util.List<android.view.View> p0, android.view.View p1, int p2) { return false; }
    private static void scheduleRemoveTargets(android.transition.Transition p0, android.transition.Transition p1, java.util.ArrayList<android.view.View> p2, android.transition.Transition p3, java.util.ArrayList<android.view.View> p4, android.transition.TransitionSet p5, java.util.ArrayList<android.view.View> p6) {}
    public static void replaceTargets(android.transition.Transition p0, java.util.ArrayList<android.view.View> p1, java.util.ArrayList<android.view.View> p2) {}
    public static void addTargets(android.transition.Transition p0, java.util.ArrayList<android.view.View> p1) {}
    private static boolean hasSimpleTarget(android.transition.Transition p0) { return false; }
    private static boolean isNullOrEmpty(java.util.List p0) { return false; }
    private static java.util.ArrayList<android.view.View> configureEnteringExitingViews(android.transition.Transition p0, android.app.Fragment p1, java.util.ArrayList<android.view.View> p2, android.view.View p3) { return null; }
    private static void setViewVisibility(java.util.ArrayList<android.view.View> p0, int p1) {}
    private static android.transition.Transition mergeTransitions(android.transition.Transition p0, android.transition.Transition p1, android.transition.Transition p2, android.app.Fragment p3, boolean p4) { return null; }
    public static void calculateFragments(android.app.BackStackRecord p0, android.util.SparseArray<android.app.FragmentTransition.FragmentContainerTransition> p1, boolean p2) {}
    public static void calculatePopFragments(android.app.BackStackRecord p0, android.util.SparseArray<android.app.FragmentTransition.FragmentContainerTransition> p1, boolean p2) {}
    private static void addToFirstInLastOut(android.app.BackStackRecord p0, android.app.BackStackRecord.Op p1, android.util.SparseArray<android.app.FragmentTransition.FragmentContainerTransition> p2, boolean p3, boolean p4) {}
    private static android.app.FragmentTransition.FragmentContainerTransition ensureContainer(android.app.FragmentTransition.FragmentContainerTransition p0, android.util.SparseArray<android.app.FragmentTransition.FragmentContainerTransition> p1, int p2) { return null; }

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
