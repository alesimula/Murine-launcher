package com.android.internal.telephony.d2d;

public interface RtpAdapter {
    public java.util.Set<android.telephony.ims.RtpHeaderExtensionType> getAcceptedRtpHeaderExtensions();
    public void sendRtpHeaderExtensions(java.util.Set<android.telephony.ims.RtpHeaderExtension> p0);

    public static interface Callback {
        public void onRtpHeaderExtensionsReceived(java.util.Set<android.telephony.ims.RtpHeaderExtension> p0);
    }
}
