package android.preference;

@java.lang.Deprecated
public class EditTextPreference extends android.preference.DialogPreference {
    private android.widget.EditText mEditText;
    private java.lang.String mText;
    private boolean mTextSet;
    public EditTextPreference(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public EditTextPreference(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public EditTextPreference(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public EditTextPreference(android.content.Context p0) { super((android.content.Context)null); }
    public void setText(java.lang.String p0) {}
    public java.lang.String getText() { return null; }
    protected void onBindDialogView(android.view.View p0) {}
    protected void showDialog(android.os.Bundle p0) {}
    protected void onAddEditTextToDialogView(android.view.View p0, android.widget.EditText p1) {}
    protected void onDialogClosed(boolean p0) {}
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray p0, int p1) { return null; }
    protected void onSetInitialValue(boolean p0, java.lang.Object p1) {}
    public boolean shouldDisableDependents() { return false; }
    public android.widget.EditText getEditText() { return null; }
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}

    private static class SavedState extends android.preference.Preference.BaseSavedState {
        java.lang.String text;
        public static final android.os.Parcelable.Creator<android.preference.EditTextPreference.SavedState> CREATOR = null;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
    }
}
