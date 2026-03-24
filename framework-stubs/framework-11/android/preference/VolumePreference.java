package android.preference;

@java.lang.Deprecated
public class VolumePreference extends android.preference.SeekBarDialogPreference implements android.preference.PreferenceManager.OnActivityStopListener, android.view.View.OnKeyListener, android.preference.SeekBarVolumizer.Callback {
    private int mStreamType;
    private android.preference.SeekBarVolumizer mSeekBarVolumizer;
    public VolumePreference(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public VolumePreference(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public VolumePreference(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public VolumePreference(android.content.Context p0) { super((android.content.Context)null); }
    public void setStreamType(int p0) {}
    protected void onBindDialogView(android.view.View p0) {}
    public boolean onKey(android.view.View p0, int p1, android.view.KeyEvent p2) { return false; }
    protected void onDialogClosed(boolean p0) {}
    public void onActivityStop() {}
    private void cleanup() {}
    public void onSampleStarting(android.preference.SeekBarVolumizer p0) {}
    public void onProgressChanged(android.widget.SeekBar p0, int p1, boolean p2) {}
    public void onMuted(boolean p0, boolean p1) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}

    private static class SavedState extends android.preference.Preference.BaseSavedState {
        android.preference.VolumePreference.VolumeStore mVolumeStore;
        public static final android.os.Parcelable.Creator<android.preference.VolumePreference.SavedState> CREATOR = null;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        android.preference.VolumePreference.VolumeStore getVolumeStore() { return null; }
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
    }

    public static class VolumeStore {
        public int volume;
        public int originalVolume;
        public VolumeStore() {}
    }
}
