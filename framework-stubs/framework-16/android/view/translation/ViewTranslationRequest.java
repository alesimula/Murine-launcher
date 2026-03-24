package android.view.translation;

public final class ViewTranslationRequest implements android.os.Parcelable {
    public static final java.lang.String ID_TEXT = "android:text";
    public static final java.lang.String ID_CONTENT_DESCRIPTION = "android:content_description";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.translation.ViewTranslationRequest> CREATOR = null;
    @android.annotation.NonNull
    public android.view.translation.TranslationRequestValue getValue(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getKeys() { return null; }
    @android.annotation.NonNull
    public android.view.autofill.AutofillId getAutofillId() { return null; }
    public ViewTranslationRequest(android.view.autofill.AutofillId p0, java.util.Map<java.lang.String, android.view.translation.TranslationRequestValue> p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    ViewTranslationRequest(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder(android.view.autofill.AutofillId p0) {}
        public Builder(android.view.autofill.AutofillId p0, long p1) {}
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        @android.annotation.NonNull
        public android.view.translation.ViewTranslationRequest.Builder setValue(java.lang.String p0, android.view.translation.TranslationRequestValue p1) { return null; }
        @android.annotation.NonNull
        public android.view.translation.ViewTranslationRequest build() { return null; }
        android.view.translation.ViewTranslationRequest.Builder setTranslationRequestValues(java.util.Map<java.lang.String, android.view.translation.TranslationRequestValue> p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Id {
    }
}
