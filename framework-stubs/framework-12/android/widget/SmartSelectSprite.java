package android.widget;

final class SmartSelectSprite {
    private static final int EXPAND_DURATION = 200;
    private final android.view.animation.Interpolator mExpandInterpolator = null;
    private android.animation.Animator mActiveAnimator;
    private final java.lang.Runnable mInvalidator = null;
    private final int mFillColor = 0;
    static final java.util.Comparator<android.graphics.RectF> RECTANGLE_COMPARATOR = null;
    private android.graphics.drawable.Drawable mExistingDrawable;
    private android.widget.SmartSelectSprite.RectangleList mExistingRectangleList;
    SmartSelectSprite(android.content.Context p0, int p1, java.lang.Runnable p2) {}
    public void startAnimation(android.graphics.PointF p0, java.util.List<android.widget.SmartSelectSprite.RectangleWithTextSelectionLayout> p1, java.lang.Runnable p2) {}
    public boolean isAnimationActive() { return false; }
    private android.animation.Animator createAnimator(android.widget.SmartSelectSprite.RectangleList p0, float p1, float p2, android.animation.ValueAnimator.AnimatorUpdateListener p3, java.lang.Runnable p4) { return null; }
    private void setUpAnimatorListener(android.animation.Animator p0, java.lang.Runnable p1) {}
    private static int[] generateDirections(android.widget.SmartSelectSprite.RectangleWithTextSelectionLayout p0, java.util.List<android.widget.SmartSelectSprite.RectangleWithTextSelectionLayout> p1) { return null; }
    private static boolean contains(android.graphics.RectF p0, android.graphics.PointF p1) { return false; }
    private void removeExistingDrawables() {}
    public void cancelAnimation() {}
    public void draw(android.graphics.Canvas p0) {}

    private static final class RectangleList extends android.graphics.drawable.shapes.Shape {
        private static final java.lang.String PROPERTY_RIGHT_BOUNDARY = "rightBoundary";
        private static final java.lang.String PROPERTY_LEFT_BOUNDARY = "leftBoundary";
        private final java.util.List<android.widget.SmartSelectSprite.RoundedRectangleShape> mRectangles = null;
        private final java.util.List<android.widget.SmartSelectSprite.RoundedRectangleShape> mReversedRectangles = null;
        private final android.graphics.Path mOutlinePolygonPath = null;
        private int mDisplayType;
        private RectangleList(java.util.List<android.widget.SmartSelectSprite.RoundedRectangleShape> p0) { super(); }
        private void setLeftBoundary(float p0) {}
        private void setRightBoundary(float p0) {}
        void setDisplayType(int p0) {}
        private int getTotalWidth() { return 0; }
        public void draw(android.graphics.Canvas p0, android.graphics.Paint p1) {}
        private void drawRectangles(android.graphics.Canvas p0, android.graphics.Paint p1) {}
        private void drawPolygon(android.graphics.Canvas p0, android.graphics.Paint p1) {}
        private static android.graphics.Path generateOutlinePolygonPath(java.util.List<android.widget.SmartSelectSprite.RoundedRectangleShape> p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        private static @interface DisplayType {
            public static final int RECTANGLES = 0;
            public static final int POLYGON = 1;
        }
    }

    static final class RectangleWithTextSelectionLayout {
        private final android.graphics.RectF mRectangle = null;
        private final int mTextSelectionLayout = 0;
        RectangleWithTextSelectionLayout(android.graphics.RectF p0, int p1) {}
        public android.graphics.RectF getRectangle() { return null; }
        public int getTextSelectionLayout() { return 0; }
    }

    private static final class RoundedRectangleShape extends android.graphics.drawable.shapes.Shape {
        private static final java.lang.String PROPERTY_ROUND_RATIO = "roundRatio";
        private final android.graphics.RectF mBoundingRectangle = null;
        private float mRoundRatio;
        private final int mExpansionDirection = 0;
        private final android.graphics.RectF mDrawRect = null;
        private final android.graphics.Path mClipPath = null;
        private float mLeftBoundary;
        private float mRightBoundary;
        private final boolean mInverted = false;
        private final float mBoundingWidth = 0.0f;
        private static int invert(int p0) { return 0; }
        private RoundedRectangleShape(android.graphics.RectF p0, int p1, boolean p2) { super(); }
        public void draw(android.graphics.Canvas p0, android.graphics.Paint p1) {}
        void setRoundRatio(float p0) {}
        float getRoundRatio() { return 0.0f; }
        private void setStartBoundary(float p0) {}
        private void setEndBoundary(float p0) {}
        private float getCornerRadius() { return 0.0f; }
        private float getAdjustedCornerRadius() { return 0.0f; }
        private float getBoundingWidth() { return 0.0f; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        private static @interface ExpansionDirection {
            public static final int LEFT = -1;
            public static final int CENTER = 0;
            public static final int RIGHT = 1;
        }
    }
}
