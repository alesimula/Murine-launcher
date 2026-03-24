package android.preference;

@java.lang.Deprecated
public class PreferenceCategory extends android.preference.PreferenceGroup {
    private static final java.lang.String TAG = "PreferenceCategory";
    public PreferenceCategory(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null, (android.util.AttributeSet)null); }
    public PreferenceCategory(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null, (android.util.AttributeSet)null); }
    public PreferenceCategory(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null, (android.util.AttributeSet)null); }
    public PreferenceCategory(android.content.Context p0) { super((android.content.Context)null, (android.util.AttributeSet)null); }
    protected boolean onPrepareAddPreference(android.preference.Preference p0) { return false; }
    public boolean isEnabled() { return false; }
    public boolean shouldDisableDependents() { return false; }
}
