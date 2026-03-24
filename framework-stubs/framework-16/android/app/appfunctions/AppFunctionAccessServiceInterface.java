package android.app.appfunctions;

public interface AppFunctionAccessServiceInterface {
    public boolean checkAppFunctionAccess(java.lang.String p0, int p1, java.lang.String p2, int p3);
    public int getAppFunctionAccessRequestState(java.lang.String p0, int p1, java.lang.String p2, int p3);
    public int getAppFunctionAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3);
    public boolean updateAppFunctionAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4, int p5) throws java.lang.IllegalArgumentException;
    public void setAgentAllowlist(java.util.List<android.content.pm.SignedPackage> p0);
}
