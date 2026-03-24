package com.android.internal.telephony;

public class RadioVoiceProxy extends com.android.internal.telephony.RadioServiceProxy {
    public RadioVoiceProxy() { super(); }
    public com.android.internal.telephony.HalVersion setAidl(com.android.internal.telephony.HalVersion p0, android.hardware.radio.voice.IRadioVoice p1) { return null; }
    public android.hardware.radio.voice.IRadioVoice getAidl() { return null; }
    public void clear() {}
    public boolean isEmpty() { return false; }
    public void acceptCall(int p0) throws android.os.RemoteException {}
    public void cancelPendingUssd(int p0) throws android.os.RemoteException {}
    public void conference(int p0) throws android.os.RemoteException {}
    public void dial(int p0, java.lang.String p1, int p2, com.android.internal.telephony.UUSInfo p3) throws android.os.RemoteException {}
    public void emergencyDial(int p0, java.lang.String p1, android.telephony.emergency.EmergencyNumber p2, boolean p3, int p4, com.android.internal.telephony.UUSInfo p5) throws android.os.RemoteException {}
    public void exitEmergencyCallbackMode(int p0) throws android.os.RemoteException {}
    public void explicitCallTransfer(int p0) throws android.os.RemoteException {}
    public void getCallForwardStatus(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
    public void getCallWaiting(int p0, int p1) throws android.os.RemoteException {}
    public void getClip(int p0) throws android.os.RemoteException {}
    public void getClir(int p0) throws android.os.RemoteException {}
    public void getCurrentCalls(int p0) throws android.os.RemoteException {}
    public void getLastCallFailCause(int p0) throws android.os.RemoteException {}
    public void getMute(int p0) throws android.os.RemoteException {}
    public void getPreferredVoicePrivacy(int p0) throws android.os.RemoteException {}
    public void getTtyMode(int p0) throws android.os.RemoteException {}
    public void handleStkCallSetupRequestFromSim(int p0, boolean p1) throws android.os.RemoteException {}
    public void hangup(int p0, int p1) throws android.os.RemoteException {}
    public void hangupForegroundResumeBackground(int p0) throws android.os.RemoteException {}
    public void hangupWaitingOrBackground(int p0) throws android.os.RemoteException {}
    public void isVoNrEnabled(int p0) throws android.os.RemoteException {}
    public void rejectCall(int p0) throws android.os.RemoteException {}
    public void responseAcknowledgement() throws android.os.RemoteException {}
    public void sendBurstDtmf(int p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
    public void sendCdmaFeatureCode(int p0, java.lang.String p1) throws android.os.RemoteException {}
    public void sendDtmf(int p0, java.lang.String p1) throws android.os.RemoteException {}
    public void sendUssd(int p0, java.lang.String p1) throws android.os.RemoteException {}
    public void separateConnection(int p0, int p1) throws android.os.RemoteException {}
    public void setCallForward(int p0, int p1, int p2, int p3, java.lang.String p4, int p5) throws android.os.RemoteException {}
    public void setCallWaiting(int p0, boolean p1, int p2) throws android.os.RemoteException {}
    public void setClir(int p0, int p1) throws android.os.RemoteException {}
    public void setMute(int p0, boolean p1) throws android.os.RemoteException {}
    public void setPreferredVoicePrivacy(int p0, boolean p1) throws android.os.RemoteException {}
    public void setTtyMode(int p0, int p1) throws android.os.RemoteException {}
    public void setVoNrEnabled(int p0, boolean p1) throws android.os.RemoteException {}
    public void startDtmf(int p0, java.lang.String p1) throws android.os.RemoteException {}
    public void stopDtmf(int p0) throws android.os.RemoteException {}
    public void switchWaitingOrHoldingAndActive(int p0) throws android.os.RemoteException {}
}
