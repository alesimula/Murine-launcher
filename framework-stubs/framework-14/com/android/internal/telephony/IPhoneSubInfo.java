package com.android.internal.telephony;

public interface IPhoneSubInfo extends android.os.IInterface {
    @java.lang.Deprecated
    public java.lang.String getDeviceId(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getDeviceIdWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getNaiForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getDeviceIdForPhone(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getImeiForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getDeviceSvn(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getDeviceSvnUsingSubId(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    @java.lang.Deprecated
    public java.lang.String getSubscriberId(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getSubscriberIdWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getSubscriberIdForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getGroupIdLevel1ForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getIccSerialNumber(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getIccSerialNumberWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getIccSerialNumberForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getLine1Number(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getLine1NumberForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getLine1AlphaTag(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getLine1AlphaTagForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getMsisdn(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getMsisdnForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getVoiceMailNumber(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getVoiceMailNumberForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.telephony.ImsiEncryptionInfo getCarrierInfoForImsiEncryption(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void setCarrierInfoForImsiEncryption(int p0, java.lang.String p1, android.telephony.ImsiEncryptionInfo p2) throws android.os.RemoteException;
    public void resetCarrierKeysForImsiEncryption(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getVoiceMailAlphaTag(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getVoiceMailAlphaTagForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getIsimImpi(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.USE_ICC_AUTH_WITH_DEVICE_IDENTIFIER")
    public java.lang.String getImsPrivateUserIdentity(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getIsimDomain(int p0) throws android.os.RemoteException;
    public java.lang.String[] getIsimImpu(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PHONE_NUMBERS", "android.permission.READ_PRIVILEGED_PHONE_STATE"})
    public java.util.List<android.net.Uri> getImsPublicUserIdentities(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getIsimIst(int p0) throws android.os.RemoteException;
    public java.lang.String[] getIsimPcscf(int p0) throws android.os.RemoteException;
    public java.lang.String getIccSimChallengeResponse(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public android.net.Uri getSmscIdentity(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getSimServiceTable(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.IPhoneSubInfo {
        public Default() {}
        public java.lang.String getDeviceId(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getDeviceIdWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getNaiForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getDeviceIdForPhone(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getImeiForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getDeviceSvn(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getDeviceSvnUsingSubId(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getSubscriberId(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getSubscriberIdWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getSubscriberIdForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getGroupIdLevel1ForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getIccSerialNumber(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getIccSerialNumberWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getIccSerialNumberForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getLine1Number(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getLine1NumberForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getLine1AlphaTag(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getLine1AlphaTagForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getMsisdn(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getMsisdnForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getVoiceMailNumber(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getVoiceMailNumberForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.telephony.ImsiEncryptionInfo getCarrierInfoForImsiEncryption(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void setCarrierInfoForImsiEncryption(int p0, java.lang.String p1, android.telephony.ImsiEncryptionInfo p2) throws android.os.RemoteException {}
        public void resetCarrierKeysForImsiEncryption(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.lang.String getVoiceMailAlphaTag(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getVoiceMailAlphaTagForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getIsimImpi(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getImsPrivateUserIdentity(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getIsimDomain(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] getIsimImpu(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.net.Uri> getImsPublicUserIdentities(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getIsimIst(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] getIsimPcscf(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getIccSimChallengeResponse(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException { return null; }
        public android.net.Uri getSmscIdentity(int p0, int p1) throws android.os.RemoteException { return null; }
        public java.lang.String getSimServiceTable(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.IPhoneSubInfo {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.IPhoneSubInfo";
        static final int TRANSACTION_getDeviceId = 1;
        static final int TRANSACTION_getDeviceIdWithFeature = 2;
        static final int TRANSACTION_getNaiForSubscriber = 3;
        static final int TRANSACTION_getDeviceIdForPhone = 4;
        static final int TRANSACTION_getImeiForSubscriber = 5;
        static final int TRANSACTION_getDeviceSvn = 6;
        static final int TRANSACTION_getDeviceSvnUsingSubId = 7;
        static final int TRANSACTION_getSubscriberId = 8;
        static final int TRANSACTION_getSubscriberIdWithFeature = 9;
        static final int TRANSACTION_getSubscriberIdForSubscriber = 10;
        static final int TRANSACTION_getGroupIdLevel1ForSubscriber = 11;
        static final int TRANSACTION_getIccSerialNumber = 12;
        static final int TRANSACTION_getIccSerialNumberWithFeature = 13;
        static final int TRANSACTION_getIccSerialNumberForSubscriber = 14;
        static final int TRANSACTION_getLine1Number = 15;
        static final int TRANSACTION_getLine1NumberForSubscriber = 16;
        static final int TRANSACTION_getLine1AlphaTag = 17;
        static final int TRANSACTION_getLine1AlphaTagForSubscriber = 18;
        static final int TRANSACTION_getMsisdn = 19;
        static final int TRANSACTION_getMsisdnForSubscriber = 20;
        static final int TRANSACTION_getVoiceMailNumber = 21;
        static final int TRANSACTION_getVoiceMailNumberForSubscriber = 22;
        static final int TRANSACTION_getCarrierInfoForImsiEncryption = 23;
        static final int TRANSACTION_setCarrierInfoForImsiEncryption = 24;
        static final int TRANSACTION_resetCarrierKeysForImsiEncryption = 25;
        static final int TRANSACTION_getVoiceMailAlphaTag = 26;
        static final int TRANSACTION_getVoiceMailAlphaTagForSubscriber = 27;
        static final int TRANSACTION_getIsimImpi = 28;
        static final int TRANSACTION_getImsPrivateUserIdentity = 29;
        static final int TRANSACTION_getIsimDomain = 30;
        static final int TRANSACTION_getIsimImpu = 31;
        static final int TRANSACTION_getImsPublicUserIdentities = 32;
        static final int TRANSACTION_getIsimIst = 33;
        static final int TRANSACTION_getIsimPcscf = 34;
        static final int TRANSACTION_getIccSimChallengeResponse = 35;
        static final int TRANSACTION_getSmscIdentity = 36;
        static final int TRANSACTION_getSimServiceTable = 37;
        public Stub() { super(); }
        public static com.android.internal.telephony.IPhoneSubInfo asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telephony.IPhoneSubInfo {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getDeviceId(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getDeviceIdWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getNaiForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getDeviceIdForPhone(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getImeiForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getDeviceSvn(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getDeviceSvnUsingSubId(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getSubscriberId(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getSubscriberIdWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getSubscriberIdForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getGroupIdLevel1ForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getIccSerialNumber(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getIccSerialNumberWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getIccSerialNumberForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getLine1Number(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getLine1NumberForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getLine1AlphaTag(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getLine1AlphaTagForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getMsisdn(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getMsisdnForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getVoiceMailNumber(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getVoiceMailNumberForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.telephony.ImsiEncryptionInfo getCarrierInfoForImsiEncryption(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void setCarrierInfoForImsiEncryption(int p0, java.lang.String p1, android.telephony.ImsiEncryptionInfo p2) throws android.os.RemoteException {}
            public void resetCarrierKeysForImsiEncryption(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public java.lang.String getVoiceMailAlphaTag(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getVoiceMailAlphaTagForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getIsimImpi(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getImsPrivateUserIdentity(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getIsimDomain(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] getIsimImpu(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.net.Uri> getImsPublicUserIdentities(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getIsimIst(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] getIsimPcscf(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getIccSimChallengeResponse(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException { return null; }
            public android.net.Uri getSmscIdentity(int p0, int p1) throws android.os.RemoteException { return null; }
            public java.lang.String getSimServiceTable(int p0, int p1) throws android.os.RemoteException { return null; }
        }
    }
}
