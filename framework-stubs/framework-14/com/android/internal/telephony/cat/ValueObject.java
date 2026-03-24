package com.android.internal.telephony.cat;

abstract class ValueObject {
    ValueObject() {}
    abstract com.android.internal.telephony.cat.ComprehensionTlvTag getTag();
}
