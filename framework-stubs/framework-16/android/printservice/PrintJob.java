package android.printservice;

public final class PrintJob {
    PrintJob(android.content.Context p0, android.print.PrintJobInfo p1, android.printservice.IPrintServiceClient p2) {}
    public android.print.PrintJobId getId() { return null; }
    @android.annotation.NonNull
    public android.print.PrintJobInfo getInfo() { return null; }
    @android.annotation.NonNull
    public android.printservice.PrintDocument getDocument() { return null; }
    public boolean isQueued() { return false; }
    public boolean isStarted() { return false; }
    public boolean isBlocked() { return false; }
    public boolean isCompleted() { return false; }
    public boolean isFailed() { return false; }
    public boolean isCancelled() { return false; }
    public boolean start() { return false; }
    public boolean block(java.lang.String p0) { return false; }
    public boolean complete() { return false; }
    public boolean fail(java.lang.String p0) { return false; }
    public boolean cancel() { return false; }
    public void setProgress(float p0) {}
    public void setStatus(java.lang.CharSequence p0) {}
    public void setStatus(int p0) {}
    public boolean setTag(java.lang.String p0) { return false; }
    @android.annotation.Nullable
    public java.lang.String getTag() { return null; }
    public java.lang.String getAdvancedStringOption(java.lang.String p0) { return null; }
    public boolean hasAdvancedOption(java.lang.String p0) { return false; }
    public int getAdvancedIntOption(java.lang.String p0) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
