package android.adservices.extdata;

public abstract class AdServicesExtDataStorageService extends android.app.Service {
    public static final int FIELD_IS_ADULT_ACCOUNT = 3;
    public static final int FIELD_IS_MEASUREMENT_CONSENTED = 1;
    public static final int FIELD_IS_NOTIFICATION_DISPLAYED = 0;
    public static final int FIELD_IS_U18_ACCOUNT = 2;
    public static final int FIELD_MANUAL_INTERACTION_WITH_CONSENT_STATUS = 4;
    public static final int FIELD_MEASUREMENT_ROLLBACK_APEX_VERSION = 5;
    public static final java.lang.String SERVICE_INTERFACE = "android.adservices.extdata.AdServicesExtDataStorageService";
    public AdServicesExtDataStorageService() { super(); }
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.NonNull
    public abstract android.adservices.extdata.AdServicesExtDataParams onGetAdServicesExtData();
    public abstract void onPutAdServicesExtData(android.adservices.extdata.AdServicesExtDataParams p0, int[] p1);
}
