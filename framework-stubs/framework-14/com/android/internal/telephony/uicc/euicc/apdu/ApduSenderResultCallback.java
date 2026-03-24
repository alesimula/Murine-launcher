package com.android.internal.telephony.uicc.euicc.apdu;

public abstract class ApduSenderResultCallback extends com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<byte[]> {
    public ApduSenderResultCallback() { super(); }
    public abstract boolean shouldContinueOnIntermediateResult(com.android.internal.telephony.uicc.IccIoResult p0);
}
