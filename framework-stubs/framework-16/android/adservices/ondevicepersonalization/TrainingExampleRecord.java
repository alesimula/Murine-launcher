package android.adservices.ondevicepersonalization;

public final class TrainingExampleRecord implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.ondevicepersonalization.TrainingExampleRecord> CREATOR = null;
    TrainingExampleRecord() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public byte[] getResumptionToken() { return null; }
    @android.annotation.Nullable
    public byte[] getTrainingExample() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.TrainingExampleRecord build() { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder setResumptionToken(byte... p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder setTrainingExample(byte... p0) { return null; }
    }
}
