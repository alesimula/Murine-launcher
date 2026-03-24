package android.telecom;

public final class InCallAdapter {
    private final com.android.internal.telecom.IInCallAdapter mAdapter = null;
    public InCallAdapter(com.android.internal.telecom.IInCallAdapter p0) {}
    public void answerCall(java.lang.String p0, int p1) {}
    public void deflectCall(java.lang.String p0, android.net.Uri p1) {}
    public void rejectCall(java.lang.String p0, boolean p1, java.lang.String p2) {}
    public void disconnectCall(java.lang.String p0) {}
    public void holdCall(java.lang.String p0) {}
    public void unholdCall(java.lang.String p0) {}
    public void mute(boolean p0) {}
    public void setAudioRoute(int p0) {}
    public void requestBluetoothAudio(java.lang.String p0) {}
    public void playDtmfTone(java.lang.String p0, char p1) {}
    public void stopDtmfTone(java.lang.String p0) {}
    public void postDialContinue(java.lang.String p0, boolean p1) {}
    public void phoneAccountSelected(java.lang.String p0, android.telecom.PhoneAccountHandle p1, boolean p2) {}
    public void conference(java.lang.String p0, java.lang.String p1) {}
    public void splitFromConference(java.lang.String p0) {}
    public void mergeConference(java.lang.String p0) {}
    public void swapConference(java.lang.String p0) {}
    public void pullExternalCall(java.lang.String p0) {}
    public void sendCallEvent(java.lang.String p0, java.lang.String p1, int p2, android.os.Bundle p3) {}
    public void putExtras(java.lang.String p0, android.os.Bundle p1) {}
    public void putExtra(java.lang.String p0, java.lang.String p1, boolean p2) {}
    public void putExtra(java.lang.String p0, java.lang.String p1, int p2) {}
    public void putExtra(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void removeExtras(java.lang.String p0, java.util.List<java.lang.String> p1) {}
    public void turnProximitySensorOn() {}
    public void turnProximitySensorOff(boolean p0) {}
    public void sendRttRequest(java.lang.String p0) {}
    public void respondToRttRequest(java.lang.String p0, int p1, boolean p2) {}
    public void stopRtt(java.lang.String p0) {}
    public void setRttMode(java.lang.String p0, int p1) {}
    public void handoverTo(java.lang.String p0, android.telecom.PhoneAccountHandle p1, int p2, android.os.Bundle p3) {}
}
