package android.text.style;

public class SuggestionSpan extends android.text.style.CharacterStyle implements android.text.ParcelableSpan {
    private static final java.lang.String TAG = "SuggestionSpan";
    public static final int FLAG_EASY_CORRECT = 1;
    public static final int FLAG_MISSPELLED = 2;
    public static final int FLAG_AUTO_CORRECTION = 4;
    public static final int FLAG_GRAMMAR_ERROR = 8;
    @java.lang.Deprecated
    public static final java.lang.String ACTION_SUGGESTION_PICKED = "android.text.style.SUGGESTION_PICKED";
    @java.lang.Deprecated
    public static final java.lang.String SUGGESTION_SPAN_PICKED_AFTER = "after";
    @java.lang.Deprecated
    public static final java.lang.String SUGGESTION_SPAN_PICKED_BEFORE = "before";
    @java.lang.Deprecated
    public static final java.lang.String SUGGESTION_SPAN_PICKED_HASHCODE = "hashcode";
    public static final int SUGGESTIONS_MAX_SIZE = 5;
    private int mFlags;
    private final java.lang.String[] mSuggestions = null;
    private final java.lang.String mLocaleStringForCompatibility = null;
    private final java.lang.String mLanguageTag = null;
    private final int mHashCode = 0;
    private float mEasyCorrectUnderlineThickness;
    private int mEasyCorrectUnderlineColor;
    private float mMisspelledUnderlineThickness;
    private int mMisspelledUnderlineColor;
    private float mAutoCorrectionUnderlineThickness;
    private int mAutoCorrectionUnderlineColor;
    private float mGrammarErrorUnderlineThickness;
    private int mGrammarErrorUnderlineColor;
    public static final android.os.Parcelable.Creator<android.text.style.SuggestionSpan> CREATOR = null;
    public SuggestionSpan(android.content.Context p0, java.lang.String[] p1, int p2) { super(); }
    public SuggestionSpan(java.util.Locale p0, java.lang.String[] p1, int p2) { super(); }
    public SuggestionSpan(android.content.Context p0, java.util.Locale p1, java.lang.String[] p2, int p3, java.lang.Class<?> p4) { super(); }
    private void initStyle(android.content.Context p0) {}
    public SuggestionSpan(android.os.Parcel p0) { super(); }
    public java.lang.String[] getSuggestions() { return null; }
    @java.lang.Deprecated
    public java.lang.String getLocale() { return null; }
    public java.util.Locale getLocaleObject() { return null; }
    @java.lang.Deprecated
    public java.lang.String getNotificationTargetClassName() { return null; }
    public int getFlags() { return 0; }
    public void setFlags(int p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
    public int getSpanTypeId() { return 0; }
    public int getSpanTypeIdInternal() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    private static int hashCodeInternal(java.lang.String[] p0, java.lang.String p1, java.lang.String p2) { return 0; }
    public void updateDrawState(android.text.TextPaint p0) {}
    public int getUnderlineColor() { return 0; }
    @java.lang.Deprecated
    public void notifySelection(android.content.Context p0, java.lang.String p1, int p2) {}
}
