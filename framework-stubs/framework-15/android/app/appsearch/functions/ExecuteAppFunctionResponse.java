package android.app.appsearch.functions;

public final class ExecuteAppFunctionResponse implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.functions.ExecuteAppFunctionResponse> CREATOR = null;
    public static final java.lang.String PROPERTY_RESULT = "result";
    ExecuteAppFunctionResponse() {}
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    @android.annotation.NonNull
    public android.app.appsearch.GenericDocument getResult() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.app.appsearch.functions.ExecuteAppFunctionResponse build() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.functions.ExecuteAppFunctionResponse.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.functions.ExecuteAppFunctionResponse.Builder setResult(android.app.appsearch.GenericDocument p0) { return null; }
    }
}
