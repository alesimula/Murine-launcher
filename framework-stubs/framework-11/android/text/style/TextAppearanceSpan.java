package android.text.style;

public class TextAppearanceSpan extends android.text.style.MetricAffectingSpan implements android.text.ParcelableSpan {
    private final java.lang.String mFamilyName = null;
    private final int mStyle = 0;
    private final int mTextSize = 0;
    private final android.content.res.ColorStateList mTextColor = null;
    private final android.content.res.ColorStateList mTextColorLink = null;
    private final android.graphics.Typeface mTypeface = null;
    private final int mTextFontWeight = 0;
    private final android.os.LocaleList mTextLocales = null;
    private final float mShadowRadius = 0.0f;
    private final float mShadowDx = 0.0f;
    private final float mShadowDy = 0.0f;
    private final int mShadowColor = 0;
    private final boolean mHasElegantTextHeight = false;
    private final boolean mElegantTextHeight = false;
    private final boolean mHasLetterSpacing = false;
    private final float mLetterSpacing = 0.0f;
    private final java.lang.String mFontFeatureSettings = null;
    private final java.lang.String mFontVariationSettings = null;
    public TextAppearanceSpan(android.content.Context p0, int p1) { super(); }
    public TextAppearanceSpan(android.content.Context p0, int p1, int p2) { super(); }
    public TextAppearanceSpan(java.lang.String p0, int p1, int p2, android.content.res.ColorStateList p3, android.content.res.ColorStateList p4) { super(); }
    public TextAppearanceSpan(android.os.Parcel p0) { super(); }
    public int getSpanTypeId() { return 0; }
    public int getSpanTypeIdInternal() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
    public java.lang.String getFamily() { return null; }
    public android.content.res.ColorStateList getTextColor() { return null; }
    public android.content.res.ColorStateList getLinkTextColor() { return null; }
    public int getTextSize() { return 0; }
    public int getTextStyle() { return 0; }
    public int getTextFontWeight() { return 0; }
    public android.os.LocaleList getTextLocales() { return null; }
    public android.graphics.Typeface getTypeface() { return null; }
    public int getShadowColor() { return 0; }
    public float getShadowDx() { return 0.0f; }
    public float getShadowDy() { return 0.0f; }
    public float getShadowRadius() { return 0.0f; }
    public java.lang.String getFontFeatureSettings() { return null; }
    public java.lang.String getFontVariationSettings() { return null; }
    public boolean isElegantTextHeight() { return false; }
    public void updateDrawState(android.text.TextPaint p0) {}
    public void updateMeasureState(android.text.TextPaint p0) {}
}
