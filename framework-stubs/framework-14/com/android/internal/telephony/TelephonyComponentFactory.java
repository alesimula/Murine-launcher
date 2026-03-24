package com.android.internal.telephony;

public class TelephonyComponentFactory {
    public TelephonyComponentFactory() {}
    public static com.android.internal.telephony.TelephonyComponentFactory getInstance() { return null; }
    public void injectTheComponentFactory(android.content.res.XmlResourceParser p0) {}
    public com.android.internal.telephony.TelephonyComponentFactory inject(java.lang.String p0) { return null; }
    public com.android.internal.telephony.GsmCdmaCallTracker makeGsmCdmaCallTracker(com.android.internal.telephony.GsmCdmaPhone p0) { return null; }
    public com.android.internal.telephony.SmsStorageMonitor makeSmsStorageMonitor(com.android.internal.telephony.Phone p0) { return null; }
    public com.android.internal.telephony.SmsUsageMonitor makeSmsUsageMonitor(android.content.Context p0) { return null; }
    public com.android.internal.telephony.ServiceStateTracker makeServiceStateTracker(com.android.internal.telephony.GsmCdmaPhone p0, com.android.internal.telephony.CommandsInterface p1) { return null; }
    public com.android.internal.telephony.emergency.EmergencyNumberTracker makeEmergencyNumberTracker(com.android.internal.telephony.Phone p0, com.android.internal.telephony.CommandsInterface p1) { return null; }
    public com.android.internal.telephony.NitzStateMachine makeNitzStateMachine(com.android.internal.telephony.GsmCdmaPhone p0) { return null; }
    public com.android.internal.telephony.SimActivationTracker makeSimActivationTracker(com.android.internal.telephony.Phone p0) { return null; }
    public com.android.internal.telephony.CarrierSignalAgent makeCarrierSignalAgent(com.android.internal.telephony.Phone p0) { return null; }
    public com.android.internal.telephony.CarrierActionAgent makeCarrierActionAgent(com.android.internal.telephony.Phone p0) { return null; }
    public com.android.internal.telephony.CarrierResolver makeCarrierResolver(com.android.internal.telephony.Phone p0) { return null; }
    public com.android.internal.telephony.IccPhoneBookInterfaceManager makeIccPhoneBookInterfaceManager(com.android.internal.telephony.Phone p0) { return null; }
    public com.android.internal.telephony.IccSmsInterfaceManager makeIccSmsInterfaceManager(com.android.internal.telephony.Phone p0) { return null; }
    public com.android.internal.telephony.uicc.UiccProfile makeUiccProfile(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, com.android.internal.telephony.uicc.IccCardStatus p2, int p3, com.android.internal.telephony.uicc.UiccCard p4, java.lang.Object p5) { return null; }
    public com.android.internal.telephony.cdma.EriManager makeEriManager(com.android.internal.telephony.Phone p0, int p1) { return null; }
    public com.android.internal.telephony.WspTypeDecoder makeWspTypeDecoder(byte[] p0) { return null; }
    public com.android.internal.telephony.InboundSmsTracker makeInboundSmsTracker(android.content.Context p0, byte[] p1, long p2, int p3, boolean p4, boolean p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, boolean p9, int p10, int p11) { return null; }
    public com.android.internal.telephony.InboundSmsTracker makeInboundSmsTracker(android.content.Context p0, byte[] p1, long p2, int p3, boolean p4, java.lang.String p5, java.lang.String p6, int p7, int p8, int p9, boolean p10, java.lang.String p11, boolean p12, int p13, int p14) { return null; }
    public com.android.internal.telephony.InboundSmsTracker makeInboundSmsTracker(android.content.Context p0, android.database.Cursor p1, boolean p2) { return null; }
    public com.android.internal.telephony.imsphone.ImsPhoneCallTracker makeImsPhoneCallTracker(com.android.internal.telephony.imsphone.ImsPhone p0) { return null; }
    public com.android.internal.telephony.imsphone.ImsExternalCallTracker makeImsExternalCallTracker(com.android.internal.telephony.imsphone.ImsPhone p0) { return null; }
    public com.android.internal.telephony.imsphone.ImsNrSaModeHandler makeImsNrSaModeHandler(com.android.internal.telephony.imsphone.ImsPhone p0) { return null; }
    public com.android.internal.telephony.AppSmsManager makeAppSmsManager(android.content.Context p0) { return null; }
    public com.android.internal.telephony.DeviceStateMonitor makeDeviceStateMonitor(com.android.internal.telephony.Phone p0) { return null; }
    public com.android.internal.telephony.data.AccessNetworksManager makeAccessNetworksManager(com.android.internal.telephony.Phone p0, android.os.Looper p1) { return null; }
    public com.android.internal.telephony.cdma.CdmaSubscriptionSourceManager getCdmaSubscriptionSourceManagerInstance(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, android.os.Handler p2, int p3, java.lang.Object p4) { return null; }
    public com.android.internal.telephony.LocaleTracker makeLocaleTracker(com.android.internal.telephony.Phone p0, com.android.internal.telephony.NitzStateMachine p1, android.os.Looper p2) { return null; }
    public com.android.internal.telephony.Phone makePhone(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, com.android.internal.telephony.PhoneNotifier p2, int p3, int p4, com.android.internal.telephony.TelephonyComponentFactory p5) { return null; }
    public com.android.internal.telephony.data.PhoneSwitcher makePhoneSwitcher(int p0, android.content.Context p1, android.os.Looper p2) { return null; }
    public com.android.internal.telephony.DisplayInfoController makeDisplayInfoController(com.android.internal.telephony.Phone p0) { return null; }
    public com.android.internal.telephony.MultiSimSettingController initMultiSimSettingController(android.content.Context p0) { return null; }
    public com.android.internal.telephony.SignalStrengthController makeSignalStrengthController(com.android.internal.telephony.GsmCdmaPhone p0) { return null; }
    public com.android.internal.telephony.data.LinkBandwidthEstimator makeLinkBandwidthEstimator(com.android.internal.telephony.Phone p0) { return null; }
    public com.android.internal.telephony.data.DataNetworkController makeDataNetworkController(com.android.internal.telephony.Phone p0, android.os.Looper p1) { return null; }
    public com.android.internal.telephony.data.DataProfileManager makeDataProfileManager(com.android.internal.telephony.Phone p0, com.android.internal.telephony.data.DataNetworkController p1, com.android.internal.telephony.data.DataServiceManager p2, android.os.Looper p3, com.android.internal.telephony.data.DataProfileManager.DataProfileManagerCallback p4) { return null; }
    public com.android.internal.telephony.data.DataSettingsManager makeDataSettingsManager(com.android.internal.telephony.Phone p0, com.android.internal.telephony.data.DataNetworkController p1, android.os.Looper p2, com.android.internal.telephony.data.DataSettingsManager.DataSettingsManagerCallback p3) { return null; }

    private static class InjectedComponents {
    }
}
