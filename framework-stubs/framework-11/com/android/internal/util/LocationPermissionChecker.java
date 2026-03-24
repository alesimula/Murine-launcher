package com.android.internal.util;

public class LocationPermissionChecker {
    private static final java.lang.String TAG = "LocationPermissionChecker";
    public static final int SUCCEEDED = 0;
    public static final int ERROR_LOCATION_MODE_OFF = 1;
    public static final int ERROR_LOCATION_PERMISSION_MISSING = 2;
    private final android.content.Context mContext = null;
    private final android.app.AppOpsManager mAppOpsManager = null;
    public LocationPermissionChecker(android.content.Context p0) {}
    public boolean checkLocationPermission(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) { return false; }
    public int checkLocationPermissionWithDetailInfo(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) { return 0; }
    public void enforceLocationPermission(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) throws java.lang.SecurityException {}
    private int checkLocationPermissionInternal(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) { return 0; }
    public boolean checkCallersLocationPermission(java.lang.String p0, java.lang.String p1, int p2, boolean p3, java.lang.String p4) { return false; }
    public boolean isLocationModeEnabled() { return false; }
    private boolean isTargetSdkLessThan(java.lang.String p0, int p1, int p2) { return false; }
    private boolean noteAppOpAllowed(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4) { return false; }
    private void checkPackage(int p0, java.lang.String p1) throws java.lang.SecurityException {}
    protected int getCurrentUser() { return 0; }
    private int getUidPermission(java.lang.String p0, int p1) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LocationPermissionCheckStatus {
    }
}
