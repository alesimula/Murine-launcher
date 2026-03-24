package android.preference;

@java.lang.Deprecated
public class Preference implements java.lang.Comparable<android.preference.Preference> {
    public static final int DEFAULT_ORDER = 2147483647;
    private android.content.Context mContext;
    private android.preference.PreferenceManager mPreferenceManager;
    private android.preference.PreferenceDataStore mPreferenceDataStore;
    private long mId;
    private android.preference.Preference.OnPreferenceChangeListener mOnChangeListener;
    private android.preference.Preference.OnPreferenceClickListener mOnClickListener;
    private int mOrder;
    private java.lang.CharSequence mTitle;
    private int mTitleRes;
    @android.annotation.UnsupportedAppUsage
    private java.lang.CharSequence mSummary;
    private int mIconResId;
    private android.graphics.drawable.Drawable mIcon;
    private java.lang.String mKey;
    private android.content.Intent mIntent;
    private java.lang.String mFragment;
    private android.os.Bundle mExtras;
    private boolean mEnabled;
    private boolean mSelectable;
    private boolean mRequiresKey;
    private boolean mPersistent;
    private java.lang.String mDependencyKey;
    private java.lang.Object mDefaultValue;
    private boolean mDependencyMet;
    private boolean mParentDependencyMet;
    private boolean mRecycleEnabled;
    private boolean mHasSingleLineTitleAttr;
    private boolean mSingleLineTitle;
    private boolean mIconSpaceReserved;
    private boolean mShouldDisableView;
    @android.annotation.UnsupportedAppUsage
    private int mLayoutResId;
    @android.annotation.UnsupportedAppUsage
    private int mWidgetLayoutResId;
    private android.preference.Preference.OnPreferenceChangeInternalListener mListener;
    private java.util.List<android.preference.Preference> mDependents;
    private android.preference.PreferenceGroup mParentGroup;
    private boolean mBaseMethodCalled;
    public Preference(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) {}
    public Preference(android.content.Context p0, android.util.AttributeSet p1, int p2) {}
    public Preference(android.content.Context p0, android.util.AttributeSet p1) {}
    public Preference(android.content.Context p0) {}
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray p0, int p1) { return null; }
    public void setIntent(android.content.Intent p0) {}
    public android.content.Intent getIntent() { return null; }
    public void setFragment(java.lang.String p0) {}
    public java.lang.String getFragment() { return null; }
    public void setPreferenceDataStore(android.preference.PreferenceDataStore p0) {}
    public android.preference.PreferenceDataStore getPreferenceDataStore() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public android.os.Bundle peekExtras() { return null; }
    public void setLayoutResource(int p0) {}
    public int getLayoutResource() { return 0; }
    public void setWidgetLayoutResource(int p0) {}
    public int getWidgetLayoutResource() { return 0; }
    public android.view.View getView(android.view.View p0, android.view.ViewGroup p1) { return null; }
    protected android.view.View onCreateView(android.view.ViewGroup p0) { return null; }
    protected void onBindView(android.view.View p0) {}
    private void setEnabledStateOnViews(android.view.View p0, boolean p1) {}
    public void setOrder(int p0) {}
    public int getOrder() { return 0; }
    public void setTitle(java.lang.CharSequence p0) {}
    public void setTitle(int p0) {}
    public int getTitleRes() { return 0; }
    public java.lang.CharSequence getTitle() { return null; }
    public void setIcon(android.graphics.drawable.Drawable p0) {}
    public void setIcon(int p0) {}
    public android.graphics.drawable.Drawable getIcon() { return null; }
    public java.lang.CharSequence getSummary() { return null; }
    public void setSummary(java.lang.CharSequence p0) {}
    public void setSummary(int p0) {}
    public void setEnabled(boolean p0) {}
    public boolean isEnabled() { return false; }
    public void setSelectable(boolean p0) {}
    public boolean isSelectable() { return false; }
    public void setShouldDisableView(boolean p0) {}
    public boolean getShouldDisableView() { return false; }
    public void setRecycleEnabled(boolean p0) {}
    public boolean isRecycleEnabled() { return false; }
    public void setSingleLineTitle(boolean p0) {}
    public boolean isSingleLineTitle() { return false; }
    public void setIconSpaceReserved(boolean p0) {}
    public boolean isIconSpaceReserved() { return false; }
    @android.annotation.UnsupportedAppUsage
    long getId() { return 0L; }
    protected void onClick() {}
    public void setKey(java.lang.String p0) {}
    public java.lang.String getKey() { return null; }
    void requireKey() {}
    public boolean hasKey() { return false; }
    public boolean isPersistent() { return false; }
    protected boolean shouldPersist() { return false; }
    public void setPersistent(boolean p0) {}
    protected boolean callChangeListener(java.lang.Object p0) { return false; }
    public void setOnPreferenceChangeListener(android.preference.Preference.OnPreferenceChangeListener p0) {}
    public android.preference.Preference.OnPreferenceChangeListener getOnPreferenceChangeListener() { return null; }
    public void setOnPreferenceClickListener(android.preference.Preference.OnPreferenceClickListener p0) {}
    public android.preference.Preference.OnPreferenceClickListener getOnPreferenceClickListener() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void performClick(android.preference.PreferenceScreen p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public boolean onKey(android.view.View p0, int p1, android.view.KeyEvent p2) { return false; }
    public android.content.Context getContext() { return null; }
    public android.content.SharedPreferences getSharedPreferences() { return null; }
    public android.content.SharedPreferences.Editor getEditor() { return null; }
    public boolean shouldCommit() { return false; }
    public int compareTo(android.preference.Preference p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    final void setOnPreferenceChangeInternalListener(android.preference.Preference.OnPreferenceChangeInternalListener p0) {}
    protected void notifyChanged() {}
    protected void notifyHierarchyChanged() {}
    public android.preference.PreferenceManager getPreferenceManager() { return null; }
    protected void onAttachedToHierarchy(android.preference.PreferenceManager p0) {}
    protected void onAttachedToActivity() {}
    void assignParent(android.preference.PreferenceGroup p0) {}
    private void registerDependency() {}
    private void unregisterDependency() {}
    protected android.preference.Preference findPreferenceInHierarchy(java.lang.String p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    private void registerDependent(android.preference.Preference p0) {}
    private void unregisterDependent(android.preference.Preference p0) {}
    public void notifyDependencyChange(boolean p0) {}
    public void onDependencyChanged(android.preference.Preference p0, boolean p1) {}
    public void onParentChanged(android.preference.Preference p0, boolean p1) {}
    public boolean shouldDisableDependents() { return false; }
    public void setDependency(java.lang.String p0) {}
    public java.lang.String getDependency() { return null; }
    public android.preference.PreferenceGroup getParent() { return null; }
    protected void onPrepareForRemoval() {}
    public void setDefaultValue(java.lang.Object p0) {}
    private void dispatchSetInitialValue() {}
    protected void onSetInitialValue(boolean p0, java.lang.Object p1) {}
    private void tryCommit(android.content.SharedPreferences.Editor p0) {}
    protected boolean persistString(java.lang.String p0) { return false; }
    protected java.lang.String getPersistedString(java.lang.String p0) { return null; }
    public boolean persistStringSet(java.util.Set<java.lang.String> p0) { return false; }
    public java.util.Set<java.lang.String> getPersistedStringSet(java.util.Set<java.lang.String> p0) { return null; }
    protected boolean persistInt(int p0) { return false; }
    protected int getPersistedInt(int p0) { return 0; }
    protected boolean persistFloat(float p0) { return false; }
    protected float getPersistedFloat(float p0) { return 0.0f; }
    protected boolean persistLong(long p0) { return false; }
    protected long getPersistedLong(long p0) { return 0L; }
    protected boolean persistBoolean(boolean p0) { return false; }
    protected boolean getPersistedBoolean(boolean p0) { return false; }
    public java.lang.String toString() { return null; }
    java.lang.StringBuilder getFilterableStringBuilder() { return null; }
    public void saveHierarchyState(android.os.Bundle p0) {}
    void dispatchSaveInstanceState(android.os.Bundle p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    public void restoreHierarchyState(android.os.Bundle p0) {}
    void dispatchRestoreInstanceState(android.os.Bundle p0) {}
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}

    @java.lang.Deprecated
    public static interface OnPreferenceClickListener {
        public boolean onPreferenceClick(android.preference.Preference p0);
    }

    @java.lang.Deprecated
    public static interface OnPreferenceChangeListener {
        public boolean onPreferenceChange(android.preference.Preference p0, java.lang.Object p1);
    }

    static interface OnPreferenceChangeInternalListener {
        public void onPreferenceChange(android.preference.Preference p0);
        public void onPreferenceHierarchyChange(android.preference.Preference p0);
    }

    @java.lang.Deprecated
    public static class BaseSavedState extends android.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<android.preference.Preference.BaseSavedState> CREATOR = null;
        public BaseSavedState(android.os.Parcel p0) { super((android.os.Parcelable)null); }
        public BaseSavedState(android.os.Parcelable p0) { super((android.os.Parcelable)null); }
    }
}
