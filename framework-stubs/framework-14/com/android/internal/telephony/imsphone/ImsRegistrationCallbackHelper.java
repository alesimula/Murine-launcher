package com.android.internal.telephony.imsphone;

public class ImsRegistrationCallbackHelper {
    public ImsRegistrationCallbackHelper(com.android.internal.telephony.imsphone.ImsRegistrationCallbackHelper.ImsRegistrationUpdate p0, java.util.concurrent.Executor p1) {}
    public void reset() {}
    public synchronized void updateRegistrationState(int p0) {}
    public int getImsRegistrationState() { return 0; }
    public boolean isImsRegistered() { return false; }
    public android.telephony.ims.RegistrationManager.RegistrationCallback getCallback() { return null; }
    public android.telephony.ims.aidl.IImsRegistrationCallback getCallbackBinder() { return null; }

    public static interface ImsRegistrationUpdate {
        public void handleImsRegistered(android.telephony.ims.ImsRegistrationAttributes p0);
        public void handleImsRegistering(int p0);
        public void handleImsUnregistered(android.telephony.ims.ImsReasonInfo p0, int p1, int p2);
        public void handleImsSubscriberAssociatedUriChanged(android.net.Uri[] p0);
    }
}
