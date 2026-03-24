package android.content.pm;

@android.annotation.SystemApi
public class DataLoaderParams {
    @android.annotation.NonNull
    public static final android.content.pm.DataLoaderParams forStreaming(android.content.ComponentName p0, java.lang.String p1) { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public static final android.content.pm.DataLoaderParams forIncremental(android.content.ComponentName p0, java.lang.String p1) { return null; }
    public DataLoaderParams(int p0, android.content.ComponentName p1, java.lang.String p2) {}
    DataLoaderParams(android.content.pm.DataLoaderParamsParcel p0) {}
    @android.annotation.NonNull
    public final android.content.pm.DataLoaderParamsParcel getData() { return null; }
    @android.annotation.NonNull
    @android.content.pm.DataLoaderType
    public final int getType() { return 0; }
    @android.annotation.NonNull
    public final android.content.ComponentName getComponentName() { return null; }
    @android.annotation.NonNull
    public final java.lang.String getArguments() { return null; }
}
