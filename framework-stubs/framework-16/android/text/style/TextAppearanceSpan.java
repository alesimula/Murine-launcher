package android.text.style;

public class TextAppearanceSpan extends android.text.style.MetricAffectingSpan implements android.text.ParcelableSpan {
    public TextAppearanceSpan(android.content.Context p0, int p1) { super(); }
    public TextAppearanceSpan(android.content.Context p0, int p1, int p2) { super(); }
    public TextAppearanceSpan(java.lang.String p0, int p1, int p2, android.content.res.ColorStateList p3, android.content.res.ColorStateList p4) { super(); }
    public TextAppearanceSpan(android.os.Parcel p0) { super(); }
    public TextAppearanceSpan(java.lang.String p0, int p1, int p2, android.content.res.ColorStateList p3, android.content.res.ColorStateList p4, android.graphics.Typeface p5, int p6, android.os.LocaleList p7, float p8, float p9, float p10, int p11, boolean p12, boolean p13, boolean p14, float p15, java.lang.String p16, java.lang.String p17) { super(); }
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
    @android.annotation.Nullable
    public android.os.LocaleList getTextLocales() { return null; }
    @android.annotation.Nullable
    public android.graphics.Typeface getTypeface() { return null; }
    public int getShadowColor() { return 0; }
    public float getShadowDx() { return 0.0f; }
    public float getShadowDy() { return 0.0f; }
    public float getShadowRadius() { return 0.0f; }
    @android.annotation.Nullable
    public java.lang.String getFontFeatureSettings() { return null; }
    @android.annotation.Nullable
    public java.lang.String getFontVariationSettings() { return null; }
    public boolean isElegantTextHeight() { return false; }
    public float getLetterSpacing() { return 0.0f; }
    public void updateDrawState(android.text.TextPaint p0) {}
    public void updateMeasureState(android.text.TextPaint p0) {}
    public java.lang.String toString() { return null; }
    public boolean hasElegantTextHeight() { return false; }
    public boolean hasLetterSpacing() { return false; }
}
