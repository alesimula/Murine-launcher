package android.preference;

@java.lang.Deprecated
public class MultiCheckPreference extends android.preference.DialogPreference {
    public MultiCheckPreference(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public MultiCheckPreference(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public MultiCheckPreference(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MultiCheckPreference(android.content.Context p0) { super((android.content.Context)null); }
    public void setEntries(java.lang.CharSequence[] p0) {}
    public void setEntries(int p0) {}
    public java.lang.CharSequence[] getEntries() { return null; }
    public void setEntryValues(java.lang.String[] p0) {}
    public void setEntryValues(int p0) {}
    public java.lang.String[] getEntryValues() { return null; }
    public boolean getValue(int p0) { return false; }
    public void setValue(int p0, boolean p1) {}
    public void setValues(boolean[] p0) {}
    public java.lang.CharSequence getSummary() { return null; }
    public void setSummary(java.lang.CharSequence p0) {}
    public boolean[] getValues() { return null; }
    public int findIndexOfValue(java.lang.String p0) { return 0; }
    protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder p0) {}
    protected void onDialogClosed(boolean p0) {}
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray p0, int p1) { return null; }
    protected void onSetInitialValue(boolean p0, java.lang.Object p1) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}

    private static class SavedState extends android.preference.Preference.BaseSavedState {
        boolean[] values;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.preference.MultiCheckPreference.SavedState> CREATOR = null;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
    }
}
