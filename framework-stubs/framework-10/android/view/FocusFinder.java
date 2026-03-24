package android.view;

public class FocusFinder {
    private static final java.lang.ThreadLocal<android.view.FocusFinder> tlFocusFinder = null;
    final android.graphics.Rect mFocusedRect = null;
    final android.graphics.Rect mOtherRect = null;
    final android.graphics.Rect mBestCandidateRect = null;
    private final android.view.FocusFinder.UserSpecifiedFocusComparator mUserSpecifiedFocusComparator = null;
    private final android.view.FocusFinder.UserSpecifiedFocusComparator mUserSpecifiedClusterComparator = null;
    private final android.view.FocusFinder.FocusSorter mFocusSorter = null;
    private final java.util.ArrayList<android.view.View> mTempList = null;
    public static android.view.FocusFinder getInstance() { return null; }
    private FocusFinder() {}
    public final android.view.View findNextFocus(android.view.ViewGroup p0, android.view.View p1, int p2) { return null; }
    public android.view.View findNextFocusFromRect(android.view.ViewGroup p0, android.graphics.Rect p1, int p2) { return null; }
    private android.view.View findNextFocus(android.view.ViewGroup p0, android.view.View p1, android.graphics.Rect p2, int p3) { return null; }
    private android.view.ViewGroup getEffectiveRoot(android.view.ViewGroup p0, android.view.View p1) { return null; }
    public android.view.View findNextKeyboardNavigationCluster(android.view.View p0, android.view.View p1, int p2) { return null; }
    private android.view.View findNextUserSpecifiedKeyboardNavigationCluster(android.view.View p0, android.view.View p1, int p2) { return null; }
    private android.view.View findNextUserSpecifiedFocus(android.view.ViewGroup p0, android.view.View p1, int p2) { return null; }
    private android.view.View findNextFocus(android.view.ViewGroup p0, android.view.View p1, android.graphics.Rect p2, int p3, java.util.ArrayList<android.view.View> p4) { return null; }
    private android.view.View findNextKeyboardNavigationCluster(android.view.View p0, android.view.View p1, java.util.List<android.view.View> p2, int p3) { return null; }
    private android.view.View findNextFocusInRelativeDirection(java.util.ArrayList<android.view.View> p0, android.view.ViewGroup p1, android.view.View p2, android.graphics.Rect p3, int p4) { return null; }
    private void setFocusBottomRight(android.view.ViewGroup p0, android.graphics.Rect p1) {}
    private void setFocusTopLeft(android.view.ViewGroup p0, android.graphics.Rect p1) {}
    android.view.View findNextFocusInAbsoluteDirection(java.util.ArrayList<android.view.View> p0, android.view.ViewGroup p1, android.view.View p2, android.graphics.Rect p3, int p4) { return null; }
    private static android.view.View getNextFocusable(android.view.View p0, java.util.ArrayList<android.view.View> p1, int p2) { return null; }
    private static android.view.View getPreviousFocusable(android.view.View p0, java.util.ArrayList<android.view.View> p1, int p2) { return null; }
    private static android.view.View getNextKeyboardNavigationCluster(android.view.View p0, android.view.View p1, java.util.List<android.view.View> p2, int p3) { return null; }
    private static android.view.View getPreviousKeyboardNavigationCluster(android.view.View p0, android.view.View p1, java.util.List<android.view.View> p2, int p3) { return null; }
    boolean isBetterCandidate(int p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3) { return false; }
    boolean beamBeats(int p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3) { return false; }
    long getWeightedDistanceFor(long p0, long p1) { return 0L; }
    boolean isCandidate(android.graphics.Rect p0, android.graphics.Rect p1, int p2) { return false; }
    boolean beamsOverlap(int p0, android.graphics.Rect p1, android.graphics.Rect p2) { return false; }
    boolean isToDirectionOf(int p0, android.graphics.Rect p1, android.graphics.Rect p2) { return false; }
    static int majorAxisDistance(int p0, android.graphics.Rect p1, android.graphics.Rect p2) { return 0; }
    static int majorAxisDistanceRaw(int p0, android.graphics.Rect p1, android.graphics.Rect p2) { return 0; }
    static int majorAxisDistanceToFarEdge(int p0, android.graphics.Rect p1, android.graphics.Rect p2) { return 0; }
    static int majorAxisDistanceToFarEdgeRaw(int p0, android.graphics.Rect p1, android.graphics.Rect p2) { return 0; }
    static int minorAxisDistance(int p0, android.graphics.Rect p1, android.graphics.Rect p2) { return 0; }
    public android.view.View findNearestTouchable(android.view.ViewGroup p0, int p1, int p2, int p3, int[] p4) { return null; }
    private boolean isTouchCandidate(int p0, int p1, android.graphics.Rect p2, int p3) { return false; }
    private static final boolean isValidId(int p0) { return false; }
    public static void sort(android.view.View[] p0, int p1, int p2, android.view.ViewGroup p3, boolean p4) {}

    private static final class UserSpecifiedFocusComparator implements java.util.Comparator<android.view.View> {
        private final android.util.ArrayMap<android.view.View, android.view.View> mNextFoci = null;
        private final android.util.ArraySet<android.view.View> mIsConnectedTo = null;
        private final android.util.ArrayMap<android.view.View, android.view.View> mHeadsOfChains = null;
        private final android.util.ArrayMap<android.view.View, java.lang.Integer> mOriginalOrdinal = null;
        private final android.view.FocusFinder.UserSpecifiedFocusComparator.NextFocusGetter mNextFocusGetter = null;
        private android.view.View mRoot;
        UserSpecifiedFocusComparator(android.view.FocusFinder.UserSpecifiedFocusComparator.NextFocusGetter p0) {}
        public void recycle() {}
        public void setFocusables(java.util.List<android.view.View> p0, android.view.View p1) {}
        private void setHeadOfChain(android.view.View p0) {}
        public int compare(android.view.View p0, android.view.View p1) { return 0; }

        public static interface NextFocusGetter {
            public android.view.View get(android.view.View p0, android.view.View p1);
        }
    }

    static final class FocusSorter {
        private java.util.ArrayList<android.graphics.Rect> mRectPool;
        private int mLastPoolRect;
        private int mRtlMult;
        private java.util.HashMap<android.view.View, android.graphics.Rect> mRectByView;
        private java.util.Comparator<android.view.View> mTopsComparator;
        private java.util.Comparator<android.view.View> mSidesComparator;
        FocusSorter() {}
        public void sort(android.view.View[] p0, int p1, int p2, android.view.ViewGroup p3, boolean p4) {}
    }
}
