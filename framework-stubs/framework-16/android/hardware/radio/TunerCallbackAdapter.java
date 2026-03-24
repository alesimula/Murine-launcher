package android.hardware.radio;

final class TunerCallbackAdapter extends android.hardware.radio.ITunerCallback.Stub {
    @android.annotation.Nullable
    android.hardware.radio.ProgramList mProgramList;
    boolean mIsAntennaConnected;
    @android.annotation.Nullable
    java.util.List<android.hardware.radio.RadioManager.ProgramInfo> mLastCompleteList;
    @android.annotation.Nullable
    android.hardware.radio.RadioManager.ProgramInfo mCurrentProgramInfo;
    TunerCallbackAdapter(android.hardware.radio.RadioTuner.Callback p0, android.os.Handler p1) { super(); }
    void close() {}
    void setProgramListObserver(android.hardware.radio.ProgramList p0, android.hardware.radio.ProgramList.OnCloseListener p1) {}
    @android.annotation.Nullable
    java.util.List<android.hardware.radio.RadioManager.ProgramInfo> getLastCompleteList() { return null; }
    void clearLastCompleteList() {}
    @android.annotation.Nullable
    android.hardware.radio.RadioManager.ProgramInfo getCurrentProgramInformation() { return null; }
    boolean isAntennaConnected() { return false; }
    public void onError(int p0) {}
    public void onTuneFailed(int p0, android.hardware.radio.ProgramSelector p1) {}
    public void onConfigurationChanged(android.hardware.radio.RadioManager.BandConfig p0) {}
    public void onCurrentProgramInfoChanged(android.hardware.radio.RadioManager.ProgramInfo p0) {}
    public void onTrafficAnnouncement(boolean p0) {}
    public void onEmergencyAnnouncement(boolean p0) {}
    public void onAntennaState(boolean p0) {}
    public void onBackgroundScanAvailabilityChange(boolean p0) {}
    public void onBackgroundScanComplete() {}
    public void onProgramListChanged() {}
    public void onProgramListUpdated(android.hardware.radio.ProgramList.Chunk p0) {}
    public void onConfigFlagUpdated(int p0, boolean p1) {}
    public void onParametersUpdated(java.util.Map<java.lang.String, java.lang.String> p0) {}
}
