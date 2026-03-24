package com.android.internal.telephony;

public class PhoneSubInfoController extends com.android.internal.telephony.IPhoneSubInfo.Stub {
    public PhoneSubInfoController(android.content.Context p0) { super(); }
    @java.lang.Deprecated
    public java.lang.String getDeviceId(java.lang.String p0) { return null; }
    public java.lang.String getDeviceIdWithFeature(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String getDeviceIdForPhone(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public java.lang.String getNaiForSubscriber(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public java.lang.String getImeiForSubscriber(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public android.telephony.ImsiEncryptionInfo getCarrierInfoForImsiEncryption(int p0, int p1, java.lang.String p2) { return null; }
    public void setCarrierInfoForImsiEncryption(int p0, java.lang.String p1, android.telephony.ImsiEncryptionInfo p2) {}
    public void resetCarrierKeysForImsiEncryption(int p0, java.lang.String p1) {}
    public java.lang.String getDeviceSvn(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String getDeviceSvnUsingSubId(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    @java.lang.Deprecated
    public java.lang.String getSubscriberId(java.lang.String p0) { return null; }
    public java.lang.String getSubscriberIdWithFeature(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String getSubscriberIdForSubscriber(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    @java.lang.Deprecated
    public java.lang.String getIccSerialNumber(java.lang.String p0) { return null; }
    public java.lang.String getIccSerialNumberWithFeature(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String getIccSerialNumberForSubscriber(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public java.lang.String getLine1Number(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String getLine1NumberForSubscriber(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public java.lang.String getLine1AlphaTag(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String getLine1AlphaTagForSubscriber(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public java.lang.String getMsisdn(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String getMsisdnForSubscriber(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public java.lang.String getVoiceMailNumber(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String getVoiceMailNumberForSubscriber(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public java.lang.String getVoiceMailAlphaTag(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String getVoiceMailAlphaTagForSubscriber(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public java.lang.String getIsimImpi(int p0) { return null; }
    public java.lang.String getImsPrivateUserIdentity(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public java.lang.String getIsimDomain(int p0) { return null; }
    public java.lang.String[] getIsimImpu(int p0) { return null; }
    public java.util.List<android.net.Uri> getImsPublicUserIdentities(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public java.lang.String getIsimIst(int p0) throws android.os.RemoteException { return null; }
    public java.lang.String[] getIsimPcscf(int p0) throws android.os.RemoteException { return null; }
    public java.lang.String getSimServiceTable(int p0, int p1) throws android.os.RemoteException { return null; }
    public java.lang.String getIccSimChallengeResponse(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException { return null; }
    public java.lang.String getGroupIdLevel1ForSubscriber(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public android.net.Uri getSmscIdentity(int p0, int p1) throws android.os.RemoteException { return null; }

    private static interface CallPhoneMethodHelper<T extends java.lang.Object> {
        public T callMethod(com.android.internal.telephony.Phone p0);
    }

    private static interface PermissionCheckHelper {
        public boolean checkPermission(android.content.Context p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4);
    }
}
