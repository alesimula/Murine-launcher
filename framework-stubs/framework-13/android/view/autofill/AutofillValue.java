package android.view.autofill;

public final class AutofillValue implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.autofill.AutofillValue> CREATOR = null;
    public java.lang.CharSequence getTextValue() { return null; }
    public boolean isText() { return false; }
    public boolean getToggleValue() { return false; }
    public boolean isToggle() { return false; }
    public int getListValue() { return 0; }
    public boolean isList() { return false; }
    public long getDateValue() { return 0L; }
    public boolean isDate() { return false; }
    public boolean isEmpty() { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.view.autofill.AutofillValue forText(java.lang.CharSequence p0) { return null; }
    public static android.view.autofill.AutofillValue forToggle(boolean p0) { return null; }
    public static android.view.autofill.AutofillValue forList(int p0) { return null; }
    public static android.view.autofill.AutofillValue forDate(long p0) { return null; }
}
