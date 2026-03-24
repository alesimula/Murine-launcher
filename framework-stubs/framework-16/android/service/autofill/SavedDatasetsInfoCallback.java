package android.service.autofill;

public interface SavedDatasetsInfoCallback {
    public static final int ERROR_OTHER = 0;
    public static final int ERROR_UNSUPPORTED = 1;
    public static final int ERROR_NEEDS_USER_ACTION = 2;
    public void onSuccess(java.util.Set<android.service.autofill.SavedDatasetsInfo> p0);
    public void onError(int p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Error {
    }
}
