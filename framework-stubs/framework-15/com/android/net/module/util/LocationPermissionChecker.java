package com.android.net.module.util;

public class LocationPermissionChecker {
    public static final int SUCCEEDED = 0;
    public static final int ERROR_LOCATION_MODE_OFF = 1;
    public static final int ERROR_LOCATION_PERMISSION_MISSING = 2;
    public LocationPermissionChecker(android.content.Context p0) {}
    public boolean checkLocationPermission(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) { return false; }
    public int checkLocationPermissionWithDetailInfo(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) { return 0; }
    public void enforceLocationPermission(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) throws java.lang.SecurityException {}
    public boolean checkCallersLocationPermission(java.lang.String p0, java.lang.String p1, int p2, boolean p3, java.lang.String p4) { return false; }
    public boolean isLocationModeEnabled() { return false; }
    protected int getCurrentUser() { return 0; }
    public boolean checkNetworkSettingsPermission(int p0) { return false; }
    public boolean checkNetworkSetupWizardPermission(int p0) { return false; }
    public boolean checkNetworkStackPermission(int p0) { return false; }
    public boolean checkMainlineNetworkStackPermission(int p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LocationPermissionCheckStatus {
    }
}
