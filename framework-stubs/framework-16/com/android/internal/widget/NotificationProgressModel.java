package com.android.internal.widget;

@android.annotation.FlaggedApi("android.app.api_rich_ongoing")
public final class NotificationProgressModel {
    public static final int INVALID_COLOR = 0;
    public NotificationProgressModel(java.util.List<android.app.Notification.ProgressStyle.Segment> p0, java.util.List<android.app.Notification.ProgressStyle.Point> p1, int p2, boolean p3, int p4) {}
    public NotificationProgressModel(int p0) {}
    public java.util.List<android.app.Notification.ProgressStyle.Segment> getSegments() { return null; }
    public java.util.List<android.app.Notification.ProgressStyle.Point> getPoints() { return null; }
    public int getProgress() { return 0; }
    public int getProgressMax() { return 0; }
    public boolean isStyledByProgress() { return false; }
    public int getSegmentsFallbackColor() { return 0; }
    public int getIndeterminateColor() { return 0; }
    public boolean isIndeterminate() { return false; }
    @android.annotation.NonNull
    public android.os.Bundle toBundle() { return null; }
    @android.annotation.NonNull
    public static com.android.internal.widget.NotificationProgressModel fromBundle(android.os.Bundle p0) { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
