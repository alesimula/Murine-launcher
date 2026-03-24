package android.preference;

@java.lang.Deprecated
public class RingtonePreference extends android.preference.Preference implements android.preference.PreferenceManager.OnActivityResultListener {
    private static final java.lang.String TAG = "RingtonePreference";
    private int mRingtoneType;
    private boolean mShowDefault;
    private boolean mShowSilent;
    @android.annotation.UnsupportedAppUsage
    private int mRequestCode;
    public RingtonePreference(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public RingtonePreference(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public RingtonePreference(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public RingtonePreference(android.content.Context p0) { super((android.content.Context)null); }
    public int getRingtoneType() { return 0; }
    public void setRingtoneType(int p0) {}
    public boolean getShowDefault() { return false; }
    public void setShowDefault(boolean p0) {}
    public boolean getShowSilent() { return false; }
    public void setShowSilent(boolean p0) {}
    protected void onClick() {}
    protected void onPrepareRingtonePickerIntent(android.content.Intent p0) {}
    protected void onSaveRingtone(android.net.Uri p0) {}
    protected android.net.Uri onRestoreRingtone() { return null; }
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray p0, int p1) { return null; }
    protected void onSetInitialValue(boolean p0, java.lang.Object p1) {}
    protected void onAttachedToHierarchy(android.preference.PreferenceManager p0) {}
    public boolean onActivityResult(int p0, int p1, android.content.Intent p2) { return false; }
}
