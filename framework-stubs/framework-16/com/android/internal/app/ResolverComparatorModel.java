package com.android.internal.app;

interface ResolverComparatorModel {
    public java.util.Comparator<android.content.pm.ResolveInfo> getComparator();
    public float getScore(com.android.internal.app.chooser.TargetInfo p0);
    public void notifyOnTargetSelected(com.android.internal.app.chooser.TargetInfo p0);
}
