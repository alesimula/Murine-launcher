package com.android.internal.telephony;

public interface ISms extends android.os.IInterface {
    public java.util.List<com.android.internal.telephony.SmsRawData> getAllMessagesFromIccEfForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean updateMessageOnIccEfForSubscriber(int p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException;
    public boolean copyMessageToIccEfForSubscriber(int p0, java.lang.String p1, int p2, byte[] p3, byte[] p4) throws android.os.RemoteException;
    public void sendDataForSubscriber(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, byte[] p6, android.app.PendingIntent p7, android.app.PendingIntent p8) throws android.os.RemoteException;
    public void sendTextForSubscriber(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, android.app.PendingIntent p6, android.app.PendingIntent p7, boolean p8, long p9) throws android.os.RemoteException;
    public void sendTextForSubscriberWithOptions(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, android.app.PendingIntent p6, android.app.PendingIntent p7, boolean p8, int p9, boolean p10, int p11) throws android.os.RemoteException;
    public void injectSmsPduForSubscriber(int p0, byte[] p1, java.lang.String p2, android.app.PendingIntent p3) throws android.os.RemoteException;
    public void sendMultipartTextForSubscriber(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.util.List<java.lang.String> p5, java.util.List<android.app.PendingIntent> p6, java.util.List<android.app.PendingIntent> p7, boolean p8, long p9) throws android.os.RemoteException;
    public void sendMultipartTextForSubscriberWithOptions(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.util.List<java.lang.String> p5, java.util.List<android.app.PendingIntent> p6, java.util.List<android.app.PendingIntent> p7, boolean p8, int p9, boolean p10, int p11) throws android.os.RemoteException;
    public boolean enableCellBroadcastForSubscriber(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean disableCellBroadcastForSubscriber(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean enableCellBroadcastRangeForSubscriber(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public boolean disableCellBroadcastRangeForSubscriber(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public int getPremiumSmsPermission(java.lang.String p0) throws android.os.RemoteException;
    public int getPremiumSmsPermissionForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setPremiumSmsPermission(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setPremiumSmsPermissionForSubscriber(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean isImsSmsSupportedForSubscriber(int p0) throws android.os.RemoteException;
    public boolean isSmsSimPickActivityNeeded(int p0) throws android.os.RemoteException;
    public int getPreferredSmsSubscription() throws android.os.RemoteException;
    public java.lang.String getImsSmsFormatForSubscriber(int p0) throws android.os.RemoteException;
    public boolean isSMSPromptEnabled() throws android.os.RemoteException;
    public void sendStoredText(int p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, java.lang.String p4, android.app.PendingIntent p5, android.app.PendingIntent p6) throws android.os.RemoteException;
    public void sendStoredMultipartText(int p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, java.lang.String p4, java.util.List<android.app.PendingIntent> p5, java.util.List<android.app.PendingIntent> p6) throws android.os.RemoteException;
    public android.os.Bundle getCarrierConfigValuesForSubscriber(int p0) throws android.os.RemoteException;
    public java.lang.String createAppSpecificSmsToken(int p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException;
    public java.lang.String createAppSpecificSmsTokenWithPackageInfo(int p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3) throws android.os.RemoteException;
    public int checkSmsShortCodeDestination(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public java.lang.String getSmscAddressFromIccEfForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setSmscAddressOnIccEfForSubscriber(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int getSmsCapacityOnIccForSubscriber(int p0) throws android.os.RemoteException;
    public boolean resetAllCellBroadcastRanges(int p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.ISms {
        public Default() {}
        public java.util.List<com.android.internal.telephony.SmsRawData> getAllMessagesFromIccEfForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean updateMessageOnIccEfForSubscriber(int p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException { return false; }
        public boolean copyMessageToIccEfForSubscriber(int p0, java.lang.String p1, int p2, byte[] p3, byte[] p4) throws android.os.RemoteException { return false; }
        public void sendDataForSubscriber(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, byte[] p6, android.app.PendingIntent p7, android.app.PendingIntent p8) throws android.os.RemoteException {}
        public void sendTextForSubscriber(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, android.app.PendingIntent p6, android.app.PendingIntent p7, boolean p8, long p9) throws android.os.RemoteException {}
        public void sendTextForSubscriberWithOptions(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, android.app.PendingIntent p6, android.app.PendingIntent p7, boolean p8, int p9, boolean p10, int p11) throws android.os.RemoteException {}
        public void injectSmsPduForSubscriber(int p0, byte[] p1, java.lang.String p2, android.app.PendingIntent p3) throws android.os.RemoteException {}
        public void sendMultipartTextForSubscriber(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.util.List<java.lang.String> p5, java.util.List<android.app.PendingIntent> p6, java.util.List<android.app.PendingIntent> p7, boolean p8, long p9) throws android.os.RemoteException {}
        public void sendMultipartTextForSubscriberWithOptions(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.util.List<java.lang.String> p5, java.util.List<android.app.PendingIntent> p6, java.util.List<android.app.PendingIntent> p7, boolean p8, int p9, boolean p10, int p11) throws android.os.RemoteException {}
        public boolean enableCellBroadcastForSubscriber(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean disableCellBroadcastForSubscriber(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean enableCellBroadcastRangeForSubscriber(int p0, int p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public boolean disableCellBroadcastRangeForSubscriber(int p0, int p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public int getPremiumSmsPermission(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getPremiumSmsPermissionForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void setPremiumSmsPermission(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void setPremiumSmsPermissionForSubscriber(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public boolean isImsSmsSupportedForSubscriber(int p0) throws android.os.RemoteException { return false; }
        public boolean isSmsSimPickActivityNeeded(int p0) throws android.os.RemoteException { return false; }
        public int getPreferredSmsSubscription() throws android.os.RemoteException { return 0; }
        public java.lang.String getImsSmsFormatForSubscriber(int p0) throws android.os.RemoteException { return null; }
        public boolean isSMSPromptEnabled() throws android.os.RemoteException { return false; }
        public void sendStoredText(int p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, java.lang.String p4, android.app.PendingIntent p5, android.app.PendingIntent p6) throws android.os.RemoteException {}
        public void sendStoredMultipartText(int p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, java.lang.String p4, java.util.List<android.app.PendingIntent> p5, java.util.List<android.app.PendingIntent> p6) throws android.os.RemoteException {}
        public android.os.Bundle getCarrierConfigValuesForSubscriber(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String createAppSpecificSmsToken(int p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException { return null; }
        public java.lang.String createAppSpecificSmsTokenWithPackageInfo(int p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3) throws android.os.RemoteException { return null; }
        public int checkSmsShortCodeDestination(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
        public java.lang.String getSmscAddressFromIccEfForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean setSmscAddressOnIccEfForSubscriber(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public int getSmsCapacityOnIccForSubscriber(int p0) throws android.os.RemoteException { return 0; }
        public boolean resetAllCellBroadcastRanges(int p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ISms {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ISms";
        static final int TRANSACTION_getAllMessagesFromIccEfForSubscriber = 1;
        static final int TRANSACTION_updateMessageOnIccEfForSubscriber = 2;
        static final int TRANSACTION_copyMessageToIccEfForSubscriber = 3;
        static final int TRANSACTION_sendDataForSubscriber = 4;
        static final int TRANSACTION_sendTextForSubscriber = 5;
        static final int TRANSACTION_sendTextForSubscriberWithOptions = 6;
        static final int TRANSACTION_injectSmsPduForSubscriber = 7;
        static final int TRANSACTION_sendMultipartTextForSubscriber = 8;
        static final int TRANSACTION_sendMultipartTextForSubscriberWithOptions = 9;
        static final int TRANSACTION_enableCellBroadcastForSubscriber = 10;
        static final int TRANSACTION_disableCellBroadcastForSubscriber = 11;
        static final int TRANSACTION_enableCellBroadcastRangeForSubscriber = 12;
        static final int TRANSACTION_disableCellBroadcastRangeForSubscriber = 13;
        static final int TRANSACTION_getPremiumSmsPermission = 14;
        static final int TRANSACTION_getPremiumSmsPermissionForSubscriber = 15;
        static final int TRANSACTION_setPremiumSmsPermission = 16;
        static final int TRANSACTION_setPremiumSmsPermissionForSubscriber = 17;
        static final int TRANSACTION_isImsSmsSupportedForSubscriber = 18;
        static final int TRANSACTION_isSmsSimPickActivityNeeded = 19;
        static final int TRANSACTION_getPreferredSmsSubscription = 20;
        static final int TRANSACTION_getImsSmsFormatForSubscriber = 21;
        static final int TRANSACTION_isSMSPromptEnabled = 22;
        static final int TRANSACTION_sendStoredText = 23;
        static final int TRANSACTION_sendStoredMultipartText = 24;
        static final int TRANSACTION_getCarrierConfigValuesForSubscriber = 25;
        static final int TRANSACTION_createAppSpecificSmsToken = 26;
        static final int TRANSACTION_createAppSpecificSmsTokenWithPackageInfo = 27;
        static final int TRANSACTION_checkSmsShortCodeDestination = 28;
        static final int TRANSACTION_getSmscAddressFromIccEfForSubscriber = 29;
        static final int TRANSACTION_setSmscAddressOnIccEfForSubscriber = 30;
        static final int TRANSACTION_getSmsCapacityOnIccForSubscriber = 31;
        static final int TRANSACTION_resetAllCellBroadcastRanges = 32;
        public Stub() { super(); }
        public static com.android.internal.telephony.ISms asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telephony.ISms p0) { return false; }
        public static com.android.internal.telephony.ISms getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telephony.ISms {
            private android.os.IBinder mRemote;
            public static com.android.internal.telephony.ISms sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<com.android.internal.telephony.SmsRawData> getAllMessagesFromIccEfForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean updateMessageOnIccEfForSubscriber(int p0, java.lang.String p1, int p2, int p3, byte[] p4) throws android.os.RemoteException { return false; }
            public boolean copyMessageToIccEfForSubscriber(int p0, java.lang.String p1, int p2, byte[] p3, byte[] p4) throws android.os.RemoteException { return false; }
            public void sendDataForSubscriber(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, byte[] p6, android.app.PendingIntent p7, android.app.PendingIntent p8) throws android.os.RemoteException {}
            public void sendTextForSubscriber(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, android.app.PendingIntent p6, android.app.PendingIntent p7, boolean p8, long p9) throws android.os.RemoteException {}
            public void sendTextForSubscriberWithOptions(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, android.app.PendingIntent p6, android.app.PendingIntent p7, boolean p8, int p9, boolean p10, int p11) throws android.os.RemoteException {}
            public void injectSmsPduForSubscriber(int p0, byte[] p1, java.lang.String p2, android.app.PendingIntent p3) throws android.os.RemoteException {}
            public void sendMultipartTextForSubscriber(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.util.List<java.lang.String> p5, java.util.List<android.app.PendingIntent> p6, java.util.List<android.app.PendingIntent> p7, boolean p8, long p9) throws android.os.RemoteException {}
            public void sendMultipartTextForSubscriberWithOptions(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.util.List<java.lang.String> p5, java.util.List<android.app.PendingIntent> p6, java.util.List<android.app.PendingIntent> p7, boolean p8, int p9, boolean p10, int p11) throws android.os.RemoteException {}
            public boolean enableCellBroadcastForSubscriber(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean disableCellBroadcastForSubscriber(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean enableCellBroadcastRangeForSubscriber(int p0, int p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public boolean disableCellBroadcastRangeForSubscriber(int p0, int p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public int getPremiumSmsPermission(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getPremiumSmsPermissionForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void setPremiumSmsPermission(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void setPremiumSmsPermissionForSubscriber(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public boolean isImsSmsSupportedForSubscriber(int p0) throws android.os.RemoteException { return false; }
            public boolean isSmsSimPickActivityNeeded(int p0) throws android.os.RemoteException { return false; }
            public int getPreferredSmsSubscription() throws android.os.RemoteException { return 0; }
            public java.lang.String getImsSmsFormatForSubscriber(int p0) throws android.os.RemoteException { return null; }
            public boolean isSMSPromptEnabled() throws android.os.RemoteException { return false; }
            public void sendStoredText(int p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, java.lang.String p4, android.app.PendingIntent p5, android.app.PendingIntent p6) throws android.os.RemoteException {}
            public void sendStoredMultipartText(int p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, java.lang.String p4, java.util.List<android.app.PendingIntent> p5, java.util.List<android.app.PendingIntent> p6) throws android.os.RemoteException {}
            public android.os.Bundle getCarrierConfigValuesForSubscriber(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String createAppSpecificSmsToken(int p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException { return null; }
            public java.lang.String createAppSpecificSmsTokenWithPackageInfo(int p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3) throws android.os.RemoteException { return null; }
            public int checkSmsShortCodeDestination(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
            public java.lang.String getSmscAddressFromIccEfForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean setSmscAddressOnIccEfForSubscriber(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public int getSmsCapacityOnIccForSubscriber(int p0) throws android.os.RemoteException { return 0; }
            public boolean resetAllCellBroadcastRanges(int p0) throws android.os.RemoteException { return false; }
        }
    }
}
