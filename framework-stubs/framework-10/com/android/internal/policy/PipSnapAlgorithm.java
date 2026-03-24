package com.android.internal.policy;

public class PipSnapAlgorithm {
    private static final int SNAP_MODE_CORNERS_ONLY = 0;
    private static final int SNAP_MODE_CORNERS_AND_SIDES = 1;
    private static final int SNAP_MODE_EDGE = 2;
    private static final int SNAP_MODE_EDGE_MAGNET_CORNERS = 3;
    private static final int SNAP_MODE_LONG_EDGE_MAGNET_CORNERS = 4;
    private static final float CORNER_MAGNET_THRESHOLD = 0.30000001192092896f;
    private final android.content.Context mContext = null;
    private final java.util.ArrayList<java.lang.Integer> mSnapGravities = null;
    private final int mDefaultSnapMode = 0;
    private int mSnapMode;
    private final float mDefaultSizePercent = 0.0f;
    private final float mMinAspectRatioForMinSize = 0.0f;
    private final float mMaxAspectRatioForMinSize = 0.0f;
    private final int mFlingDeceleration = 0;
    private int mOrientation;
    private final int mMinimizedVisibleSize = 0;
    private boolean mIsMinimized;
    public PipSnapAlgorithm(android.content.Context p0) {}
    public void onConfigurationChanged() {}
    public void setMinimized(boolean p0) {}
    public android.graphics.Rect findClosestSnapBounds(android.graphics.Rect p0, android.graphics.Rect p1, float p2, float p3, android.graphics.Point p4) { return null; }
    public android.graphics.Point getEdgeIntersect(android.graphics.Rect p0, android.graphics.Rect p1, float p2, float p3, android.graphics.Point p4) { return null; }
    private int findY(float p0, float p1, float p2) { return 0; }
    private int findX(float p0, float p1, float p2) { return 0; }
    public android.graphics.Rect findClosestSnapBounds(android.graphics.Rect p0, android.graphics.Rect p1) { return null; }
    public void applyMinimizedOffset(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Point p2, android.graphics.Rect p3) {}
    public float getSnapFraction(android.graphics.Rect p0, android.graphics.Rect p1) { return 0.0f; }
    public void applySnapFraction(android.graphics.Rect p0, android.graphics.Rect p1, float p2) {}
    public void getMovementBounds(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, int p3) {}
    public android.util.Size getSizeForAspectRatio(float p0, float p1, int p2, int p3) { return null; }
    private android.graphics.Point findClosestPoint(int p0, int p1, android.graphics.Point[] p2) { return null; }
    private void snapRectToClosestEdge(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2) {}
    private float distanceToPoint(android.graphics.Point p0, int p1, int p2) { return 0.0f; }
    private void calculateSnapTargets() {}
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
}
