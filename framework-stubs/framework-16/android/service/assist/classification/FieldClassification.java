package android.service.assist.classification;

public final class FieldClassification implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.assist.classification.FieldClassification> CREATOR = null;
    @android.annotation.NonNull
    public android.view.autofill.AutofillId getAutofillId() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getHints() { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getGroupHints() { return null; }
    static java.util.Set<java.lang.String> unparcelHints(android.os.Parcel p0) { return null; }
    void parcelHints(android.os.Parcel p0, int p1) {}
    static java.util.Set<java.lang.String> unparcelGroupHints(android.os.Parcel p0) { return null; }
    void parcelGroupHints(android.os.Parcel p0, int p1) {}
    public FieldClassification(android.view.autofill.AutofillId p0, java.util.Set<java.lang.String> p1) {}
    @android.annotation.SystemApi
    public FieldClassification(android.view.autofill.AutofillId p0, java.util.Set<java.lang.String> p1, java.util.Set<java.lang.String> p2) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    FieldClassification(android.os.Parcel p0) {}
}
