package android.app.prediction;

@android.annotation.SystemApi
public final class AppPredictionContext implements android.os.Parcelable {
    private final int mPredictedTargetCount = 0;
    private final java.lang.String mUiSurface = null;
    private final java.lang.String mPackageName = null;
    private final android.os.Bundle mExtras = null;
    public static final android.os.Parcelable.Creator<android.app.prediction.AppPredictionContext> CREATOR = null;
    private AppPredictionContext(java.lang.String p0, int p1, java.lang.String p2, android.os.Bundle p3) {}
    private AppPredictionContext(android.os.Parcel p0) {}
    public java.lang.String getUiSurface() { return null; }
    public int getPredictedTargetCount() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private final java.lang.String mPackageName = null;
        private int mPredictedTargetCount;
        private java.lang.String mUiSurface;
        private android.os.Bundle mExtras;
        @android.annotation.SystemApi
        public Builder(android.content.Context p0) {}
        public android.app.prediction.AppPredictionContext.Builder setPredictedTargetCount(int p0) { return null; }
        public android.app.prediction.AppPredictionContext.Builder setUiSurface(java.lang.String p0) { return null; }
        public android.app.prediction.AppPredictionContext.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.app.prediction.AppPredictionContext build() { return null; }
    }
}
