package android.telecom;

@android.annotation.SystemApi
@java.lang.Deprecated
public final class Phone {
    public static final int SDK_VERSION_R = 30;
    Phone(android.telecom.InCallAdapter p0, java.lang.String p1, int p2) {}
    final void internalAddCall(android.telecom.ParcelableCall p0) {}
    final void internalRemoveCall(android.telecom.Call p0) {}
    final void internalUpdateCall(android.telecom.ParcelableCall p0) {}
    android.telecom.Call getCallById(java.lang.String p0) { return null; }
    final void internalSetPostDialWait(java.lang.String p0, java.lang.String p1) {}
    final void internalCallAudioStateChanged(android.telecom.CallAudioState p0) {}
    final android.telecom.Call internalGetCallByTelecomId(java.lang.String p0) { return null; }
    final void internalBringToForeground(boolean p0) {}
    final void internalSetCanAddCall(boolean p0) {}
    final void internalSilenceRinger() {}
    final void internalOnConnectionEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) {}
    final void internalOnRttUpgradeRequest(java.lang.String p0, int p1) {}
    final void internalOnRttInitiationFailure(java.lang.String p0, int p1) {}
    final void internalOnHandoverFailed(java.lang.String p0, int p1) {}
    final void internalOnHandoverComplete(java.lang.String p0) {}
    final void destroy() {}
    public final void addListener(android.telecom.Phone.Listener p0) {}
    public final void removeListener(android.telecom.Phone.Listener p0) {}
    public final java.util.List<android.telecom.Call> getCalls() { return null; }
    public final boolean canAddCall() { return false; }
    public final void setMuted(boolean p0) {}
    public final void setAudioRoute(int p0) {}
    public void requestBluetoothAudio(java.lang.String p0) {}
    public final void setProximitySensorOn() {}
    public final void setProximitySensorOff(boolean p0) {}
    @java.lang.Deprecated
    public final android.telecom.AudioState getAudioState() { return null; }
    public final android.telecom.CallAudioState getCallAudioState() { return null; }

    public static abstract class Listener {
        public Listener() {}
        @java.lang.Deprecated
        public void onAudioStateChanged(android.telecom.Phone p0, android.telecom.AudioState p1) {}
        public void onCallAudioStateChanged(android.telecom.Phone p0, android.telecom.CallAudioState p1) {}
        public void onBringToForeground(android.telecom.Phone p0, boolean p1) {}
        public void onCallAdded(android.telecom.Phone p0, android.telecom.Call p1) {}
        public void onCallRemoved(android.telecom.Phone p0, android.telecom.Call p1) {}
        public void onCanAddCallChanged(android.telecom.Phone p0, boolean p1) {}
        public void onSilenceRinger(android.telecom.Phone p0) {}
    }
}
