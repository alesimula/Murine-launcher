package android.view;

public class FocusFinder {
    final android.graphics.Rect mFocusedRect = null;
    final android.graphics.Rect mOtherRect = null;
    final android.graphics.Rect mBestCandidateRect = null;
    public static android.view.FocusFinder getInstance() { return null; }
    public final android.view.View findNextFocus(android.view.ViewGroup p0, android.view.View p1, int p2) { return null; }
    public android.view.View findNextFocusFromRect(android.view.ViewGroup p0, android.graphics.Rect p1, int p2) { return null; }
    public android.view.View findNextKeyboardNavigationCluster(android.view.View p0, android.view.View p1, int p2) { return null; }
    android.view.View findNextFocusInAbsoluteDirection(java.util.ArrayList<android.view.View> p0, android.view.ViewGroup p1, android.view.View p2, android.graphics.Rect p3, int p4) { return null; }
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
    public static void sort(android.view.View[] p0, int p1, int p2, android.view.ViewGroup p3, boolean p4) {}

    static final class FocusSorter {
        FocusSorter() {}
        public void sort(android.view.View[] p0, int p1, int p2, android.view.ViewGroup p3, boolean p4) {}
    }

    private static abstract class UserSpecifiedFocusComparator implements java.util.Comparator<android.view.View> {
        UserSpecifiedFocusComparator(android.view.FocusFinder.UserSpecifiedFocusComparator.NextFocusGetter p0) {}
        public void recycle() {}
        public void setFocusables(java.util.List<android.view.View> p0, android.view.View p1) {}
        public int compare(android.view.View p0, android.view.View p1) { return 0; }

        public static interface NextFocusGetter {
            public android.view.View get(android.view.View p0, android.view.View p1);
        }
    }
}
