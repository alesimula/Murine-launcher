package android.safetycenter;

public final class SafetyCenterManager {
    public static final java.lang.String ACTION_REFRESH_SAFETY_SOURCES = "android.safetycenter.action.REFRESH_SAFETY_SOURCES";
    public static final java.lang.String ACTION_SAFETY_CENTER_ENABLED_CHANGED = "android.safetycenter.action.SAFETY_CENTER_ENABLED_CHANGED";
    public static final int EXTRA_REFRESH_REQUEST_TYPE_FETCH_FRESH_DATA = 0;
    public static final int EXTRA_REFRESH_REQUEST_TYPE_GET_DATA = 1;
    public static final java.lang.String EXTRA_REFRESH_SAFETY_SOURCES_BROADCAST_ID = "android.safetycenter.extra.REFRESH_SAFETY_SOURCES_BROADCAST_ID";
    public static final java.lang.String EXTRA_REFRESH_SAFETY_SOURCES_REQUEST_TYPE = "android.safetycenter.extra.REFRESH_SAFETY_SOURCES_REQUEST_TYPE";
    public static final java.lang.String EXTRA_REFRESH_SAFETY_SOURCE_IDS = "android.safetycenter.extra.REFRESH_SAFETY_SOURCE_IDS";
    public static final java.lang.String EXTRA_SAFETY_SOURCES_GROUP_ID = "android.safetycenter.extra.SAFETY_SOURCES_GROUP_ID";
    public static final java.lang.String EXTRA_SAFETY_SOURCE_ID = "android.safetycenter.extra.SAFETY_SOURCE_ID";
    public static final java.lang.String EXTRA_SAFETY_SOURCE_ISSUE_ID = "android.safetycenter.extra.SAFETY_SOURCE_ISSUE_ID";
    public static final java.lang.String EXTRA_SAFETY_SOURCE_USER_HANDLE = "android.safetycenter.extra.SAFETY_SOURCE_USER_HANDLE";
    public static final int REFRESH_REASON_DEVICE_LOCALE_CHANGE = 400;
    public static final int REFRESH_REASON_DEVICE_REBOOT = 300;
    public static final int REFRESH_REASON_OTHER = 600;
    public static final int REFRESH_REASON_PAGE_OPEN = 100;
    public static final int REFRESH_REASON_PERIODIC = 700;
    public static final int REFRESH_REASON_RESCAN_BUTTON_CLICK = 200;
    public static final int REFRESH_REASON_SAFETY_CENTER_ENABLED = 500;
    SafetyCenterManager() {}
    public boolean isSafetyCenterEnabled() { return false; }
    public void setSafetySourceData(java.lang.String p0, android.safetycenter.SafetySourceData p1, android.safetycenter.SafetyEvent p2) {}
    @android.annotation.Nullable
    public android.safetycenter.SafetySourceData getSafetySourceData(java.lang.String p0) { return null; }
    public void reportSafetySourceError(java.lang.String p0, android.safetycenter.SafetySourceErrorDetails p1) {}
    public void refreshSafetySources(int p0) {}
    public void refreshSafetySources(int p0, java.util.List<java.lang.String> p1) {}
    @android.annotation.Nullable
    public android.safetycenter.config.SafetyCenterConfig getSafetyCenterConfig() { return null; }
    @android.annotation.NonNull
    public android.safetycenter.SafetyCenterData getSafetyCenterData() { return null; }
    public void addOnSafetyCenterDataChangedListener(java.util.concurrent.Executor p0, android.safetycenter.SafetyCenterManager.OnSafetyCenterDataChangedListener p1) {}
    public void removeOnSafetyCenterDataChangedListener(android.safetycenter.SafetyCenterManager.OnSafetyCenterDataChangedListener p0) {}
    public void dismissSafetyCenterIssue(java.lang.String p0) {}
    public void executeSafetyCenterIssueAction(java.lang.String p0, java.lang.String p1) {}
    public void clearAllSafetySourceDataForTests() {}
    public void setSafetyCenterConfigForTests(android.safetycenter.config.SafetyCenterConfig p0) {}
    public void clearSafetyCenterConfigForTests() {}

    public static interface OnSafetyCenterDataChangedListener {
        public void onSafetyCenterDataChanged(android.safetycenter.SafetyCenterData p0);
        default public void onError(android.safetycenter.SafetyCenterErrorDetails p0) {}
    }
}
