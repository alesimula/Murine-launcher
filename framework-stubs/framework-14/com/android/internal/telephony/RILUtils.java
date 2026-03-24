package com.android.internal.telephony;

public class RILUtils {
    public static final int CDMA_BSI_NO_OF_INTS_STRUCT = 3;
    public static final int CDMA_BROADCAST_SMS_NO_OF_SERVICE_CATEGORIES = 31;
    public static final java.lang.String RADIO_POWER_FAILURE_BUGREPORT_UUID = "316f3801-fa21-4954-a42f-0041eada3b31";
    public static final java.lang.String RADIO_POWER_FAILURE_RF_HARDWARE_ISSUE_UUID = "316f3801-fa21-4954-a42f-0041eada3b32";
    public static final java.lang.String RADIO_POWER_FAILURE_NO_RF_CALIBRATION_UUID = "316f3801-fa21-4954-a42f-0041eada3b33";
    public RILUtils() {}
    public static int convertToHalPersoType(com.android.internal.telephony.uicc.IccCardApplicationStatus.PersoSubState p0) { return 0; }
    public static int convertToHalPersoTypeAidl(com.android.internal.telephony.uicc.IccCardApplicationStatus.PersoSubState p0) { return 0; }
    public static android.hardware.radio.V1_0.GsmSmsMessage convertToHalGsmSmsMessage(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.hardware.radio.messaging.GsmSmsMessage convertToHalGsmSmsMessageAidl(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.hardware.radio.V1_0.CdmaSmsMessage convertToHalCdmaSmsMessage(byte[] p0) { return null; }
    public static android.hardware.radio.messaging.CdmaSmsMessage convertToHalCdmaSmsMessageAidl(byte[] p0) { return null; }
    public static com.android.internal.telephony.cdma.SmsMessage convertHalCdmaSmsMessage(android.hardware.radio.V1_0.CdmaSmsMessage p0) { return null; }
    public static com.android.internal.telephony.cdma.SmsMessage convertHalCdmaSmsMessage(android.hardware.radio.messaging.CdmaSmsMessage p0) { return null; }
    public static android.hardware.radio.V1_0.DataProfileInfo convertToHalDataProfile10(android.telephony.data.DataProfile p0) { return null; }
    public static android.hardware.radio.V1_4.DataProfileInfo convertToHalDataProfile14(android.telephony.data.DataProfile p0) { return null; }
    public static android.hardware.radio.V1_5.DataProfileInfo convertToHalDataProfile15(android.telephony.data.DataProfile p0) { return null; }
    public static android.hardware.radio.data.DataProfileInfo convertToHalDataProfile(android.telephony.data.DataProfile p0) { return null; }
    public static android.telephony.data.DataProfile convertToDataProfile(android.hardware.radio.data.DataProfileInfo p0) { return null; }
    public static android.hardware.radio.V1_6.OptionalSliceInfo convertToHalSliceInfo(android.telephony.data.NetworkSliceInfo p0) { return null; }
    public static android.hardware.radio.data.SliceInfo convertToHalSliceInfoAidl(android.telephony.data.NetworkSliceInfo p0) { return null; }
    public static android.hardware.radio.V1_6.OptionalTrafficDescriptor convertToHalTrafficDescriptor(android.telephony.data.TrafficDescriptor p0) { return null; }
    public static android.hardware.radio.data.TrafficDescriptor convertToHalTrafficDescriptorAidl(android.telephony.data.TrafficDescriptor p0) { return null; }
    public static int convertToHalResetNvType(int p0) { return 0; }
    public static int convertToHalResetNvTypeAidl(int p0) { return 0; }
    public static java.util.ArrayList<android.hardware.radio.V1_5.LinkAddress> convertToHalLinkProperties15(android.net.LinkProperties p0) { return null; }
    public static android.hardware.radio.data.LinkAddress[] convertToHalLinkProperties(android.net.LinkProperties p0) { return null; }
    public static android.telephony.RadioAccessSpecifier convertHalRadioAccessSpecifier(android.hardware.radio.V1_5.RadioAccessSpecifier p0) { return null; }
    public static android.telephony.RadioAccessSpecifier convertHalRadioAccessSpecifier(android.hardware.radio.network.RadioAccessSpecifier p0) { return null; }
    public static android.hardware.radio.V1_1.RadioAccessSpecifier convertToHalRadioAccessSpecifier11(android.telephony.RadioAccessSpecifier p0) { return null; }
    public static android.hardware.radio.V1_5.RadioAccessSpecifier convertToHalRadioAccessSpecifier15(android.telephony.RadioAccessSpecifier p0) { return null; }
    public static android.hardware.radio.network.RadioAccessSpecifier convertToHalRadioAccessSpecifierAidl(android.telephony.RadioAccessSpecifier p0) { return null; }
    public static java.lang.String convertToCensoredTerminalResponse(java.lang.String p0) { return null; }
    public static int convertHalNetworkTypeBitMask(int p0) { return 0; }
    public static int convertToHalRadioAccessFamily(int p0) { return 0; }
    public static int convertToHalRadioAccessFamilyAidl(int p0) { return 0; }
    public static int convertToHalAccessNetwork(int p0) { return 0; }
    public static int convertToHalAccessNetworkAidl(int p0) { return 0; }
    public static int convertToHalRadioAccessNetworks(int p0) { return 0; }
    public static int convertHalRadioAccessNetworks(int p0) { return 0; }
    public static android.hardware.radio.V1_0.SimApdu convertToHalSimApdu(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) { return null; }
    public static android.hardware.radio.sim.SimApdu convertToHalSimApduAidl(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6, boolean p7, com.android.internal.telephony.HalVersion p8) { return null; }
    public static int convertToHalSimLockMultiSimPolicy(int p0) { return 0; }
    public static int convertToHalSimLockMultiSimPolicyAidl(int p0) { return 0; }
    public static java.util.ArrayList<android.hardware.radio.V1_0.Carrier> convertToHalCarrierRestrictionList(java.util.List<android.service.carrier.CarrierIdentifier> p0) { return null; }
    public static android.hardware.radio.sim.Carrier[] convertToHalCarrierRestrictionListAidl(java.util.List<android.service.carrier.CarrierIdentifier> p0) { return null; }
    public static android.hardware.radio.V1_0.Dial convertToHalDial(java.lang.String p0, int p1, com.android.internal.telephony.UUSInfo p2) { return null; }
    public static android.hardware.radio.voice.Dial convertToHalDialAidl(java.lang.String p0, int p1, com.android.internal.telephony.UUSInfo p2) { return null; }
    public static android.hardware.radio.V1_5.SignalThresholdInfo convertToHalSignalThresholdInfo(android.telephony.SignalThresholdInfo p0) { return null; }
    public static android.hardware.radio.network.SignalThresholdInfo convertToHalSignalThresholdInfoAidl(android.telephony.SignalThresholdInfo p0) { return null; }
    public static int convertToHalSmsWriteArgsStatus(int p0) { return 0; }
    public static int convertToHalSmsWriteArgsStatusAidl(int p0) { return 0; }
    public static java.util.ArrayList<com.android.internal.telephony.HardwareConfig> convertHalHardwareConfigList(java.util.ArrayList<android.hardware.radio.V1_0.HardwareConfig> p0) { return null; }
    public static java.util.ArrayList<com.android.internal.telephony.HardwareConfig> convertHalHardwareConfigList(android.hardware.radio.modem.HardwareConfig[] p0) { return null; }
    public static com.android.internal.telephony.RadioCapability convertHalRadioCapability(android.hardware.radio.V1_0.RadioCapability p0, com.android.internal.telephony.RIL p1) { return null; }
    public static com.android.internal.telephony.RadioCapability convertHalRadioCapability(android.hardware.radio.modem.RadioCapability p0, com.android.internal.telephony.RIL p1) { return null; }
    public static java.util.List<android.telephony.LinkCapacityEstimate> convertHalLceData(java.lang.Object p0) { return null; }
    public static java.util.List<android.telephony.LinkCapacityEstimate> convertHalLceData(android.hardware.radio.network.LceDataInfo p0) { return null; }
    public static java.util.List<android.telephony.LinkCapacityEstimate> convertHalLceData(android.hardware.radio.network.LinkCapacityEstimate p0) { return null; }
    public static java.util.ArrayList<android.telephony.CellInfo> convertHalCellInfoList(java.util.ArrayList<java.lang.Object> p0) { return null; }
    public static java.util.ArrayList<android.telephony.CellInfo> convertHalCellInfoList(android.hardware.radio.network.CellInfo[] p0) { return null; }
    public static android.telephony.CellIdentity convertHalCellIdentity(java.lang.Object p0) { return null; }
    public static android.telephony.CellIdentity convertHalCellIdentity(android.hardware.radio.network.CellIdentity p0) { return null; }
    public static android.telephony.CellIdentityGsm convertHalCellIdentityGsm(java.lang.Object p0) { return null; }
    public static android.telephony.CellIdentityGsm convertHalCellIdentityGsm(android.hardware.radio.network.CellIdentityGsm p0) { return null; }
    public static android.telephony.CellIdentityCdma convertHalCellIdentityCdma(java.lang.Object p0) { return null; }
    public static android.telephony.CellIdentityCdma convertHalCellIdentityCdma(android.hardware.radio.network.CellIdentityCdma p0) { return null; }
    public static android.telephony.CellIdentityLte convertHalCellIdentityLte(java.lang.Object p0) { return null; }
    public static android.telephony.CellIdentityLte convertHalCellIdentityLte(android.hardware.radio.network.CellIdentityLte p0) { return null; }
    public static android.telephony.CellIdentityWcdma convertHalCellIdentityWcdma(java.lang.Object p0) { return null; }
    public static android.telephony.CellIdentityWcdma convertHalCellIdentityWcdma(android.hardware.radio.network.CellIdentityWcdma p0) { return null; }
    public static android.telephony.CellIdentityTdscdma convertHalCellIdentityTdscdma(java.lang.Object p0) { return null; }
    public static android.telephony.CellIdentityTdscdma convertHalCellIdentityTdscdma(android.hardware.radio.network.CellIdentityTdscdma p0) { return null; }
    public static android.telephony.CellIdentityNr convertHalCellIdentityNr(java.lang.Object p0) { return null; }
    public static android.telephony.CellIdentityNr convertHalCellIdentityNr(android.hardware.radio.network.CellIdentityNr p0) { return null; }
    public static android.telephony.SignalStrength convertHalSignalStrength(java.lang.Object p0) { return null; }
    public static android.telephony.SignalStrength convertHalSignalStrength(android.hardware.radio.network.SignalStrength p0) { return null; }
    public static android.telephony.CellSignalStrengthGsm convertHalGsmSignalStrength(android.hardware.radio.V1_0.GsmSignalStrength p0) { return null; }
    public static android.telephony.CellSignalStrengthGsm convertHalGsmSignalStrength(android.hardware.radio.network.GsmSignalStrength p0) { return null; }
    public static android.telephony.CellSignalStrengthCdma convertHalCdmaSignalStrength(android.hardware.radio.V1_0.CdmaSignalStrength p0, android.hardware.radio.V1_0.EvdoSignalStrength p1) { return null; }
    public static android.telephony.CellSignalStrengthCdma convertHalCdmaSignalStrength(android.hardware.radio.network.CdmaSignalStrength p0, android.hardware.radio.network.EvdoSignalStrength p1) { return null; }
    public static android.telephony.CellSignalStrengthLte convertHalLteSignalStrength(java.lang.Object p0) { return null; }
    public static android.telephony.CellSignalStrengthLte convertHalLteSignalStrength(android.hardware.radio.network.LteSignalStrength p0) { return null; }
    public static android.telephony.CellSignalStrengthWcdma convertHalWcdmaSignalStrength(java.lang.Object p0) { return null; }
    public static android.telephony.CellSignalStrengthWcdma convertHalWcdmaSignalStrength(android.hardware.radio.network.WcdmaSignalStrength p0) { return null; }
    public static android.telephony.CellSignalStrengthTdscdma convertHalTdscdmaSignalStrength(java.lang.Object p0) { return null; }
    public static android.telephony.CellSignalStrengthTdscdma convertHalTdscdmaSignalStrength(android.hardware.radio.network.TdscdmaSignalStrength p0) { return null; }
    public static android.telephony.CellSignalStrengthNr convertHalNrSignalStrength(java.lang.Object p0) { return null; }
    public static android.telephony.CellSignalStrengthNr convertHalNrSignalStrength(android.hardware.radio.network.NrSignalStrength p0) { return null; }
    public static android.util.SparseArray<android.telephony.BarringInfo.BarringServiceInfo> convertHalBarringInfoList(java.util.List<android.hardware.radio.V1_5.BarringInfo> p0) { return null; }
    public static android.util.SparseArray<android.telephony.BarringInfo.BarringServiceInfo> convertHalBarringInfoList(android.hardware.radio.network.BarringInfo[] p0) { return null; }
    public static android.telephony.data.DataCallResponse convertHalDataCallResult(java.lang.Object p0) { return null; }
    public static android.telephony.data.DataCallResponse convertHalDataCallResult(android.hardware.radio.data.SetupDataCallResult p0) { return null; }
    public static android.telephony.data.NetworkSlicingConfig convertHalSlicingConfig(android.hardware.radio.V1_6.SlicingConfig p0) { return null; }
    public static android.telephony.data.NetworkSlicingConfig convertHalSlicingConfig(android.hardware.radio.data.SlicingConfig p0) { return null; }
    public static java.util.ArrayList<android.telephony.data.DataCallResponse> convertHalDataCallResultList(java.util.List<? extends java.lang.Object> p0) { return null; }
    public static java.util.ArrayList<android.telephony.data.DataCallResponse> convertHalDataCallResultList(android.hardware.radio.data.SetupDataCallResult[] p0) { return null; }
    @com.android.internal.telephony.data.KeepaliveStatus.KeepaliveStatusCode
    public static int convertHalKeepaliveStatusCode(int p0) { return 0; }
    public static int convertHalRadioState(int p0) { return 0; }
    public static int convertHalCellConnectionStatus(int p0) { return 0; }
    public static com.android.internal.telephony.DriverCall convertToDriverCall(java.lang.Object p0) { return null; }
    public static com.android.internal.telephony.DriverCall convertToDriverCall(android.hardware.radio.voice.Call p0) { return null; }
    public static java.lang.String convertHalOperatorStatus(int p0) { return null; }
    public static java.util.List<android.service.carrier.CarrierIdentifier> convertHalCarrierList(java.util.List<android.hardware.radio.V1_0.Carrier> p0) { return null; }
    public static java.util.List<android.service.carrier.CarrierIdentifier> convertHalCarrierList(android.hardware.radio.sim.Carrier[] p0) { return null; }
    public static com.android.internal.telephony.uicc.IccCardStatus convertHalCardStatus(java.lang.Object p0) { return null; }
    public static com.android.internal.telephony.uicc.IccCardStatus convertHalCardStatus(android.hardware.radio.sim.CardStatus p0) { return null; }
    public static com.android.internal.telephony.uicc.AdnCapacity convertHalPhonebookCapacity(android.hardware.radio.V1_6.PhonebookCapacity p0) { return null; }
    public static com.android.internal.telephony.uicc.AdnCapacity convertHalPhonebookCapacity(android.hardware.radio.sim.PhonebookCapacity p0) { return null; }
    public static com.android.internal.telephony.uicc.SimPhonebookRecord convertHalPhonebookRecordInfo(android.hardware.radio.V1_6.PhonebookRecordInfo p0) { return null; }
    public static com.android.internal.telephony.uicc.SimPhonebookRecord convertHalPhonebookRecordInfo(android.hardware.radio.sim.PhonebookRecordInfo p0) { return null; }
    public static android.hardware.radio.V1_6.PhonebookRecordInfo convertToHalPhonebookRecordInfo(com.android.internal.telephony.uicc.SimPhonebookRecord p0) { return null; }
    public static android.hardware.radio.sim.PhonebookRecordInfo convertToHalPhonebookRecordInfoAidl(com.android.internal.telephony.uicc.SimPhonebookRecord p0) { return null; }
    public static java.util.ArrayList<com.android.internal.telephony.uicc.IccSlotStatus> convertHalSlotStatus(java.lang.Object p0) { return null; }
    public static android.hardware.radio.config.SlotPortMapping[] convertSimSlotsMapping(java.util.List<android.telephony.UiccSlotMapping> p0) { return null; }
    public static java.util.ArrayList<java.lang.Integer> convertSlotMappingToList(java.util.List<android.telephony.UiccSlotMapping> p0) { return null; }
    public static android.telephony.PhoneCapability convertHalPhoneCapability(int[] p0, java.lang.Object p1) { return null; }
    public static int convertEmergencyScanType(int p0) { return 0; }
    public static android.hardware.radio.network.EmergencyNetworkScanTrigger convertEmergencyNetworkScanTrigger(int[] p0, int p1) { return null; }
    public static android.telephony.EmergencyRegResult convertHalEmergencyRegResult(android.hardware.radio.network.EmergencyRegResult p0) { return null; }
    public static int convertHalRegState(int p0) { return 0; }
    public static java.lang.String accessNetworkTypesToString(int[] p0) { return null; }
    public static java.lang.String scanTypeToString(int p0) { return null; }
    public static int convertHalDeregistrationReason(int p0) { return 0; }
    public static int convertImsTrafficType(int p0) { return 0; }
    public static int convertImsTrafficDirection(int p0) { return 0; }
    public static int convertHalConnectionFailureReason(int p0) { return 0; }
    public static void appendPrimitiveArrayToArrayList(byte[] p0, java.util.ArrayList<java.lang.Byte> p1) {}
    public static java.util.ArrayList<java.lang.Byte> primitiveArrayToArrayList(byte[] p0) { return null; }
    public static java.util.ArrayList<java.lang.Integer> primitiveArrayToArrayList(int[] p0) { return null; }
    public static java.util.ArrayList<java.lang.String> primitiveArrayToArrayList(java.lang.String[] p0) { return null; }
    public static byte[] arrayListToPrimitiveArray(java.util.ArrayList<java.lang.Byte> p0) { return null; }
    public static java.lang.String convertNullToEmptyString(java.lang.String p0) { return null; }
    public static java.lang.String setupDataReasonToString(int p0) { return null; }
    public static java.lang.String deactivateDataReasonToString(int p0) { return null; }
    public static java.lang.String requestToString(int p0) { return null; }
    public static java.lang.String responseToString(int p0) { return null; }
    public static java.util.Set<java.lang.String> getCaps(com.android.internal.telephony.HalVersion p0, boolean p1) { return null; }
    public static java.lang.String convertToString(java.lang.Object p0) { return null; }
    public static android.hardware.radio.ims.SrvccCall[] convertToHalSrvccCall(com.android.internal.telephony.SrvccConnection[] p0) { return null; }
    public static int convertSrvccCallType(int p0) { return 0; }
    public static int convertCallState(com.android.internal.telephony.Call.State p0) { return 0; }
    public static int convertSrvccCallSubState(int p0) { return 0; }
    public static int convertSrvccCallRingbackToneType(int p0) { return 0; }
    public static int convertPresentation(int p0) { return 0; }
    public static int convertImsRegistrationState(int p0) { return 0; }
    public static int convertImsRegistrationTech(int p0) { return 0; }
    public static int convertImsCapability(int p0) { return 0; }
    public static android.hardware.radio.ims.ImsCall[] convertImsCallInfo(java.util.List<com.android.internal.telephony.imsphone.ImsCallInfo> p0) { return null; }
    public static int convertToSatelliteError(com.android.internal.telephony.CommandException.Error p0) { return 0; }
}
