package android.telephony.ims.stub;

@android.annotation.SystemApi
public class ImsMultiEndpointImplBase {
    private static final java.lang.String TAG = "MultiEndpointImplBase";
    private com.android.ims.internal.IImsExternalCallStateListener mListener;
    private com.android.ims.internal.IImsMultiEndpoint mImsMultiEndpoint;
    public ImsMultiEndpointImplBase() {}
    public com.android.ims.internal.IImsMultiEndpoint getIImsMultiEndpoint() { return null; }
    public final void onImsExternalCallStateUpdate(java.util.List<android.telephony.ims.ImsExternalCallState> p0) {}
    public void requestImsExternalCallStateInfo() {}
}
