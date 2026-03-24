package android.location;

public class LocationManager {
    public static final long BLOCK_IMMUTABLE_PENDING_INTENTS = 171317480L;
    public static final long BLOCK_PENDING_INTENT_SYSTEM_API_USAGE = 169887240L;
    public static final long DELIVER_HISTORICAL_LOCATIONS = 73144566L;
    public static final long GET_PROVIDER_SECURITY_EXCEPTIONS = 150935354L;
    public static final long BLOCK_UNTARGETED_PENDING_INTENTS = 148963590L;
    public static final long BLOCK_INCOMPLETE_LOCATIONS = 148964793L;
    public static final long BLOCK_GPS_STATUS_USAGE = 144027538L;
    public static final java.lang.String NETWORK_PROVIDER = "network";
    public static final java.lang.String GPS_PROVIDER = "gps";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.LOCATION_HARDWARE")
    public static final java.lang.String GPS_HARDWARE_PROVIDER = "gps_hardware";
    public static final java.lang.String PASSIVE_PROVIDER = "passive";
    public static final java.lang.String FUSED_PROVIDER = "fused";
    public static final java.lang.String KEY_PROXIMITY_ENTERING = "entering";
    @java.lang.Deprecated
    public static final java.lang.String KEY_STATUS_CHANGED = "status";
    public static final java.lang.String KEY_PROVIDER_ENABLED = "providerEnabled";
    public static final java.lang.String KEY_LOCATION_CHANGED = "location";
    public static final java.lang.String KEY_LOCATIONS = "locations";
    public static final java.lang.String KEY_FLUSH_COMPLETE = "flushComplete";
    public static final java.lang.String PROVIDERS_CHANGED_ACTION = "android.location.PROVIDERS_CHANGED";
    public static final java.lang.String EXTRA_PROVIDER_NAME = "android.location.extra.PROVIDER_NAME";
    public static final java.lang.String EXTRA_PROVIDER_ENABLED = "android.location.extra.PROVIDER_ENABLED";
    public static final java.lang.String MODE_CHANGED_ACTION = "android.location.MODE_CHANGED";
    public static final java.lang.String EXTRA_LOCATION_ENABLED = "android.location.extra.LOCATION_ENABLED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_ADAS_GNSS_ENABLED_CHANGED = "android.location.action.ADAS_GNSS_ENABLED_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ADAS_GNSS_ENABLED = "android.location.extra.ADAS_GNSS_ENABLED";
    @java.lang.Deprecated
    public static final java.lang.String HIGH_POWER_REQUEST_CHANGE_ACTION = "android.location.HIGH_POWER_REQUEST_CHANGE";
    public static final java.lang.String ACTION_GNSS_CAPABILITIES_CHANGED = "android.location.action.GNSS_CAPABILITIES_CHANGED";
    public static final java.lang.String EXTRA_GNSS_CAPABILITIES = "android.location.extra.GNSS_CAPABILITIES";
    public static final java.lang.String SETTINGS_FOOTER_DISPLAYED_ACTION = "com.android.settings.location.DISPLAYED_FOOTER";
    public static final java.lang.String METADATA_SETTINGS_FOOTER_STRING = "com.android.settings.location.FOOTER_STRING";
    final android.content.Context mContext = null;
    final android.location.ILocationManager mService = null;
    static android.location.ILocationManager getService() throws android.os.RemoteException { return null; }
    public LocationManager(android.content.Context p0, android.location.ILocationManager p1) {}
    public java.lang.String[] getBackgroundThrottlingWhitelist() { return null; }
    @java.lang.Deprecated
    public java.lang.String[] getIgnoreSettingsWhitelist() { return null; }
    public android.os.PackageTagsList getIgnoreSettingsAllowlist() { return null; }
    public android.os.PackageTagsList getAdasAllowlist() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getExtraLocationControllerPackage() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.LOCATION_HARDWARE")
    public void setExtraLocationControllerPackage(java.lang.String p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.LOCATION_HARDWARE")
    public void setExtraLocationControllerPackageEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public boolean isExtraLocationControllerPackageEnabled() { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.LOCATION_HARDWARE")
    public void setLocationControllerExtraPackage(java.lang.String p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.LOCATION_HARDWARE")
    public void setLocationControllerExtraPackageEnabled(boolean p0) {}
    public boolean isLocationEnabled() { return false; }
    @android.annotation.SystemApi
    public boolean isLocationEnabledForUser(android.os.UserHandle p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public void setLocationEnabledForUser(boolean p0, android.os.UserHandle p1) {}
    @android.annotation.SystemApi
    public boolean isAdasGnssLocationEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.LOCATION_BYPASS")
    public void setAdasGnssLocationEnabled(boolean p0) {}
    public boolean isProviderEnabled(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public boolean isProviderEnabledForUser(java.lang.String p0, android.os.UserHandle p1) { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public boolean setProviderEnabledForUser(java.lang.String p0, boolean p1, android.os.UserHandle p2) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.CONTROL_AUTOMOTIVE_GNSS")
    public void setAutomotiveGnssSuspended(boolean p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.CONTROL_AUTOMOTIVE_GNSS")
    public boolean isAutomotiveGnssSuspended() { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public android.location.Location getLastLocation() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public android.location.Location getLastKnownLocation(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public android.location.Location getLastKnownLocation(java.lang.String p0, android.location.LastLocationRequest p1) { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void getCurrentLocation(java.lang.String p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.location.Location> p3) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void getCurrentLocation(android.location.LocationRequest p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.location.Location> p3) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void getCurrentLocation(java.lang.String p0, android.location.LocationRequest p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, java.util.function.Consumer<android.location.Location> p4) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void requestSingleUpdate(java.lang.String p0, android.location.LocationListener p1, android.os.Looper p2) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void requestSingleUpdate(android.location.Criteria p0, android.location.LocationListener p1, android.os.Looper p2) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void requestSingleUpdate(java.lang.String p0, android.app.PendingIntent p1) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void requestSingleUpdate(android.location.Criteria p0, android.app.PendingIntent p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void requestLocationUpdates(java.lang.String p0, long p1, float p2, android.location.LocationListener p3) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void requestLocationUpdates(java.lang.String p0, long p1, float p2, android.location.LocationListener p3, android.os.Looper p4) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void requestLocationUpdates(java.lang.String p0, long p1, float p2, java.util.concurrent.Executor p3, android.location.LocationListener p4) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void requestLocationUpdates(long p0, float p1, android.location.Criteria p2, android.location.LocationListener p3, android.os.Looper p4) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void requestLocationUpdates(long p0, float p1, android.location.Criteria p2, java.util.concurrent.Executor p3, android.location.LocationListener p4) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void requestLocationUpdates(java.lang.String p0, long p1, float p2, android.app.PendingIntent p3) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void requestLocationUpdates(long p0, float p1, android.location.Criteria p2, android.app.PendingIntent p3) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void requestLocationUpdates(android.location.LocationRequest p0, android.location.LocationListener p1, android.os.Looper p2) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void requestLocationUpdates(android.location.LocationRequest p0, java.util.concurrent.Executor p1, android.location.LocationListener p2) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void requestLocationUpdates(android.location.LocationRequest p0, android.app.PendingIntent p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void requestLocationUpdates(java.lang.String p0, android.location.LocationRequest p1, java.util.concurrent.Executor p2, android.location.LocationListener p3) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void requestLocationUpdates(java.lang.String p0, android.location.LocationRequest p1, android.app.PendingIntent p2) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission(allOf={"android.permission.LOCATION_HARDWARE", "android.permission.ACCESS_FINE_LOCATION"})
    public boolean injectLocation(android.location.Location p0) { return false; }
    @android.annotation.SuppressLint("SamShouldBeLast")
    public void requestFlush(java.lang.String p0, android.location.LocationListener p1, int p2) {}
    public void requestFlush(java.lang.String p0, android.app.PendingIntent p1, int p2) {}
    public void removeUpdates(android.location.LocationListener p0) {}
    public void removeUpdates(android.app.PendingIntent p0) {}
    public boolean hasProvider(java.lang.String p0) { return false; }
    public java.util.List<java.lang.String> getAllProviders() { return null; }
    public java.util.List<java.lang.String> getProviders(boolean p0) { return null; }
    @java.lang.Deprecated
    public java.util.List<java.lang.String> getProviders(android.location.Criteria p0, boolean p1) { return null; }
    @java.lang.Deprecated
    public java.lang.String getBestProvider(android.location.Criteria p0, boolean p1) { return null; }
    @java.lang.Deprecated
    public android.location.LocationProvider getProvider(java.lang.String p0) { return null; }
    public android.location.provider.ProviderProperties getProviderProperties(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_DEVICE_CONFIG")
    public boolean isProviderPackage(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_DEVICE_CONFIG")
    public boolean isProviderPackage(java.lang.String p0, java.lang.String p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_DEVICE_CONFIG")
    public boolean isProviderPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return false; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_DEVICE_CONFIG")
    public java.util.List<java.lang.String> getProviderPackages(java.lang.String p0) { return null; }
    public boolean sendExtraCommand(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) { return false; }
    public void addTestProvider(java.lang.String p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7, int p8, int p9) {}
    public void addTestProvider(java.lang.String p0, android.location.provider.ProviderProperties p1) {}
    public void addTestProvider(java.lang.String p0, android.location.provider.ProviderProperties p1, java.util.Set<java.lang.String> p2) {}
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
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void addProximityAlert(double p0, double p1, float p2, long p3, android.app.PendingIntent p4) {}
    public void removeProximityAlert(android.app.PendingIntent p0) {}
    public android.location.GnssCapabilities getGnssCapabilities() { return null; }
    public int getGnssYearOfHardware() { return 0; }
    public java.lang.String getGnssHardwareModelName() { return null; }
    @android.annotation.SuppressLint("NullableCollection")
    public java.util.List<android.location.GnssAntennaInfo> getGnssAntennaInfos() { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public android.location.GpsStatus getGpsStatus(android.location.GpsStatus p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public boolean addGpsStatusListener(android.location.GpsStatus.Listener p0) { return false; }
    @java.lang.Deprecated
    public void removeGpsStatusListener(android.location.GpsStatus.Listener p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public boolean registerGnssStatusCallback(android.location.GnssStatus.Callback p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public boolean registerGnssStatusCallback(android.location.GnssStatus.Callback p0, android.os.Handler p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public boolean registerGnssStatusCallback(java.util.concurrent.Executor p0, android.location.GnssStatus.Callback p1) { return false; }
    public void unregisterGnssStatusCallback(android.location.GnssStatus.Callback p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public boolean addNmeaListener(android.location.GpsStatus.NmeaListener p0) { return false; }
    @java.lang.Deprecated
    public void removeNmeaListener(android.location.GpsStatus.NmeaListener p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public boolean addNmeaListener(android.location.OnNmeaMessageListener p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public boolean addNmeaListener(android.location.OnNmeaMessageListener p0, android.os.Handler p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public boolean addNmeaListener(java.util.concurrent.Executor p0, android.location.OnNmeaMessageListener p1) { return false; }
    public void removeNmeaListener(android.location.OnNmeaMessageListener p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean addGpsMeasurementListener(android.location.GpsMeasurementsEvent.Listener p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void removeGpsMeasurementListener(android.location.GpsMeasurementsEvent.Listener p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public boolean registerGnssMeasurementsCallback(android.location.GnssMeasurementsEvent.Callback p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public boolean registerGnssMeasurementsCallback(android.location.GnssMeasurementsEvent.Callback p0, android.os.Handler p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public boolean registerGnssMeasurementsCallback(java.util.concurrent.Executor p0, android.location.GnssMeasurementsEvent.Callback p1) { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public boolean registerGnssMeasurementsCallback(android.location.GnssRequest p0, java.util.concurrent.Executor p1, android.location.GnssMeasurementsEvent.Callback p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public boolean registerGnssMeasurementsCallback(android.location.GnssMeasurementRequest p0, java.util.concurrent.Executor p1, android.location.GnssMeasurementsEvent.Callback p2) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
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
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public boolean registerGnssNavigationMessageCallback(android.location.GnssNavigationMessage.Callback p0, android.os.Handler p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public boolean registerGnssNavigationMessageCallback(java.util.concurrent.Executor p0, android.location.GnssNavigationMessage.Callback p1) { return false; }
    public void unregisterGnssNavigationMessageCallback(android.location.GnssNavigationMessage.Callback p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.LOCATION_HARDWARE", "android.permission.INTERACT_ACROSS_USERS"})
    public void addProviderRequestChangedListener(java.util.concurrent.Executor p0, android.location.provider.ProviderRequest.ChangedListener p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.LOCATION_HARDWARE")
    public void removeProviderRequestChangedListener(android.location.provider.ProviderRequest.ChangedListener p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public int getGnssBatchSize() { return 0; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.LOCATION_HARDWARE", "android.permission.UPDATE_APP_OPS_STATS"})
    public boolean registerGnssBatchedLocationCallback(long p0, boolean p1, android.location.BatchedLocationCallback p2, android.os.Handler p3) { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.LOCATION_HARDWARE")
    public void flushGnssBatch() {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.LOCATION_HARDWARE")
    public boolean unregisterGnssBatchedLocationCallback(android.location.BatchedLocationCallback p0) { return false; }
    public static void invalidateLocalLocationEnabledCaches() {}
    public static void disableLocalLocationEnabledCaches() {}

    @java.lang.Deprecated
    private static class BatchedLocationCallbackTransport extends android.location.LocationManager.LocationListenerTransport {
        BatchedLocationCallbackTransport(android.location.BatchedLocationCallback p0, android.os.Handler p1) { super(null, null); }
    }

    @java.lang.Deprecated
    private static class BatchedLocationCallbackWrapper implements android.location.LocationListener {
        BatchedLocationCallbackWrapper(android.location.BatchedLocationCallback p0) {}
        public void onLocationChanged(android.location.Location p0) {}
        public void onLocationChanged(java.util.List<android.location.Location> p0) {}
    }

    private static class GetCurrentLocationTransport extends android.location.ILocationCallback.Stub implements com.android.internal.listeners.ListenerExecutor, android.os.CancellationSignal.OnCancelListener {
        volatile java.util.function.Consumer<android.location.Location> mConsumer;
        GetCurrentLocationTransport(java.util.concurrent.Executor p0, java.util.function.Consumer<android.location.Location> p1, android.os.CancellationSignal p2) { super(); }
        public void onCancel() {}
        public void onLocation(android.location.Location p0) {}
    }

    private static class GnssAntennaInfoTransport extends android.location.IGnssAntennaInfoListener.Stub implements com.android.internal.listeners.ListenerTransport<android.location.GnssAntennaInfo.Listener> {
        GnssAntennaInfoTransport(java.util.concurrent.Executor p0, android.content.Context p1, android.location.GnssAntennaInfo.Listener p2) { super(); }
        public java.lang.String getPackage() { return null; }
        public java.lang.String getAttributionTag() { return null; }
        public void unregister() {}
        public android.location.GnssAntennaInfo.Listener getListener() { return null; }
        public void onGnssAntennaInfoChanged(java.util.List<android.location.GnssAntennaInfo> p0) {}
    }

    private static class GnssAntennaTransportManager extends com.android.internal.listeners.ListenerTransportManager<android.location.LocationManager.GnssAntennaInfoTransport> {
        GnssAntennaTransportManager() { super(false); }
        protected void registerTransport(android.location.LocationManager.GnssAntennaInfoTransport p0) throws android.os.RemoteException {}
        protected void unregisterTransport(android.location.LocationManager.GnssAntennaInfoTransport p0) throws android.os.RemoteException {}
    }

    private static class GnssLazyLoader {
        static final android.location.LocationManager.GnssStatusTransportManager sGnssStatusListeners = null;
        static final android.location.LocationManager.GnssNmeaTransportManager sGnssNmeaListeners = null;
        static final android.location.LocationManager.GnssMeasurementsTransportManager sGnssMeasurementsListeners = null;
        static final android.location.LocationManager.GnssAntennaTransportManager sGnssAntennaInfoListeners = null;
        static final android.location.LocationManager.GnssNavigationTransportManager sGnssNavigationListeners = null;
    }

    private static class GnssMeasurementsTransport extends android.location.IGnssMeasurementsListener.Stub implements com.android.internal.listeners.ListenerTransport<android.location.GnssMeasurementsEvent.Callback> {
        GnssMeasurementsTransport(java.util.concurrent.Executor p0, android.content.Context p1, android.location.GnssMeasurementRequest p2, android.location.GnssMeasurementsEvent.Callback p3) { super(); }
        public java.lang.String getPackage() { return null; }
        public java.lang.String getAttributionTag() { return null; }
        public android.location.GnssMeasurementRequest getRequest() { return null; }
        public void unregister() {}
        public android.location.GnssMeasurementsEvent.Callback getListener() { return null; }
        public void onGnssMeasurementsReceived(android.location.GnssMeasurementsEvent p0) {}
        public void onStatusChanged(int p0) {}
    }

    private static class GnssMeasurementsTransportManager extends com.android.internal.listeners.ListenerTransportManager<android.location.LocationManager.GnssMeasurementsTransport> {
        GnssMeasurementsTransportManager() { super(false); }
        protected void registerTransport(android.location.LocationManager.GnssMeasurementsTransport p0) throws android.os.RemoteException {}
        protected void unregisterTransport(android.location.LocationManager.GnssMeasurementsTransport p0) throws android.os.RemoteException {}
    }

    private static class GnssNavigationTransport extends android.location.IGnssNavigationMessageListener.Stub implements com.android.internal.listeners.ListenerTransport<android.location.GnssNavigationMessage.Callback> {
        GnssNavigationTransport(java.util.concurrent.Executor p0, android.content.Context p1, android.location.GnssNavigationMessage.Callback p2) { super(); }
        public java.lang.String getPackage() { return null; }
        public java.lang.String getAttributionTag() { return null; }
        public void unregister() {}
        public android.location.GnssNavigationMessage.Callback getListener() { return null; }
        public void onGnssNavigationMessageReceived(android.location.GnssNavigationMessage p0) {}
        public void onStatusChanged(int p0) {}
    }

    private static class GnssNavigationTransportManager extends com.android.internal.listeners.ListenerTransportManager<android.location.LocationManager.GnssNavigationTransport> {
        GnssNavigationTransportManager() { super(false); }
        protected void registerTransport(android.location.LocationManager.GnssNavigationTransport p0) throws android.os.RemoteException {}
        protected void unregisterTransport(android.location.LocationManager.GnssNavigationTransport p0) throws android.os.RemoteException {}
    }

    private static class GnssNmeaTransport extends android.location.IGnssNmeaListener.Stub implements com.android.internal.listeners.ListenerTransport<android.location.OnNmeaMessageListener> {
        GnssNmeaTransport(java.util.concurrent.Executor p0, android.content.Context p1, android.location.OnNmeaMessageListener p2) { super(); }
        public java.lang.String getPackage() { return null; }
        public java.lang.String getAttributionTag() { return null; }
        public void unregister() {}
        public android.location.OnNmeaMessageListener getListener() { return null; }
        public void onNmeaReceived(long p0, java.lang.String p1) {}
    }

    private static class GnssNmeaTransportManager extends com.android.internal.listeners.ListenerTransportManager<android.location.LocationManager.GnssNmeaTransport> {
        GnssNmeaTransportManager() { super(false); }
        protected void registerTransport(android.location.LocationManager.GnssNmeaTransport p0) throws android.os.RemoteException {}
        protected void unregisterTransport(android.location.LocationManager.GnssNmeaTransport p0) throws android.os.RemoteException {}
    }

    private static class GnssStatusTransport extends android.location.IGnssStatusListener.Stub implements com.android.internal.listeners.ListenerTransport<android.location.GnssStatus.Callback> {
        GnssStatusTransport(java.util.concurrent.Executor p0, android.content.Context p1, android.location.GnssStatus.Callback p2) { super(); }
        public java.lang.String getPackage() { return null; }
        public java.lang.String getAttributionTag() { return null; }
        public void unregister() {}
        public android.location.GnssStatus.Callback getListener() { return null; }
        public void onGnssStarted() {}
        public void onGnssStopped() {}
        public void onFirstFix(int p0) {}
        public void onSvStatusChanged(android.location.GnssStatus p0) {}
    }

    private static class GnssStatusTransportManager extends com.android.internal.listeners.ListenerTransportManager<android.location.LocationManager.GnssStatusTransport> {
        GnssStatusTransportManager() { super(false); }
        protected void registerTransport(android.location.LocationManager.GnssStatusTransport p0) throws android.os.RemoteException {}
        protected void unregisterTransport(android.location.LocationManager.GnssStatusTransport p0) throws android.os.RemoteException {}
    }

    @java.lang.Deprecated
    private static class GpsAdapter extends android.location.GnssStatus.Callback {
        GpsAdapter(android.location.GpsStatus.Listener p0) { super(); }
        public void onStarted() {}
        public void onStopped() {}
        public void onFirstFix(int p0) {}
        public void onSatelliteStatusChanged(android.location.GnssStatus p0) {}
    }

    @java.lang.Deprecated
    private static class GpsStatusTransport extends android.location.LocationManager.GnssStatusTransport {
        static volatile int sTtff;
        static volatile android.location.GnssStatus sGnssStatus;
        GpsStatusTransport(java.util.concurrent.Executor p0, android.content.Context p1, android.location.GpsStatus.Listener p2) { super(null, null, null); }
        public void onFirstFix(int p0) {}
        public void onSvStatusChanged(android.location.GnssStatus p0) {}
    }

    private static class LocationEnabledCache extends android.app.PropertyInvalidatedCache<java.lang.Integer, java.lang.Boolean> {
        LocationEnabledCache(int p0) { super(0, (java.lang.String)null); }
        public java.lang.Boolean recompute(java.lang.Integer p0) { return null; }
    }

    private static class LocationListenerTransport extends android.location.ILocationListener.Stub implements com.android.internal.listeners.ListenerExecutor {
        LocationListenerTransport(android.location.LocationListener p0, java.util.concurrent.Executor p1) { super(); }
        void setExecutor(java.util.concurrent.Executor p0) {}
        boolean isRegistered() { return false; }
        void unregister() {}
        public void onLocationChanged(java.util.List<android.location.Location> p0, android.os.IRemoteCallback p1) {}
        public void onFlushComplete(int p0) {}
        public void onProviderEnabledChanged(java.lang.String p0, boolean p1) {}
    }

    private static class ProviderRequestLazyLoader {
        static final android.location.LocationManager.ProviderRequestTransportManager sProviderRequestListeners = null;
    }

    private static class ProviderRequestTransport extends android.location.provider.IProviderRequestListener.Stub implements com.android.internal.listeners.ListenerTransport<android.location.provider.ProviderRequest.ChangedListener> {
        ProviderRequestTransport(java.util.concurrent.Executor p0, android.location.provider.ProviderRequest.ChangedListener p1) { super(); }
        public void unregister() {}
        public android.location.provider.ProviderRequest.ChangedListener getListener() { return null; }
        public void onProviderRequestChanged(java.lang.String p0, android.location.provider.ProviderRequest p1) {}
    }

    private static class ProviderRequestTransportManager extends com.android.internal.listeners.ListenerTransportManager<android.location.LocationManager.ProviderRequestTransport> {
        ProviderRequestTransportManager() { super(false); }
        protected void registerTransport(android.location.LocationManager.ProviderRequestTransport p0) throws android.os.RemoteException {}
        protected void unregisterTransport(android.location.LocationManager.ProviderRequestTransport p0) throws android.os.RemoteException {}
    }
}
