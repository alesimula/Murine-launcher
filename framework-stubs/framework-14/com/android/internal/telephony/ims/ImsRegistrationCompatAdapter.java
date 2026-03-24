package com.android.internal.telephony.ims;

public class ImsRegistrationCompatAdapter extends android.telephony.ims.stub.ImsRegistrationImplBase {
    public ImsRegistrationCompatAdapter() { super(); }
    public com.android.ims.internal.IImsRegistrationListener getRegistrationListener() { return null; }
}
