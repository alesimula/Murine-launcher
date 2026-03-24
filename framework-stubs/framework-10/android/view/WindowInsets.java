package android.view;

public final class WindowInsets {
    private final android.graphics.Insets[] mTypeInsetsMap = null;
    private final android.graphics.Insets[] mTypeMaxInsetsMap = null;
    private final boolean[] mTypeVisibilityMap = null;
    private android.graphics.Rect mTempRect;
    private final boolean mIsRound = false;
    private final android.view.DisplayCutout mDisplayCutout = null;
    private final boolean mAlwaysConsumeSystemBars = false;
    private final boolean mSystemWindowInsetsConsumed = false;
    private final boolean mStableInsetsConsumed = false;
    private final boolean mDisplayCutoutConsumed = false;
    @android.annotation.UnsupportedAppUsage
    public static final android.view.WindowInsets CONSUMED = null;
    public WindowInsets(android.graphics.Rect p0, android.graphics.Rect p1, boolean p2, boolean p3, android.view.DisplayCutout p4) {}
    public WindowInsets(android.graphics.Insets[] p0, android.graphics.Insets[] p1, boolean[] p2, boolean p3, boolean p4, android.view.DisplayCutout p5) {}
    public WindowInsets(android.view.WindowInsets p0) {}
    private static android.view.DisplayCutout displayCutoutCopyConstructorArgument(android.view.WindowInsets p0) { return null; }
    private static android.graphics.Insets getInsets(android.graphics.Insets[] p0, int p1) { return null; }
    private static void setInsets(android.graphics.Insets[] p0, int p1, android.graphics.Insets p2) {}
    @android.annotation.UnsupportedAppUsage
    public WindowInsets(android.graphics.Rect p0) {}
    private static android.graphics.Insets[] createCompatTypeMap(android.graphics.Rect p0) { return null; }
    static void assignCompatInsets(android.graphics.Insets[] p0, android.graphics.Rect p1) {}
    private static boolean[] createCompatVisibilityMap(android.graphics.Insets[] p0) { return null; }
    @java.lang.Deprecated
    public android.graphics.Rect getSystemWindowInsetsAsRect() { return null; }
    public android.graphics.Insets getSystemWindowInsets() { return null; }
    public android.graphics.Insets getInsets(int p0) { return null; }
    public android.graphics.Insets getMaxInsets(int p0) throws java.lang.IllegalArgumentException { return null; }
    public boolean isVisible(int p0) { return false; }
    public int getSystemWindowInsetLeft() { return 0; }
    public int getSystemWindowInsetTop() { return 0; }
    public int getSystemWindowInsetRight() { return 0; }
    public int getSystemWindowInsetBottom() { return 0; }
    public boolean hasSystemWindowInsets() { return false; }
    public boolean hasInsets() { return false; }
    public android.view.DisplayCutout getDisplayCutout() { return null; }
    public android.view.WindowInsets consumeDisplayCutout() { return null; }
    public boolean isConsumed() { return false; }
    public boolean isRound() { return false; }
    public android.view.WindowInsets consumeSystemWindowInsets() { return null; }
    @java.lang.Deprecated
    public android.view.WindowInsets replaceSystemWindowInsets(int p0, int p1, int p2, int p3) { return null; }
    @java.lang.Deprecated
    public android.view.WindowInsets replaceSystemWindowInsets(android.graphics.Rect p0) { return null; }
    public android.graphics.Insets getStableInsets() { return null; }
    public int getStableInsetTop() { return 0; }
    public int getStableInsetLeft() { return 0; }
    public int getStableInsetRight() { return 0; }
    public int getStableInsetBottom() { return 0; }
    public boolean hasStableInsets() { return false; }
    public android.graphics.Insets getSystemGestureInsets() { return null; }
    public android.graphics.Insets getMandatorySystemGestureInsets() { return null; }
    public android.graphics.Insets getTappableElementInsets() { return null; }
    public android.view.WindowInsets consumeStableInsets() { return null; }
    public boolean shouldAlwaysConsumeSystemBars() { return false; }
    public java.lang.String toString() { return null; }
    @java.lang.Deprecated
    public android.view.WindowInsets inset(android.graphics.Rect p0) { return null; }
    public android.view.WindowInsets inset(android.graphics.Insets p0) { return null; }
    public android.view.WindowInsets inset(int p0, int p1, int p2, int p3) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    private static android.graphics.Insets[] insetInsets(android.graphics.Insets[] p0, int p1, int p2, int p3, int p4) { return null; }
    private static android.graphics.Insets insetInsets(android.graphics.Insets p0, int p1, int p2, int p3, int p4) { return null; }
    boolean isSystemWindowInsetsConsumed() { return false; }

    public static final class Type {
        static final int FIRST = 1;
        static final int TOP_BAR = 1;
        static final int IME = 2;
        static final int SIDE_BARS = 4;
        static final int SYSTEM_GESTURES = 8;
        static final int MANDATORY_SYSTEM_GESTURES = 16;
        static final int TAPPABLE_ELEMENT = 32;
        static final int LAST = 64;
        static final int SIZE = 7;
        static final int WINDOW_DECOR = 64;
        static int indexOf(int p0) { return 0; }
        private Type() {}
        public static int topBar() { return 0; }
        public static int ime() { return 0; }
        public static int sideBars() { return 0; }
        public static int windowDecor() { return 0; }
        public static int systemGestures() { return 0; }
        public static int mandatorySystemGestures() { return 0; }
        public static int tappableElement() { return 0; }
        public static int systemBars() { return 0; }
        static int compatSystemInsets() { return 0; }
        public static int all() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface InsetType {
        }
    }

    public static final class Builder {
        private final android.graphics.Insets[] mTypeInsetsMap = null;
        private final android.graphics.Insets[] mTypeMaxInsetsMap = null;
        private final boolean[] mTypeVisibilityMap = null;
        private boolean mSystemInsetsConsumed;
        private boolean mStableInsetsConsumed;
        private android.view.DisplayCutout mDisplayCutout;
        private boolean mIsRound;
        private boolean mAlwaysConsumeSystemBars;
        public Builder() {}
        public Builder(android.view.WindowInsets p0) {}
        public android.view.WindowInsets.Builder setSystemWindowInsets(android.graphics.Insets p0) { return null; }
        public android.view.WindowInsets.Builder setSystemGestureInsets(android.graphics.Insets p0) { return null; }
        public android.view.WindowInsets.Builder setMandatorySystemGestureInsets(android.graphics.Insets p0) { return null; }
        public android.view.WindowInsets.Builder setTappableElementInsets(android.graphics.Insets p0) { return null; }
        public android.view.WindowInsets.Builder setInsets(int p0, android.graphics.Insets p1) { return null; }
        public android.view.WindowInsets.Builder setMaxInsets(int p0, android.graphics.Insets p1) throws java.lang.IllegalArgumentException { return null; }
        public android.view.WindowInsets.Builder setVisible(int p0, boolean p1) { return null; }
        public android.view.WindowInsets.Builder setStableInsets(android.graphics.Insets p0) { return null; }
        public android.view.WindowInsets.Builder setDisplayCutout(android.view.DisplayCutout p0) { return null; }
        public android.view.WindowInsets.Builder setRound(boolean p0) { return null; }
        public android.view.WindowInsets.Builder setAlwaysConsumeSystemBars(boolean p0) { return null; }
        public android.view.WindowInsets build() { return null; }
    }
}
