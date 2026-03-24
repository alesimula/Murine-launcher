package android.location;

public interface ILocationManager extends android.os.IInterface {
    public void requestLocationUpdates(android.location.LocationRequest p0, android.location.ILocationListener p1, android.app.PendingIntent p2, java.lang.String p3) throws android.os.RemoteException;
    public void removeUpdates(android.location.ILocationListener p0, android.app.PendingIntent p1, java.lang.String p2) throws android.os.RemoteException;
    public void requestGeofence(android.location.LocationRequest p0, android.location.Geofence p1, android.app.PendingIntent p2, java.lang.String p3) throws android.os.RemoteException;
    public void removeGeofence(android.location.Geofence p0, android.app.PendingIntent p1, java.lang.String p2) throws android.os.RemoteException;
    public android.location.Location getLastLocation(android.location.LocationRequest p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean registerGnssStatusCallback(android.location.IGnssStatusListener p0, java.lang.String p1) throws android.os.RemoteException;
    public void unregisterGnssStatusCallback(android.location.IGnssStatusListener p0) throws android.os.RemoteException;
    public boolean geocoderIsPresent() throws android.os.RemoteException;
    public java.lang.String getFromLocation(double p0, double p1, int p2, android.location.GeocoderParams p3, java.util.List<android.location.Address> p4) throws android.os.RemoteException;
    public java.lang.String getFromLocationName(java.lang.String p0, double p1, double p2, double p3, double p4, int p5, android.location.GeocoderParams p6, java.util.List<android.location.Address> p7) throws android.os.RemoteException;
    public boolean sendNiResponse(int p0, int p1) throws android.os.RemoteException;
    public boolean addGnssMeasurementsListener(android.location.IGnssMeasurementsListener p0, java.lang.String p1) throws android.os.RemoteException;
    public void injectGnssMeasurementCorrections(android.location.GnssMeasurementCorrections p0, java.lang.String p1) throws android.os.RemoteException;
    public long getGnssCapabilities(java.lang.String p0) throws android.os.RemoteException;
    public void removeGnssMeasurementsListener(android.location.IGnssMeasurementsListener p0) throws android.os.RemoteException;
    public boolean addGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0, java.lang.String p1) throws android.os.RemoteException;
    public void removeGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0) throws android.os.RemoteException;
    public int getGnssYearOfHardware() throws android.os.RemoteException;
    public java.lang.String getGnssHardwareModelName() throws android.os.RemoteException;
    public int getGnssBatchSize(java.lang.String p0) throws android.os.RemoteException;
    public boolean addGnssBatchingCallback(android.location.IBatchedLocationCallback p0, java.lang.String p1) throws android.os.RemoteException;
    public void removeGnssBatchingCallback() throws android.os.RemoteException;
    public boolean startGnssBatch(long p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public void flushGnssBatch(java.lang.String p0) throws android.os.RemoteException;
    public boolean stopGnssBatch() throws android.os.RemoteException;
    public boolean injectLocation(android.location.Location p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.util.List<java.lang.String> getAllProviders() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getProviders(android.location.Criteria p0, boolean p1) throws android.os.RemoteException;
    public java.lang.String getBestProvider(android.location.Criteria p0, boolean p1) throws android.os.RemoteException;
    public com.android.internal.location.ProviderProperties getProviderProperties(java.lang.String p0) throws android.os.RemoteException;
    public boolean isProviderPackage(java.lang.String p0) throws android.os.RemoteException;
    public void setExtraLocationControllerPackage(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getExtraLocationControllerPackage() throws android.os.RemoteException;
    public void setExtraLocationControllerPackageEnabled(boolean p0) throws android.os.RemoteException;
    public boolean isExtraLocationControllerPackageEnabled() throws android.os.RemoteException;
    public boolean isProviderEnabledForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isLocationEnabledForUser(int p0) throws android.os.RemoteException;
    public void addTestProvider(java.lang.String p0, com.android.internal.location.ProviderProperties p1, java.lang.String p2) throws android.os.RemoteException;
    public void removeTestProvider(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void setTestProviderLocation(java.lang.String p0, android.location.Location p1, java.lang.String p2) throws android.os.RemoteException;
    public void setTestProviderEnabled(java.lang.String p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<android.location.LocationRequest> getTestProviderCurrentRequests(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.location.LocationTime getGnssTimeMillis() throws android.os.RemoteException;
    public void setTestProviderStatus(java.lang.String p0, int p1, android.os.Bundle p2, long p3, java.lang.String p4) throws android.os.RemoteException;
    public boolean sendExtraCommand(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void locationCallbackFinished(android.location.ILocationListener p0) throws android.os.RemoteException;
    public java.lang.String[] getBackgroundThrottlingWhitelist() throws android.os.RemoteException;
    public java.lang.String[] getIgnoreSettingsWhitelist() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.location.ILocationManager {
        private static final java.lang.String DESCRIPTOR = "android.location.ILocationManager";
        static final int TRANSACTION_requestLocationUpdates = 1;
        static final int TRANSACTION_removeUpdates = 2;
        static final int TRANSACTION_requestGeofence = 3;
        static final int TRANSACTION_removeGeofence = 4;
        static final int TRANSACTION_getLastLocation = 5;
        static final int TRANSACTION_registerGnssStatusCallback = 6;
        static final int TRANSACTION_unregisterGnssStatusCallback = 7;
        static final int TRANSACTION_geocoderIsPresent = 8;
        static final int TRANSACTION_getFromLocation = 9;
        static final int TRANSACTION_getFromLocationName = 10;
        static final int TRANSACTION_sendNiResponse = 11;
        static final int TRANSACTION_addGnssMeasurementsListener = 12;
        static final int TRANSACTION_injectGnssMeasurementCorrections = 13;
        static final int TRANSACTION_getGnssCapabilities = 14;
        static final int TRANSACTION_removeGnssMeasurementsListener = 15;
        static final int TRANSACTION_addGnssNavigationMessageListener = 16;
        static final int TRANSACTION_removeGnssNavigationMessageListener = 17;
        static final int TRANSACTION_getGnssYearOfHardware = 18;
        static final int TRANSACTION_getGnssHardwareModelName = 19;
        static final int TRANSACTION_getGnssBatchSize = 20;
        static final int TRANSACTION_addGnssBatchingCallback = 21;
        static final int TRANSACTION_removeGnssBatchingCallback = 22;
        static final int TRANSACTION_startGnssBatch = 23;
        static final int TRANSACTION_flushGnssBatch = 24;
        static final int TRANSACTION_stopGnssBatch = 25;
        static final int TRANSACTION_injectLocation = 26;
        static final int TRANSACTION_getAllProviders = 27;
        static final int TRANSACTION_getProviders = 28;
        static final int TRANSACTION_getBestProvider = 29;
        static final int TRANSACTION_getProviderProperties = 30;
        static final int TRANSACTION_isProviderPackage = 31;
        static final int TRANSACTION_setExtraLocationControllerPackage = 32;
        static final int TRANSACTION_getExtraLocationControllerPackage = 33;
        static final int TRANSACTION_setExtraLocationControllerPackageEnabled = 34;
        static final int TRANSACTION_isExtraLocationControllerPackageEnabled = 35;
        static final int TRANSACTION_isProviderEnabledForUser = 36;
        static final int TRANSACTION_isLocationEnabledForUser = 37;
        static final int TRANSACTION_addTestProvider = 38;
        static final int TRANSACTION_removeTestProvider = 39;
        static final int TRANSACTION_setTestProviderLocation = 40;
        static final int TRANSACTION_setTestProviderEnabled = 41;
        static final int TRANSACTION_getTestProviderCurrentRequests = 42;
        static final int TRANSACTION_getGnssTimeMillis = 43;
        static final int TRANSACTION_setTestProviderStatus = 44;
        static final int TRANSACTION_sendExtraCommand = 45;
        static final int TRANSACTION_locationCallbackFinished = 46;
        static final int TRANSACTION_getBackgroundThrottlingWhitelist = 47;
        static final int TRANSACTION_getIgnoreSettingsWhitelist = 48;
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
            public void requestLocationUpdates(android.location.LocationRequest p0, android.location.ILocationListener p1, android.app.PendingIntent p2, java.lang.String p3) throws android.os.RemoteException {}
            public void removeUpdates(android.location.ILocationListener p0, android.app.PendingIntent p1, java.lang.String p2) throws android.os.RemoteException {}
            public void requestGeofence(android.location.LocationRequest p0, android.location.Geofence p1, android.app.PendingIntent p2, java.lang.String p3) throws android.os.RemoteException {}
            public void removeGeofence(android.location.Geofence p0, android.app.PendingIntent p1, java.lang.String p2) throws android.os.RemoteException {}
            public android.location.Location getLastLocation(android.location.LocationRequest p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean registerGnssStatusCallback(android.location.IGnssStatusListener p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void unregisterGnssStatusCallback(android.location.IGnssStatusListener p0) throws android.os.RemoteException {}
            public boolean geocoderIsPresent() throws android.os.RemoteException { return false; }
            public java.lang.String getFromLocation(double p0, double p1, int p2, android.location.GeocoderParams p3, java.util.List<android.location.Address> p4) throws android.os.RemoteException { return null; }
            public java.lang.String getFromLocationName(java.lang.String p0, double p1, double p2, double p3, double p4, int p5, android.location.GeocoderParams p6, java.util.List<android.location.Address> p7) throws android.os.RemoteException { return null; }
            public boolean sendNiResponse(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean addGnssMeasurementsListener(android.location.IGnssMeasurementsListener p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void injectGnssMeasurementCorrections(android.location.GnssMeasurementCorrections p0, java.lang.String p1) throws android.os.RemoteException {}
            public long getGnssCapabilities(java.lang.String p0) throws android.os.RemoteException { return 0L; }
            public void removeGnssMeasurementsListener(android.location.IGnssMeasurementsListener p0) throws android.os.RemoteException {}
            public boolean addGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void removeGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0) throws android.os.RemoteException {}
            public int getGnssYearOfHardware() throws android.os.RemoteException { return 0; }
            public java.lang.String getGnssHardwareModelName() throws android.os.RemoteException { return null; }
            public int getGnssBatchSize(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public boolean addGnssBatchingCallback(android.location.IBatchedLocationCallback p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void removeGnssBatchingCallback() throws android.os.RemoteException {}
            public boolean startGnssBatch(long p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void flushGnssBatch(java.lang.String p0) throws android.os.RemoteException {}
            public boolean stopGnssBatch() throws android.os.RemoteException { return false; }
            public boolean injectLocation(android.location.Location p0) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getAllProviders() throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getProviders(android.location.Criteria p0, boolean p1) throws android.os.RemoteException { return null; }
            public java.lang.String getBestProvider(android.location.Criteria p0, boolean p1) throws android.os.RemoteException { return null; }
            public com.android.internal.location.ProviderProperties getProviderProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean isProviderPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setExtraLocationControllerPackage(java.lang.String p0) throws android.os.RemoteException {}
            public java.lang.String getExtraLocationControllerPackage() throws android.os.RemoteException { return null; }
            public void setExtraLocationControllerPackageEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean isExtraLocationControllerPackageEnabled() throws android.os.RemoteException { return false; }
            public boolean isProviderEnabledForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isLocationEnabledForUser(int p0) throws android.os.RemoteException { return false; }
            public void addTestProvider(java.lang.String p0, com.android.internal.location.ProviderProperties p1, java.lang.String p2) throws android.os.RemoteException {}
            public void removeTestProvider(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setTestProviderLocation(java.lang.String p0, android.location.Location p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setTestProviderEnabled(java.lang.String p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.util.List<android.location.LocationRequest> getTestProviderCurrentRequests(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.location.LocationTime getGnssTimeMillis() throws android.os.RemoteException { return null; }
            public void setTestProviderStatus(java.lang.String p0, int p1, android.os.Bundle p2, long p3, java.lang.String p4) throws android.os.RemoteException {}
            public boolean sendExtraCommand(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException { return false; }
            public void locationCallbackFinished(android.location.ILocationListener p0) throws android.os.RemoteException {}
            public java.lang.String[] getBackgroundThrottlingWhitelist() throws android.os.RemoteException { return null; }
            public java.lang.String[] getIgnoreSettingsWhitelist() throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.location.ILocationManager {
        public Default() {}
        public void requestLocationUpdates(android.location.LocationRequest p0, android.location.ILocationListener p1, android.app.PendingIntent p2, java.lang.String p3) throws android.os.RemoteException {}
        public void removeUpdates(android.location.ILocationListener p0, android.app.PendingIntent p1, java.lang.String p2) throws android.os.RemoteException {}
        public void requestGeofence(android.location.LocationRequest p0, android.location.Geofence p1, android.app.PendingIntent p2, java.lang.String p3) throws android.os.RemoteException {}
        public void removeGeofence(android.location.Geofence p0, android.app.PendingIntent p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.location.Location getLastLocation(android.location.LocationRequest p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean registerGnssStatusCallback(android.location.IGnssStatusListener p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void unregisterGnssStatusCallback(android.location.IGnssStatusListener p0) throws android.os.RemoteException {}
        public boolean geocoderIsPresent() throws android.os.RemoteException { return false; }
        public java.lang.String getFromLocation(double p0, double p1, int p2, android.location.GeocoderParams p3, java.util.List<android.location.Address> p4) throws android.os.RemoteException { return null; }
        public java.lang.String getFromLocationName(java.lang.String p0, double p1, double p2, double p3, double p4, int p5, android.location.GeocoderParams p6, java.util.List<android.location.Address> p7) throws android.os.RemoteException { return null; }
        public boolean sendNiResponse(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean addGnssMeasurementsListener(android.location.IGnssMeasurementsListener p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void injectGnssMeasurementCorrections(android.location.GnssMeasurementCorrections p0, java.lang.String p1) throws android.os.RemoteException {}
        public long getGnssCapabilities(java.lang.String p0) throws android.os.RemoteException { return 0L; }
        public void removeGnssMeasurementsListener(android.location.IGnssMeasurementsListener p0) throws android.os.RemoteException {}
        public boolean addGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void removeGnssNavigationMessageListener(android.location.IGnssNavigationMessageListener p0) throws android.os.RemoteException {}
        public int getGnssYearOfHardware() throws android.os.RemoteException { return 0; }
        public java.lang.String getGnssHardwareModelName() throws android.os.RemoteException { return null; }
        public int getGnssBatchSize(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public boolean addGnssBatchingCallback(android.location.IBatchedLocationCallback p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void removeGnssBatchingCallback() throws android.os.RemoteException {}
        public boolean startGnssBatch(long p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void flushGnssBatch(java.lang.String p0) throws android.os.RemoteException {}
        public boolean stopGnssBatch() throws android.os.RemoteException { return false; }
        public boolean injectLocation(android.location.Location p0) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getAllProviders() throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getProviders(android.location.Criteria p0, boolean p1) throws android.os.RemoteException { return null; }
        public java.lang.String getBestProvider(android.location.Criteria p0, boolean p1) throws android.os.RemoteException { return null; }
        public com.android.internal.location.ProviderProperties getProviderProperties(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean isProviderPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setExtraLocationControllerPackage(java.lang.String p0) throws android.os.RemoteException {}
        public java.lang.String getExtraLocationControllerPackage() throws android.os.RemoteException { return null; }
        public void setExtraLocationControllerPackageEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean isExtraLocationControllerPackageEnabled() throws android.os.RemoteException { return false; }
        public boolean isProviderEnabledForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isLocationEnabledForUser(int p0) throws android.os.RemoteException { return false; }
        public void addTestProvider(java.lang.String p0, com.android.internal.location.ProviderProperties p1, java.lang.String p2) throws android.os.RemoteException {}
        public void removeTestProvider(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setTestProviderLocation(java.lang.String p0, android.location.Location p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setTestProviderEnabled(java.lang.String p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.util.List<android.location.LocationRequest> getTestProviderCurrentRequests(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.location.LocationTime getGnssTimeMillis() throws android.os.RemoteException { return null; }
        public void setTestProviderStatus(java.lang.String p0, int p1, android.os.Bundle p2, long p3, java.lang.String p4) throws android.os.RemoteException {}
        public boolean sendExtraCommand(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException { return false; }
        public void locationCallbackFinished(android.location.ILocationListener p0) throws android.os.RemoteException {}
        public java.lang.String[] getBackgroundThrottlingWhitelist() throws android.os.RemoteException { return null; }
        public java.lang.String[] getIgnoreSettingsWhitelist() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
