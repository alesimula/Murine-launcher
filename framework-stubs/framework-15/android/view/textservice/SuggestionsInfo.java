package android.view.textservice;

public final class SuggestionsInfo implements android.os.Parcelable {
    public static final int RESULT_ATTR_IN_THE_DICTIONARY = 1;
    public static final int RESULT_ATTR_LOOKS_LIKE_TYPO = 2;
    public static final int RESULT_ATTR_HAS_RECOMMENDED_SUGGESTIONS = 4;
    public static final int RESULT_ATTR_LOOKS_LIKE_GRAMMAR_ERROR = 8;
    public static final int RESULT_ATTR_DONT_SHOW_UI_FOR_SUGGESTIONS = 16;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.textservice.SuggestionsInfo> CREATOR = null;
    public SuggestionsInfo(int p0, java.lang.String[] p1) {}
    public SuggestionsInfo(int p0, java.lang.String[] p1, int p2, int p3) {}
    public SuggestionsInfo(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void setCookieAndSequence(int p0, int p1) {}
    public int getCookie() { return 0; }
    public int getSequence() { return 0; }
    public int getSuggestionsAttributes() { return 0; }
    public int getSuggestionsCount() { return 0; }
    public java.lang.String getSuggestionAt(int p0) { return null; }
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultAttrs {
    }
}
