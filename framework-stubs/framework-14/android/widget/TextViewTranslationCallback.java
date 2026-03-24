package android.widget;

public class TextViewTranslationCallback implements android.view.translation.ViewTranslationCallback {
    public TextViewTranslationCallback() {}
    public boolean onShowTranslation(android.view.View p0) { return false; }
    public boolean onHideTranslation(android.view.View p0) { return false; }
    public boolean onClearTranslation(android.view.View p0) { return false; }
    public boolean isShowingTranslation() { return false; }
    public boolean isAnimationRunning() { return false; }
    public void enableContentPadding() {}
    boolean isTextPaddingEnabled() { return false; }
    java.lang.CharSequence getPaddedText(java.lang.CharSequence p0, java.lang.CharSequence p1) { return null; }
    public void setAnimationDurationMillis(int p0) {}
}
