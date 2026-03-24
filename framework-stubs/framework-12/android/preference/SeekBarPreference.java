package android.preference;

@java.lang.Deprecated
public class SeekBarPreference extends android.preference.Preference implements android.widget.SeekBar.OnSeekBarChangeListener {
    private int mProgress;
    private int mMax;
    private boolean mTrackingTouch;
    public SeekBarPreference(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public SeekBarPreference(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public SeekBarPreference(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SeekBarPreference(android.content.Context p0) { super((android.content.Context)null); }
    protected void onBindView(android.view.View p0) {}
    protected void onSetInitialValue(boolean p0, java.lang.Object p1) {}
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray p0, int p1) { return null; }
    public boolean onKey(android.view.View p0, int p1, android.view.KeyEvent p2) { return false; }
    public void setMax(int p0) {}
    public void setProgress(int p0) {}
    private void setProgress(int p0, boolean p1) {}
    public int getProgress() { return 0; }
    void syncProgress(android.widget.SeekBar p0) {}
    public void onProgressChanged(android.widget.SeekBar p0, int p1, boolean p2) {}
    public void onStartTrackingTouch(android.widget.SeekBar p0) {}
    public void onStopTrackingTouch(android.widget.SeekBar p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}

    private static class SavedState extends android.preference.Preference.BaseSavedState {
        int progress;
        int max;
        public static final android.os.Parcelable.Creator<android.preference.SeekBarPreference.SavedState> CREATOR = null;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
    }
}
