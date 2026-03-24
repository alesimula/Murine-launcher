package android.service.wearable;

@android.annotation.SystemApi
public interface WearableSensingDataRequester {
    public static final int STATUS_UNKNOWN = 0;
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_OBSERVER_CANCELLED = 2;
    public static final int STATUS_TOO_LARGE = 3;
    public static final int STATUS_TOO_FREQUENT = 4;
    public void requestData(android.app.wearable.WearableSensingDataRequest p0, java.util.function.Consumer<java.lang.Integer> p1);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StatusCode {
    }
}
