package com.android.internal.telephony;

public final class CellBroadcastConfigTracker extends com.android.internal.telephony.StateMachine {
    public int mSubId;
    public final android.telephony.SubscriptionManager.OnSubscriptionsChangedListener mSubChangedListener = null;
    CellBroadcastConfigTracker() { super((java.lang.String)null); }
    public static com.android.internal.telephony.CellBroadcastConfigTracker make(com.android.internal.telephony.Phone p0, android.os.Handler p1, boolean p2) { return null; }
    public java.util.List<android.telephony.CellBroadcastIdRange> getCellBroadcastIdRanges() { return null; }
    public void setCellBroadcastIdRanges(java.util.List<android.telephony.CellBroadcastIdRange> p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public static java.util.List<android.telephony.CellBroadcastIdRange> mergeRangesAsNeeded(java.util.List<android.telephony.CellBroadcastIdRange> p0) throws java.lang.IllegalArgumentException { return null; }

    private class CdmaActivatingState extends com.android.internal.telephony.State {
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private class CdmaConfiguringState extends com.android.internal.telephony.State {
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private class DefaultState extends com.android.internal.telephony.State {
        public void enter() {}
        public void exit() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private class GsmActivatingState extends com.android.internal.telephony.State {
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private class GsmConfiguringState extends com.android.internal.telephony.State {
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private class IdleState extends com.android.internal.telephony.State {
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private static class Request {
        java.util.function.Consumer<java.lang.Integer> mCallback;
        Request(java.util.List<android.telephony.CellBroadcastIdRange> p0, java.util.function.Consumer<java.lang.Integer> p1) {}
        java.util.List<android.telephony.CellBroadcastIdRange> get3gppRanges() { return null; }
        java.util.List<android.telephony.CellBroadcastIdRange> get3gpp2Ranges() { return null; }
        java.util.function.Consumer<java.lang.Integer> getCallback() { return null; }
        public java.lang.String toString() { return null; }
    }
}
