package com.android.internal.widget.remotecompose.core.operations.utilities;

public interface CollectionsAccess {
    public float getFloatValue(int p0, int p1);
    @android.annotation.Nullable
    public float[] getFloats(int p0);
    public int getListLength(int p0);
    public int getId(int p0, int p1);
    default public int getIntValue(int p0, int p1) { return 0; }
}
