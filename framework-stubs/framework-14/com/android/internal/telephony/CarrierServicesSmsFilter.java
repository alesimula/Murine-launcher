package com.android.internal.telephony;

public class CarrierServicesSmsFilter {
    protected static final boolean DBG = true;
    public static final int EVENT_ON_FILTER_COMPLETE_NOT_CALLED = 1;
    public static final int FILTER_COMPLETE_TIMEOUT_MS = 600000;
    public CarrierServicesSmsFilter(android.content.Context p0, com.android.internal.telephony.Phone p1, byte[][] p2, int p3, java.lang.String p4, com.android.internal.telephony.CarrierServicesSmsFilter.CarrierServicesSmsFilterCallbackInterface p5, java.lang.String p6, com.android.internal.telephony.LocalLog p7, long p8) {}
    public boolean filter() { return false; }

    protected final class CallbackTimeoutHandler extends android.os.Handler {
        protected CallbackTimeoutHandler(com.android.internal.telephony.CarrierServicesSmsFilter p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface CarrierServicesSmsFilterCallbackInterface {
        public void onFilterComplete(int p0);
    }

    private final class CarrierSmsFilter {
        protected final android.service.carrier.CarrierMessagingServiceWrapper mCarrierMessagingServiceWrapper = null;
        CarrierSmsFilter(com.android.internal.telephony.CarrierServicesSmsFilter p0, byte[][] p1, int p2, java.lang.String p3, java.lang.String p4) {}
        void filterSms(com.android.internal.telephony.CarrierServicesSmsFilter.CarrierSmsFilterCallback p0) {}
    }

    private final class CarrierSmsFilterCallback implements android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallback {
        CarrierSmsFilterCallback(com.android.internal.telephony.CarrierServicesSmsFilter p0, com.android.internal.telephony.CarrierServicesSmsFilter.FilterAggregator p1, android.service.carrier.CarrierMessagingServiceWrapper p2, java.lang.String p3) {}
        public void onReceiveSmsComplete(int p0) {}
        public void onSendSmsComplete(int p0, int p1) {}
        public void onSendMultipartSmsComplete(int p0, int[] p1) {}
        public void onSendMmsComplete(int p0, byte[] p1) {}
        public void onDownloadMmsComplete(int p0) {}
    }

    private final class FilterAggregator {
        FilterAggregator(com.android.internal.telephony.CarrierServicesSmsFilter p0, int p1) {}
        void onFilterComplete(int p0, com.android.internal.telephony.CarrierServicesSmsFilter.CarrierSmsFilterCallback p1) {}
    }
}
