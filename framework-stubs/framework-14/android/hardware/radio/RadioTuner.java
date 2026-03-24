package android.hardware.radio;

@android.annotation.SystemApi
public abstract class RadioTuner {
    public static final int DIRECTION_UP = 0;
    public static final int DIRECTION_DOWN = 1;
    @java.lang.Deprecated
    public static final int ERROR_HARDWARE_FAILURE = 0;
    @java.lang.Deprecated
    public static final int ERROR_SERVER_DIED = 1;
    @java.lang.Deprecated
    public static final int ERROR_CANCELLED = 2;
    @java.lang.Deprecated
    public static final int ERROR_SCAN_TIMEOUT = 3;
    @java.lang.Deprecated
    public static final int ERROR_CONFIG = 4;
    @java.lang.Deprecated
    public static final int ERROR_BACKGROUND_SCAN_UNAVAILABLE = 5;
    @java.lang.Deprecated
    public static final int ERROR_BACKGROUND_SCAN_FAILED = 6;
    public static final int TUNER_RESULT_OK = 0;
    public static final int TUNER_RESULT_INTERNAL_ERROR = 1;
    public static final int TUNER_RESULT_INVALID_ARGUMENTS = 2;
    public static final int TUNER_RESULT_INVALID_STATE = 3;
    public static final int TUNER_RESULT_NOT_SUPPORTED = 4;
    public static final int TUNER_RESULT_TIMEOUT = 5;
    public static final int TUNER_RESULT_CANCELED = 6;
    public static final int TUNER_RESULT_UNKNOWN_ERROR = 7;
    public RadioTuner() {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract void close();
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract int setConfiguration(android.hardware.radio.RadioManager.BandConfig p0);
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract int getConfiguration(android.hardware.radio.RadioManager.BandConfig[] p0);
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract int setMute(boolean p0);
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract boolean getMute();
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract int step(int p0, boolean p1);
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract int scan(int p0, boolean p1);
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public int seek(int p0, boolean p1) { return 0; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract int tune(int p0, int p1);
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract void tune(android.hardware.radio.ProgramSelector p0);
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract int cancel();
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract void cancelAnnouncement();
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract int getProgramInformation(android.hardware.radio.RadioManager.ProgramInfo[] p0);
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract android.graphics.Bitmap getMetadataImage(int p0);
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract boolean startBackgroundScan();
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract java.util.List<android.hardware.radio.RadioManager.ProgramInfo> getProgramList(java.util.Map<java.lang.String, java.lang.String> p0);
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public android.hardware.radio.ProgramList getDynamicProgramList(android.hardware.radio.ProgramList.Filter p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract boolean isAnalogForced();
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract void setAnalogForced(boolean p0);
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public boolean isConfigFlagSupported(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public boolean isConfigFlagSet(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public void setConfigFlag(int p0, boolean p1) {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public java.util.Map<java.lang.String, java.lang.String> setParameters(java.util.Map<java.lang.String, java.lang.String> p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public java.util.Map<java.lang.String, java.lang.String> getParameters(java.util.List<java.lang.String> p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract boolean isAntennaConnected();
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RADIO")
    public abstract boolean hasControl();

    public static abstract class Callback {
        public Callback() {}
        public void onError(int p0) {}
        public void onTuneFailed(int p0, android.hardware.radio.ProgramSelector p1) {}
        @java.lang.Deprecated
        public void onConfigurationChanged(android.hardware.radio.RadioManager.BandConfig p0) {}
        public void onProgramInfoChanged(android.hardware.radio.RadioManager.ProgramInfo p0) {}
        @java.lang.Deprecated
        public void onMetadataChanged(android.hardware.radio.RadioMetadata p0) {}
        public void onTrafficAnnouncement(boolean p0) {}
        public void onEmergencyAnnouncement(boolean p0) {}
        public void onAntennaState(boolean p0) {}
        public void onControlChanged(boolean p0) {}
        public void onBackgroundScanAvailabilityChange(boolean p0) {}
        public void onBackgroundScanComplete() {}
        public void onProgramListChanged() {}
        public void onConfigFlagUpdated(int p0, boolean p1) {}
        public void onParametersUpdated(java.util.Map<java.lang.String, java.lang.String> p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TunerResultType {
    }
}
