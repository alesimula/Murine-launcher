package com.android.internal.telephony.emergency;

public class EmergencyNumberTracker extends android.os.Handler {
    public static boolean DBG;
    public static final int ADD_EMERGENCY_NUMBER_TEST_MODE = 1;
    public static final int REMOVE_EMERGENCY_NUMBER_TEST_MODE = 2;
    public static final int RESET_EMERGENCY_NUMBER_TEST_MODE = 3;
    public boolean mIsCountrySetByAnotherSub;
    public static final int EVENT_UPDATE_OTA_EMERGENCY_NUMBER_DB = 5;
    public static final int EVENT_OVERRIDE_OTA_EMERGENCY_NUMBER_DB_FILE_PATH = 6;
    public EmergencyNumberTracker(com.android.internal.telephony.Phone p0, com.android.internal.telephony.CommandsInterface p1) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public boolean isSimAbsent() { return false; }
    public void updateEmergencyCountryIsoAllPhones(java.lang.String p0) {}
    public void updateEmergencyNumberDatabaseCountryChange(java.lang.String p0) {}
    public void updateOtaEmergencyNumberDatabase() {}
    public void updateOtaEmergencyNumberDbFilePath(android.os.ParcelFileDescriptor p0) {}
    public void resetOtaEmergencyNumberDbFilePath() {}
    public java.util.List<android.telephony.emergency.EmergencyNumber> getEmergencyNumberList() { return null; }
    public boolean isEmergencyNumber(java.lang.String p0) { return false; }
    public android.telephony.emergency.EmergencyNumber getEmergencyNumber(java.lang.String p0) { return null; }
    public int getEmergencyServiceCategories(java.lang.String p0) { return 0; }
    public int getEmergencyCallRouting(java.lang.String p0) { return 0; }
    public java.lang.String getEmergencyCountryIso() { return null; }
    public java.lang.String getLastKnownEmergencyCountryIso() { return null; }
    public int getEmergencyNumberDbVersion() { return 0; }
    public int getEmergencyNumberOtaDbVersion() { return 0; }
    public void executeEmergencyNumberTestModeCommand(int p0, android.telephony.emergency.EmergencyNumber p1) {}
    public java.util.List<android.telephony.emergency.EmergencyNumber> getEmergencyNumberListTestMode() { return null; }
    public java.util.List<android.telephony.emergency.EmergencyNumber> getRadioEmergencyNumberList() { return null; }
    public boolean shouldModemConfigEmergencyNumbersBeIgnored() { return false; }
    public boolean shouldEmergencyNumberRoutingFromDbBeIgnored() { return false; }
    public boolean shouldDeterminingOfUrnsAndCategoriesWhileMergingIgnored() { return false; }
    public com.android.internal.telephony.nano.PersistAtomsProto.EmergencyNumbersInfo[] getEmergencyNumbersProtoArray() { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
}
