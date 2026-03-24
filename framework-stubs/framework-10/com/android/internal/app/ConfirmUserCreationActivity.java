package com.android.internal.app;

public class ConfirmUserCreationActivity extends com.android.internal.app.AlertActivity implements android.content.DialogInterface.OnClickListener {
    private static final java.lang.String TAG = "CreateUser";
    private java.lang.String mUserName;
    private java.lang.String mAccountName;
    private java.lang.String mAccountType;
    private android.os.PersistableBundle mAccountOptions;
    private boolean mCanProceed;
    private android.os.UserManager mUserManager;
    public ConfirmUserCreationActivity() { super(); }
    public void onCreate(android.os.Bundle p0) {}
    private java.lang.String checkUserCreationRequirements() { return null; }
    public void onClick(android.content.DialogInterface p0, int p1) {}
}
