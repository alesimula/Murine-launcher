package android.location;

public interface ILocationManager extends android.os.IInterface {
    public android.location.Location getLastLocation(android.location.LocationRequest p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.os.ICancellationSignal getCurrentLocation(android.location.LocationRequest p0, android.location.ILocationListener p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void requestLocationUpdates(android.location.LocationRequest p0, android.location.ILocationListener p1, android.app.PendingIntent p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException;
    public void removeUpdates(android.location.ILocationListener p0, android.app.PendingIntent p1) throws android.os.RemoteException;
    public void requestGeofence(android.location.LocationRequest p0, android.location.Geofence p1, android.app.PendingIntent p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void removeGeofence(android.location.Geofence p0, android.app.PendingIntent p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean registerGnssStatusCallback(android.location.IGnssStatusListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void unregisterGnssStatusCallback(android.location.IGnssStatusListener p0) throws android.os.RemoteException;
    public boolean geocoderIsPresent() throws android.os.RemoteException;
    public java.lang.String getFromLocation(double p0, double p1, int p2, android.location.GeocoderParams p3, java.util.List<android.location.Address> p4) throws android.os.RemoteException;
    public java.lang.String getFromLocationName(java.lang.String p0, double p1, double p2, double p3, double p4, int p5, android.location.GeocoderParams p6, java.util.List<android.location.Address> p7) throws android.os.RemoteException;
    public boolean addGnssMeasurementsListener(android.location.GnssRequest p0, android.location.IGnssMeasurementsListener p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void injectGnssMeasurementCorrections(android.location.GnssMeasurementCorrections p0, java.lang.String p1) throws android.os.RemoteException;
    public long getGnssCapabilities() throws android.os.RemoteException;
    public void removeGnssMeasurementsListener(android.location.IGnssMeasurementsListener p0) throws android.os.RemoteException;
    public boolean addGnssAntennaInfoListener(android.location.IGnssAntennaInfoListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void removeGnssAntennaInfoListener(android.location.IGnssAntennaInfoListener p0) throws android.os.RemoteException;
    public boolean addGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void removeGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0) throws android.os.RemoteException;
    public int getGnssYearOfHardware() throws android.os.RemoteException;
    public java.lang.String getGnssHardwareModelName() throws android.os.RemoteException;
    public int getGnssBatchSize(java.lang.String p0) throws android.os.RemoteException;
    public boolean addGnssBatchingCallback(android.location.IBatchedLocationCallback p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void removeGnssBatchingCallback() throws android.os.RemoteException;
    public boolean startGnssBatch(long p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void flushGnssBatch(java.lang.String p0) throws android.os.RemoteException;
    public boolean stopGnssBatch() throws android.os.RemoteException;
    public void injectLocation(android.location.Location p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllProviders() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getProviders(android.location.Criteria p0, boolean p1) throws android.os.RemoteException;
    public java.lang.String getBestProvider(android.location.Criteria p0, boolean p1) throws android.os.RemoteException;
    public com.android.internal.location.ProviderProperties getProviderProperties(java.lang.String p0) throws android.os.RemoteException;
    public boolean isProviderPackage(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getProviderPackages(java.lang.String p0) throws android.os.RemoteException;
    public void setExtraLocationControllerPackage(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getExtraLocationControllerPackage() throws android.os.RemoteException;
    public void setExtraLocationControllerPackageEnabled(boolean p0) throws android.os.RemoteException;
    public boolean isExtraLocationControllerPackageEnabled() throws android.os.RemoteException;
    public boolean isProviderEnabledForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isLocationEnabledForUser(int p0) throws android.os.RemoteException;
    public void setLocationEnabledForUser(boolean p0, int p1) throws android.os.RemoteException;
    public void addTestProvider(java.lang.String p0, com.android.internal.location.ProviderProperties p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void removeTestProvider(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setTestProviderLocation(java.lang.String p0, android.location.Location p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void setTestProviderEnabled(java.lang.String p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public java.util.List<android.location.LocationRequest> getTestProviderCurrentRequests(java.lang.String p0) throws android.os.RemoteException;
    public android.location.LocationTime getGnssTimeMillis() throws android.os.RemoteException;
    public boolean sendExtraCommand(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void locationCallbackFinished(android.location.ILocationListener p0) throws android.os.RemoteException;
    public java.lang.String[] getBackgroundThrottlingWhitelist() throws android.os.RemoteException;
    public java.lang.String[] getIgnoreSettingsWhitelist() throws android.os.RemoteException;

    public static class Default implements android.location.ILocationManager {
        public Default() {}
        public android.location.Location getLastLocation(android.location.LocationRequest p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.os.ICancellationSignal getCurrentLocation(android.location.LocationRequest p0, android.location.ILocationListener p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return null; }
        public void requestLocationUpdates(android.location.LocationRequest p0, android.location.ILocationListener p1, android.app.PendingIntent p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException {}
        public void removeUpdates(android.location.ILocationListener p0, android.app.PendingIntent p1) throws android.os.RemoteException {}
        public void requestGeofence(android.location.LocationRequest p0, android.location.Geofence p1, android.app.PendingIntent p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void removeGeofence(android.location.Geofence p0, android.app.PendingIntent p1, java.lang.String p2) throws android.os.RemoteException {}
        public boolean registerGnssStatusCallback(android.location.IGnssStatusListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void unregisterGnssStatusCallback(android.location.IGnssStatusListener p0) throws android.os.RemoteException {}
        public boolean geocoderIsPresent() throws android.os.RemoteException { return false; }
        public java.lang.String getFromLocation(double p0, double p1, int p2, android.location.GeocoderParams p3, java.util.List<android.location.Address> p4) throws android.os.RemoteException { return null; }
        public java.lang.String getFromLocationName(java.lang.String p0, double p1, double p2, double p3, double p4, int p5, android.location.GeocoderParams p6, java.util.List<android.location.Address> p7) throws android.os.RemoteException { return null; }
        public boolean addGnssMeasurementsListener(android.location.GnssRequest p0, android.location.IGnssMeasurementsListener p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return false; }
        public void injectGnssMeasurementCorrections(android.location.GnssMeasurementCorrections p0, java.lang.String p1) throws android.os.RemoteException {}
        public long getGnssCapabilities() throws android.os.RemoteException { return 0L; }
        public void removeGnssMeasurementsListener(android.location.IGnssMeasurementsListener p0) throws android.os.RemoteException {}
        public boolean addGnssAntennaInfoListener(android.location.IGnssAntennaInfoListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void removeGnssAntennaInfoListener(android.location.IGnssAntennaInfoListener p0) throws android.os.RemoteException {}
        public boolean addGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void removeGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0) throws android.os.RemoteException {}
        public int getGnssYearOfHardware() throws android.os.RemoteException { return 0; }
        public java.lang.String getGnssHardwareModelName() throws android.os.RemoteException { return null; }
        public int getGnssBatchSize(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public boolean addGnssBatchingCallback(android.location.IBatchedLocationCallback p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void removeGnssBatchingCallback() throws android.os.RemoteException {}
        public boolean startGnssBatch(long p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return false; }
        public void flushGnssBatch(java.lang.String p0) throws android.os.RemoteException {}
        public boolean stopGnssBatch() throws android.os.RemoteException { return false; }
        public void injectLocation(android.location.Location p0) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getAllProviders() throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getProviders(android.location.Criteria p0, boolean p1) throws android.os.RemoteException { return null; }
        public java.lang.String getBestProvider(android.location.Criteria p0, boolean p1) throws android.os.RemoteException { return null; }
        public com.android.internal.location.ProviderProperties getProviderProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean isProviderPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getProviderPackages(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void setExtraLocationControllerPackage(java.lang.String p0) throws android.os.RemoteException {}
        public java.lang.String getExtraLocationControllerPackage() throws android.os.RemoteException { return null; }
        public void setExtraLocationControllerPackageEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean isExtraLocationControllerPackageEnabled() throws android.os.RemoteException { return false; }
        public boolean isProviderEnabledForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isLocationEnabledForUser(int p0) throws android.os.RemoteException { return false; }
        public void setLocationEnabledForUser(boolean p0, int p1) throws android.os.RemoteException {}
        public void addTestProvider(java.lang.String p0, com.android.internal.location.ProviderProperties p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void removeTestProvider(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setTestProviderLocation(java.lang.String p0, android.location.Location p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void setTestProviderEnabled(java.lang.String p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public java.util.List<android.location.LocationRequest> getTestProviderCurrentRequests(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.location.LocationTime getGnssTimeMillis() throws android.os.RemoteException { return null; }
        public boolean sendExtraCommand(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException { return false; }
        public void locationCallbackFinished(android.location.ILocationListener p0) throws android.os.RemoteException {}
        public java.lang.String[] getBackgroundThrottlingWhitelist() throws android.os.RemoteException { return null; }
        public java.lang.String[] getIgnoreSettingsWhitelist() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.ILocationManager {
        private static final java.lang.String DESCRIPTOR = "android.location.ILocationManager";
        static final int TRANSACTION_getLastLocation = 1;
        static final int TRANSACTION_getCurrentLocation = 2;
        static final int TRANSACTION_requestLocationUpdates = 3;
        static final int TRANSACTION_removeUpdates = 4;
        static final int TRANSACTION_requestGeofence = 5;
        static final int TRANSACTION_removeGeofence = 6;
        static final int TRANSACTION_registerGnssStatusCallback = 7;
        static final int TRANSACTION_unregisterGnssStatusCallback = 8;
        static final int TRANSACTION_geocoderIsPresent = 9;
        static final int TRANSACTION_getFromLocation = 10;
        static final int TRANSACTION_getFromLocationName = 11;
        static final int TRANSACTION_addGnssMeasurementsListener = 12;
        static final int TRANSACTION_injectGnssMeasurementCorrections = 13;
        static final int TRANSACTION_getGnssCapabilities = 14;
        static final int TRANSACTION_removeGnssMeasurementsListener = 15;
        static final int TRANSACTION_addGnssAntennaInfoListener = 16;
        static final int TRANSACTION_removeGnssAntennaInfoListener = 17;
        static final int TRANSACTION_addGnssNavigationMessageListener = 18;
        static final int TRANSACTION_removeGnssNavigationMessageListener = 19;
        static final int TRANSACTION_getGnssYearOfHardware = 20;
        static final int TRANSACTION_getGnssHardwareModelName = 21;
        static final int TRANSACTION_getGnssBatchSize = 22;
        static final int TRANSACTION_addGnssBatchingCallback = 23;
        static final int TRANSACTION_removeGnssBatchingCallback = 24;
        static final int TRANSACTION_startGnssBatch = 25;
        static final int TRANSACTION_flushGnssBatch = 26;
        static final int TRANSACTION_stopGnssBatch = 27;
        static final int TRANSACTION_injectLocation = 28;
        static final int TRANSACTION_getAllProviders = 29;
        static final int TRANSACTION_getProviders = 30;
        static final int TRANSACTION_getBestProvider = 31;
        static final int TRANSACTION_getProviderProperties = 32;
        static final int TRANSACTION_isProviderPackage = 33;
        static final int TRANSACTION_getProviderPackages = 34;
        static final int TRANSACTION_setExtraLocationControllerPackage = 35;
        static final int TRANSACTION_getExtraLocationControllerPackage = 36;
        static final int TRANSACTION_setExtraLocationControllerPackageEnabled = 37;
        static final int TRANSACTION_isExtraLocationControllerPackageEnabled = 38;
        static final int TRANSACTION_isProviderEnabledForUser = 39;
        static final int TRANSACTION_isLocationEnabledForUser = 40;
        static final int TRANSACTION_setLocationEnabledForUser = 41;
        static final int TRANSACTION_addTestProvider = 42;
        static final int TRANSACTION_removeTestProvider = 43;
        static final int TRANSACTION_setTestProviderLocation = 44;
        static final int TRANSACTION_setTestProviderEnabled = 45;
        static final int TRANSACTION_getTestProviderCurrentRequests = 46;
        static final int TRANSACTION_getGnssTimeMillis = 47;
        static final int TRANSACTION_sendExtraCommand = 48;
        static final int TRANSACTION_locationCallbackFinished = 49;
        static final int TRANSACTION_getBackgroundThrottlingWhitelist = 50;
        static final int TRANSACTION_getIgnoreSettingsWhitelist = 51;
        public Stub() { super(); }
        public static android.location.ILocationManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.location.ILocationManager p0) { return false; }
        public static android.location.ILocationManager getDefaultImpl() { return null; }

        private static class Proxy implements android.location.ILocationManager {
            private android.os.IBinder mRemote;
            public static android.location.ILocationManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.location.Location getLastLocation(android.location.LocationRequest p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.os.ICancellationSignal getCurrentLocation(android.location.LocationRequest p0, android.location.ILocationListener p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return null; }
            public void requestLocationUpdates(android.location.LocationRequest p0, android.location.ILocationListener p1, android.app.PendingIntent p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException {}
            public void removeUpdates(android.location.ILocationListener p0, android.app.PendingIntent p1) throws android.os.RemoteException {}
            public void requestGeofence(android.location.LocationRequest p0, android.location.Geofence p1, android.app.PendingIntent p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void removeGeofence(android.location.Geofence p0, android.app.PendingIntent p1, java.lang.String p2) throws android.os.RemoteException {}
            public boolean registerGnssStatusCallback(android.location.IGnssStatusListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void unregisterGnssStatusCallback(android.location.IGnssStatusListener p0) throws android.os.RemoteException {}
            public boolean geocoderIsPresent() throws android.os.RemoteException { return false; }
            public java.lang.String getFromLocation(double p0, double p1, int p2, android.location.GeocoderParams p3, java.util.List<android.location.Address> p4) throws android.os.RemoteException { return null; }
            public java.lang.String getFromLocationName(java.lang.String p0, double p1, double p2, double p3, double p4, int p5, android.location.GeocoderParams p6, java.util.List<android.location.Address> p7) throws android.os.RemoteException { return null; }
            public boolean addGnssMeasurementsListener(android.location.GnssRequest p0, android.location.IGnssMeasurementsListener p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return false; }
            public void injectGnssMeasurementCorrections(android.location.GnssMeasurementCorrections p0, java.lang.String p1) throws android.os.RemoteException {}
            public long getGnssCapabilities() throws android.os.RemoteException { return 0L; }
            public void removeGnssMeasurementsListener(android.location.IGnssMeasurementsListener p0) throws android.os.RemoteException {}
            public boolean addGnssAntennaInfoListener(android.location.IGnssAntennaInfoListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void removeGnssAntennaInfoListener(android.location.IGnssAntennaInfoListener p0) throws android.os.RemoteException {}
            public boolean addGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void removeGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0) throws android.os.RemoteException {}
            public int getGnssYearOfHardware() throws android.os.RemoteException { return 0; }
            public java.lang.String getGnssHardwareModelName() throws android.os.RemoteException { return null; }
            public int getGnssBatchSize(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public boolean addGnssBatchingCallback(android.location.IBatchedLocationCallback p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void removeGnssBatchingCallback() throws android.os.RemoteException {}
            public boolean startGnssBatch(long p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return false; }
            public void flushGnssBatch(java.lang.String p0) throws android.os.RemoteException {}
            public boolean stopGnssBatch() throws android.os.RemoteException { return false; }
            public void injectLocation(android.location.Location p0) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getAllProviders() throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getProviders(android.location.Criteria p0, boolean p1) throws android.os.RemoteException { return null; }
            public java.lang.String getBestProvider(android.location.Criteria p0, boolean p1) throws android.os.RemoteException { return null; }
            public com.android.internal.location.ProviderProperties getProviderProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean isProviderPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getProviderPackages(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void setExtraLocationControllerPackage(java.lang.String p0) throws android.os.RemoteException {}
            public java.lang.String getExtraLocationControllerPackage() throws android.os.RemoteException { return null; }
            public void setExtraLocationControllerPackageEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean isExtraLocationControllerPackageEnabled() throws android.os.RemoteException { return false; }
            public boolean isProviderEnabledForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isLocationEnabledForUser(int p0) throws android.os.RemoteException { return false; }
            public void setLocationEnabledForUser(boolean p0, int p1) throws android.os.RemoteException {}
            public void addTestProvider(java.lang.String p0, com.android.internal.location.ProviderProperties p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void removeTestProvider(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setTestProviderLocation(java.lang.String p0, android.location.Location p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void setTestProviderEnabled(java.lang.String p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public java.util.List<android.location.LocationRequest> getTestProviderCurrentRequests(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.location.LocationTime getGnssTimeMillis() throws android.os.RemoteException { return null; }
            public boolean sendExtraCommand(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException { return false; }
            public void locationCallbackFinished(android.location.ILocationListener p0) throws android.os.RemoteException {}
            public java.lang.String[] getBackgroundThrottlingWhitelist() throws android.os.RemoteException { return null; }
            public java.lang.String[] getIgnoreSettingsWhitelist() throws android.os.RemoteException { return null; }
        }
    }
}
