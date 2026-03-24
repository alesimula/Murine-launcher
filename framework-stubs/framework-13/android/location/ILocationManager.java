package android.location;

public interface ILocationManager extends android.os.IInterface {
    public android.location.Location getLastLocation(java.lang.String p0, android.location.LastLocationRequest p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public android.os.ICancellationSignal getCurrentLocation(java.lang.String p0, android.location.LocationRequest p1, android.location.ILocationCallback p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException;
    public void registerLocationListener(java.lang.String p0, android.location.LocationRequest p1, android.location.ILocationListener p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException;
    public void unregisterLocationListener(android.location.ILocationListener p0) throws android.os.RemoteException;
    public void registerLocationPendingIntent(java.lang.String p0, android.location.LocationRequest p1, android.app.PendingIntent p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void unregisterLocationPendingIntent(android.app.PendingIntent p0) throws android.os.RemoteException;
    public void injectLocation(android.location.Location p0) throws android.os.RemoteException;
    public void requestListenerFlush(java.lang.String p0, android.location.ILocationListener p1, int p2) throws android.os.RemoteException;
    public void requestPendingIntentFlush(java.lang.String p0, android.app.PendingIntent p1, int p2) throws android.os.RemoteException;
    public void requestGeofence(android.location.Geofence p0, android.app.PendingIntent p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void removeGeofence(android.app.PendingIntent p0) throws android.os.RemoteException;
    public boolean geocoderIsPresent() throws android.os.RemoteException;
    public void getFromLocation(double p0, double p1, int p2, android.location.GeocoderParams p3, android.location.IGeocodeListener p4) throws android.os.RemoteException;
    public void getFromLocationName(java.lang.String p0, double p1, double p2, double p3, double p4, int p5, android.location.GeocoderParams p6, android.location.IGeocodeListener p7) throws android.os.RemoteException;
    public android.location.GnssCapabilities getGnssCapabilities() throws android.os.RemoteException;
    public int getGnssYearOfHardware() throws android.os.RemoteException;
    public java.lang.String getGnssHardwareModelName() throws android.os.RemoteException;
    public java.util.List<android.location.GnssAntennaInfo> getGnssAntennaInfos() throws android.os.RemoteException;
    public void registerGnssStatusCallback(android.location.IGnssStatusListener p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void unregisterGnssStatusCallback(android.location.IGnssStatusListener p0) throws android.os.RemoteException;
    public void registerGnssNmeaCallback(android.location.IGnssNmeaListener p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void unregisterGnssNmeaCallback(android.location.IGnssNmeaListener p0) throws android.os.RemoteException;
    public void addGnssMeasurementsListener(android.location.GnssMeasurementRequest p0, android.location.IGnssMeasurementsListener p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void removeGnssMeasurementsListener(android.location.IGnssMeasurementsListener p0) throws android.os.RemoteException;
    public void injectGnssMeasurementCorrections(android.location.GnssMeasurementCorrections p0) throws android.os.RemoteException;
    public void addGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void removeGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0) throws android.os.RemoteException;
    public void addGnssAntennaInfoListener(android.location.IGnssAntennaInfoListener p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void removeGnssAntennaInfoListener(android.location.IGnssAntennaInfoListener p0) throws android.os.RemoteException;
    public void addProviderRequestListener(android.location.provider.IProviderRequestListener p0) throws android.os.RemoteException;
    public void removeProviderRequestListener(android.location.provider.IProviderRequestListener p0) throws android.os.RemoteException;
    public int getGnssBatchSize() throws android.os.RemoteException;
    public void startGnssBatch(long p0, android.location.ILocationListener p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void flushGnssBatch() throws android.os.RemoteException;
    public void stopGnssBatch() throws android.os.RemoteException;
    public boolean hasProvider(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllProviders() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getProviders(android.location.Criteria p0, boolean p1) throws android.os.RemoteException;
    public java.lang.String getBestProvider(android.location.Criteria p0, boolean p1) throws android.os.RemoteException;
    public android.location.provider.ProviderProperties getProviderProperties(java.lang.String p0) throws android.os.RemoteException;
    public boolean isProviderPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getProviderPackages(java.lang.String p0) throws android.os.RemoteException;
    public void setExtraLocationControllerPackage(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getExtraLocationControllerPackage() throws android.os.RemoteException;
    public void setExtraLocationControllerPackageEnabled(boolean p0) throws android.os.RemoteException;
    public boolean isExtraLocationControllerPackageEnabled() throws android.os.RemoteException;
    public boolean isProviderEnabledForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isLocationEnabledForUser(int p0) throws android.os.RemoteException;
    public void setLocationEnabledForUser(boolean p0, int p1) throws android.os.RemoteException;
    public boolean isAdasGnssLocationEnabledForUser(int p0) throws android.os.RemoteException;
    public void setAdasGnssLocationEnabledForUser(boolean p0, int p1) throws android.os.RemoteException;
    public boolean isAutomotiveGnssSuspended() throws android.os.RemoteException;
    public void setAutomotiveGnssSuspended(boolean p0) throws android.os.RemoteException;
    public void addTestProvider(java.lang.String p0, android.location.provider.ProviderProperties p1, java.util.List<java.lang.String> p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void removeTestProvider(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setTestProviderLocation(java.lang.String p0, android.location.Location p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void setTestProviderEnabled(java.lang.String p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public android.location.LocationTime getGnssTimeMillis() throws android.os.RemoteException;
    public void sendExtraCommand(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    public java.lang.String[] getBackgroundThrottlingWhitelist() throws android.os.RemoteException;
    public android.os.PackageTagsList getIgnoreSettingsAllowlist() throws android.os.RemoteException;
    public android.os.PackageTagsList getAdasAllowlist() throws android.os.RemoteException;

    public static class Default implements android.location.ILocationManager {
        public Default() {}
        public android.location.Location getLastLocation(java.lang.String p0, android.location.LastLocationRequest p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.os.ICancellationSignal getCurrentLocation(java.lang.String p0, android.location.LocationRequest p1, android.location.ILocationCallback p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException { return null; }
        public void registerLocationListener(java.lang.String p0, android.location.LocationRequest p1, android.location.ILocationListener p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException {}
        public void unregisterLocationListener(android.location.ILocationListener p0) throws android.os.RemoteException {}
        public void registerLocationPendingIntent(java.lang.String p0, android.location.LocationRequest p1, android.app.PendingIntent p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void unregisterLocationPendingIntent(android.app.PendingIntent p0) throws android.os.RemoteException {}
        public void injectLocation(android.location.Location p0) throws android.os.RemoteException {}
        public void requestListenerFlush(java.lang.String p0, android.location.ILocationListener p1, int p2) throws android.os.RemoteException {}
        public void requestPendingIntentFlush(java.lang.String p0, android.app.PendingIntent p1, int p2) throws android.os.RemoteException {}
        public void requestGeofence(android.location.Geofence p0, android.app.PendingIntent p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void removeGeofence(android.app.PendingIntent p0) throws android.os.RemoteException {}
        public boolean geocoderIsPresent() throws android.os.RemoteException { return false; }
        public void getFromLocation(double p0, double p1, int p2, android.location.GeocoderParams p3, android.location.IGeocodeListener p4) throws android.os.RemoteException {}
        public void getFromLocationName(java.lang.String p0, double p1, double p2, double p3, double p4, int p5, android.location.GeocoderParams p6, android.location.IGeocodeListener p7) throws android.os.RemoteException {}
        public android.location.GnssCapabilities getGnssCapabilities() throws android.os.RemoteException { return null; }
        public int getGnssYearOfHardware() throws android.os.RemoteException { return 0; }
        public java.lang.String getGnssHardwareModelName() throws android.os.RemoteException { return null; }
        public java.util.List<android.location.GnssAntennaInfo> getGnssAntennaInfos() throws android.os.RemoteException { return null; }
        public void registerGnssStatusCallback(android.location.IGnssStatusListener p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void unregisterGnssStatusCallback(android.location.IGnssStatusListener p0) throws android.os.RemoteException {}
        public void registerGnssNmeaCallback(android.location.IGnssNmeaListener p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void unregisterGnssNmeaCallback(android.location.IGnssNmeaListener p0) throws android.os.RemoteException {}
        public void addGnssMeasurementsListener(android.location.GnssMeasurementRequest p0, android.location.IGnssMeasurementsListener p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void removeGnssMeasurementsListener(android.location.IGnssMeasurementsListener p0) throws android.os.RemoteException {}
        public void injectGnssMeasurementCorrections(android.location.GnssMeasurementCorrections p0) throws android.os.RemoteException {}
        public void addGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void removeGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0) throws android.os.RemoteException {}
        public void addGnssAntennaInfoListener(android.location.IGnssAntennaInfoListener p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void removeGnssAntennaInfoListener(android.location.IGnssAntennaInfoListener p0) throws android.os.RemoteException {}
        public void addProviderRequestListener(android.location.provider.IProviderRequestListener p0) throws android.os.RemoteException {}
        public void removeProviderRequestListener(android.location.provider.IProviderRequestListener p0) throws android.os.RemoteException {}
        public int getGnssBatchSize() throws android.os.RemoteException { return 0; }
        public void startGnssBatch(long p0, android.location.ILocationListener p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void flushGnssBatch() throws android.os.RemoteException {}
        public void stopGnssBatch() throws android.os.RemoteException {}
        public boolean hasProvider(java.lang.String p0) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getAllProviders() throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getProviders(android.location.Criteria p0, boolean p1) throws android.os.RemoteException { return null; }
        public java.lang.String getBestProvider(android.location.Criteria p0, boolean p1) throws android.os.RemoteException { return null; }
        public android.location.provider.ProviderProperties getProviderProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean isProviderPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getProviderPackages(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void setExtraLocationControllerPackage(java.lang.String p0) throws android.os.RemoteException {}
        public java.lang.String getExtraLocationControllerPackage() throws android.os.RemoteException { return null; }
        public void setExtraLocationControllerPackageEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean isExtraLocationControllerPackageEnabled() throws android.os.RemoteException { return false; }
        public boolean isProviderEnabledForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isLocationEnabledForUser(int p0) throws android.os.RemoteException { return false; }
        public void setLocationEnabledForUser(boolean p0, int p1) throws android.os.RemoteException {}
        public boolean isAdasGnssLocationEnabledForUser(int p0) throws android.os.RemoteException { return false; }
        public void setAdasGnssLocationEnabledForUser(boolean p0, int p1) throws android.os.RemoteException {}
        public boolean isAutomotiveGnssSuspended() throws android.os.RemoteException { return false; }
        public void setAutomotiveGnssSuspended(boolean p0) throws android.os.RemoteException {}
        public void addTestProvider(java.lang.String p0, android.location.provider.ProviderProperties p1, java.util.List<java.lang.String> p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void removeTestProvider(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setTestProviderLocation(java.lang.String p0, android.location.Location p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void setTestProviderEnabled(java.lang.String p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public android.location.LocationTime getGnssTimeMillis() throws android.os.RemoteException { return null; }
        public void sendExtraCommand(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public java.lang.String[] getBackgroundThrottlingWhitelist() throws android.os.RemoteException { return null; }
        public android.os.PackageTagsList getIgnoreSettingsAllowlist() throws android.os.RemoteException { return null; }
        public android.os.PackageTagsList getAdasAllowlist() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.ILocationManager {
        public static final java.lang.String DESCRIPTOR = "android.location.ILocationManager";
        static final int TRANSACTION_getLastLocation = 1;
        static final int TRANSACTION_getCurrentLocation = 2;
        static final int TRANSACTION_registerLocationListener = 3;
        static final int TRANSACTION_unregisterLocationListener = 4;
        static final int TRANSACTION_registerLocationPendingIntent = 5;
        static final int TRANSACTION_unregisterLocationPendingIntent = 6;
        static final int TRANSACTION_injectLocation = 7;
        static final int TRANSACTION_requestListenerFlush = 8;
        static final int TRANSACTION_requestPendingIntentFlush = 9;
        static final int TRANSACTION_requestGeofence = 10;
        static final int TRANSACTION_removeGeofence = 11;
        static final int TRANSACTION_geocoderIsPresent = 12;
        static final int TRANSACTION_getFromLocation = 13;
        static final int TRANSACTION_getFromLocationName = 14;
        static final int TRANSACTION_getGnssCapabilities = 15;
        static final int TRANSACTION_getGnssYearOfHardware = 16;
        static final int TRANSACTION_getGnssHardwareModelName = 17;
        static final int TRANSACTION_getGnssAntennaInfos = 18;
        static final int TRANSACTION_registerGnssStatusCallback = 19;
        static final int TRANSACTION_unregisterGnssStatusCallback = 20;
        static final int TRANSACTION_registerGnssNmeaCallback = 21;
        static final int TRANSACTION_unregisterGnssNmeaCallback = 22;
        static final int TRANSACTION_addGnssMeasurementsListener = 23;
        static final int TRANSACTION_removeGnssMeasurementsListener = 24;
        static final int TRANSACTION_injectGnssMeasurementCorrections = 25;
        static final int TRANSACTION_addGnssNavigationMessageListener = 26;
        static final int TRANSACTION_removeGnssNavigationMessageListener = 27;
        static final int TRANSACTION_addGnssAntennaInfoListener = 28;
        static final int TRANSACTION_removeGnssAntennaInfoListener = 29;
        static final int TRANSACTION_addProviderRequestListener = 30;
        static final int TRANSACTION_removeProviderRequestListener = 31;
        static final int TRANSACTION_getGnssBatchSize = 32;
        static final int TRANSACTION_startGnssBatch = 33;
        static final int TRANSACTION_flushGnssBatch = 34;
        static final int TRANSACTION_stopGnssBatch = 35;
        static final int TRANSACTION_hasProvider = 36;
        static final int TRANSACTION_getAllProviders = 37;
        static final int TRANSACTION_getProviders = 38;
        static final int TRANSACTION_getBestProvider = 39;
        static final int TRANSACTION_getProviderProperties = 40;
        static final int TRANSACTION_isProviderPackage = 41;
        static final int TRANSACTION_getProviderPackages = 42;
        static final int TRANSACTION_setExtraLocationControllerPackage = 43;
        static final int TRANSACTION_getExtraLocationControllerPackage = 44;
        static final int TRANSACTION_setExtraLocationControllerPackageEnabled = 45;
        static final int TRANSACTION_isExtraLocationControllerPackageEnabled = 46;
        static final int TRANSACTION_isProviderEnabledForUser = 47;
        static final int TRANSACTION_isLocationEnabledForUser = 48;
        static final int TRANSACTION_setLocationEnabledForUser = 49;
        static final int TRANSACTION_isAdasGnssLocationEnabledForUser = 50;
        static final int TRANSACTION_setAdasGnssLocationEnabledForUser = 51;
        static final int TRANSACTION_isAutomotiveGnssSuspended = 52;
        static final int TRANSACTION_setAutomotiveGnssSuspended = 53;
        static final int TRANSACTION_addTestProvider = 54;
        static final int TRANSACTION_removeTestProvider = 55;
        static final int TRANSACTION_setTestProviderLocation = 56;
        static final int TRANSACTION_setTestProviderEnabled = 57;
        static final int TRANSACTION_getGnssTimeMillis = 58;
        static final int TRANSACTION_sendExtraCommand = 59;
        static final int TRANSACTION_getBackgroundThrottlingWhitelist = 60;
        static final int TRANSACTION_getIgnoreSettingsAllowlist = 61;
        static final int TRANSACTION_getAdasAllowlist = 62;
        public Stub() { super(); }
        public static android.location.ILocationManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.location.ILocationManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.location.Location getLastLocation(java.lang.String p0, android.location.LastLocationRequest p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.os.ICancellationSignal getCurrentLocation(java.lang.String p0, android.location.LocationRequest p1, android.location.ILocationCallback p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException { return null; }
            public void registerLocationListener(java.lang.String p0, android.location.LocationRequest p1, android.location.ILocationListener p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException {}
            public void unregisterLocationListener(android.location.ILocationListener p0) throws android.os.RemoteException {}
            public void registerLocationPendingIntent(java.lang.String p0, android.location.LocationRequest p1, android.app.PendingIntent p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void unregisterLocationPendingIntent(android.app.PendingIntent p0) throws android.os.RemoteException {}
            public void injectLocation(android.location.Location p0) throws android.os.RemoteException {}
            public void requestListenerFlush(java.lang.String p0, android.location.ILocationListener p1, int p2) throws android.os.RemoteException {}
            public void requestPendingIntentFlush(java.lang.String p0, android.app.PendingIntent p1, int p2) throws android.os.RemoteException {}
            public void requestGeofence(android.location.Geofence p0, android.app.PendingIntent p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void removeGeofence(android.app.PendingIntent p0) throws android.os.RemoteException {}
            public boolean geocoderIsPresent() throws android.os.RemoteException { return false; }
            public void getFromLocation(double p0, double p1, int p2, android.location.GeocoderParams p3, android.location.IGeocodeListener p4) throws android.os.RemoteException {}
            public void getFromLocationName(java.lang.String p0, double p1, double p2, double p3, double p4, int p5, android.location.GeocoderParams p6, android.location.IGeocodeListener p7) throws android.os.RemoteException {}
            public android.location.GnssCapabilities getGnssCapabilities() throws android.os.RemoteException { return null; }
            public int getGnssYearOfHardware() throws android.os.RemoteException { return 0; }
            public java.lang.String getGnssHardwareModelName() throws android.os.RemoteException { return null; }
            public java.util.List<android.location.GnssAntennaInfo> getGnssAntennaInfos() throws android.os.RemoteException { return null; }
            public void registerGnssStatusCallback(android.location.IGnssStatusListener p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void unregisterGnssStatusCallback(android.location.IGnssStatusListener p0) throws android.os.RemoteException {}
            public void registerGnssNmeaCallback(android.location.IGnssNmeaListener p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void unregisterGnssNmeaCallback(android.location.IGnssNmeaListener p0) throws android.os.RemoteException {}
            public void addGnssMeasurementsListener(android.location.GnssMeasurementRequest p0, android.location.IGnssMeasurementsListener p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void removeGnssMeasurementsListener(android.location.IGnssMeasurementsListener p0) throws android.os.RemoteException {}
            public void injectGnssMeasurementCorrections(android.location.GnssMeasurementCorrections p0) throws android.os.RemoteException {}
            public void addGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void removeGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0) throws android.os.RemoteException {}
            public void addGnssAntennaInfoListener(android.location.IGnssAntennaInfoListener p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void removeGnssAntennaInfoListener(android.location.IGnssAntennaInfoListener p0) throws android.os.RemoteException {}
            public void addProviderRequestListener(android.location.provider.IProviderRequestListener p0) throws android.os.RemoteException {}
            public void removeProviderRequestListener(android.location.provider.IProviderRequestListener p0) throws android.os.RemoteException {}
            public int getGnssBatchSize() throws android.os.RemoteException { return 0; }
            public void startGnssBatch(long p0, android.location.ILocationListener p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void flushGnssBatch() throws android.os.RemoteException {}
            public void stopGnssBatch() throws android.os.RemoteException {}
            public boolean hasProvider(java.lang.String p0) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getAllProviders() throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getProviders(android.location.Criteria p0, boolean p1) throws android.os.RemoteException { return null; }
            public java.lang.String getBestProvider(android.location.Criteria p0, boolean p1) throws android.os.RemoteException { return null; }
            public android.location.provider.ProviderProperties getProviderProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean isProviderPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getProviderPackages(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void setExtraLocationControllerPackage(java.lang.String p0) throws android.os.RemoteException {}
            public java.lang.String getExtraLocationControllerPackage() throws android.os.RemoteException { return null; }
            public void setExtraLocationControllerPackageEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean isExtraLocationControllerPackageEnabled() throws android.os.RemoteException { return false; }
            public boolean isProviderEnabledForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isLocationEnabledForUser(int p0) throws android.os.RemoteException { return false; }
            public void setLocationEnabledForUser(boolean p0, int p1) throws android.os.RemoteException {}
            public boolean isAdasGnssLocationEnabledForUser(int p0) throws android.os.RemoteException { return false; }
            public void setAdasGnssLocationEnabledForUser(boolean p0, int p1) throws android.os.RemoteException {}
            public boolean isAutomotiveGnssSuspended() throws android.os.RemoteException { return false; }
            public void setAutomotiveGnssSuspended(boolean p0) throws android.os.RemoteException {}
            public void addTestProvider(java.lang.String p0, android.location.provider.ProviderProperties p1, java.util.List<java.lang.String> p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void removeTestProvider(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setTestProviderLocation(java.lang.String p0, android.location.Location p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void setTestProviderEnabled(java.lang.String p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public android.location.LocationTime getGnssTimeMillis() throws android.os.RemoteException { return null; }
            public void sendExtraCommand(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public java.lang.String[] getBackgroundThrottlingWhitelist() throws android.os.RemoteException { return null; }
            public android.os.PackageTagsList getIgnoreSettingsAllowlist() throws android.os.RemoteException { return null; }
            public android.os.PackageTagsList getAdasAllowlist() throws android.os.RemoteException { return null; }
        }
    }
}
