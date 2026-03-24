package com.android.internal.telephony;

public class CarrierServiceStateTracker extends android.os.Handler {
    protected static final int CARRIER_EVENT_BASE = 100;
    protected static final int CARRIER_EVENT_VOICE_REGISTRATION = 101;
    protected static final int CARRIER_EVENT_VOICE_DEREGISTRATION = 102;
    protected static final int CARRIER_EVENT_DATA_REGISTRATION = 103;
    protected static final int CARRIER_EVENT_DATA_DEREGISTRATION = 104;
    protected static final int CARRIER_EVENT_IMS_CAPABILITIES_CHANGED = 105;
    public static final int NOTIFICATION_PREF_NETWORK = 1000;
    public static final int NOTIFICATION_EMERGENCY_NETWORK = 1001;
    public static final java.lang.String EMERGENCY_NOTIFICATION_TAG = "EmergencyNetworkNotification";
    public static final java.lang.String PREF_NETWORK_NOTIFICATION_TAG = "PrefNetworkNotification";
    public CarrierServiceStateTracker(com.android.internal.telephony.Phone p0, com.android.internal.telephony.ServiceStateTracker p1) { super(); }
    public com.android.internal.telephony.CarrierServiceStateTracker.AllowedNetworkTypesListener getAllowedNetworkTypesChangedListener() { return null; }
    public java.util.Map<java.lang.Integer, com.android.internal.telephony.CarrierServiceStateTracker.NotificationType> getNotificationTypeMap() { return null; }
    public void handleMessage(android.os.Message p0) {}
    public boolean isRadioOffOrAirplaneMode() { return false; }
    public boolean evaluateSendingMessage(com.android.internal.telephony.CarrierServiceStateTracker.NotificationType p0) { return false; }
    public int getDelay(com.android.internal.telephony.CarrierServiceStateTracker.NotificationType p0) { return 0; }
    public android.app.Notification.Builder getNotificationBuilder(com.android.internal.telephony.CarrierServiceStateTracker.NotificationType p0) { return null; }
    public android.app.NotificationManager getNotificationManager(android.content.Context p0) { return null; }
    public void sendNotification(com.android.internal.telephony.CarrierServiceStateTracker.NotificationType p0) {}
    public void cancelNotification(com.android.internal.telephony.CarrierServiceStateTracker.NotificationType p0) {}
    public void dispose() {}

    public class AllowedNetworkTypesListener extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.AllowedNetworkTypesListener {
        public AllowedNetworkTypesListener(com.android.internal.telephony.CarrierServiceStateTracker p0) { super(); }
        public void onAllowedNetworkTypesChanged(int p0, long p1) {}
    }

    public class EmergencyNetworkNotification implements com.android.internal.telephony.CarrierServiceStateTracker.NotificationType {
        EmergencyNetworkNotification(com.android.internal.telephony.CarrierServiceStateTracker p0, int p1) {}
        public void setDelay(android.os.PersistableBundle p0) {}
        public int getDelay() { return 0; }
        public int getTypeId() { return 0; }
        public int getNotificationId() { return 0; }
        public java.lang.String getNotificationTag() { return null; }
        public boolean sendMessage() { return false; }
        public android.app.Notification.Builder getNotificationBuilder() { return null; }
    }

    public static interface NotificationType {
        public boolean sendMessage();
        public int getDelay();
        public void setDelay(android.os.PersistableBundle p0);
        public int getTypeId();
        public int getNotificationId();
        public java.lang.String getNotificationTag();
        public android.app.Notification.Builder getNotificationBuilder();
    }

    public class PrefNetworkNotification implements com.android.internal.telephony.CarrierServiceStateTracker.NotificationType {
        PrefNetworkNotification(com.android.internal.telephony.CarrierServiceStateTracker p0, int p1) {}
        public void setDelay(android.os.PersistableBundle p0) {}
        public int getDelay() { return 0; }
        public int getTypeId() { return 0; }
        public int getNotificationId() { return 0; }
        public java.lang.String getNotificationTag() { return null; }
        public boolean sendMessage() { return false; }
        public android.app.Notification.Builder getNotificationBuilder() { return null; }
    }
}
