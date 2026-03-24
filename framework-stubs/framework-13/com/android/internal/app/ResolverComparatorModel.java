package com.android.internal.app;

interface ResolverComparatorModel {
    public java.util.Comparator<android.content.pm.ResolveInfo> getComparator();
    public float getScore(android.content.ComponentName p0);
    public void notifyOnTargetSelected(android.content.ComponentName p0);
}
