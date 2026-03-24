package android.telephony;

public final class LocationAccessPolicy {
    private static final java.lang.String TAG = "LocationAccessPolicy";
    private static final boolean DBG = false;
    public static final int MAX_SDK_FOR_ANY_ENFORCEMENT = 10000;
    public LocationAccessPolicy() {}
    private static void logError(android.content.Context p0, android.telephony.LocationAccessPolicy.LocationPermissionQuery p1, java.lang.String p2) {}
    private static android.telephony.LocationAccessPolicy.LocationPermissionResult appOpsModeToPermissionResult(int p0) { return null; }
    private static java.lang.String getAppOpsString(java.lang.String p0) { return null; }
    private static android.telephony.LocationAccessPolicy.LocationPermissionResult checkAppLocationPermissionHelper(android.content.Context p0, android.telephony.LocationAccessPolicy.LocationPermissionQuery p1, java.lang.String p2) { return null; }
    public static android.telephony.LocationAccessPolicy.LocationPermissionResult checkLocationPermission(android.content.Context p0, android.telephony.LocationAccessPolicy.LocationPermissionQuery p1) { return null; }
    private static boolean checkManifestPermission(android.content.Context p0, int p1, int p2, java.lang.String p3) { return false; }
    private static boolean checkSystemLocationAccess(android.content.Context p0, int p1, int p2) { return false; }
    private static boolean isLocationModeEnabled(android.content.Context p0, int p1) { return false; }
    private static boolean checkInteractAcrossUsersFull(android.content.Context p0, int p1, int p2) { return false; }
    private static boolean isCurrentProfile(android.content.Context p0, int p1) { return false; }
    private static boolean isAppAtLeastSdkVersion(android.content.Context p0, java.lang.String p1, int p2) { return false; }

    public static class LocationPermissionQuery {
        public final java.lang.String callingPackage = null;
        public final java.lang.String callingFeatureId = null;
        public final int callingUid = 0;
        public final int callingPid = 0;
        public final int minSdkVersionForCoarse = 0;
        public final int minSdkVersionForFine = 0;
        public final boolean logAsInfo = false;
        public final java.lang.String method = null;
        private LocationPermissionQuery(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4, int p5, boolean p6, java.lang.String p7) {}

        public static class Builder {
            private java.lang.String mCallingPackage;
            private java.lang.String mCallingFeatureId;
            private int mCallingUid;
            private int mCallingPid;
            private int mMinSdkVersionForCoarse;
            private int mMinSdkVersionForFine;
            private boolean mLogAsInfo;
            private java.lang.String mMethod;
            public Builder() {}
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setCallingPackage(java.lang.String p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setCallingFeatureId(java.lang.String p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setCallingUid(int p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setCallingPid(int p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setMinSdkVersionForCoarse(int p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setMinSdkVersionForFine(int p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setMethod(java.lang.String p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery.Builder setLogAsInfo(boolean p0) { return null; }
            public android.telephony.LocationAccessPolicy.LocationPermissionQuery build() { return null; }
        }
    }

    public static enum LocationPermissionResult {
        ALLOWED,
        DENIED_SOFT,
        DENIED_HARD;
        private LocationPermissionResult() {}
    }
}
