package android.location;

public class LocationManager {
    private android.app.PropertyInvalidatedCache<java.lang.Integer, java.lang.Boolean> mLocationEnabledCache;
    private final java.lang.Object mLock = null;
    private static final long GET_PROVIDER_SECURITY_EXCEPTIONS = 150935354L;
    private static final long TARGETED_PENDING_INTENT = 148963590L;
    private static final long INCOMPLETE_LOCATION = 148964793L;
    private static final long GPS_STATUS_USAGE = 144027538L;
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
    public static final java.lang.String EXTRA_PROVIDER_ENABLED = "android.location.extra.PROVIDER_ENABLED";
    public static final java.lang.String MODE_CHANGED_ACTION = "android.location.MODE_CHANGED";
    public static final java.lang.String EXTRA_LOCATION_ENABLED = "android.location.extra.LOCATION_ENABLED";
    public static final java.lang.String HIGH_POWER_REQUEST_CHANGE_ACTION = "android.location.HIGH_POWER_REQUEST_CHANGE";
    public static final java.lang.String SETTINGS_FOOTER_DISPLAYED_ACTION = "com.android.settings.location.DISPLAYED_FOOTER";
    public static final java.lang.String METADATA_SETTINGS_FOOTER_STRING = "com.android.settings.location.FOOTER_STRING";
    private static final long GET_CURRENT_LOCATION_MAX_TIMEOUT_MS = 30000L;
    private final android.content.Context mContext = null;
    private final android.location.ILocationManager mService = null;
    private final android.util.ArrayMap<android.location.LocationListener, android.location.LocationManager.LocationListenerTransport> mListeners = null;
    private final android.location.LocationManager.BatchedLocationCallbackManager mBatchedLocationCallbackManager = null;
    private final android.location.LocationManager.GnssStatusListenerManager mGnssStatusListenerManager = null;
    private final android.location.LocationManager.GnssMeasurementsListenerManager mGnssMeasurementsListenerManager = null;
    private final android.location.LocationManager.GnssNavigationMessageListenerManager mGnssNavigationMessageListenerTransport = null;
    private final android.location.LocationManager.GnssAntennaInfoListenerManager mGnssAntennaInfoListenerManager = null;
    public static final java.lang.String CACHE_KEY_LOCATION_ENABLED_PROPERTY = "cache_key.location_enabled";
    public LocationManager(android.content.Context p0, android.location.ILocationManager p1) {}
    public java.lang.String[] getBackgroundThrottlingWhitelist() { return null; }
    public java.lang.String[] getIgnoreSettingsWhitelist() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getExtraLocationControllerPackage() { return null; }
    @android.annotation.SystemApi
    public void setExtraLocationControllerPackage(java.lang.String p0) {}
    @android.annotation.SystemApi
    public void setExtraLocationControllerPackageEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public boolean isExtraLocationControllerPackageEnabled() { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void setLocationControllerExtraPackage(java.lang.String p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void setLocationControllerExtraPackageEnabled(boolean p0) {}
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
    public void getCurrentLocation(java.lang.String p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.location.Location> p3) {}
    @android.annotation.SystemApi
    public void getCurrentLocation(android.location.LocationRequest p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.location.Location> p3) {}
    @java.lang.Deprecated
    public void requestSingleUpdate(java.lang.String p0, android.location.LocationListener p1, android.os.Looper p2) {}
    @java.lang.Deprecated
    public void requestSingleUpdate(android.location.Criteria p0, android.location.LocationListener p1, android.os.Looper p2) {}
    @java.lang.Deprecated
    public void requestSingleUpdate(java.lang.String p0, android.app.PendingIntent p1) {}
    @java.lang.Deprecated
    public void requestSingleUpdate(android.location.Criteria p0, android.app.PendingIntent p1) {}
    public void requestLocationUpdates(java.lang.String p0, long p1, float p2, android.location.LocationListener p3) {}
    public void requestLocationUpdates(java.lang.String p0, long p1, float p2, android.location.LocationListener p3, android.os.Looper p4) {}
    public void requestLocationUpdates(java.lang.String p0, long p1, float p2, java.util.concurrent.Executor p3, android.location.LocationListener p4) {}
    public void requestLocationUpdates(long p0, float p1, android.location.Criteria p2, android.location.LocationListener p3, android.os.Looper p4) {}
    public void requestLocationUpdates(long p0, float p1, android.location.Criteria p2, java.util.concurrent.Executor p3, android.location.LocationListener p4) {}
    public void requestLocationUpdates(java.lang.String p0, long p1, float p2, android.app.PendingIntent p3) {}
    public void requestLocationUpdates(long p0, float p1, android.location.Criteria p2, android.app.PendingIntent p3) {}
    @android.annotation.SystemApi
    public void requestLocationUpdates(android.location.LocationRequest p0, android.location.LocationListener p1, android.os.Looper p2) {}
    @android.annotation.SystemApi
    public void requestLocationUpdates(android.location.LocationRequest p0, java.util.concurrent.Executor p1, android.location.LocationListener p2) {}
    @android.annotation.SystemApi
    public void requestLocationUpdates(android.location.LocationRequest p0, android.app.PendingIntent p1) {}
    public boolean injectLocation(android.location.Location p0) { return false; }
    public void removeUpdates(android.location.LocationListener p0) {}
    public void removeUpdates(android.app.PendingIntent p0) {}
    public java.util.List<java.lang.String> getAllProviders() { return null; }
    public java.util.List<java.lang.String> getProviders(boolean p0) { return null; }
    public java.util.List<java.lang.String> getProviders(android.location.Criteria p0, boolean p1) { return null; }
    public java.lang.String getBestProvider(android.location.Criteria p0, boolean p1) { return null; }
    public android.location.LocationProvider getProvider(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public boolean isProviderPackage(java.lang.String p0) { return false; }
    public java.util.List<java.lang.String> getProviderPackages(java.lang.String p0) { return null; }
    public boolean sendExtraCommand(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) { return false; }
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
    public void addProximityAlert(double p0, double p1, float p2, long p3, android.app.PendingIntent p4) {}
    public void removeProximityAlert(android.app.PendingIntent p0) {}
    public void addGeofence(android.location.LocationRequest p0, android.location.Geofence p1, android.app.PendingIntent p2) {}
    public void removeGeofence(android.location.Geofence p0, android.app.PendingIntent p1) {}
    public void removeAllGeofences(android.app.PendingIntent p0) {}
    public android.location.GnssCapabilities getGnssCapabilities() { return null; }
    public int getGnssYearOfHardware() { return 0; }
    public java.lang.String getGnssHardwareModelName() { return null; }
    @java.lang.Deprecated
    public android.location.GpsStatus getGpsStatus(android.location.GpsStatus p0) { return null; }
    @java.lang.Deprecated
    public boolean addGpsStatusListener(android.location.GpsStatus.Listener p0) { return false; }
    @java.lang.Deprecated
    public void removeGpsStatusListener(android.location.GpsStatus.Listener p0) {}
    @java.lang.Deprecated
    public boolean registerGnssStatusCallback(android.location.GnssStatus.Callback p0) { return false; }
    public boolean registerGnssStatusCallback(android.location.GnssStatus.Callback p0, android.os.Handler p1) { return false; }
    public boolean registerGnssStatusCallback(java.util.concurrent.Executor p0, android.location.GnssStatus.Callback p1) { return false; }
    public void unregisterGnssStatusCallback(android.location.GnssStatus.Callback p0) {}
    @java.lang.Deprecated
    public boolean addNmeaListener(android.location.GpsStatus.NmeaListener p0) { return false; }
    @java.lang.Deprecated
    public void removeNmeaListener(android.location.GpsStatus.NmeaListener p0) {}
    @java.lang.Deprecated
    public boolean addNmeaListener(android.location.OnNmeaMessageListener p0) { return false; }
    public boolean addNmeaListener(android.location.OnNmeaMessageListener p0, android.os.Handler p1) { return false; }
    public boolean addNmeaListener(java.util.concurrent.Executor p0, android.location.OnNmeaMessageListener p1) { return false; }
    public void removeNmeaListener(android.location.OnNmeaMessageListener p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean addGpsMeasurementListener(android.location.GpsMeasurementsEvent.Listener p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void removeGpsMeasurementListener(android.location.GpsMeasurementsEvent.Listener p0) {}
    @java.lang.Deprecated
    public boolean registerGnssMeasurementsCallback(android.location.GnssMeasurementsEvent.Callback p0) { return false; }
    public boolean registerGnssMeasurementsCallback(android.location.GnssMeasurementsEvent.Callback p0, android.os.Handler p1) { return false; }
    public boolean registerGnssMeasurementsCallback(java.util.concurrent.Executor p0, android.location.GnssMeasurementsEvent.Callback p1) { return false; }
    @android.annotation.SystemApi
    public boolean registerGnssMeasurementsCallback(android.location.GnssRequest p0, java.util.concurrent.Executor p1, android.location.GnssMeasurementsEvent.Callback p2) { return false; }
    @android.annotation.SystemApi
    public void injectGnssMeasurementCorrections(android.location.GnssMeasurementCorrections p0) {}
    public void unregisterGnssMeasurementsCallback(android.location.GnssMeasurementsEvent.Callback p0) {}
    public boolean registerAntennaInfoListener(java.util.concurrent.Executor p0, android.location.GnssAntennaInfo.Listener p1) { return false; }
    public void unregisterAntennaInfoListener(android.location.GnssAntennaInfo.Listener p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean addGpsNavigationMessageListener(android.location.GpsNavigationMessageEvent.Listener p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void removeGpsNavigationMessageListener(android.location.GpsNavigationMessageEvent.Listener p0) {}
    @java.lang.Deprecated
    public boolean registerGnssNavigationMessageCallback(android.location.GnssNavigationMessage.Callback p0) { return false; }
    public boolean registerGnssNavigationMessageCallback(android.location.GnssNavigationMessage.Callback p0, android.os.Handler p1) { return false; }
    public boolean registerGnssNavigationMessageCallback(java.util.concurrent.Executor p0, android.location.GnssNavigationMessage.Callback p1) { return false; }
    public void unregisterGnssNavigationMessageCallback(android.location.GnssNavigationMessage.Callback p0) {}
    @android.annotation.SystemApi
    public int getGnssBatchSize() { return 0; }
    @android.annotation.SystemApi
    public boolean registerGnssBatchedLocationCallback(long p0, boolean p1, android.location.BatchedLocationCallback p2, android.os.Handler p3) { return false; }
    @android.annotation.SystemApi
    public void flushGnssBatch() {}
    @android.annotation.SystemApi
    public boolean unregisterGnssBatchedLocationCallback(android.location.BatchedLocationCallback p0) { return false; }
    public static void invalidateLocalLocationEnabledCaches() {}
    public void disableLocalLocationEnabledCaches() {}

    private class BatchedLocationCallbackManager extends android.location.AbstractListenerManager<java.lang.Void, android.location.BatchedLocationCallback> {
        private android.location.IBatchedLocationCallback mListenerTransport;
        private BatchedLocationCallbackManager(android.location.LocationManager p0) { super(); }
        protected boolean registerService(java.lang.Void p0) throws android.os.RemoteException { return false; }
        protected void unregisterService() throws android.os.RemoteException {}

        private class BatchedLocationCallback extends android.location.IBatchedLocationCallback.Stub {
            private BatchedLocationCallback(android.location.LocationManager.BatchedLocationCallbackManager p0) { super(); }
            public void onLocationBatch(java.util.List<android.location.Location> p0) {}
        }
    }

    private static class GetCurrentLocationTransport extends android.location.ILocationListener.Stub implements android.app.AlarmManager.OnAlarmListener, android.os.CancellationSignal.OnCancelListener {
        private java.util.concurrent.Executor mExecutor;
        private java.util.function.Consumer<android.location.Location> mConsumer;
        private android.app.AlarmManager mAlarmManager;
        private android.os.ICancellationSignal mRemoteCancellationSignal;
        private GetCurrentLocationTransport(java.util.concurrent.Executor p0, java.util.function.Consumer<android.location.Location> p1) { super(); }
        public java.lang.String getListenerId() { return null; }
        public synchronized void register(android.app.AlarmManager p0, android.os.CancellationSignal p1, android.os.ICancellationSignal p2) {}
        public void onCancel() {}
        private java.util.function.Consumer<android.location.Location> remove() { return null; }
        public void fail() {}
        public void onAlarm() {}
        public void onLocationChanged(android.location.Location p0) {}
        public void onProviderEnabled(java.lang.String p0) {}
        public void onProviderDisabled(java.lang.String p0) {}
        public void onRemoved() {}
        private synchronized void deliverResult(android.location.Location p0) {}
        private void acceptResult(android.location.Location p0) {}
    }

    private class GnssAntennaInfoListenerManager extends android.location.AbstractListenerManager<java.lang.Void, android.location.GnssAntennaInfo.Listener> {
        private android.location.IGnssAntennaInfoListener mListenerTransport;
        private GnssAntennaInfoListenerManager(android.location.LocationManager p0) { super(); }
        protected boolean registerService(java.lang.Void p0) throws android.os.RemoteException { return false; }
        protected void unregisterService() throws android.os.RemoteException {}

        private class GnssAntennaInfoListener extends android.location.IGnssAntennaInfoListener.Stub {
            private GnssAntennaInfoListener(android.location.LocationManager.GnssAntennaInfoListenerManager p0) { super(); }
            public void onGnssAntennaInfoReceived(java.util.List<android.location.GnssAntennaInfo> p0) {}
        }
    }

    private class GnssMeasurementsListenerManager extends android.location.AbstractListenerManager<android.location.GnssRequest, android.location.GnssMeasurementsEvent.Callback> {
        private android.location.IGnssMeasurementsListener mListenerTransport;
        private GnssMeasurementsListenerManager(android.location.LocationManager p0) { super(); }
        protected boolean registerService(android.location.GnssRequest p0) throws android.os.RemoteException { return false; }
        protected void unregisterService() throws android.os.RemoteException {}
        protected android.location.GnssRequest merge(java.util.List<android.location.GnssRequest> p0) { return null; }

        private class GnssMeasurementsListener extends android.location.IGnssMeasurementsListener.Stub {
            private GnssMeasurementsListener(android.location.LocationManager.GnssMeasurementsListenerManager p0) { super(); }
            public void onGnssMeasurementsReceived(android.location.GnssMeasurementsEvent p0) {}
            public void onStatusChanged(int p0) {}
        }
    }

    private class GnssNavigationMessageListenerManager extends android.location.AbstractListenerManager<java.lang.Void, android.location.GnssNavigationMessage.Callback> {
        private android.location.IGnssNavigationMessageListener mListenerTransport;
        private GnssNavigationMessageListenerManager(android.location.LocationManager p0) { super(); }
        protected boolean registerService(java.lang.Void p0) throws android.os.RemoteException { return false; }
        protected void unregisterService() throws android.os.RemoteException {}

        private class GnssNavigationMessageListener extends android.location.IGnssNavigationMessageListener.Stub {
            private GnssNavigationMessageListener(android.location.LocationManager.GnssNavigationMessageListenerManager p0) { super(); }
            public void onGnssNavigationMessageReceived(android.location.GnssNavigationMessage p0) {}
            public void onStatusChanged(int p0) {}
        }
    }

    private class GnssStatusListenerManager extends android.location.AbstractListenerManager<java.lang.Void, android.location.GnssStatus.Callback> {
        private android.location.IGnssStatusListener mListenerTransport;
        private volatile android.location.GnssStatus mGnssStatus;
        private volatile int mTtff;
        private GnssStatusListenerManager(android.location.LocationManager p0) { super(); }
        public android.location.GnssStatus getGnssStatus() { return null; }
        public int getTtff() { return 0; }
        public boolean addListener(android.location.GpsStatus.Listener p0, java.util.concurrent.Executor p1) throws android.os.RemoteException { return false; }
        public boolean addListener(android.location.OnNmeaMessageListener p0, android.os.Handler p1) throws android.os.RemoteException { return false; }
        public boolean addListener(android.location.OnNmeaMessageListener p0, java.util.concurrent.Executor p1) throws android.os.RemoteException { return false; }
        protected android.location.GnssStatus.Callback convertKey(java.lang.Object p0) { return null; }
        protected boolean registerService(java.lang.Void p0) throws android.os.RemoteException { return false; }
        protected void unregisterService() throws android.os.RemoteException {}

        private class GnssStatusListener extends android.location.IGnssStatusListener.Stub {
            private GnssStatusListener(android.location.LocationManager.GnssStatusListenerManager p0) { super(); }
            public void onGnssStarted() {}
            public void onGnssStopped() {}
            public void onFirstFix(int p0) {}
            public void onSvStatusChanged(int p0, int[] p1, float[] p2, float[] p3, float[] p4, float[] p5, float[] p6) {}
            public void onNmeaReceived(long p0, java.lang.String p1) {}
        }
    }

    private class LocationListenerTransport extends android.location.ILocationListener.Stub {
        private final android.location.LocationListener mListener = null;
        private volatile java.util.concurrent.Executor mExecutor;
        private LocationListenerTransport(android.location.LocationManager p0, android.location.LocationListener p1) { super(); }
        public android.location.LocationListener getKey() { return null; }
        public java.lang.String getListenerId() { return null; }
        public void register(java.util.concurrent.Executor p0) {}
        public void unregister() {}
        public void onLocationChanged(android.location.Location p0) {}
        private void acceptLocation(java.util.concurrent.Executor p0, android.location.Location p1) {}
        public void onProviderEnabled(java.lang.String p0) {}
        public void onProviderDisabled(java.lang.String p0) {}
        private void acceptProviderChange(java.util.concurrent.Executor p0, java.lang.String p1, boolean p2) {}
        public void onRemoved() {}
        private void locationCallbackFinished() {}
    }

    private static class NmeaAdapter extends android.location.GnssStatus.Callback implements android.location.OnNmeaMessageListener {
        private final android.location.OnNmeaMessageListener mListener = null;
        private NmeaAdapter(android.location.OnNmeaMessageListener p0) { super(); }
        public void onNmeaMessage(java.lang.String p0, long p1) {}
    }
}
