package com.android.internal.telephony;

public class VisualVoicemailSmsFilter {
    public VisualVoicemailSmsFilter() {}
    public static boolean filter(android.content.Context p0, byte[][] p1, java.lang.String p2, int p3, int p4) { return false; }
    public static void setPhoneAccountHandleConverterForTest(com.android.internal.telephony.VisualVoicemailSmsFilter.PhoneAccountHandleConverter p0) {}

    private static class FullMessage {
        public android.telephony.SmsMessage firstMessage;
        public java.lang.String fullMessageBody;
    }

    public static interface PhoneAccountHandleConverter {
        public android.telecom.PhoneAccountHandle fromSubId(int p0, android.content.Context p1);
    }
}
