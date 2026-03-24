package com.android.internal.telephony.imsphone;

public class ImsExternalCallTracker implements com.android.internal.telephony.imsphone.ImsPhoneCallTracker.PhoneStateListener {
    public static final java.lang.String TAG = "ImsExternalCallTracker";
    public static final java.lang.String EXTRA_IMS_EXTERNAL_CALL_ID = "android.telephony.ImsExternalCallTracker.extra.EXTERNAL_CALL_ID";
    public ImsExternalCallTracker(com.android.internal.telephony.imsphone.ImsPhone p0, com.android.internal.telephony.imsphone.ImsPullCall p1, com.android.internal.telephony.imsphone.ImsExternalCallTracker.ImsCallNotify p2, java.util.concurrent.Executor p3) {}
    public ImsExternalCallTracker(com.android.internal.telephony.imsphone.ImsPhone p0, java.util.concurrent.Executor p1) {}
    public void tearDown() {}
    public void setCallPuller(com.android.internal.telephony.imsphone.ImsPullCall p0) {}
    public com.android.internal.telephony.imsphone.ImsExternalCallTracker.ExternalCallStateListener getExternalCallStateListener() { return null; }
    public void onPhoneStateChanged(com.android.internal.telephony.PhoneConstants.State p0, com.android.internal.telephony.PhoneConstants.State p1) {}
    public void refreshExternalCallState(java.util.List<android.telephony.ims.ImsExternalCallState> p0) {}
    public com.android.internal.telephony.Connection getConnectionById(int p0) { return null; }

    public class ExternalCallStateListener {
        public ExternalCallStateListener(com.android.internal.telephony.imsphone.ImsExternalCallTracker p0, java.util.concurrent.Executor p1) {}
        public void onImsExternalCallStateUpdate(java.util.List<android.telephony.ims.ImsExternalCallState> p0, java.util.concurrent.Executor p1) {}
    }

    public class ExternalConnectionListener implements com.android.internal.telephony.imsphone.ImsExternalConnection.Listener {
        public ExternalConnectionListener(com.android.internal.telephony.imsphone.ImsExternalCallTracker p0) {}
        public void onPullExternalCall(com.android.internal.telephony.imsphone.ImsExternalConnection p0) {}
    }

    public static interface ImsCallNotify {
        public void notifyUnknownConnection(com.android.internal.telephony.Connection p0);
        public void notifyPreciseCallStateChanged();
    }
}
