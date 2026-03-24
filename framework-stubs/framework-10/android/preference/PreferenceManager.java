package android.preference;

@java.lang.Deprecated
public class PreferenceManager {
    private static final java.lang.String TAG = "PreferenceManager";
    public static final java.lang.String METADATA_KEY_PREFERENCES = "android.preference";
    public static final java.lang.String KEY_HAS_SET_DEFAULT_VALUES = "_has_set_default_values";
    private android.app.Activity mActivity;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private android.preference.PreferenceFragment mFragment;
    private android.content.Context mContext;
    private long mNextId;
    private int mNextRequestCode;
    @android.annotation.UnsupportedAppUsage
    private android.content.SharedPreferences mSharedPreferences;
    private android.preference.PreferenceDataStore mPreferenceDataStore;
    private android.content.SharedPreferences.Editor mEditor;
    private boolean mNoCommit;
    private java.lang.String mSharedPreferencesName;
    private int mSharedPreferencesMode;
    private static final int STORAGE_DEFAULT = 0;
    private static final int STORAGE_DEVICE_PROTECTED = 1;
    private static final int STORAGE_CREDENTIAL_PROTECTED = 2;
    private int mStorage;
    private android.preference.PreferenceScreen mPreferenceScreen;
    private java.util.List<android.preference.PreferenceManager.OnActivityResultListener> mActivityResultListeners;
    private java.util.List<android.preference.PreferenceManager.OnActivityStopListener> mActivityStopListeners;
    @android.annotation.UnsupportedAppUsage
    private java.util.List<android.preference.PreferenceManager.OnActivityDestroyListener> mActivityDestroyListeners;
    private java.util.List<android.content.DialogInterface> mPreferencesScreens;
    @android.annotation.UnsupportedAppUsage
    private android.preference.PreferenceManager.OnPreferenceTreeClickListener mOnPreferenceTreeClickListener;
    @android.annotation.UnsupportedAppUsage
    public PreferenceManager(android.app.Activity p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    PreferenceManager(android.content.Context p0) {}
    private void init(android.content.Context p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    void setFragment(android.preference.PreferenceFragment p0) {}
    @android.annotation.UnsupportedAppUsage
    android.preference.PreferenceFragment getFragment() { return null; }
    public void setPreferenceDataStore(android.preference.PreferenceDataStore p0) {}
    public android.preference.PreferenceDataStore getPreferenceDataStore() { return null; }
    private java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    android.preference.PreferenceScreen inflateFromIntent(android.content.Intent p0, android.preference.PreferenceScreen p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.preference.PreferenceScreen inflateFromResource(android.content.Context p0, int p1, android.preference.PreferenceScreen p2) { return null; }
    public android.preference.PreferenceScreen createPreferenceScreen(android.content.Context p0) { return null; }
    long getNextId() { return 0L; }
    public java.lang.String getSharedPreferencesName() { return null; }
    public void setSharedPreferencesName(java.lang.String p0) {}
    public int getSharedPreferencesMode() { return 0; }
    public void setSharedPreferencesMode(int p0) {}
    public void setStorageDefault() {}
    public void setStorageDeviceProtected() {}
    @android.annotation.SystemApi
    public void setStorageCredentialProtected() {}
    public boolean isStorageDefault() { return false; }
    public boolean isStorageDeviceProtected() { return false; }
    @android.annotation.SystemApi
    public boolean isStorageCredentialProtected() { return false; }
    public android.content.SharedPreferences getSharedPreferences() { return null; }
    public static android.content.SharedPreferences getDefaultSharedPreferences(android.content.Context p0) { return null; }
    public static java.lang.String getDefaultSharedPreferencesName(android.content.Context p0) { return null; }
    private static int getDefaultSharedPreferencesMode() { return 0; }
    @android.annotation.UnsupportedAppUsage
    android.preference.PreferenceScreen getPreferenceScreen() { return null; }
    @android.annotation.UnsupportedAppUsage
    boolean setPreferences(android.preference.PreferenceScreen p0) { return false; }
    public android.preference.Preference findPreference(java.lang.CharSequence p0) { return null; }
    public static void setDefaultValues(android.content.Context p0, int p1, boolean p2) {}
    public static void setDefaultValues(android.content.Context p0, java.lang.String p1, int p2, int p3, boolean p4) {}
    @android.annotation.UnsupportedAppUsage
    android.content.SharedPreferences.Editor getEditor() { return null; }
    @android.annotation.UnsupportedAppUsage
    boolean shouldCommit() { return false; }
    @android.annotation.UnsupportedAppUsage
    private void setNoCommit(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    android.app.Activity getActivity() { return null; }
    android.content.Context getContext() { return null; }
    @android.annotation.UnsupportedAppUsage
    void registerOnActivityResultListener(android.preference.PreferenceManager.OnActivityResultListener p0) {}
    @android.annotation.UnsupportedAppUsage
    void unregisterOnActivityResultListener(android.preference.PreferenceManager.OnActivityResultListener p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityResult(int p0, int p1, android.content.Intent p2) {}
    @android.annotation.UnsupportedAppUsage
    public void registerOnActivityStopListener(android.preference.PreferenceManager.OnActivityStopListener p0) {}
    @android.annotation.UnsupportedAppUsage
    public void unregisterOnActivityStopListener(android.preference.PreferenceManager.OnActivityStopListener p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityStop() {}
    @android.annotation.UnsupportedAppUsage
    void registerOnActivityDestroyListener(android.preference.PreferenceManager.OnActivityDestroyListener p0) {}
    @android.annotation.UnsupportedAppUsage
    void unregisterOnActivityDestroyListener(android.preference.PreferenceManager.OnActivityDestroyListener p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityDestroy() {}
    @android.annotation.UnsupportedAppUsage
    int getNextRequestCode() { return 0; }
    void addPreferencesScreen(android.content.DialogInterface p0) {}
    void removePreferencesScreen(android.content.DialogInterface p0) {}
    void dispatchNewIntent(android.content.Intent p0) {}
    private void dismissAllScreens() {}
    void setOnPreferenceTreeClickListener(android.preference.PreferenceManager.OnPreferenceTreeClickListener p0) {}
    android.preference.PreferenceManager.OnPreferenceTreeClickListener getOnPreferenceTreeClickListener() { return null; }

    @java.lang.Deprecated
    public static interface OnPreferenceTreeClickListener {
        public boolean onPreferenceTreeClick(android.preference.PreferenceScreen p0, android.preference.Preference p1);
    }

    @java.lang.Deprecated
    public static interface OnActivityStopListener {
        public void onActivityStop();
    }

    @java.lang.Deprecated
    public static interface OnActivityResultListener {
        public boolean onActivityResult(int p0, int p1, android.content.Intent p2);
    }

    @java.lang.Deprecated
    public static interface OnActivityDestroyListener {
        public void onActivityDestroy();
    }
}
