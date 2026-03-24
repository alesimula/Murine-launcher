package com.android.internal.widget;

public abstract class PagerAdapter {
    private android.database.DataSetObservable mObservable;
    public static final int POSITION_UNCHANGED = -1;
    public static final int POSITION_NONE = -2;
    public PagerAdapter() {}
    public abstract int getCount();
    public void startUpdate(android.view.ViewGroup p0) {}
    public java.lang.Object instantiateItem(android.view.ViewGroup p0, int p1) { return null; }
    public void destroyItem(android.view.ViewGroup p0, int p1, java.lang.Object p2) {}
    public void setPrimaryItem(android.view.ViewGroup p0, int p1, java.lang.Object p2) {}
    public void finishUpdate(android.view.ViewGroup p0) {}
    public void startUpdate(android.view.View p0) {}
    public java.lang.Object instantiateItem(android.view.View p0, int p1) { return null; }
    public void destroyItem(android.view.View p0, int p1, java.lang.Object p2) {}
    public void setPrimaryItem(android.view.View p0, int p1, java.lang.Object p2) {}
    public void finishUpdate(android.view.View p0) {}
    public abstract boolean isViewFromObject(android.view.View p0, java.lang.Object p1);
    public android.os.Parcelable saveState() { return null; }
    public void restoreState(android.os.Parcelable p0, java.lang.ClassLoader p1) {}
    public int getItemPosition(java.lang.Object p0) { return 0; }
    public void notifyDataSetChanged() {}
    public void registerDataSetObserver(android.database.DataSetObserver p0) {}
    public void unregisterDataSetObserver(android.database.DataSetObserver p0) {}
    public java.lang.CharSequence getPageTitle(int p0) { return null; }
    public float getPageWidth(int p0) { return 0.0f; }
}
