package com.android.internal.telephony.cat;

class DeviceIdentities extends com.android.internal.telephony.cat.ValueObject {
    public int sourceId;
    public int destinationId;
    DeviceIdentities() { super(); }
    com.android.internal.telephony.cat.ComprehensionTlvTag getTag() { return null; }
}
