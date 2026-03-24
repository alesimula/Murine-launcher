package android.telecom;

@android.annotation.SuppressLint("NotCloseable")
public final class CallControl {
    public CallControl(java.lang.String p0, com.android.internal.telecom.ICallControl p1) {}
    @android.annotation.NonNull
    public android.os.ParcelUuid getCallId() { return null; }
    public void setActive(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, android.telecom.CallException> p1) {}
    public void answer(int p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.telecom.CallException> p2) {}
    public void setInactive(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, android.telecom.CallException> p1) {}
    public void disconnect(android.telecom.DisconnectCause p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.telecom.CallException> p2) {}
    public void startCallStreaming(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, android.telecom.CallException> p1) {}
    public void requestCallEndpointChange(android.telecom.CallEndpoint p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.telecom.CallException> p2) {}
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.set_mute_state")
    public void requestMuteState(boolean p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.telecom.CallException> p2) {}
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.transactional_video_state")
    public void requestVideoState(int p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.telecom.CallException> p2) {}
    public void sendEvent(java.lang.String p0, android.os.Bundle p1) {}

    private class CallControlResultReceiver extends android.os.ResultReceiver {
        CallControlResultReceiver(java.lang.String p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.telecom.CallException> p2) { super((android.os.Handler)null); }
        protected void onReceiveResult(int p0, android.os.Bundle p1) {}
    }
}
