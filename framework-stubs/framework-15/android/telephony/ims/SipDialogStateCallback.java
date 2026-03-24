package android.telephony.ims;

@android.annotation.SystemApi
public abstract class SipDialogStateCallback {
    public SipDialogStateCallback() {}
    public void attachExecutor(java.util.concurrent.Executor p0) {}
    public abstract void onActiveSipDialogsChanged(java.util.List<android.telephony.ims.SipDialogState> p0);
    public abstract void onError();
    public final void binderDied() {}
    public android.telephony.ims.SipDialogStateCallback.CallbackBinder getCallbackBinder() { return null; }

    private static class CallbackBinder extends com.android.internal.telephony.ISipDialogStateCallback.Stub {
        java.util.concurrent.Executor getExecutor() { return null; }
        public void onActiveSipDialogsChanged(java.util.List<android.telephony.ims.SipDialogState> p0) {}
    }
}
