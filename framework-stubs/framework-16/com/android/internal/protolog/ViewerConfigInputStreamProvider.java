package com.android.internal.protolog;

public interface ViewerConfigInputStreamProvider {
    @android.annotation.NonNull
    public com.android.internal.protolog.AutoClosableProtoInputStream getInputStream();
}
