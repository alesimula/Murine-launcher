package com.android.internal.preference;

public class YesNoPreference extends android.preference.DialogPreference {
    public YesNoPreference(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public YesNoPreference(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public YesNoPreference(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public YesNoPreference(android.content.Context p0) { super((android.content.Context)null); }
    protected void onDialogClosed(boolean p0) {}
    public void setValue(boolean p0) {}
    public boolean getValue() { return false; }
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray p0, int p1) { return null; }
    protected void onSetInitialValue(boolean p0, java.lang.Object p1) {}
    public boolean shouldDisableDependents() { return false; }
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}

    private static class SavedState extends android.preference.Preference.BaseSavedState {
        boolean wasPositiveResult;
        public static final android.os.Parcelable.Creator<com.android.internal.preference.YesNoPreference.SavedState> CREATOR = null;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
    }
}
