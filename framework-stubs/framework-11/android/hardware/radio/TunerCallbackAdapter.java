package android.hardware.radio;

class TunerCallbackAdapter extends android.hardware.radio.ITunerCallback.Stub {
    private static final java.lang.String TAG = "BroadcastRadio.TunerCallbackAdapter";
    private final java.lang.Object mLock = null;
    private final android.hardware.radio.RadioTuner.Callback mCallback = null;
    private final android.os.Handler mHandler = null;
    android.hardware.radio.ProgramList mProgramList;
    boolean mIsAntennaConnected;
    java.util.List<android.hardware.radio.RadioManager.ProgramInfo> mLastCompleteList;
    private boolean mDelayedCompleteCallback;
    android.hardware.radio.RadioManager.ProgramInfo mCurrentProgramInfo;
    TunerCallbackAdapter(android.hardware.radio.RadioTuner.Callback p0, android.os.Handler p1) { super(); }
    void close() {}
    void setProgramListObserver(android.hardware.radio.ProgramList p0, android.hardware.radio.ProgramList.OnCloseListener p1) {}
    java.util.List<android.hardware.radio.RadioManager.ProgramInfo> getLastCompleteList() { return null; }
    void clearLastCompleteList() {}
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
    private void sendBackgroundScanCompleteLocked() {}
    public void onBackgroundScanComplete() {}
    public void onProgramListChanged() {}
    public void onProgramListUpdated(android.hardware.radio.ProgramList.Chunk p0) {}
    public void onParametersUpdated(java.util.Map p0) {}
}
