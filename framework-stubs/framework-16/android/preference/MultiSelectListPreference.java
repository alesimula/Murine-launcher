package android.preference;

@java.lang.Deprecated
public class MultiSelectListPreference extends android.preference.DialogPreference {
    public MultiSelectListPreference(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public MultiSelectListPreference(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public MultiSelectListPreference(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MultiSelectListPreference(android.content.Context p0) { super((android.content.Context)null); }
    public void setEntries(java.lang.CharSequence[] p0) {}
    public void setEntries(int p0) {}
    public java.lang.CharSequence[] getEntries() { return null; }
    public void setEntryValues(java.lang.CharSequence[] p0) {}
    public void setEntryValues(int p0) {}
    public java.lang.CharSequence[] getEntryValues() { return null; }
    public void setValues(java.util.Set<java.lang.String> p0) {}
    public java.util.Set<java.lang.String> getValues() { return null; }
    public int findIndexOfValue(java.lang.String p0) { return 0; }
    protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder p0) {}
    protected void onDialogClosed(boolean p0) {}
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray p0, int p1) { return null; }
    protected void onSetInitialValue(boolean p0, java.lang.Object p1) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }

    private static class SavedState extends android.preference.Preference.BaseSavedState {
        java.util.Set<java.lang.String> values;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.preference.MultiSelectListPreference.SavedState> CREATOR = null;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
