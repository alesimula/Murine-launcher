package android.location;

public class LocationManager {
    private static final java.lang.String TAG = "LocationManager";
    private final android.content.Context mContext = null;
    @android.annotation.UnsupportedAppUsage
    private final android.location.ILocationManager mService = null;
    private final android.location.GnssMeasurementCallbackTransport mGnssMeasurementCallbackTransport = null;
    private final android.location.GnssNavigationMessageCallbackTransport mGnssNavigationMessageCallbackTransport = null;
    private final android.location.BatchedLocationCallbackTransport mBatchedLocationCallbackTransport = null;
    private final android.util.ArrayMap<android.location.GnssStatus.Callback, android.location.LocationManager.GnssStatusListenerTransport> mGnssStatusListeners = null;
    private final android.util.ArrayMap<android.location.OnNmeaMessageListener, android.location.LocationManager.GnssStatusListenerTransport> mGnssNmeaListeners = null;
    private final android.util.ArrayMap<android.location.GpsStatus.Listener, android.location.LocationManager.GnssStatusListenerTransport> mGpsStatusListeners = null;
    private volatile android.location.GnssStatus mGnssStatus;
    private int mTimeToFirstFix;
    public static final java.lang.String NETWORK_PROVIDER = "network";
    public static final java.lang.String GPS_PROVIDER = "gps";
    public static final java.lang.String PASSIVE_PROVIDER = "passive";
    public static final java.lang.String FUSED_PROVIDER = "fused";
    public static final java.lang.String KEY_PROXIMITY_ENTERING = "entering";
    @java.lang.Deprecated
    public static final java.lang.String KEY_STATUS_CHANGED = "status";
    public static final java.lang.String KEY_PROVIDER_ENABLED = "providerEnabled";
    public static final java.lang.String KEY_LOCATION_CHANGED = "location";
    public static final java.lang.String PROVIDERS_CHANGED_ACTION = "android.location.PROVIDERS_CHANGED";
    public static final java.lang.String EXTRA_PROVIDER_NAME = "android.location.extra.PROVIDER_NAME";
    public static final java.lang.String MODE_CHANGED_ACTION = "android.location.MODE_CHANGED";
    @java.lang.Deprecated
    public static final java.lang.String MODE_CHANGING_ACTION = "com.android.settings.location.MODE_CHANGING";
    public static final java.lang.String HIGH_POWER_REQUEST_CHANGE_ACTION = "android.location.HIGH_POWER_REQUEST_CHANGE";
    public static final java.lang.String SETTINGS_FOOTER_DISPLAYED_ACTION = "com.android.settings.location.DISPLAYED_FOOTER";
    public static final java.lang.String SETTINGS_FOOTER_REMOVED_ACTION = "com.android.settings.location.REMOVED_FOOTER";
    public static final java.lang.String METADATA_SETTINGS_FOOTER_STRING = "com.android.settings.location.FOOTER_STRING";
    private final android.util.ArrayMap<android.location.LocationListener, android.location.LocationManager.ListenerTransport> mListeners = null;
    public java.lang.String[] getBackgroundThrottlingWhitelist() { return null; }
    public java.lang.String[] getIgnoreSettingsWhitelist() { return null; }
    public LocationManager(android.content.Context p0, android.location.ILocationManager p1) {}
    private android.location.LocationProvider createProvider(java.lang.String p0, com.android.internal.location.ProviderProperties p1) { return null; }
    public java.util.List<java.lang.String> getAllProviders() { return null; }
    public java.util.List<java.lang.String> getProviders(boolean p0) { return null; }
    public android.location.LocationProvider getProvider(java.lang.String p0) { return null; }
    public java.util.List<java.lang.String> getProviders(android.location.Criteria p0, boolean p1) { return null; }
    public java.lang.String getBestProvider(android.location.Criteria p0, boolean p1) { return null; }
    public void requestLocationUpdates(java.lang.String p0, long p1, float p2, android.location.LocationListener p3) {}
    public void requestLocationUpdates(java.lang.String p0, long p1, float p2, android.location.LocationListener p3, android.os.Looper p4) {}
    public void requestLocationUpdates(long p0, float p1, android.location.Criteria p2, android.location.LocationListener p3, android.os.Looper p4) {}
    public void requestLocationUpdates(java.lang.String p0, long p1, float p2, android.app.PendingIntent p3) {}
    public void requestLocationUpdates(long p0, float p1, android.location.Criteria p2, android.app.PendingIntent p3) {}
    public void requestSingleUpdate(java.lang.String p0, android.location.LocationListener p1, android.os.Looper p2) {}
    public void requestSingleUpdate(android.location.Criteria p0, android.location.LocationListener p1, android.os.Looper p2) {}
    public void requestSingleUpdate(java.lang.String p0, android.app.PendingIntent p1) {}
    public void requestSingleUpdate(android.location.Criteria p0, android.app.PendingIntent p1) {}
    @android.annotation.SystemApi
    public void requestLocationUpdates(android.location.LocationRequest p0, android.location.LocationListener p1, android.os.Looper p2) {}
    @android.annotation.SystemApi
    public void requestLocationUpdates(android.location.LocationRequest p0, android.app.PendingIntent p1) {}
    public boolean injectLocation(android.location.Location p0) { return false; }
    private android.location.LocationManager.ListenerTransport wrapListener(android.location.LocationListener p0, android.os.Looper p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    private void requestLocationUpdates(android.location.LocationRequest p0, android.location.LocationListener p1, android.os.Looper p2, android.app.PendingIntent p3) {}
    public void removeUpdates(android.location.LocationListener p0) {}
    public void removeUpdates(android.app.PendingIntent p0) {}
    public void addProximityAlert(double p0, double p1, float p2, long p3, android.app.PendingIntent p4) {}
    public void addGeofence(android.location.LocationRequest p0, android.location.Geofence p1, android.app.PendingIntent p2) {}
    public void removeProximityAlert(android.app.PendingIntent p0) {}
    public void removeGeofence(android.location.Geofence p0, android.app.PendingIntent p1) {}
    public void removeAllGeofences(android.app.PendingIntent p0) {}
    public boolean isLocationEnabled() { return false; }
    @android.annotation.SystemApi
    public boolean isLocationEnabledForUser(android.os.UserHandle p0) { return false; }
    @android.annotation.SystemApi
    public void setLocationEnabledForUser(boolean p0, android.os.UserHandle p1) {}
    public boolean isProviderEnabled(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public boolean isProviderEnabledForUser(java.lang.String p0, android.os.UserHandle p1) { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean setProviderEnabledForUser(java.lang.String p0, boolean p1, android.os.UserHandle p2) { return false; }
    public android.location.Location getLastLocation() { return null; }
    public android.location.Location getLastKnownLocation(java.lang.String p0) { return null; }
    public void addTestProvider(java.lang.String p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7, int p8, int p9) {}
    public void removeTestProvider(java.lang.String p0) {}
    public void setTestProviderLocation(java.lang.String p0, android.location.Location p1) {}
    @java.lang.Deprecated
    public void clearTestProviderLocation(java.lang.String p0) {}
    public void setTestProviderEnabled(java.lang.String p0, boolean p1) {}
    @java.lang.Deprecated
    public void clearTestProviderEnabled(java.lang.String p0) {}
    @java.lang.Deprecated
    public void setTestProviderStatus(java.lang.String p0, int p1, android.os.Bundle p2, long p3) {}
    @java.lang.Deprecated
    public void clearTestProviderStatus(java.lang.String p0) {}
    public java.util.List<android.location.LocationRequest> getTestProviderCurrentRequests(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public boolean addGpsStatusListener(android.location.GpsStatus.Listener p0) { return false; }
    @java.lang.Deprecated
    public void removeGpsStatusListener(android.location.GpsStatus.Listener p0) {}
    public boolean registerGnssStatusCallback(android.location.GnssStatus.Callback p0) { return false; }
    public boolean registerGnssStatusCallback(android.location.GnssStatus.Callback p0, android.os.Handler p1) { return false; }
    public void unregisterGnssStatusCallback(android.location.GnssStatus.Callback p0) {}
    @java.lang.Deprecated
    public boolean addNmeaListener(android.location.GpsStatus.NmeaListener p0) { return false; }
    @java.lang.Deprecated
    public void removeNmeaListener(android.location.GpsStatus.NmeaListener p0) {}
    public boolean addNmeaListener(android.location.OnNmeaMessageListener p0) { return false; }
    public boolean addNmeaListener(android.location.OnNmeaMessageListener p0, android.os.Handler p1) { return false; }
    public void removeNmeaListener(android.location.OnNmeaMessageListener p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public boolean addGpsMeasurementListener(android.location.GpsMeasurementsEvent.Listener p0) { return false; }
    public boolean registerGnssMeasurementsCallback(android.location.GnssMeasurementsEvent.Callback p0) { return false; }
    public boolean registerGnssMeasurementsCallback(android.location.GnssMeasurementsEvent.Callback p0, android.os.Handler p1) { return false; }
    @android.annotation.SystemApi
    public void injectGnssMeasurementCorrections(android.location.GnssMeasurementCorrections p0) {}
    @android.annotation.SystemApi
    public android.location.GnssCapabilities getGnssCapabilities() { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public void removeGpsMeasurementListener(android.location.GpsMeasurementsEvent.Listener p0) {}
    public void unregisterGnssMeasurementsCallback(android.location.GnssMeasurementsEvent.Callback p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public boolean addGpsNavigationMessageListener(android.location.GpsNavigationMessageEvent.Listener p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public void removeGpsNavigationMessageListener(android.location.GpsNavigationMessageEvent.Listener p0) {}
    public boolean registerGnssNavigationMessageCallback(android.location.GnssNavigationMessage.Callback p0) { return false; }
    public boolean registerGnssNavigationMessageCallback(android.location.GnssNavigationMessage.Callback p0, android.os.Handler p1) { return false; }
    public void unregisterGnssNavigationMessageCallback(android.location.GnssNavigationMessage.Callback p0) {}
    @java.lang.Deprecated
    public android.location.GpsStatus getGpsStatus(android.location.GpsStatus p0) { return null; }
    public int getGnssYearOfHardware() { return 0; }
    public java.lang.String getGnssHardwareModelName() { return null; }
    @android.annotation.SystemApi
    public int getGnssBatchSize() { return 0; }
    @android.annotation.SystemApi
    public boolean registerGnssBatchedLocationCallback(long p0, boolean p1, android.location.BatchedLocationCallback p2, android.os.Handler p3) { return false; }
    @android.annotation.SystemApi
    public void flushGnssBatch() {}
    @android.annotation.SystemApi
    public boolean unregisterGnssBatchedLocationCallback(android.location.BatchedLocationCallback p0) { return false; }
    public boolean sendExtraCommand(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public boolean sendNiResponse(int p0, int p1) { return false; }
    private static void checkProvider(java.lang.String p0) {}
    private static void checkCriteria(android.location.Criteria p0) {}
    private static void checkListener(android.location.LocationListener p0) {}
    private void checkPendingIntent(android.app.PendingIntent p0) {}
    private static void checkGeofence(android.location.Geofence p0) {}
    @android.annotation.SystemApi
    public boolean isProviderPackage(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public void setExtraLocationControllerPackage(java.lang.String p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void setLocationControllerExtraPackage(java.lang.String p0) {}
    @android.annotation.SystemApi
    public java.lang.String getExtraLocationControllerPackage() { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void setLocationControllerExtraPackageEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public void setExtraLocationControllerPackageEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public boolean isExtraLocationControllerPackageEnabled() { return false; }

    private class ListenerTransport extends android.location.ILocationListener.Stub {
        private static final int TYPE_LOCATION_CHANGED = 1;
        private static final int TYPE_STATUS_CHANGED = 2;
        private static final int TYPE_PROVIDER_ENABLED = 3;
        private static final int TYPE_PROVIDER_DISABLED = 4;
        private android.location.LocationListener mListener;
        private final android.os.Handler mListenerHandler = null;
        ListenerTransport(android.location.LocationManager p0, android.location.LocationListener p1, android.os.Looper p2) { super(); }
        public void onLocationChanged(android.location.Location p0) {}
        public void onStatusChanged(java.lang.String p0, int p1, android.os.Bundle p2) {}
        public void onProviderEnabled(java.lang.String p0) {}
        public void onProviderDisabled(java.lang.String p0) {}
        private void sendCallbackMessage(android.os.Message p0) {}
        private void _handleMessage(android.os.Message p0) {}
        private void locationCallbackFinished() {}
    }

    private class GnssStatusListenerTransport extends android.location.IGnssStatusListener.Stub {
        private final android.location.GnssStatus.Callback mGnssCallback = null;
        private final android.location.OnNmeaMessageListener mGnssNmeaListener = null;
        private final android.os.Handler mGnssHandler = null;
        private static final int NMEA_RECEIVED = 1;
        private static final int GNSS_EVENT_STARTED = 2;
        private static final int GNSS_EVENT_STOPPED = 3;
        private static final int GNSS_EVENT_FIRST_FIX = 4;
        private static final int GNSS_EVENT_SATELLITE_STATUS = 5;
        private final java.util.ArrayList<android.location.LocationManager.GnssStatusListenerTransport.Nmea> mNmeaBuffer = null;
        GnssStatusListenerTransport(android.location.LocationManager p0, android.location.GnssStatus.Callback p1, android.os.Handler p2) { super(); }
        GnssStatusListenerTransport(android.location.LocationManager p0, android.location.OnNmeaMessageListener p1, android.os.Handler p2) { super(); }
        GnssStatusListenerTransport(android.location.LocationManager p0, android.location.GpsStatus.Listener p1, android.os.Handler p2) { super(); }
        public void onGnssStarted() {}
        public void onGnssStopped() {}
        public void onFirstFix(int p0) {}
        public void onSvStatusChanged(int p0, int[] p1, float[] p2, float[] p3, float[] p4, float[] p5) {}
        public void onNmeaReceived(long p0, java.lang.String p1) {}

        private class Nmea {
            long mTimestamp;
            java.lang.String mNmea;
            Nmea(android.location.LocationManager.GnssStatusListenerTransport p0, long p1, java.lang.String p2) {}
        }

        private class GnssHandler extends android.os.Handler {
            GnssHandler(android.location.LocationManager.GnssStatusListenerTransport p0, android.os.Handler p1) { super(); }
            public void handleMessage(android.os.Message p0) {}
        }
    }
}
