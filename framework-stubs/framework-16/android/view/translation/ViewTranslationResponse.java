package android.view.translation;

public final class ViewTranslationResponse implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.translation.ViewTranslationResponse> CREATOR = null;
    @android.annotation.NonNull
    public android.view.translation.TranslationResponseValue getValue(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getKeys() { return null; }
    @android.annotation.NonNull
    public android.view.autofill.AutofillId getAutofillId() { return null; }
    ViewTranslationResponse(android.view.autofill.AutofillId p0, java.util.Map<java.lang.String, android.view.translation.TranslationResponseValue> p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    ViewTranslationResponse(android.os.Parcel p0) {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
        abstract android.view.translation.ViewTranslationResponse.Builder setTranslationResponseValues(java.util.Map<java.lang.String, android.view.translation.TranslationResponseValue> p0);
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.view.translation.ViewTranslationResponse.Builder setValue(java.lang.String p0, android.view.translation.TranslationResponseValue p1) { return null; }
    }

    public static final class Builder extends android.view.translation.ViewTranslationResponse.BaseBuilder {
        public Builder(android.view.autofill.AutofillId p0) { super(); }
        @android.annotation.NonNull
        android.view.translation.ViewTranslationResponse.Builder setTranslationResponseValues(java.util.Map<java.lang.String, android.view.translation.TranslationResponseValue> p0) { return null; }
        @android.annotation.NonNull
        public android.view.translation.ViewTranslationResponse build() { return null; }
    }
}
