package com.android.internal.widget.remotecompose.core.operations.utilities;

public interface ArrayAccess {
    public float getFloatValue(int p0);
    default public int getId(int p0) { return 0; }
    @android.annotation.Nullable
    public float[] getFloats();
    public int getLength();
    default public int getIntValue(int p0) { return 0; }
}
