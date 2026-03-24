package com.android.internal.telephony;

public class ExponentialBackoff {
    public ExponentialBackoff(long p0, long p1, int p2, android.os.Looper p3, java.lang.Runnable p4) {}
    public ExponentialBackoff(long p0, long p1, int p2, android.os.Handler p3, java.lang.Runnable p4) {}
    public void start() {}
    public void stop() {}
    public void notifyFailed() {}
    public long getCurrentDelay() { return 0L; }
    public void setHandlerAdapter(com.android.internal.telephony.ExponentialBackoff.HandlerAdapter p0) {}

    public static interface HandlerAdapter {
        public boolean postDelayed(java.lang.Runnable p0, long p1);
        public void removeCallbacks(java.lang.Runnable p0);
    }
}
