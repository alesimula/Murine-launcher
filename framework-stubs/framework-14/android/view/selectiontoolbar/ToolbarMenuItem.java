package android.view.selectiontoolbar;

public final class ToolbarMenuItem implements android.os.Parcelable {
    public static final int PRIORITY_UNKNOWN = 0;
    public static final int PRIORITY_PRIMARY = 1;
    public static final int PRIORITY_OVERFLOW = 2;
    public static final android.os.Parcelable.Creator<android.view.selectiontoolbar.ToolbarMenuItem> CREATOR = null;
    public static int getPriorityFromMenuItem(android.view.MenuItem p0) { return 0; }
    public static java.lang.String priorityToString(int p0) { return null; }
    ToolbarMenuItem(int p0, java.lang.CharSequence p1, java.lang.CharSequence p2, int p3, android.graphics.drawable.Icon p4, java.lang.CharSequence p5, int p6) {}
    public int getItemId() { return 0; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public int getGroupId() { return 0; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public java.lang.CharSequence getTooltipText() { return null; }
    public int getPriority() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    ToolbarMenuItem(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder(int p0, java.lang.CharSequence p1, java.lang.CharSequence p2, int p3, android.graphics.drawable.Icon p4, java.lang.CharSequence p5, int p6) {}
        public android.view.selectiontoolbar.ToolbarMenuItem.Builder setItemId(int p0) { return null; }
        public android.view.selectiontoolbar.ToolbarMenuItem.Builder setTitle(java.lang.CharSequence p0) { return null; }
        public android.view.selectiontoolbar.ToolbarMenuItem.Builder setContentDescription(java.lang.CharSequence p0) { return null; }
        public android.view.selectiontoolbar.ToolbarMenuItem.Builder setGroupId(int p0) { return null; }
        public android.view.selectiontoolbar.ToolbarMenuItem.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.view.selectiontoolbar.ToolbarMenuItem.Builder setTooltipText(java.lang.CharSequence p0) { return null; }
        public android.view.selectiontoolbar.ToolbarMenuItem.Builder setPriority(int p0) { return null; }
        public android.view.selectiontoolbar.ToolbarMenuItem build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Priority {
    }
}
