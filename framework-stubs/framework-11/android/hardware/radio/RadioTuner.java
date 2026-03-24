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
    public RadioTuner() {}
    public abstract void close();
    @java.lang.Deprecated
    public abstract int setConfiguration(android.hardware.radio.RadioManager.BandConfig p0);
    @java.lang.Deprecated
    public abstract int getConfiguration(android.hardware.radio.RadioManager.BandConfig[] p0);
    public abstract int setMute(boolean p0);
    public abstract boolean getMute();
    public abstract int step(int p0, boolean p1);
    public abstract int scan(int p0, boolean p1);
    @java.lang.Deprecated
    public abstract int tune(int p0, int p1);
    public abstract void tune(android.hardware.radio.ProgramSelector p0);
    public abstract int cancel();
    public abstract void cancelAnnouncement();
    @java.lang.Deprecated
    public abstract int getProgramInformation(android.hardware.radio.RadioManager.ProgramInfo[] p0);
    public abstract android.graphics.Bitmap getMetadataImage(int p0);
    public abstract boolean startBackgroundScan();
    @java.lang.Deprecated
    public abstract java.util.List<android.hardware.radio.RadioManager.ProgramInfo> getProgramList(java.util.Map<java.lang.String, java.lang.String> p0);
    public android.hardware.radio.ProgramList getDynamicProgramList(android.hardware.radio.ProgramList.Filter p0) { return null; }
    @java.lang.Deprecated
    public abstract boolean isAnalogForced();
    @java.lang.Deprecated
    public abstract void setAnalogForced(boolean p0);
    public boolean isConfigFlagSupported(int p0) { return false; }
    public boolean isConfigFlagSet(int p0) { return false; }
    public void setConfigFlag(int p0, boolean p1) {}
    public java.util.Map<java.lang.String, java.lang.String> setParameters(java.util.Map<java.lang.String, java.lang.String> p0) { return null; }
    public java.util.Map<java.lang.String, java.lang.String> getParameters(java.util.List<java.lang.String> p0) { return null; }
    @java.lang.Deprecated
    public abstract boolean isAntennaConnected();
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
        public void onParametersUpdated(java.util.Map<java.lang.String, java.lang.String> p0) {}
    }
}
