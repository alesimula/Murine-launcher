package android.view;

public class CutoutSpecification {
    private static final java.lang.String TAG = "CutoutSpecification";
    private static final boolean DEBUG = false;
    private static final int MINIMAL_ACCEPTABLE_PATH_LENGTH = Integer.valueOf(0);
    private static final char MARKER_START_CHAR = '@';
    private static final java.lang.String DP_MARKER = "@dp";
    private static final java.lang.String BOTTOM_MARKER = "@bottom";
    private static final java.lang.String RIGHT_MARKER = "@right";
    private static final java.lang.String LEFT_MARKER = "@left";
    private static final java.lang.String CUTOUT_MARKER = "@cutout";
    private static final java.lang.String CENTER_VERTICAL_MARKER = "@center_vertical";
    private static final java.lang.String BIND_RIGHT_CUTOUT_MARKER = "@bind_right_cutout";
    private static final java.lang.String BIND_LEFT_CUTOUT_MARKER = "@bind_left_cutout";
    private final android.graphics.Path mPath = null;
    private final android.graphics.Rect mLeftBound = null;
    private final android.graphics.Rect mTopBound = null;
    private final android.graphics.Rect mRightBound = null;
    private final android.graphics.Rect mBottomBound = null;
    private final android.graphics.Insets mInsets = null;
    private CutoutSpecification(android.view.CutoutSpecification.Parser p0) {}
    public android.graphics.Path getPath() { return null; }
    public android.graphics.Rect getLeftBound() { return null; }
    public android.graphics.Rect getTopBound() { return null; }
    public android.graphics.Rect getRightBound() { return null; }
    public android.graphics.Rect getBottomBound() { return null; }
    public android.graphics.Rect getSafeInset() { return null; }
    private static int decideWhichEdge(boolean p0, boolean p1, boolean p2) { return 0; }

    public static class Parser {
        private final boolean mIsShortEdgeOnTop = false;
        private final float mDensity = 0.0f;
        private final int mDisplayWidth = 0;
        private final int mDisplayHeight = 0;
        private final android.graphics.Matrix mMatrix = null;
        private android.graphics.Insets mInsets;
        private int mSafeInsetLeft;
        private int mSafeInsetTop;
        private int mSafeInsetRight;
        private int mSafeInsetBottom;
        private final android.graphics.Rect mTmpRect = null;
        private final android.graphics.RectF mTmpRectF = null;
        private boolean mInDp;
        private android.graphics.Path mPath;
        private android.graphics.Rect mLeftBound;
        private android.graphics.Rect mTopBound;
        private android.graphics.Rect mRightBound;
        private android.graphics.Rect mBottomBound;
        private boolean mPositionFromLeft;
        private boolean mPositionFromRight;
        private boolean mPositionFromBottom;
        private boolean mPositionFromCenterVertical;
        private boolean mBindLeftCutout;
        private boolean mBindRightCutout;
        private boolean mBindBottomCutout;
        private boolean mIsTouchShortEdgeStart;
        private boolean mIsTouchShortEdgeEnd;
        private boolean mIsCloserToStartSide;
        public Parser(float p0, int p1, int p2) {}
        private void computeBoundsRectAndAddToRegion(android.graphics.Path p0, android.graphics.Region p1, android.graphics.Rect p2) {}
        private void resetStatus(java.lang.StringBuilder p0) {}
        private void translateMatrix() {}
        private int computeSafeInsets(int p0, android.graphics.Rect p1) { return 0; }
        private void setSafeInset(int p0, int p1) {}
        private int getSafeInset(int p0) { return 0; }
        private android.graphics.Rect onSetEdgeCutout(boolean p0, boolean p1, android.graphics.Rect p2) { return null; }
        private void setEdgeCutout(android.graphics.Path p0) {}
        private void parseSvgPathSpec(android.graphics.Region p0, java.lang.String p1) {}
        private void parseSpecWithoutDp(java.lang.String p0) {}
        public android.view.CutoutSpecification parse(java.lang.String p0) { return null; }
    }
}
