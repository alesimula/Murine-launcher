package com.android.internal.policy;

public class DividerSnapAlgorithm {
    private static final int MIN_FLING_VELOCITY_DP_PER_SECOND = 400;
    private static final int MIN_DISMISS_VELOCITY_DP_PER_SECOND = 600;
    private static final int SNAP_MODE_16_9 = 0;
    private static final int SNAP_FIXED_RATIO = 1;
    private static final int SNAP_ONLY_1_1 = 2;
    private static final int SNAP_MODE_MINIMIZED = 3;
    private final float mMinFlingVelocityPxPerSecond = 0.0f;
    private final float mMinDismissVelocityPxPerSecond = 0.0f;
    private final int mDisplayWidth = 0;
    private final int mDisplayHeight = 0;
    private final int mDividerSize = 0;
    private final java.util.ArrayList<com.android.internal.policy.DividerSnapAlgorithm.SnapTarget> mTargets = null;
    private final android.graphics.Rect mInsets = null;
    private final int mSnapMode = 0;
    private final int mMinimalSizeResizableTask = 0;
    private final int mTaskHeightInMinimizedMode = 0;
    private final float mFixedRatio = 0.0f;
    private boolean mIsHorizontalDivision;
    private final com.android.internal.policy.DividerSnapAlgorithm.SnapTarget mFirstSplitTarget = null;
    private final com.android.internal.policy.DividerSnapAlgorithm.SnapTarget mLastSplitTarget = null;
    private final com.android.internal.policy.DividerSnapAlgorithm.SnapTarget mDismissStartTarget = null;
    private final com.android.internal.policy.DividerSnapAlgorithm.SnapTarget mDismissEndTarget = null;
    private final com.android.internal.policy.DividerSnapAlgorithm.SnapTarget mMiddleTarget = null;
    public static com.android.internal.policy.DividerSnapAlgorithm create(android.content.Context p0, android.graphics.Rect p1) { return null; }
    public DividerSnapAlgorithm(android.content.res.Resources p0, int p1, int p2, int p3, boolean p4, android.graphics.Rect p5) {}
    public DividerSnapAlgorithm(android.content.res.Resources p0, int p1, int p2, int p3, boolean p4, android.graphics.Rect p5, int p6) {}
    public DividerSnapAlgorithm(android.content.res.Resources p0, int p1, int p2, int p3, boolean p4, android.graphics.Rect p5, int p6, boolean p7) {}
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
    private int getStartInset() { return 0; }
    private int getEndInset() { return 0; }
    private com.android.internal.policy.DividerSnapAlgorithm.SnapTarget snap(int p0, boolean p1) { return null; }
    private void calculateTargets(boolean p0, int p1) {}
    private void addNonDismissingTargets(boolean p0, int p1, int p2, int p3) {}
    private void addFixedDivisionTargets(boolean p0, int p1) {}
    private void addRatio16_9Targets(boolean p0, int p1) {}
    private void maybeAddTarget(int p0, int p1) {}
    private void addMiddleTarget(boolean p0) {}
    private void addMinimizedTarget(boolean p0, int p1) {}
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
        private final float distanceMultiplier = 0.0f;
        public SnapTarget(int p0, int p1, int p2) {}
        public SnapTarget(int p0, int p1, int p2, float p3) {}
    }
}
