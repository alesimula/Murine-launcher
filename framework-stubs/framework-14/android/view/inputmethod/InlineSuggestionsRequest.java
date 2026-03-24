package android.view.inputmethod;

public final class InlineSuggestionsRequest implements android.os.Parcelable {
    public static final int SUGGESTION_COUNT_UNLIMITED = 2147483647;
    public static final android.os.Parcelable.Creator<android.view.inputmethod.InlineSuggestionsRequest> CREATOR = null;
    public void setHostInputToken(android.os.IBinder p0) {}
    public void setHostDisplayId(int p0) {}
    public void filterContentTypes() {}
    InlineSuggestionsRequest(int p0, java.util.List<android.widget.inline.InlinePresentationSpec> p1, java.lang.String p2, android.os.LocaleList p3, android.os.Bundle p4, android.os.IBinder p5, int p6, android.widget.inline.InlinePresentationSpec p7) {}
    public int getMaxSuggestionCount() { return 0; }
    public java.util.List<android.widget.inline.InlinePresentationSpec> getInlinePresentationSpecs() { return null; }
    public java.lang.String getHostPackageName() { return null; }
    public android.os.LocaleList getSupportedLocales() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public android.os.IBinder getHostInputToken() { return null; }
    public int getHostDisplayId() { return 0; }
    public android.widget.inline.InlinePresentationSpec getInlineTooltipPresentationSpec() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    InlineSuggestionsRequest(android.os.Parcel p0) {}

    public static final class Builder extends android.view.inputmethod.InlineSuggestionsRequest.BaseBuilder {
        public Builder(java.util.List<android.widget.inline.InlinePresentationSpec> p0) { super(); }
        public android.view.inputmethod.InlineSuggestionsRequest.Builder setMaxSuggestionCount(int p0) { return null; }
        public android.view.inputmethod.InlineSuggestionsRequest.Builder setInlinePresentationSpecs(java.util.List<android.widget.inline.InlinePresentationSpec> p0) { return null; }
        public android.view.inputmethod.InlineSuggestionsRequest.Builder addInlinePresentationSpecs(android.widget.inline.InlinePresentationSpec p0) { return null; }
        android.view.inputmethod.InlineSuggestionsRequest.Builder setHostPackageName(java.lang.String p0) { return null; }
        public android.view.inputmethod.InlineSuggestionsRequest.Builder setSupportedLocales(android.os.LocaleList p0) { return null; }
        public android.view.inputmethod.InlineSuggestionsRequest.Builder setExtras(android.os.Bundle p0) { return null; }
        android.view.inputmethod.InlineSuggestionsRequest.Builder setHostInputToken(android.os.IBinder p0) { return null; }
        android.view.inputmethod.InlineSuggestionsRequest.Builder setHostDisplayId(int p0) { return null; }
        public android.view.inputmethod.InlineSuggestionsRequest.Builder setInlineTooltipPresentationSpec(android.widget.inline.InlinePresentationSpec p0) { return null; }
        public android.view.inputmethod.InlineSuggestionsRequest build() { return null; }
    }

    static abstract class BaseBuilder {
        BaseBuilder() {}
        abstract android.view.inputmethod.InlineSuggestionsRequest.Builder setInlinePresentationSpecs(java.util.List<android.widget.inline.InlinePresentationSpec> p0);
        abstract android.view.inputmethod.InlineSuggestionsRequest.Builder setHostPackageName(java.lang.String p0);
        abstract android.view.inputmethod.InlineSuggestionsRequest.Builder setHostInputToken(android.os.IBinder p0);
        abstract android.view.inputmethod.InlineSuggestionsRequest.Builder setHostDisplayId(int p0);
    }
}
