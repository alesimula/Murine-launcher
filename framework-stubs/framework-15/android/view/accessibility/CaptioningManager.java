package android.view.accessibility;

public class CaptioningManager {
    public CaptioningManager(android.content.Context p0) {}
    public final boolean isEnabled() { return false; }
    @android.annotation.Nullable
    public final java.lang.String getRawLocale() { return null; }
    @android.annotation.Nullable
    public final java.util.Locale getLocale() { return null; }
    public final float getFontScale() { return 0.0f; }
    public int getRawUserStyle() { return 0; }
    @android.annotation.NonNull
    public android.view.accessibility.CaptioningManager.CaptionStyle getUserStyle() { return null; }
    public final boolean isSystemAudioCaptioningEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SET_SYSTEM_AUDIO_CAPTION")
    public final void setSystemAudioCaptioningEnabled(boolean p0) {}
    public final boolean isSystemAudioCaptioningUiEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SET_SYSTEM_AUDIO_CAPTION")
    public final void setSystemAudioCaptioningUiEnabled(boolean p0) {}
    public void addCaptioningChangeListener(android.view.accessibility.CaptioningManager.CaptioningChangeListener p0) {}
    public void removeCaptioningChangeListener(android.view.accessibility.CaptioningManager.CaptioningChangeListener p0) {}
    public boolean isCallCaptioningEnabled() { return false; }

    public static final class CaptionStyle {
        public static final int COLOR_UNSPECIFIED = 16777215;
        public static final android.view.accessibility.CaptioningManager.CaptionStyle DEFAULT = null;
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
        public static boolean hasColor(int p0) { return false; }
        @android.annotation.NonNull
        public android.view.accessibility.CaptioningManager.CaptionStyle applyStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0) { return null; }
        public boolean hasBackgroundColor() { return false; }
        public boolean hasForegroundColor() { return false; }
        public boolean hasEdgeType() { return false; }
        public boolean hasEdgeColor() { return false; }
        public boolean hasWindowColor() { return false; }
        @android.annotation.Nullable
        public android.graphics.Typeface getTypeface() { return null; }
        @android.annotation.NonNull
        public static android.view.accessibility.CaptioningManager.CaptionStyle getCustomStyle(android.content.ContentResolver p0) { return null; }
    }

    public static abstract class CaptioningChangeListener {
        public CaptioningChangeListener() {}
        public void onEnabledChanged(boolean p0) {}
        public void onUserStyleChanged(android.view.accessibility.CaptioningManager.CaptionStyle p0) {}
        public void onLocaleChanged(java.util.Locale p0) {}
        public void onFontScaleChanged(float p0) {}
        public void onSystemAudioCaptioningChanged(boolean p0) {}
        public void onSystemAudioCaptioningUiChanged(boolean p0) {}
    }

    private class MyContentObserver extends android.database.ContentObserver {
        public MyContentObserver(android.view.accessibility.CaptioningManager p0, android.os.Handler p1) { super((android.os.Handler)null); }
        public void onChange(boolean p0, android.net.Uri p1) {}
    }

    public static interface SystemAudioCaptioningAccessing {
        public void setSystemAudioCaptioningEnabled(boolean p0, int p1);
        public boolean isSystemAudioCaptioningUiEnabled(int p0);
        public void setSystemAudioCaptioningUiEnabled(boolean p0, int p1);
    }
}
