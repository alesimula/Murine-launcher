package com.android.internal.telephony.metrics;

public class SmsStats {
    public SmsStats(com.android.internal.telephony.Phone p0) {}
    public void onDroppedIncomingMultipartSms(boolean p0, int p1, int p2) {}
    public void onIncomingSmsVoicemail(boolean p0, int p1) {}
    public void onIncomingSmsTypeZero(int p0) {}
    public void onIncomingSmsPP(int p0, boolean p1) {}
    public void onIncomingSmsSuccess(boolean p0, int p1, int p2, boolean p3, long p4) {}
    public void onIncomingSmsError(boolean p0, int p1, int p2) {}
    public void onIncomingSmsWapPush(int p0, int p1, int p2, long p3) {}
    public void onOutgoingSms(boolean p0, boolean p1, boolean p2, int p3, long p4, boolean p5, long p6) {}
    public void onOutgoingSms(boolean p0, boolean p1, boolean p2, int p3, int p4, long p5, boolean p6, long p7) {}
    public void onOutgoingShortCodeSms(int p0, int p1) {}
    static int getSmsHashCode(com.android.internal.telephony.nano.PersistAtomsProto.OutgoingSms p0) { return 0; }
    static int getSmsHashCode(com.android.internal.telephony.nano.PersistAtomsProto.IncomingSms p0) { return 0; }
}
