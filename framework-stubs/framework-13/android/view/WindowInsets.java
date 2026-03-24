package android.view;

public final class WindowInsets {
    public static final android.view.WindowInsets CONSUMED = null;
    @java.lang.Deprecated
    public WindowInsets(android.graphics.Rect p0, android.graphics.Rect p1, boolean p2, boolean p3, android.view.DisplayCutout p4) {}
    public WindowInsets(android.graphics.Insets[] p0, android.graphics.Insets[] p1, boolean[] p2, boolean p3, boolean p4, android.view.DisplayCutout p5, android.view.RoundedCorners p6, android.view.PrivacyIndicatorBounds p7, int p8, boolean p9) {}
    public WindowInsets(android.view.WindowInsets p0) {}
    static android.graphics.Insets getInsets(android.graphics.Insets[] p0, int p1) { return null; }
    public WindowInsets(android.graphics.Rect p0) {}
    public static void assignCompatInsets(android.graphics.Insets[] p0, android.graphics.Rect p1) {}
    @java.lang.Deprecated
    public android.graphics.Rect getSystemWindowInsetsAsRect() { return null; }
    @java.lang.Deprecated
    public android.graphics.Insets getSystemWindowInsets() { return null; }
    public android.graphics.Insets getInsets(int p0) { return null; }
    public android.graphics.Insets getInsetsIgnoringVisibility(int p0) { return null; }
    public boolean isVisible(int p0) { return false; }
    @java.lang.Deprecated
    public int getSystemWindowInsetLeft() { return 0; }
    @java.lang.Deprecated
    public int getSystemWindowInsetTop() { return 0; }
    @java.lang.Deprecated
    public int getSystemWindowInsetRight() { return 0; }
    @java.lang.Deprecated
    public int getSystemWindowInsetBottom() { return 0; }
    @java.lang.Deprecated
    public boolean hasSystemWindowInsets() { return false; }
    public boolean hasInsets() { return false; }
    public android.view.DisplayCutout getDisplayCutout() { return null; }
    public android.view.RoundedCorner getRoundedCorner(int p0) { return null; }
    public android.graphics.Rect getPrivacyIndicatorBounds() { return null; }
    @java.lang.Deprecated
    public android.view.WindowInsets consumeDisplayCutout() { return null; }
    public boolean isConsumed() { return false; }
    public boolean isRound() { return false; }
    @java.lang.Deprecated
    public android.view.WindowInsets consumeSystemWindowInsets() { return null; }
    @java.lang.Deprecated
    public android.view.WindowInsets replaceSystemWindowInsets(int p0, int p1, int p2, int p3) { return null; }
    @java.lang.Deprecated
    public android.view.WindowInsets replaceSystemWindowInsets(android.graphics.Rect p0) { return null; }
    @java.lang.Deprecated
    public android.graphics.Insets getStableInsets() { return null; }
    @java.lang.Deprecated
    public int getStableInsetTop() { return 0; }
    @java.lang.Deprecated
    public int getStableInsetLeft() { return 0; }
    @java.lang.Deprecated
    public int getStableInsetRight() { return 0; }
    @java.lang.Deprecated
    public int getStableInsetBottom() { return 0; }
    @java.lang.Deprecated
    public boolean hasStableInsets() { return false; }
    @java.lang.Deprecated
    public android.graphics.Insets getSystemGestureInsets() { return null; }
    @java.lang.Deprecated
    public android.graphics.Insets getMandatorySystemGestureInsets() { return null; }
    @java.lang.Deprecated
    public android.graphics.Insets getTappableElementInsets() { return null; }
    @java.lang.Deprecated
    public android.view.WindowInsets consumeStableInsets() { return null; }
    public boolean shouldAlwaysConsumeSystemBars() { return false; }
    public java.lang.String toString() { return null; }
    @java.lang.Deprecated
    public android.view.WindowInsets inset(android.graphics.Rect p0) { return null; }
    public android.view.WindowInsets inset(android.graphics.Insets p0) { return null; }
    public android.view.WindowInsets inset(int p0, int p1, int p2, int p3) { return null; }
    public android.view.WindowInsets insetUnchecked(int p0, int p1, int p2, int p3) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    static android.graphics.Insets insetInsets(android.graphics.Insets p0, int p1, int p2, int p3, int p4) { return null; }
    boolean isSystemWindowInsetsConsumed() { return false; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.view.WindowInsets p0) {}
        @java.lang.Deprecated
        public android.view.WindowInsets.Builder setSystemWindowInsets(android.graphics.Insets p0) { return null; }
        @java.lang.Deprecated
        public android.view.WindowInsets.Builder setSystemGestureInsets(android.graphics.Insets p0) { return null; }
        @java.lang.Deprecated
        public android.view.WindowInsets.Builder setMandatorySystemGestureInsets(android.graphics.Insets p0) { return null; }
        @java.lang.Deprecated
        public android.view.WindowInsets.Builder setTappableElementInsets(android.graphics.Insets p0) { return null; }
        public android.view.WindowInsets.Builder setInsets(int p0, android.graphics.Insets p1) { return null; }
        public android.view.WindowInsets.Builder setInsetsIgnoringVisibility(int p0, android.graphics.Insets p1) throws java.lang.IllegalArgumentException { return null; }
        public android.view.WindowInsets.Builder setVisible(int p0, boolean p1) { return null; }
        @java.lang.Deprecated
        public android.view.WindowInsets.Builder setStableInsets(android.graphics.Insets p0) { return null; }
        public android.view.WindowInsets.Builder setDisplayCutout(android.view.DisplayCutout p0) { return null; }
        public android.view.WindowInsets.Builder setRoundedCorners(android.view.RoundedCorners p0) { return null; }
        public android.view.WindowInsets.Builder setRoundedCorner(int p0, android.view.RoundedCorner p1) { return null; }
        public android.view.WindowInsets.Builder setPrivacyIndicatorBounds(android.view.PrivacyIndicatorBounds p0) { return null; }
        public android.view.WindowInsets.Builder setPrivacyIndicatorBounds(android.graphics.Rect p0) { return null; }
        public android.view.WindowInsets.Builder setRound(boolean p0) { return null; }
        public android.view.WindowInsets.Builder setAlwaysConsumeSystemBars(boolean p0) { return null; }
        public android.view.WindowInsets build() { return null; }
    }

    public static final class Side {
        public static final int LEFT = 1;
        public static final int TOP = 2;
        public static final int RIGHT = 4;
        public static final int BOTTOM = 8;
        public static int all() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface InsetsSide {
        }
    }

    public static final class Type {
        static final int FIRST = 1;
        static final int STATUS_BARS = 1;
        static final int NAVIGATION_BARS = 2;
        static final int CAPTION_BAR = 4;
        static final int IME = 8;
        static final int SYSTEM_GESTURES = 16;
        static final int MANDATORY_SYSTEM_GESTURES = 32;
        static final int TAPPABLE_ELEMENT = 64;
        static final int DISPLAY_CUTOUT = 128;
        static final int WINDOW_DECOR = 256;
        static final int GENERIC_OVERLAYS = 512;
        static final int LAST = 512;
        static final int SIZE = 10;
        static int indexOf(int p0) { return 0; }
        static java.lang.String toString(int p0) { return null; }
        public static int statusBars() { return 0; }
        public static int navigationBars() { return 0; }
        public static int captionBar() { return 0; }
        public static int ime() { return 0; }
        public static int systemGestures() { return 0; }
        public static int mandatorySystemGestures() { return 0; }
        public static int tappableElement() { return 0; }
        public static int displayCutout() { return 0; }
        public static int systemBars() { return 0; }
        public static int all() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface InsetsType {
        }
    }
}
