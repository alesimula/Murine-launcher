package android.view.animation;

public class GridLayoutAnimationController extends android.view.animation.LayoutAnimationController {
    public static final int DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int DIRECTION_RIGHT_TO_LEFT = 1;
    public static final int DIRECTION_TOP_TO_BOTTOM = 0;
    public static final int DIRECTION_BOTTOM_TO_TOP = 2;
    public static final int DIRECTION_HORIZONTAL_MASK = 1;
    public static final int DIRECTION_VERTICAL_MASK = 2;
    public static final int PRIORITY_NONE = 0;
    public static final int PRIORITY_COLUMN = 1;
    public static final int PRIORITY_ROW = 2;
    public GridLayoutAnimationController(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.animation.Animation)null); }
    public GridLayoutAnimationController(android.view.animation.Animation p0) { super((android.view.animation.Animation)null); }
    public GridLayoutAnimationController(android.view.animation.Animation p0, float p1, float p2) { super((android.view.animation.Animation)null); }
    public float getColumnDelay() { return 0.0f; }
    public void setColumnDelay(float p0) {}
    public float getRowDelay() { return 0.0f; }
    public void setRowDelay(float p0) {}
    public int getDirection() { return 0; }
    public void setDirection(int p0) {}
    public int getDirectionPriority() { return 0; }
    public void setDirectionPriority(int p0) {}
    public boolean willOverlap() { return false; }
    protected long getDelayForView(android.view.View p0) { return 0L; }

    public static class AnimationParameters extends android.view.animation.LayoutAnimationController.AnimationParameters {
        public int column;
        public int row;
        public int columnsCount;
        public int rowsCount;
        public AnimationParameters() { super(); }
    }
}
