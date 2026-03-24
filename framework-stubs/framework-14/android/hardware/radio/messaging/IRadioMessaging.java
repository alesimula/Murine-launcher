package android.hardware.radio.messaging;

public interface IRadioMessaging extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "50aefda34c9dd40090c8d5925e71d5b84530c3d0";
    public static final java.lang.String DESCRIPTOR = null;
    public void acknowledgeIncomingGsmSmsWithPdu(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public void acknowledgeLastIncomingCdmaSms(int p0, android.hardware.radio.messaging.CdmaSmsAck p1) throws android.os.RemoteException;
    public void acknowledgeLastIncomingGsmSms(int p0, boolean p1, int p2) throws android.os.RemoteException;
    public void deleteSmsOnRuim(int p0, int p1) throws android.os.RemoteException;
    public void deleteSmsOnSim(int p0, int p1) throws android.os.RemoteException;
    public void getCdmaBroadcastConfig(int p0) throws android.os.RemoteException;
    public void getGsmBroadcastConfig(int p0) throws android.os.RemoteException;
    public void getSmscAddress(int p0) throws android.os.RemoteException;
    public void reportSmsMemoryStatus(int p0, boolean p1) throws android.os.RemoteException;
    public void responseAcknowledgement() throws android.os.RemoteException;
    public void sendCdmaSms(int p0, android.hardware.radio.messaging.CdmaSmsMessage p1) throws android.os.RemoteException;
    public void sendCdmaSmsExpectMore(int p0, android.hardware.radio.messaging.CdmaSmsMessage p1) throws android.os.RemoteException;
    public void sendImsSms(int p0, android.hardware.radio.messaging.ImsSmsMessage p1) throws android.os.RemoteException;
    public void sendSms(int p0, android.hardware.radio.messaging.GsmSmsMessage p1) throws android.os.RemoteException;
    public void sendSmsExpectMore(int p0, android.hardware.radio.messaging.GsmSmsMessage p1) throws android.os.RemoteException;
    public void setCdmaBroadcastActivation(int p0, boolean p1) throws android.os.RemoteException;
    public void setCdmaBroadcastConfig(int p0, android.hardware.radio.messaging.CdmaBroadcastSmsConfigInfo[] p1) throws android.os.RemoteException;
    public void setGsmBroadcastActivation(int p0, boolean p1) throws android.os.RemoteException;
    public void setGsmBroadcastConfig(int p0, android.hardware.radio.messaging.GsmBroadcastSmsConfigInfo[] p1) throws android.os.RemoteException;
    public void setResponseFunctions(android.hardware.radio.messaging.IRadioMessagingResponse p0, android.hardware.radio.messaging.IRadioMessagingIndication p1) throws android.os.RemoteException;
    public void setSmscAddress(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void writeSmsToRuim(int p0, android.hardware.radio.messaging.CdmaSmsWriteArgs p1) throws android.os.RemoteException;
    public void writeSmsToSim(int p0, android.hardware.radio.messaging.SmsWriteArgs p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.messaging.IRadioMessaging {
        public Default() {}
        public void acknowledgeIncomingGsmSmsWithPdu(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
        public void acknowledgeLastIncomingCdmaSms(int p0, android.hardware.radio.messaging.CdmaSmsAck p1) throws android.os.RemoteException {}
        public void acknowledgeLastIncomingGsmSms(int p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void deleteSmsOnRuim(int p0, int p1) throws android.os.RemoteException {}
        public void deleteSmsOnSim(int p0, int p1) throws android.os.RemoteException {}
        public void getCdmaBroadcastConfig(int p0) throws android.os.RemoteException {}
        public void getGsmBroadcastConfig(int p0) throws android.os.RemoteException {}
        public void getSmscAddress(int p0) throws android.os.RemoteException {}
        public void reportSmsMemoryStatus(int p0, boolean p1) throws android.os.RemoteException {}
        public void responseAcknowledgement() throws android.os.RemoteException {}
        public void sendCdmaSms(int p0, android.hardware.radio.messaging.CdmaSmsMessage p1) throws android.os.RemoteException {}
        public void sendCdmaSmsExpectMore(int p0, android.hardware.radio.messaging.CdmaSmsMessage p1) throws android.os.RemoteException {}
        public void sendImsSms(int p0, android.hardware.radio.messaging.ImsSmsMessage p1) throws android.os.RemoteException {}
        public void sendSms(int p0, android.hardware.radio.messaging.GsmSmsMessage p1) throws android.os.RemoteException {}
        public void sendSmsExpectMore(int p0, android.hardware.radio.messaging.GsmSmsMessage p1) throws android.os.RemoteException {}
        public void setCdmaBroadcastActivation(int p0, boolean p1) throws android.os.RemoteException {}
        public void setCdmaBroadcastConfig(int p0, android.hardware.radio.messaging.CdmaBroadcastSmsConfigInfo[] p1) throws android.os.RemoteException {}
        public void setGsmBroadcastActivation(int p0, boolean p1) throws android.os.RemoteException {}
        public void setGsmBroadcastConfig(int p0, android.hardware.radio.messaging.GsmBroadcastSmsConfigInfo[] p1) throws android.os.RemoteException {}
        public void setResponseFunctions(android.hardware.radio.messaging.IRadioMessagingResponse p0, android.hardware.radio.messaging.IRadioMessagingIndication p1) throws android.os.RemoteException {}
        public void setSmscAddress(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void writeSmsToRuim(int p0, android.hardware.radio.messaging.CdmaSmsWriteArgs p1) throws android.os.RemoteException {}
        public void writeSmsToSim(int p0, android.hardware.radio.messaging.SmsWriteArgs p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.messaging.IRadioMessaging {
        static final int TRANSACTION_acknowledgeIncomingGsmSmsWithPdu = 1;
        static final int TRANSACTION_acknowledgeLastIncomingCdmaSms = 2;
        static final int TRANSACTION_acknowledgeLastIncomingGsmSms = 3;
        static final int TRANSACTION_deleteSmsOnRuim = 4;
        static final int TRANSACTION_deleteSmsOnSim = 5;
        static final int TRANSACTION_getCdmaBroadcastConfig = 6;
        static final int TRANSACTION_getGsmBroadcastConfig = 7;
        static final int TRANSACTION_getSmscAddress = 8;
        static final int TRANSACTION_reportSmsMemoryStatus = 9;
        static final int TRANSACTION_responseAcknowledgement = 10;
        static final int TRANSACTION_sendCdmaSms = 11;
        static final int TRANSACTION_sendCdmaSmsExpectMore = 12;
        static final int TRANSACTION_sendImsSms = 13;
        static final int TRANSACTION_sendSms = 14;
        static final int TRANSACTION_sendSmsExpectMore = 15;
        static final int TRANSACTION_setCdmaBroadcastActivation = 16;
        static final int TRANSACTION_setCdmaBroadcastConfig = 17;
        static final int TRANSACTION_setGsmBroadcastActivation = 18;
        static final int TRANSACTION_setGsmBroadcastConfig = 19;
        static final int TRANSACTION_setResponseFunctions = 20;
        static final int TRANSACTION_setSmscAddress = 21;
        static final int TRANSACTION_writeSmsToRuim = 22;
        static final int TRANSACTION_writeSmsToSim = 23;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.messaging.IRadioMessaging asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.messaging.IRadioMessaging {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void acknowledgeIncomingGsmSmsWithPdu(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
            public void acknowledgeLastIncomingCdmaSms(int p0, android.hardware.radio.messaging.CdmaSmsAck p1) throws android.os.RemoteException {}
            public void acknowledgeLastIncomingGsmSms(int p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void deleteSmsOnRuim(int p0, int p1) throws android.os.RemoteException {}
            public void deleteSmsOnSim(int p0, int p1) throws android.os.RemoteException {}
            public void getCdmaBroadcastConfig(int p0) throws android.os.RemoteException {}
            public void getGsmBroadcastConfig(int p0) throws android.os.RemoteException {}
            public void getSmscAddress(int p0) throws android.os.RemoteException {}
            public void reportSmsMemoryStatus(int p0, boolean p1) throws android.os.RemoteException {}
            public void responseAcknowledgement() throws android.os.RemoteException {}
            public void sendCdmaSms(int p0, android.hardware.radio.messaging.CdmaSmsMessage p1) throws android.os.RemoteException {}
            public void sendCdmaSmsExpectMore(int p0, android.hardware.radio.messaging.CdmaSmsMessage p1) throws android.os.RemoteException {}
            public void sendImsSms(int p0, android.hardware.radio.messaging.ImsSmsMessage p1) throws android.os.RemoteException {}
            public void sendSms(int p0, android.hardware.radio.messaging.GsmSmsMessage p1) throws android.os.RemoteException {}
            public void sendSmsExpectMore(int p0, android.hardware.radio.messaging.GsmSmsMessage p1) throws android.os.RemoteException {}
            public void setCdmaBroadcastActivation(int p0, boolean p1) throws android.os.RemoteException {}
            public void setCdmaBroadcastConfig(int p0, android.hardware.radio.messaging.CdmaBroadcastSmsConfigInfo[] p1) throws android.os.RemoteException {}
            public void setGsmBroadcastActivation(int p0, boolean p1) throws android.os.RemoteException {}
            public void setGsmBroadcastConfig(int p0, android.hardware.radio.messaging.GsmBroadcastSmsConfigInfo[] p1) throws android.os.RemoteException {}
            public void setResponseFunctions(android.hardware.radio.messaging.IRadioMessagingResponse p0, android.hardware.radio.messaging.IRadioMessagingIndication p1) throws android.os.RemoteException {}
            public void setSmscAddress(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void writeSmsToRuim(int p0, android.hardware.radio.messaging.CdmaSmsWriteArgs p1) throws android.os.RemoteException {}
            public void writeSmsToSim(int p0, android.hardware.radio.messaging.SmsWriteArgs p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
