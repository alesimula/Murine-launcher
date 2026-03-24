package android.telephony;

public final class LocationAccessPolicy {
    public static final int MAX_SDK_FOR_ANY_ENFORCEMENT = 10000;
    public LocationAccessPolicy() {}
    public static android.telephony.LocationAccessPolicy.LocationPermissionResult checkLocationPermission(android.content.Context p0, android.telephony.LocationAccessPolicy.LocationPermissionQuery p1) { return null; }
    public static boolean isLocationModeEnabled(android.content.Context p0, int p1) { return false; }
    @android.annotation.NonNull
    public static java.lang.String[] getLocationBypassPackages(android.content.Context p0) { return null; }

    public static class LocationPermissionQuery {
        public final java.lang.String callingPackage = null;
        public final java.lang.String callingFeatureId = null;
        public final int callingUid = 0;
        public final int callingPid = 0;
        public final int minSdkVersionForCoarse = 0;
        public final int minSdkVersionForFine = 0;
        public final boolean logAsInfo = false;
        public final java.lang.String method = null;

        public static class Builder {
            public Builder() {}
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setCallingPackage(java.lang.String p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setCallingFeatureId(java.lang.String p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setCallingUid(int p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setCallingPid(int p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setMinSdkVersionForCoarse(int p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setMinSdkVersionForFine(int p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setMinSdkVersionForEnforcement(int p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setMethod(java.lang.String p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setLogAsInfo(boolean p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery build() { return null; }
        }
    }

    public static enum LocationPermissionResult {
        ALLOWED,
        DENIED_SOFT,
        DENIED_HARD;
    }
}
