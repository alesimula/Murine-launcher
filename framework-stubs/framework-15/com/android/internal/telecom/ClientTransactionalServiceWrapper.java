package com.android.internal.telecom;

public class ClientTransactionalServiceWrapper {
    public ClientTransactionalServiceWrapper(android.telecom.PhoneAccountHandle p0, com.android.internal.telecom.ClientTransactionalServiceRepository p1) {}
    public void untrackCall(java.lang.String p0) {}
    public java.lang.String trackCall(android.telecom.CallAttributes p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.telecom.CallControl, android.telecom.CallException> p2, android.telecom.CallControlCallback p3, android.telecom.CallEventCallback p4) { return null; }
    public com.android.internal.telecom.ICallEventCallback getCallEventCallback() { return null; }

    private class ReceiverWrapper implements java.util.function.Consumer<java.lang.Boolean> {
        ReceiverWrapper(com.android.internal.telecom.ClientTransactionalServiceWrapper p0, android.os.ResultReceiver p1) {}
        public void accept(java.lang.Boolean p0) {}
        public java.util.function.Consumer<java.lang.Boolean> andThen(java.util.function.Consumer<? super java.lang.Boolean> p0) { return null; }
    }
}
