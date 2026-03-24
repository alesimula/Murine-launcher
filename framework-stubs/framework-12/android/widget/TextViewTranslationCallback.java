package android.widget;

public class TextViewTranslationCallback implements android.view.translation.ViewTranslationCallback {
    private static final java.lang.String TAG = "TextViewTranslationCb";
    private static final boolean DEBUG = Boolean.valueOf(false);
    private android.text.method.TranslationTransformationMethod mTranslationTransformation;
    private boolean mIsShowingTranslation;
    private boolean mIsTextPaddingEnabled;
    private java.lang.CharSequence mPaddedText;
    private int mAnimationDurationMillis;
    private java.lang.CharSequence mContentDescription;
    private static final char COMPAT_PAD_CHARACTER = (char)0x2002;
    private android.animation.ValueAnimator mAnimator;
    public TextViewTranslationCallback() {}
    private void clearTranslationTransformation() {}
    public boolean onShowTranslation(android.view.View p0) { return false; }
    public boolean onHideTranslation(android.view.View p0) { return false; }
    public boolean onClearTranslation(android.view.View p0) { return false; }
    boolean isShowingTranslation() { return false; }
    public void enableContentPadding() {}
    boolean isTextPaddingEnabled() { return false; }
    java.lang.CharSequence getPaddedText(java.lang.CharSequence p0, java.lang.CharSequence p1) { return null; }
    private java.lang.CharSequence computePaddedText(java.lang.CharSequence p0, java.lang.CharSequence p1) { return null; }
    public void setAnimationDurationMillis(int p0) {}
    private void runWithAnimation(android.widget.TextView p0, java.lang.Runnable p1) {}
    private static int colorWithAlpha(int p0, int p1) { return 0; }
}
