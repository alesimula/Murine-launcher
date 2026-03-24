package android.hardware.radio.voice;

public interface IRadioVoiceIndication extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "8c5e0d53dc67b5ed221b2da0570a17684d973a20";
    public static final java.lang.String DESCRIPTOR = null;
    public void callRing(int p0, boolean p1, android.hardware.radio.voice.CdmaSignalInfoRecord p2) throws android.os.RemoteException;
    public void callStateChanged(int p0) throws android.os.RemoteException;
    public void cdmaCallWaiting(int p0, android.hardware.radio.voice.CdmaCallWaiting p1) throws android.os.RemoteException;
    public void cdmaInfoRec(int p0, android.hardware.radio.voice.CdmaInformationRecord[] p1) throws android.os.RemoteException;
    public void cdmaOtaProvisionStatus(int p0, int p1) throws android.os.RemoteException;
    public void currentEmergencyNumberList(int p0, android.hardware.radio.voice.EmergencyNumber[] p1) throws android.os.RemoteException;
    public void enterEmergencyCallbackMode(int p0) throws android.os.RemoteException;
    public void exitEmergencyCallbackMode(int p0) throws android.os.RemoteException;
    public void indicateRingbackTone(int p0, boolean p1) throws android.os.RemoteException;
    public void onSupplementaryServiceIndication(int p0, android.hardware.radio.voice.StkCcUnsolSsResult p1) throws android.os.RemoteException;
    public void onUssd(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void resendIncallMute(int p0) throws android.os.RemoteException;
    public void srvccStateNotify(int p0, int p1) throws android.os.RemoteException;
    public void stkCallControlAlphaNotify(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void stkCallSetup(int p0, long p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.voice.IRadioVoiceIndication {
        public Default() {}
        public void callRing(int p0, boolean p1, android.hardware.radio.voice.CdmaSignalInfoRecord p2) throws android.os.RemoteException {}
        public void callStateChanged(int p0) throws android.os.RemoteException {}
        public void cdmaCallWaiting(int p0, android.hardware.radio.voice.CdmaCallWaiting p1) throws android.os.RemoteException {}
        public void cdmaInfoRec(int p0, android.hardware.radio.voice.CdmaInformationRecord[] p1) throws android.os.RemoteException {}
        public void cdmaOtaProvisionStatus(int p0, int p1) throws android.os.RemoteException {}
        public void currentEmergencyNumberList(int p0, android.hardware.radio.voice.EmergencyNumber[] p1) throws android.os.RemoteException {}
        public void enterEmergencyCallbackMode(int p0) throws android.os.RemoteException {}
        public void exitEmergencyCallbackMode(int p0) throws android.os.RemoteException {}
        public void indicateRingbackTone(int p0, boolean p1) throws android.os.RemoteException {}
        public void onSupplementaryServiceIndication(int p0, android.hardware.radio.voice.StkCcUnsolSsResult p1) throws android.os.RemoteException {}
        public void onUssd(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void resendIncallMute(int p0) throws android.os.RemoteException {}
        public void srvccStateNotify(int p0, int p1) throws android.os.RemoteException {}
        public void stkCallControlAlphaNotify(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void stkCallSetup(int p0, long p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.voice.IRadioVoiceIndication {
        static final int TRANSACTION_callRing = 1;
        static final int TRANSACTION_callStateChanged = 2;
        static final int TRANSACTION_cdmaCallWaiting = 3;
        static final int TRANSACTION_cdmaInfoRec = 4;
        static final int TRANSACTION_cdmaOtaProvisionStatus = 5;
        static final int TRANSACTION_currentEmergencyNumberList = 6;
        static final int TRANSACTION_enterEmergencyCallbackMode = 7;
        static final int TRANSACTION_exitEmergencyCallbackMode = 8;
        static final int TRANSACTION_indicateRingbackTone = 9;
        static final int TRANSACTION_onSupplementaryServiceIndication = 10;
        static final int TRANSACTION_onUssd = 11;
        static final int TRANSACTION_resendIncallMute = 12;
        static final int TRANSACTION_srvccStateNotify = 13;
        static final int TRANSACTION_stkCallControlAlphaNotify = 14;
        static final int TRANSACTION_stkCallSetup = 15;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.voice.IRadioVoiceIndication asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.voice.IRadioVoiceIndication {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void callRing(int p0, boolean p1, android.hardware.radio.voice.CdmaSignalInfoRecord p2) throws android.os.RemoteException {}
            public void callStateChanged(int p0) throws android.os.RemoteException {}
            public void cdmaCallWaiting(int p0, android.hardware.radio.voice.CdmaCallWaiting p1) throws android.os.RemoteException {}
            public void cdmaInfoRec(int p0, android.hardware.radio.voice.CdmaInformationRecord[] p1) throws android.os.RemoteException {}
            public void cdmaOtaProvisionStatus(int p0, int p1) throws android.os.RemoteException {}
            public void currentEmergencyNumberList(int p0, android.hardware.radio.voice.EmergencyNumber[] p1) throws android.os.RemoteException {}
            public void enterEmergencyCallbackMode(int p0) throws android.os.RemoteException {}
            public void exitEmergencyCallbackMode(int p0) throws android.os.RemoteException {}
            public void indicateRingbackTone(int p0, boolean p1) throws android.os.RemoteException {}
            public void onSupplementaryServiceIndication(int p0, android.hardware.radio.voice.StkCcUnsolSsResult p1) throws android.os.RemoteException {}
            public void onUssd(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void resendIncallMute(int p0) throws android.os.RemoteException {}
            public void srvccStateNotify(int p0, int p1) throws android.os.RemoteException {}
            public void stkCallControlAlphaNotify(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void stkCallSetup(int p0, long p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
