package android.preference;

@java.lang.Deprecated
public class PreferenceFrameLayout extends android.widget.FrameLayout {
    private static final int DEFAULT_BORDER_TOP = 0;
    private static final int DEFAULT_BORDER_BOTTOM = 0;
    private static final int DEFAULT_BORDER_LEFT = 0;
    private static final int DEFAULT_BORDER_RIGHT = 0;
    private final int mBorderTop = 0;
    private final int mBorderBottom = 0;
    private final int mBorderLeft = 0;
    private final int mBorderRight = 0;
    private boolean mPaddingApplied;
    public PreferenceFrameLayout(android.content.Context p0) { super((android.content.Context)null); }
    public PreferenceFrameLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public PreferenceFrameLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public PreferenceFrameLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public android.preference.PreferenceFrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    public void addView(android.view.View p0) {}

    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams {
        public boolean removeBorders;
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
    }
}
