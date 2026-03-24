package com.android.internal.telephony;

public class MultiSimSettingController extends android.os.Handler {
    public static final int EVENT_RADIO_STATE_CHANGED = 9;
    protected final android.content.Context mContext = null;
    protected static com.android.internal.telephony.MultiSimSettingController sInstance;
    public static com.android.internal.telephony.MultiSimSettingController getInstance() { return null; }
    public static com.android.internal.telephony.MultiSimSettingController init(android.content.Context p0) { return null; }
    public MultiSimSettingController(android.content.Context p0) { super(); }
    public void notifyUserDataEnabled(int p0, boolean p1) {}
    public void notifyRoamingDataEnabled(int p0, boolean p1) {}
    public void notifyAllSubscriptionLoaded() {}
    public void notifySubscriptionInfoChanged() {}
    public void notifySubscriptionGroupChanged(android.os.ParcelUuid p0) {}
    public void notifyDefaultDataSubChanged() {}
    public void handleMessage(android.os.Message p0) {}
    public void onPhoneRemoved() {}
    public boolean isCarrierConfigLoadedForAllSub() { return false; }
    protected void updateDefaults() {}
    protected void disableDataForNonDefaultNonOpportunisticSubscriptions() {}
    protected void setUserDataEnabledForGroup(int p0, boolean p1) {}

    private static class DataSettingsControllerCallback extends com.android.internal.telephony.data.DataSettingsManager.DataSettingsManagerCallback {
        DataSettingsControllerCallback(com.android.internal.telephony.Phone p0, java.util.concurrent.Executor p1) { super(null); }
        public void onDataEnabledChanged(boolean p0, int p1, java.lang.String p2) {}
        public void onDataRoamingEnabledChanged(boolean p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface PrimarySubChangeType {
    }

    private class SimCombinationWarningParams {
        int mWarningType;
        java.lang.String mSimNames;
    }

    private static interface UpdateDefaultAction {
        public void update(int p0);
    }
}
