package android.service.autofill;

public final class RegexValidator extends android.service.autofill.InternalValidator implements android.service.autofill.Validator, android.os.Parcelable {
    private static final java.lang.String TAG = "RegexValidator";
    private final android.view.autofill.AutofillId mId = null;
    private final java.util.regex.Pattern mRegex = null;
    public static final android.os.Parcelable.Creator<android.service.autofill.RegexValidator> CREATOR = null;
    public RegexValidator(android.view.autofill.AutofillId p0, java.util.regex.Pattern p1) { super(); }
    public boolean isValid(android.service.autofill.ValueFinder p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
