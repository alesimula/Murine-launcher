package android.preference;

@java.lang.Deprecated
public final class PreferenceScreen extends android.preference.PreferenceGroup implements android.widget.AdapterView.OnItemClickListener, android.content.DialogInterface.OnDismissListener {
    public PreferenceScreen(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null, (android.util.AttributeSet)null); }
    public void setDialogFitsSystemWindows(boolean p0) {}
    public android.widget.ListAdapter getRootAdapter() { return null; }
    protected android.widget.ListAdapter onCreateRootAdapter() { return null; }
    public void bind(android.widget.ListView p0) {}
    protected void onClick() {}
    public void onDismiss(android.content.DialogInterface p0) {}
    public android.app.Dialog getDialog() { return null; }
    public void onItemClick(android.widget.AdapterView p0, android.view.View p1, int p2, long p3) {}
    protected boolean isOnSameScreenAsChildren() { return false; }
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}

    private static class SavedState extends android.preference.Preference.BaseSavedState {
        boolean isDialogShowing;
        android.os.Bundle dialogBundle;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.preference.PreferenceScreen.SavedState> CREATOR = null;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
    }
}
