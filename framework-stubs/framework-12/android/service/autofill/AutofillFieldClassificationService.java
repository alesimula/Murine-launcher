package android.service.autofill;

@android.annotation.SystemApi
public abstract class AutofillFieldClassificationService extends android.app.Service {
    private static final java.lang.String TAG = "AutofillFieldClassificationService";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.autofill.AutofillFieldClassificationService";
    public static final java.lang.String SERVICE_META_DATA_KEY_DEFAULT_ALGORITHM = "android.autofill.field_classification.default_algorithm";
    public static final java.lang.String SERVICE_META_DATA_KEY_AVAILABLE_ALGORITHMS = "android.autofill.field_classification.available_algorithms";
    public static final java.lang.String REQUIRED_ALGORITHM_EDIT_DISTANCE = "EDIT_DISTANCE";
    public static final java.lang.String REQUIRED_ALGORITHM_EXACT_MATCH = "EXACT_MATCH";
    public static final java.lang.String REQUIRED_ALGORITHM_CREDIT_CARD = "CREDIT_CARD";
    public static final java.lang.String EXTRA_SCORES = "scores";
    private android.service.autofill.AutofillFieldClassificationService.AutofillFieldClassificationServiceWrapper mWrapper;
    private final android.os.Handler mHandler = null;
    private void calculateScores(android.os.RemoteCallback p0, java.util.List<android.view.autofill.AutofillValue> p1, java.lang.String[] p2, java.lang.String[] p3, java.lang.String p4, android.os.Bundle p5, java.util.Map p6, java.util.Map p7) {}
    @android.annotation.SystemApi
    public AutofillFieldClassificationService() { super(); }
    public void onCreate() {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public float[][] onGetScores(java.lang.String p0, android.os.Bundle p1, java.util.List<android.view.autofill.AutofillValue> p2, java.util.List<java.lang.String> p3) { return null; }
    @android.annotation.SystemApi
    public float[][] onCalculateScores(java.util.List<android.view.autofill.AutofillValue> p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.lang.String p3, android.os.Bundle p4, java.util.Map p5, java.util.Map p6) { return null; }

    private final class AutofillFieldClassificationServiceWrapper extends android.service.autofill.IAutofillFieldClassificationService.Stub {
        private AutofillFieldClassificationServiceWrapper(android.service.autofill.AutofillFieldClassificationService p0) { super(); }
        public void calculateScores(android.os.RemoteCallback p0, java.util.List<android.view.autofill.AutofillValue> p1, java.lang.String[] p2, java.lang.String[] p3, java.lang.String p4, android.os.Bundle p5, java.util.Map p6, java.util.Map p7) throws android.os.RemoteException {}
    }

    public static final class Scores implements android.os.Parcelable {
        public final float[][] scores = null;
        public static final android.os.Parcelable.Creator<android.service.autofill.AutofillFieldClassificationService.Scores> CREATOR = null;
        private Scores(android.os.Parcel p0) {}
        private Scores(float[][] p0) {}
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
