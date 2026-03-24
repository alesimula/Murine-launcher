package android.app.appsearch.functions;

public final class ExecuteAppFunctionRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.functions.ExecuteAppFunctionRequest> CREATOR = null;
    ExecuteAppFunctionRequest() {}
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    @android.annotation.NonNull
    public java.lang.String getFunctionIdentifier() { return null; }
    @android.annotation.NonNull
    public android.app.appsearch.GenericDocument getParameters() { return null; }
    @android.annotation.Nullable
    public byte[] getSha256Certificate() { return null; }
    @android.annotation.NonNull
    public java.lang.String getTargetPackageName() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1) {}
        @android.annotation.NonNull
        public android.app.appsearch.functions.ExecuteAppFunctionRequest build() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.functions.ExecuteAppFunctionRequest.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.functions.ExecuteAppFunctionRequest.Builder setParameters(android.app.appsearch.GenericDocument p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.functions.ExecuteAppFunctionRequest.Builder setSha256Certificate(byte[] p0) { return null; }
    }
}
