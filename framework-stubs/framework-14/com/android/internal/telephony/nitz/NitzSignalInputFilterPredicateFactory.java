package com.android.internal.telephony.nitz;

public final class NitzSignalInputFilterPredicateFactory {
    public static com.android.internal.telephony.nitz.NitzStateMachineImpl.NitzSignalInputFilterPredicate create(android.content.Context p0, com.android.internal.telephony.NitzStateMachine.DeviceState p1) { return null; }
    public static com.android.internal.telephony.nitz.NitzSignalInputFilterPredicateFactory.TrivalentPredicate createIgnoreNitzPropertyCheck(com.android.internal.telephony.NitzStateMachine.DeviceState p0) { return null; }
    public static com.android.internal.telephony.nitz.NitzSignalInputFilterPredicateFactory.TrivalentPredicate createBogusElapsedRealtimeCheck(android.content.Context p0, com.android.internal.telephony.NitzStateMachine.DeviceState p1) { return null; }
    public static com.android.internal.telephony.nitz.NitzSignalInputFilterPredicateFactory.TrivalentPredicate createNoOldSignalCheck() { return null; }
    public static com.android.internal.telephony.nitz.NitzSignalInputFilterPredicateFactory.TrivalentPredicate createRateLimitCheck(com.android.internal.telephony.NitzStateMachine.DeviceState p0) { return null; }

    public static class NitzSignalInputFilterPredicateImpl implements com.android.internal.telephony.nitz.NitzStateMachineImpl.NitzSignalInputFilterPredicate {
        public NitzSignalInputFilterPredicateImpl(com.android.internal.telephony.nitz.NitzSignalInputFilterPredicateFactory.TrivalentPredicate[] p0) {}
        public boolean mustProcessNitzSignal(com.android.internal.telephony.NitzSignal p0, com.android.internal.telephony.NitzSignal p1) { return false; }
    }

    @java.lang.FunctionalInterface
    public static interface TrivalentPredicate {
        public java.lang.Boolean mustProcessNitzSignal(com.android.internal.telephony.NitzSignal p0, com.android.internal.telephony.NitzSignal p1);
    }
}
