package com.android.internal.telephony.cat;

class SendSMSParams extends com.android.internal.telephony.cat.CommandParams {
    com.android.internal.telephony.cat.TextMessage mTextSmsMsg;
    com.android.internal.telephony.cat.TextMessage mDestAddress;
    com.android.internal.telephony.cat.DisplayTextParams mDisplayText;
    SendSMSParams(com.android.internal.telephony.cat.CommandDetails p0, com.android.internal.telephony.cat.TextMessage p1, com.android.internal.telephony.cat.TextMessage p2, com.android.internal.telephony.cat.DisplayTextParams p3) { super(null); }
}
