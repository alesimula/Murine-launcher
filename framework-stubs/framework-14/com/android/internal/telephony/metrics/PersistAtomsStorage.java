package com.android.internal.telephony.metrics;

public class PersistAtomsStorage {
    protected com.android.internal.telephony.nano.PersistAtomsProto.PersistAtoms mAtoms;
    protected boolean mSaveImmediately;
    public PersistAtomsStorage(android.content.Context p0) {}
    public synchronized void addVoiceCallSession(com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallSession p0) {}
    public synchronized void addVoiceCallRatUsage(com.android.internal.telephony.metrics.VoiceCallRatTracker p0) {}
    public synchronized void addIncomingSms(com.android.internal.telephony.nano.PersistAtomsProto.IncomingSms p0) {}
    public synchronized void addOutgoingSms(com.android.internal.telephony.nano.PersistAtomsProto.OutgoingSms p0) {}
    public synchronized void addCellularServiceStateAndCellularDataServiceSwitch(com.android.internal.telephony.nano.PersistAtomsProto.CellularServiceState p0, com.android.internal.telephony.nano.PersistAtomsProto.CellularDataServiceSwitch p1) {}
    public synchronized void addDataCallSession(com.android.internal.telephony.nano.PersistAtomsProto.DataCallSession p0) {}
    public synchronized boolean addCarrierIdMismatch(com.android.internal.telephony.nano.PersistAtomsProto.CarrierIdMismatch p0) { return false; }
    public synchronized void addImsRegistrationStats(com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationStats p0) {}
    public synchronized void addImsRegistrationTermination(com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationTermination p0) {}
    public synchronized boolean setCarrierIdTableVersion(int p0) { return false; }
    public synchronized void recordToggledAutoDataSwitch() {}
    public synchronized void addNetworkRequestsV2(com.android.internal.telephony.nano.PersistAtomsProto.NetworkRequestsV2 p0) {}
    public synchronized void addImsRegistrationFeatureTagStats(com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationFeatureTagStats p0) {}
    public synchronized void addRcsClientProvisioningStats(com.android.internal.telephony.nano.PersistAtomsProto.RcsClientProvisioningStats p0) {}
    public synchronized void addRcsAcsProvisioningStats(com.android.internal.telephony.nano.PersistAtomsProto.RcsAcsProvisioningStats p0) {}
    public synchronized void addSipDelegateStats(com.android.internal.telephony.nano.PersistAtomsProto.SipDelegateStats p0) {}
    public synchronized void addSipTransportFeatureTagStats(com.android.internal.telephony.nano.PersistAtomsProto.SipTransportFeatureTagStats p0) {}
    public synchronized void addSipMessageResponse(com.android.internal.telephony.nano.PersistAtomsProto.SipMessageResponse p0) {}
    public synchronized void addCompleteSipTransportSession(com.android.internal.telephony.nano.PersistAtomsProto.SipTransportSession p0) {}
    public synchronized void addImsDedicatedBearerListenerEvent(com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerListenerEvent p0) {}
    public synchronized void addImsDedicatedBearerEvent(com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerEvent p0) {}
    public synchronized void addImsRegistrationServiceDescStats(com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationServiceDescStats p0) {}
    public synchronized void addUceEventStats(com.android.internal.telephony.nano.PersistAtomsProto.UceEventStats p0) {}
    public synchronized void addPresenceNotifyEvent(com.android.internal.telephony.nano.PersistAtomsProto.PresenceNotifyEvent p0) {}
    public synchronized void addGbaEvent(com.android.internal.telephony.nano.PersistAtomsProto.GbaEvent p0) {}
    public synchronized void addUnmeteredNetworks(int p0, int p1, long p2) {}
    public synchronized void addOutgoingShortCodeSms(com.android.internal.telephony.nano.PersistAtomsProto.OutgoingShortCodeSms p0) {}
    public synchronized void addSatelliteControllerStats(com.android.internal.telephony.nano.PersistAtomsProto.SatelliteController p0) {}
    public synchronized void addSatelliteSessionStats(com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSession p0) {}
    public synchronized void addSatelliteIncomingDatagramStats(com.android.internal.telephony.nano.PersistAtomsProto.SatelliteIncomingDatagram p0) {}
    public synchronized void addSatelliteOutgoingDatagramStats(com.android.internal.telephony.nano.PersistAtomsProto.SatelliteOutgoingDatagram p0) {}
    public synchronized void addSatelliteProvisionStats(com.android.internal.telephony.nano.PersistAtomsProto.SatelliteProvision p0) {}
    public synchronized void addSatelliteSosMessageRecommenderStats(com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSosMessageRecommender p0) {}
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallSession[] getVoiceCallSessions(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallRatUsage[] getVoiceCallRatUsages(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.IncomingSms[] getIncomingSms(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.OutgoingSms[] getOutgoingSms(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.DataCallSession[] getDataCallSessions(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.CellularServiceState[] getCellularServiceStates(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.CellularDataServiceSwitch[] getCellularDataServiceSwitches(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationStats[] getImsRegistrationStats(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationTermination[] getImsRegistrationTerminations(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.NetworkRequestsV2[] getNetworkRequestsV2(long p0) { return null; }
    public synchronized int getAutoDataSwitchToggleCount() { return 0; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationFeatureTagStats[] getImsRegistrationFeatureTagStats(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.RcsClientProvisioningStats[] getRcsClientProvisioningStats(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.RcsAcsProvisioningStats[] getRcsAcsProvisioningStats(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.SipDelegateStats[] getSipDelegateStats(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.SipTransportFeatureTagStats[] getSipTransportFeatureTagStats(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.SipMessageResponse[] getSipMessageResponse(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.SipTransportSession[] getSipTransportSession(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerListenerEvent[] getImsDedicatedBearerListenerEvent(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerEvent[] getImsDedicatedBearerEvent(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationServiceDescStats[] getImsRegistrationServiceDescStats(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.UceEventStats[] getUceEventStats(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.PresenceNotifyEvent[] getPresenceNotifyEvent(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.GbaEvent[] getGbaEvent(long p0) { return null; }
    public synchronized long getUnmeteredNetworks(int p0, int p1) { return 0L; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.OutgoingShortCodeSms[] getOutgoingShortCodeSms(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.SatelliteController[] getSatelliteControllerStats(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSession[] getSatelliteSessionStats(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.SatelliteIncomingDatagram[] getSatelliteIncomingDatagramStats(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.SatelliteOutgoingDatagram[] getSatelliteOutgoingDatagramStats(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.SatelliteProvision[] getSatelliteProvisionStats(long p0) { return null; }
    public synchronized com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSosMessageRecommender[] getSatelliteSosMessageRecommenderStats(long p0) { return null; }
    public synchronized void flushAtoms() {}
    public synchronized void clearAtoms() {}
    protected long getWallTimeMillis() { return 0L; }
}
