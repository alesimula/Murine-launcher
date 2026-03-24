package com.android.internal.policy;

public class DividerSnapAlgorithm {
    public static com.android.internal.policy.DividerSnapAlgorithm create(android.content.Context p0, android.graphics.Rect p1) { return null; }
    public DividerSnapAlgorithm(android.content.res.Resources p0, int p1, int p2, int p3, boolean p4, android.graphics.Rect p5) {}
    public DividerSnapAlgorithm(android.content.res.Resources p0, int p1, int p2, int p3, boolean p4, android.graphics.Rect p5, int p6) {}
    public DividerSnapAlgorithm(android.content.res.Resources p0, int p1, int p2, int p3, boolean p4, android.graphics.Rect p5, int p6, boolean p7, boolean p8) {}
    public boolean isSplitScreenFeasible() { return false; }
    public com.android.internal.policy.DividerSnapAlgorithm.SnapTarget calculateSnapTarget(int p0, float p1) { return null; }
    public com.android.internal.policy.DividerSnapAlgorithm.SnapTarget calculateSnapTarget(int p0, float p1, boolean p2) { return null; }
    public com.android.internal.policy.DividerSnapAlgorithm.SnapTarget calculateNonDismissingSnapTarget(int p0) { return null; }
    public float calculateDismissingFraction(int p0) { return 0.0f; }
    public com.android.internal.policy.DividerSnapAlgorithm.SnapTarget getClosestDismissTarget(int p0) { return null; }
    public com.android.internal.policy.DividerSnapAlgorithm.SnapTarget getFirstSplitTarget() { return null; }
    public com.android.internal.policy.DividerSnapAlgorithm.SnapTarget getLastSplitTarget() { return null; }
    public com.android.internal.policy.DividerSnapAlgorithm.SnapTarget getDismissStartTarget() { return null; }
    public com.android.internal.policy.DividerSnapAlgorithm.SnapTarget getDismissEndTarget() { return null; }
    public com.android.internal.policy.DividerSnapAlgorithm.SnapTarget getMiddleTarget() { return null; }
    public com.android.internal.policy.DividerSnapAlgorithm.SnapTarget getNextTarget(com.android.internal.policy.DividerSnapAlgorithm.SnapTarget p0) { return null; }
    public com.android.internal.policy.DividerSnapAlgorithm.SnapTarget getPreviousTarget(com.android.internal.policy.DividerSnapAlgorithm.SnapTarget p0) { return null; }
    public boolean showMiddleSplitTargetForAccessibility() { return false; }
    public boolean isFirstSplitTargetAvailable() { return false; }
    public boolean isLastSplitTargetAvailable() { return false; }
    public com.android.internal.policy.DividerSnapAlgorithm.SnapTarget cycleNonDismissTarget(com.android.internal.policy.DividerSnapAlgorithm.SnapTarget p0, int p1) { return null; }

    public static class SnapTarget {
        public static final int FLAG_NONE = 0;
        public static final int FLAG_DISMISS_START = 1;
        public static final int FLAG_DISMISS_END = 2;
        public final int position = 0;
        public final int taskPosition = 0;
        public final int flag = 0;
        public boolean isMiddleTarget;
        public SnapTarget(int p0, int p1, int p2) {}
        public SnapTarget(int p0, int p1, int p2, float p3) {}
    }
}
