package android.telephony.ims.feature;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.support_ims_mmtel_interface")
public interface ImsTrafficSessionCallback {
    public void onReady();
    public void onError(android.telephony.ims.feature.ConnectionFailureInfo p0);
}
