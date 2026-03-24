package android.hardware.location;

public final class GeofenceHardwareImpl {
    private static final java.lang.String TAG = "GeofenceHardwareImpl";
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final int FIRST_VERSION_WITH_CAPABILITIES = 2;
    private final android.content.Context mContext = null;
    private static android.hardware.location.GeofenceHardwareImpl sInstance;
    private android.os.PowerManager.WakeLock mWakeLock;
    private final android.util.SparseArray<android.hardware.location.IGeofenceHardwareCallback> mGeofences = null;
    private final java.util.ArrayList<android.hardware.location.IGeofenceHardwareMonitorCallback>[] mCallbacks = null;
    private final java.util.ArrayList<android.hardware.location.GeofenceHardwareImpl.Reaper> mReapers = null;
    private android.location.IFusedGeofenceHardware mFusedService;
    private android.location.IGpsGeofenceHardware mGpsService;
    private int mCapabilities;
    private int mVersion;
    private int[] mSupportedMonitorTypes;
    private static final int GEOFENCE_TRANSITION_CALLBACK = 1;
    private static final int ADD_GEOFENCE_CALLBACK = 2;
    private static final int REMOVE_GEOFENCE_CALLBACK = 3;
    private static final int PAUSE_GEOFENCE_CALLBACK = 4;
    private static final int RESUME_GEOFENCE_CALLBACK = 5;
    private static final int GEOFENCE_CALLBACK_BINDER_DIED = 6;
    private static final int GEOFENCE_STATUS = 1;
    private static final int CALLBACK_ADD = 2;
    private static final int CALLBACK_REMOVE = 3;
    private static final int MONITOR_CALLBACK_BINDER_DIED = 4;
    private static final int REAPER_GEOFENCE_ADDED = 1;
    private static final int REAPER_MONITOR_CALLBACK_ADDED = 2;
    private static final int REAPER_REMOVED = 3;
    private static final int LOCATION_INVALID = 0;
    private static final int LOCATION_HAS_LAT_LONG = 1;
    private static final int LOCATION_HAS_ALTITUDE = 2;
    private static final int LOCATION_HAS_SPEED = 4;
    private static final int LOCATION_HAS_BEARING = 8;
    private static final int LOCATION_HAS_ACCURACY = 16;
    private static final int RESOLUTION_LEVEL_NONE = 1;
    private static final int RESOLUTION_LEVEL_COARSE = 2;
    private static final int RESOLUTION_LEVEL_FINE = 3;
    private static final int CAPABILITY_GNSS = 1;
    private android.os.Handler mGeofenceHandler;
    private android.os.Handler mCallbacksHandler;
    private android.os.Handler mReaperHandler;
    public static synchronized android.hardware.location.GeofenceHardwareImpl getInstance(android.content.Context p0) { return null; }
    private GeofenceHardwareImpl(android.content.Context p0) {}
    private void acquireWakeLock() {}
    private void releaseWakeLock() {}
    private void updateGpsHardwareAvailability() {}
    private void updateFusedHardwareAvailability() {}
    public void setGpsHardwareGeofence(android.location.IGpsGeofenceHardware p0) {}
    public void onCapabilities(int p0) {}
    public void setVersion(int p0) {}
    public void setFusedGeofenceHardware(android.location.IFusedGeofenceHardware p0) {}
    public int[] getMonitoringTypes() { return null; }
    public int getStatusOfMonitoringType(int p0) { return 0; }
    public int getCapabilitiesForMonitoringType(int p0) { return 0; }
    public boolean addCircularFence(int p0, android.hardware.location.GeofenceHardwareRequestParcelable p1, android.hardware.location.IGeofenceHardwareCallback p2) { return false; }
    public boolean removeGeofence(int p0, int p1) { return false; }
    public boolean pauseGeofence(int p0, int p1) { return false; }
    public boolean resumeGeofence(int p0, int p1, int p2) { return false; }
    public boolean registerForMonitorStateChangeCallback(int p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1) { return false; }
    public boolean unregisterForMonitorStateChangeCallback(int p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1) { return false; }
    public void reportGeofenceTransition(int p0, android.location.Location p1, int p2, long p3, int p4, int p5) {}
    public void reportGeofenceMonitorStatus(int p0, int p1, android.location.Location p2, int p3) {}
    private void reportGeofenceOperationStatus(int p0, int p1, int p2) {}
    public void reportGeofenceAddStatus(int p0, int p1) {}
    public void reportGeofenceRemoveStatus(int p0, int p1) {}
    public void reportGeofencePauseStatus(int p0, int p1) {}
    public void reportGeofenceResumeStatus(int p0, int p1) {}
    private void setMonitorAvailability(int p0, int p1) {}
    int getMonitoringResolutionLevel(int p0) { return 0; }
    int getAllowedResolutionLevel(int p0, int p1) { return 0; }

    private class GeofenceTransition {
        private int mGeofenceId;
        private int mTransition;
        private long mTimestamp;
        private android.location.Location mLocation;
        private int mMonitoringType;
        private int mSourcesUsed;
        GeofenceTransition(android.hardware.location.GeofenceHardwareImpl p0, int p1, int p2, long p3, android.location.Location p4, int p5, int p6) {}
    }

    class Reaper implements android.os.IBinder.DeathRecipient {
        private android.hardware.location.IGeofenceHardwareMonitorCallback mMonitorCallback;
        private android.hardware.location.IGeofenceHardwareCallback mCallback;
        private int mMonitoringType;
        Reaper(android.hardware.location.GeofenceHardwareImpl p0, android.hardware.location.IGeofenceHardwareCallback p1, int p2) {}
        Reaper(android.hardware.location.GeofenceHardwareImpl p0, android.hardware.location.IGeofenceHardwareMonitorCallback p1, int p2) {}
        public void binderDied() {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        private boolean binderEquals(android.os.IInterface p0, android.os.IInterface p1) { return false; }
        private boolean unlinkToDeath() { return false; }
        private boolean callbackEquals(android.hardware.location.IGeofenceHardwareCallback p0) { return false; }
    }
}
