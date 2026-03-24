package com.android.internal.telephony.uicc;

public class CarrierTestOverride {
    static final java.lang.String LOG_TAG = "CarrierTestOverride";
    static final java.lang.String DATA_CARRIER_TEST_OVERRIDE_PATH = "/user_de/0/com.android.phone/files/carrier_test_conf_sim";
    static final java.lang.String CARRIER_TEST_XML_HEADER = "carrierTestOverrides";
    static final java.lang.String CARRIER_TEST_XML_SUBHEADER = "carrierTestOverride";
    static final java.lang.String CARRIER_TEST_XML_ITEM_KEY = "key";
    static final java.lang.String CARRIER_TEST_XML_ITEM_VALUE = "value";
    static final java.lang.String CARRIER_TEST_XML_ITEM_KEY_STRING_ISINTESTMODE = "isInTestMode";
    static final java.lang.String CARRIER_TEST_XML_ITEM_KEY_STRING_MCCMNC = "mccmnc";
    static final java.lang.String CARRIER_TEST_XML_ITEM_KEY_STRING_GID1 = "gid1";
    static final java.lang.String CARRIER_TEST_XML_ITEM_KEY_STRING_GID2 = "gid2";
    static final java.lang.String CARRIER_TEST_XML_ITEM_KEY_STRING_IMSI = "imsi";
    static final java.lang.String CARRIER_TEST_XML_ITEM_KEY_STRING_SPN = "spn";
    static final java.lang.String CARRIER_TEST_XML_ITEM_KEY_STRING_PNN = "pnn";
    static final java.lang.String CARRIER_TEST_XML_ITEM_KEY_STRING_ICCID = "iccid";
    CarrierTestOverride(int p0) {}
    boolean isInTestMode() { return false; }
    java.lang.String getFakeSpn() { return null; }
    java.lang.String getFakeIMSI() { return null; }
    java.lang.String getFakeGid1() { return null; }
    java.lang.String getFakeGid2() { return null; }
    java.lang.String getFakePnnHomeName() { return null; }
    java.lang.String getFakeIccid() { return null; }
    java.lang.String getFakeMccMnc() { return null; }
    void override(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) {}
}
