package android.hardware.radio.messaging;

public interface IRadioMessagingResponse extends android.os.IInterface {
    public static final int VERSION = 3;
    public static final java.lang.String HASH = "30b0bc0e84679bc3b5ccb3a52da34c47cda6b7eb";
    public static final java.lang.String DESCRIPTOR = null;
    public void acknowledgeIncomingGsmSmsWithPduResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void acknowledgeLastIncomingCdmaSmsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void acknowledgeLastIncomingGsmSmsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void acknowledgeRequest(int p0) throws android.os.RemoteException;
    public void deleteSmsOnRuimResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void deleteSmsOnSimResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void getCdmaBroadcastConfigResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.CdmaBroadcastSmsConfigInfo[] p1) throws android.os.RemoteException;
    public void getGsmBroadcastConfigResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.GsmBroadcastSmsConfigInfo[] p1) throws android.os.RemoteException;
    public void getSmscAddressResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException;
    public void reportSmsMemoryStatusResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void sendCdmaSmsExpectMoreResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) throws android.os.RemoteException;
    public void sendCdmaSmsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) throws android.os.RemoteException;
    public void sendImsSmsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) throws android.os.RemoteException;
    public void sendSmsExpectMoreResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) throws android.os.RemoteException;
    public void sendSmsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) throws android.os.RemoteException;
    public void setCdmaBroadcastActivationResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setCdmaBroadcastConfigResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setGsmBroadcastActivationResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setGsmBroadcastConfigResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setSmscAddressResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void writeSmsToRuimResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void writeSmsToSimResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.messaging.IRadioMessagingResponse {
        public Default() {}
        public void acknowledgeIncomingGsmSmsWithPduResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void acknowledgeLastIncomingCdmaSmsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void acknowledgeLastIncomingGsmSmsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void acknowledgeRequest(int p0) throws android.os.RemoteException {}
        public void deleteSmsOnRuimResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void deleteSmsOnSimResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getCdmaBroadcastConfigResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.CdmaBroadcastSmsConfigInfo[] p1) throws android.os.RemoteException {}
        public void getGsmBroadcastConfigResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.GsmBroadcastSmsConfigInfo[] p1) throws android.os.RemoteException {}
        public void getSmscAddressResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException {}
        public void reportSmsMemoryStatusResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void sendCdmaSmsExpectMoreResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) throws android.os.RemoteException {}
        public void sendCdmaSmsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) throws android.os.RemoteException {}
        public void sendImsSmsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) throws android.os.RemoteException {}
        public void sendSmsExpectMoreResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) throws android.os.RemoteException {}
        public void sendSmsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) throws android.os.RemoteException {}
        public void setCdmaBroadcastActivationResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setCdmaBroadcastConfigResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setGsmBroadcastActivationResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setGsmBroadcastConfigResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setSmscAddressResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void writeSmsToRuimResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void writeSmsToSimResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.messaging.IRadioMessagingResponse {
        static final int TRANSACTION_acknowledgeIncomingGsmSmsWithPduResponse = 1;
        static final int TRANSACTION_acknowledgeLastIncomingCdmaSmsResponse = 2;
        static final int TRANSACTION_acknowledgeLastIncomingGsmSmsResponse = 3;
        static final int TRANSACTION_acknowledgeRequest = 4;
        static final int TRANSACTION_deleteSmsOnRuimResponse = 5;
        static final int TRANSACTION_deleteSmsOnSimResponse = 6;
        static final int TRANSACTION_getCdmaBroadcastConfigResponse = 7;
        static final int TRANSACTION_getGsmBroadcastConfigResponse = 8;
        static final int TRANSACTION_getSmscAddressResponse = 9;
        static final int TRANSACTION_reportSmsMemoryStatusResponse = 10;
        static final int TRANSACTION_sendCdmaSmsExpectMoreResponse = 11;
        static final int TRANSACTION_sendCdmaSmsResponse = 12;
        static final int TRANSACTION_sendImsSmsResponse = 13;
        static final int TRANSACTION_sendSmsExpectMoreResponse = 14;
        static final int TRANSACTION_sendSmsResponse = 15;
        static final int TRANSACTION_setCdmaBroadcastActivationResponse = 16;
        static final int TRANSACTION_setCdmaBroadcastConfigResponse = 17;
        static final int TRANSACTION_setGsmBroadcastActivationResponse = 18;
        static final int TRANSACTION_setGsmBroadcastConfigResponse = 19;
        static final int TRANSACTION_setSmscAddressResponse = 20;
        static final int TRANSACTION_writeSmsToRuimResponse = 21;
        static final int TRANSACTION_writeSmsToSimResponse = 22;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.messaging.IRadioMessagingResponse asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.messaging.IRadioMessagingResponse {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void acknowledgeIncomingGsmSmsWithPduResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void acknowledgeLastIncomingCdmaSmsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void acknowledgeLastIncomingGsmSmsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void acknowledgeRequest(int p0) throws android.os.RemoteException {}
            public void deleteSmsOnRuimResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void deleteSmsOnSimResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void getCdmaBroadcastConfigResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.CdmaBroadcastSmsConfigInfo[] p1) throws android.os.RemoteException {}
            public void getGsmBroadcastConfigResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.GsmBroadcastSmsConfigInfo[] p1) throws android.os.RemoteException {}
            public void getSmscAddressResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1) throws android.os.RemoteException {}
            public void reportSmsMemoryStatusResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void sendCdmaSmsExpectMoreResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) throws android.os.RemoteException {}
            public void sendCdmaSmsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) throws android.os.RemoteException {}
            public void sendImsSmsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) throws android.os.RemoteException {}
            public void sendSmsExpectMoreResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) throws android.os.RemoteException {}
            public void sendSmsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.messaging.SendSmsResult p1) throws android.os.RemoteException {}
            public void setCdmaBroadcastActivationResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setCdmaBroadcastConfigResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setGsmBroadcastActivationResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setGsmBroadcastConfigResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setSmscAddressResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void writeSmsToRuimResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void writeSmsToSimResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
