package android.service.autofill;

public final class RegexValidator extends android.service.autofill.InternalValidator implements android.service.autofill.Validator, android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.autofill.RegexValidator> CREATOR = null;
    public RegexValidator(android.view.autofill.AutofillId p0, java.util.regex.Pattern p1) { super(); }
    public boolean isValid(android.service.autofill.ValueFinder p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
