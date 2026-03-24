package android.preference;

@java.lang.Deprecated
public abstract class TwoStatePreference extends android.preference.Preference {
    boolean mChecked;
    public TwoStatePreference(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public TwoStatePreference(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TwoStatePreference(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TwoStatePreference(android.content.Context p0) { super((android.content.Context)null); }
    protected void onClick() {}
    public void setChecked(boolean p0) {}
    public boolean isChecked() { return false; }
    public boolean shouldDisableDependents() { return false; }
    public void setSummaryOn(java.lang.CharSequence p0) {}
    public void setSummaryOn(int p0) {}
    public java.lang.CharSequence getSummaryOn() { return null; }
    public void setSummaryOff(java.lang.CharSequence p0) {}
    public void setSummaryOff(int p0) {}
    public java.lang.CharSequence getSummaryOff() { return null; }
    public boolean getDisableDependentsState() { return false; }
    public void setDisableDependentsState(boolean p0) {}
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray p0, int p1) { return null; }
    protected void onSetInitialValue(boolean p0, java.lang.Object p1) {}
    void syncSummaryView(android.view.View p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}

    static class SavedState extends android.preference.Preference.BaseSavedState {
        boolean checked;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.preference.TwoStatePreference.SavedState> CREATOR = null;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
    }
}
