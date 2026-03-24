package android.telephony.ims.stub;

@android.annotation.SystemApi
public class ImsEcbmImplBase {
    private static final java.lang.String TAG = "ImsEcbmImplBase";
    private com.android.ims.internal.IImsEcbmListener mListener;
    private com.android.ims.internal.IImsEcbm mImsEcbm;
    public ImsEcbmImplBase() {}
    public com.android.ims.internal.IImsEcbm getImsEcbm() { return null; }
    public void exitEmergencyCallbackMode() {}
    public final void enteredEcbm() {}
    public final void exitedEcbm() {}
}
