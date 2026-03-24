package android.view.accessibility;

public class CaptioningManager {
    private static final int DEFAULT_ENABLED = 0;
    private static final int DEFAULT_PRESET = 0;
    private static final float DEFAULT_FONT_SCALE = 1.0f;
    private final java.util.ArrayList<android.view.accessibility.CaptioningManager.CaptioningChangeListener> mListeners = null;
    private final android.content.ContentResolver mContentResolver = null;
    private final android.database.ContentObserver mContentObserver = null;
    private final java.lang.Runnable mStyleChangedRunnable = null;
    public CaptioningManager(android.content.Context p0) {}
    public final boolean isEnabled() { return false; }
    public final java.lang.String getRawLocale() { return null; }
    public final java.util.Locale getLocale() { return null; }
    public final float getFontScale() { return 0.0f; }
    public int getRawUserStyle() { return 0; }
    public android.view.accessibility.CaptioningManager.CaptionStyle getUserStyle() { return null; }
    public void addCaptioningChangeListener(android.view.accessibility.CaptioningManager.CaptioningChangeListener p0) {}
    private void registerObserver(java.lang.String p0) {}
    public void removeCaptioningChangeListener(android.view.accessibility.CaptioningManager.CaptioningChangeListener p0) {}
    private void notifyEnabledChanged() {}
    private void notifyUserStyleChanged() {}
    private void notifyLocaleChanged() {}
    private void notifyFontScaleChanged() {}

    private class MyContentObserver extends android.database.ContentObserver {
        private final android.os.Handler mHandler = null;
        public MyContentObserver(android.view.accessibility.CaptioningManager p0, android.os.Handler p1) { super(null); }
        public void onChange(boolean p0, android.net.Uri p1) {}
    }

    public static abstract class CaptioningChangeListener {
        public CaptioningChangeListener() {}
        public void onEnabledChanged(boolean p0) {}
        public void onUserStyleChanged(android.view.accessibility.CaptioningManager.CaptionStyle p0) {}
        public void onLocaleChanged(java.util.Locale p0) {}
        public void onFontScaleChanged(float p0) {}
    }

    public static final class CaptionStyle {
        private static final int COLOR_NONE_OPAQUE = 255;
        public static final int COLOR_UNSPECIFIED = 16777215;
        private static final android.view.accessibility.CaptioningManager.CaptionStyle WHITE_ON_BLACK = null;
        private static final android.view.accessibility.CaptioningManager.CaptionStyle BLACK_ON_WHITE = null;
        private static final android.view.accessibility.CaptioningManager.CaptionStyle YELLOW_ON_BLACK = null;
        private static final android.view.accessibility.CaptioningManager.CaptionStyle YELLOW_ON_BLUE = null;
        private static final android.view.accessibility.CaptioningManager.CaptionStyle DEFAULT_CUSTOM = null;
        private static final android.view.accessibility.CaptioningManager.CaptionStyle UNSPECIFIED = null;
        public static final android.view.accessibility.CaptioningManager.CaptionStyle DEFAULT = null;
        @android.annotation.UnsupportedAppUsage
        public static final android.view.accessibility.CaptioningManager.CaptionStyle[] PRESETS = null;
        public static final int PRESET_CUSTOM = -1;
        public static final int EDGE_TYPE_UNSPECIFIED = -1;
        public static final int EDGE_TYPE_NONE = 0;
        public static final int EDGE_TYPE_OUTLINE = 1;
        public static final int EDGE_TYPE_DROP_SHADOW = 2;
        public static final int EDGE_TYPE_RAISED = 3;
        public static final int EDGE_TYPE_DEPRESSED = 4;
        public final int foregroundColor = 0;
        public final int backgroundColor = 0;
        public final int edgeType = 0;
        public final int edgeColor = 0;
        public final int windowColor = 0;
        public final java.lang.String mRawTypeface = null;
        private final boolean mHasForegroundColor = false;
        private final boolean mHasBackgroundColor = false;
        private final boolean mHasEdgeType = false;
        private final boolean mHasEdgeColor = false;
        private final boolean mHasWindowColor = false;
        private android.graphics.Typeface mParsedTypeface;
        private CaptionStyle(int p0, int p1, int p2, int p3, int p4, java.lang.String p5) {}
        public static boolean hasColor(int p0) { return false; }
        public android.view.accessibility.CaptioningManager.CaptionStyle applyStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0) { return null; }
        public boolean hasBackgroundColor() { return false; }
        public boolean hasForegroundColor() { return false; }
        public boolean hasEdgeType() { return false; }
        public boolean hasEdgeColor() { return false; }
        public boolean hasWindowColor() { return false; }
        public android.graphics.Typeface getTypeface() { return null; }
        public static android.view.accessibility.CaptioningManager.CaptionStyle getCustomStyle(android.content.ContentResolver p0) { return null; }
    }
}
