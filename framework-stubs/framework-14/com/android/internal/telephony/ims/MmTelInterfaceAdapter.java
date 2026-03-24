package com.android.internal.telephony.ims;

public class MmTelInterfaceAdapter {
    protected android.os.IBinder mBinder;
    protected int mSlotId;
    public MmTelInterfaceAdapter(int p0, android.os.IBinder p1) {}
    public int startSession(android.app.PendingIntent p0, com.android.ims.internal.IImsRegistrationListener p1) throws android.os.RemoteException { return 0; }
    public void endSession(int p0) throws android.os.RemoteException {}
    public boolean isConnected(int p0, int p1) throws android.os.RemoteException { return false; }
    public boolean isOpened() throws android.os.RemoteException { return false; }
    public int getFeatureState() throws android.os.RemoteException { return 0; }
    public void addRegistrationListener(com.android.ims.internal.IImsRegistrationListener p0) throws android.os.RemoteException {}
    public void removeRegistrationListener(com.android.ims.internal.IImsRegistrationListener p0) throws android.os.RemoteException {}
    public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
    public com.android.ims.internal.IImsCallSession createCallSession(int p0, android.telephony.ims.ImsCallProfile p1) throws android.os.RemoteException { return null; }
    public com.android.ims.internal.IImsCallSession getPendingCallSession(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
    public com.android.ims.internal.IImsUt getUtInterface() throws android.os.RemoteException { return null; }
    public com.android.ims.internal.IImsConfig getConfigInterface() throws android.os.RemoteException { return null; }
    public void turnOnIms() throws android.os.RemoteException {}
    public void turnOffIms() throws android.os.RemoteException {}
    public com.android.ims.internal.IImsEcbm getEcbmInterface() throws android.os.RemoteException { return null; }
    public void setUiTTYMode(int p0, android.os.Message p1) throws android.os.RemoteException {}
    public com.android.ims.internal.IImsMultiEndpoint getMultiEndpointInterface() throws android.os.RemoteException { return null; }
}
