package com.android.internal.telephony.d2d;

public interface TransportProtocol {
    public void setCallback(com.android.internal.telephony.d2d.TransportProtocol.Callback p0);
    public void startNegotiation();
    public void sendMessages(java.util.Set<com.android.internal.telephony.d2d.Communicator.Message> p0);
    public void forceNegotiated();
    public void forceNotNegotiated();

    public static interface Callback {
        public void onNegotiationSuccess(com.android.internal.telephony.d2d.TransportProtocol p0);
        public void onNegotiationFailed(com.android.internal.telephony.d2d.TransportProtocol p0);
        public void onMessagesReceived(java.util.Set<com.android.internal.telephony.d2d.Communicator.Message> p0);
    }
}
