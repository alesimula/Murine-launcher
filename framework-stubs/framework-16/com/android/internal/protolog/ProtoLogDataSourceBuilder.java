package com.android.internal.protolog;

public interface ProtoLogDataSourceBuilder {
    @android.annotation.NonNull
    public com.android.internal.protolog.ProtoLogDataSource build(com.android.internal.protolog.ProtoLogDataSource.Instance.TracingInstanceStartCallback p0, java.lang.Runnable p1, com.android.internal.protolog.ProtoLogDataSource.Instance.TracingInstanceStopCallback p2);
}
