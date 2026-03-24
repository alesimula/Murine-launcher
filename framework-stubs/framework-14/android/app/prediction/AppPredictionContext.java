package android.app.prediction;

@android.annotation.SystemApi
public final class AppPredictionContext implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.prediction.AppPredictionContext> CREATOR = null;
    public java.lang.String getUiSurface() { return null; }
    public int getPredictedTargetCount() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        @android.annotation.SystemApi
        public Builder(android.content.Context p0) {}
        public android.app.prediction.AppPredictionContext.Builder setPredictedTargetCount(int p0) { return null; }
        public android.app.prediction.AppPredictionContext.Builder setUiSurface(java.lang.String p0) { return null; }
        public android.app.prediction.AppPredictionContext.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.app.prediction.AppPredictionContext build() { return null; }
    }
}
