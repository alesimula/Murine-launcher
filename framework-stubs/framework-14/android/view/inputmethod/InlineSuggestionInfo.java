package android.view.inputmethod;

public final class InlineSuggestionInfo implements android.os.Parcelable {
    public static final java.lang.String SOURCE_AUTOFILL = "android:autofill";
    public static final java.lang.String SOURCE_PLATFORM = "android:platform";
    public static final java.lang.String TYPE_SUGGESTION = "android:autofill:suggestion";
    @android.annotation.SuppressLint("IntentName")
    public static final java.lang.String TYPE_ACTION = "android:autofill:action";
    public static final android.os.Parcelable.Creator<android.view.inputmethod.InlineSuggestionInfo> CREATOR = null;
    public static android.view.inputmethod.InlineSuggestionInfo newInlineSuggestionInfo(android.widget.inline.InlinePresentationSpec p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3, boolean p4) { return null; }
    public static android.view.inputmethod.InlineSuggestionInfo newInlineSuggestionInfo(android.widget.inline.InlinePresentationSpec p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3, boolean p4, android.view.inputmethod.InlineSuggestion p5) { return null; }
    public InlineSuggestionInfo(android.widget.inline.InlinePresentationSpec p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3, boolean p4, android.view.inputmethod.InlineSuggestion p5) {}
    public android.widget.inline.InlinePresentationSpec getInlinePresentationSpec() { return null; }
    public java.lang.String getSource() { return null; }
    public java.lang.String[] getAutofillHints() { return null; }
    public java.lang.String getType() { return null; }
    public boolean isPinned() { return false; }
    public android.view.inputmethod.InlineSuggestion getTooltip() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    InlineSuggestionInfo(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Source {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
