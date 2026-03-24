package android.adservices.adid;

public class AdIdManager {
    AdIdManager() {}
    @android.annotation.FlaggedApi("com.android.adservices.flags.adid_enable_synchronous_ad_id_api")
    public void deleteAdId() {}
    @android.annotation.NonNull
    public static android.adservices.adid.AdIdManager get(android.content.Context p0) { return null; }
    @android.annotation.FlaggedApi("com.android.adservices.flags.adid_enable_synchronous_ad_id_api")
    @android.annotation.Nullable
    public android.adservices.adid.AdId getAdId() { return null; }
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_outcomereceiver_r_api_deprecated")
    @android.annotation.NonNull
    public void getAdId(java.util.concurrent.Executor p0, android.adservices.common.AdServicesOutcomeReceiver<android.adservices.adid.AdId, java.lang.Exception> p1) {}
    @android.annotation.NonNull
    public void getAdId(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.adservices.adid.AdId, java.lang.Exception> p1) {}
    @android.annotation.FlaggedApi("com.android.adservices.flags.adid_enable_synchronous_ad_id_api")
    @android.annotation.NonNull
    public android.adservices.adid.AdId recreateAdId() { return null; }
}
