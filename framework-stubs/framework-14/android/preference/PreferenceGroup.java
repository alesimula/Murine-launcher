package android.preference;

@java.lang.Deprecated
public abstract class PreferenceGroup extends android.preference.Preference implements android.preference.GenericInflater.Parent<android.preference.Preference> {
    public PreferenceGroup(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public PreferenceGroup(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public PreferenceGroup(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public void setOrderingAsAdded(boolean p0) {}
    public boolean isOrderingAsAdded() { return false; }
    public void addItemFromInflater(android.preference.Preference p0) {}
    public int getPreferenceCount() { return 0; }
    public android.preference.Preference getPreference(int p0) { return null; }
    public boolean addPreference(android.preference.Preference p0) { return false; }
    public boolean removePreference(android.preference.Preference p0) { return false; }
    public void removeAll() {}
    protected boolean onPrepareAddPreference(android.preference.Preference p0) { return false; }
    public android.preference.Preference findPreference(java.lang.CharSequence p0) { return null; }
    protected boolean isOnSameScreenAsChildren() { return false; }
    protected void onAttachedToActivity() {}
    protected void onPrepareForRemoval() {}
    public void notifyDependencyChange(boolean p0) {}
    void sortPreferences() {}
    protected void dispatchSaveInstanceState(android.os.Bundle p0) {}
    protected void dispatchRestoreInstanceState(android.os.Bundle p0) {}
}
