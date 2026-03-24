package android.app.appfunctions;

@android.annotation.FlaggedApi("android.app.appfunctions.flags.enable_app_function_manager")
public final class ExecuteAppFunctionRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appfunctions.ExecuteAppFunctionRequest> CREATOR = null;
    @android.annotation.NonNull
    public java.lang.String getTargetPackageName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getFunctionIdentifier() { return null; }
    @android.annotation.NonNull
    public android.app.appsearch.GenericDocument getParameters() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    @android.annotation.FlaggedApi("android.permission.flags.app_function_access_api_enabled")
    @android.annotation.Nullable
    public android.app.appfunctions.AppFunctionAttribution getAttribution() { return null; }
    public int getRequestDataSize() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1) {}
        @android.annotation.NonNull
        public android.app.appfunctions.ExecuteAppFunctionRequest.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.app.appfunctions.ExecuteAppFunctionRequest.Builder setParameters(android.app.appsearch.GenericDocument p0) { return null; }
        @android.annotation.FlaggedApi("android.permission.flags.app_function_access_api_enabled")
        @android.annotation.NonNull
        public android.app.appfunctions.ExecuteAppFunctionRequest.Builder setAttribution(android.app.appfunctions.AppFunctionAttribution p0) { return null; }
        @android.annotation.NonNull
        public android.app.appfunctions.ExecuteAppFunctionRequest build() { return null; }
    }
}
