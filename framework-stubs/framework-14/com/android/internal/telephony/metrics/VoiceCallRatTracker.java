package com.android.internal.telephony.metrics;

public class VoiceCallRatTracker {
    VoiceCallRatTracker() {}
    public static com.android.internal.telephony.metrics.VoiceCallRatTracker fromProto(com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallRatUsage[] p0) { return null; }
    public com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallRatUsage[] toProto() { return null; }
    public void clear() {}
    public void add(int p0, int p1, long p2, java.util.Set<java.lang.Integer> p3) {}
    public void conclude(long p0) {}
    public com.android.internal.telephony.metrics.VoiceCallRatTracker mergeWith(com.android.internal.telephony.metrics.VoiceCallRatTracker p0) { return null; }

    private static class Key {
        public final int carrierId = 0;
        public final int rat = 0;
        Key(int p0, int p1) {}
        static com.android.internal.telephony.metrics.VoiceCallRatTracker.Key fromProto(com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallRatUsage p0) { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    private static class Value {
        public long durationMillis;
        public long callCount;
        Value(long p0, java.util.Set<java.lang.Integer> p1) {}
        void add(long p0, java.util.Set<java.lang.Integer> p1) {}
        void endSession() {}
        static com.android.internal.telephony.metrics.VoiceCallRatTracker.Value fromProto(com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallRatUsage p0) { return null; }
        static com.android.internal.telephony.metrics.VoiceCallRatTracker.Value mergeInPlace(com.android.internal.telephony.metrics.VoiceCallRatTracker.Value p0, com.android.internal.telephony.metrics.VoiceCallRatTracker.Value p1) { return null; }
    }
}
