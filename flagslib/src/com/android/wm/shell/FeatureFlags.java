package com.android.wm.shell;
// TODO(b/303773055): Remove the annotation after access issue is resolved.
/** @hide */
public interface FeatureFlags {


    
    boolean animateBubbleSizeChange();
    
    
    boolean enableAppPairs();
    
    
    boolean enableBubbleAnything();
    
    
    boolean enableBubbleBar();


    boolean enableCreateAnyBubble();
    
    
    boolean enableBubbleStashing();
    
    
    boolean enableBubblesLongPressNavHandle();
    
    
    boolean enableLeftRightSplitInPortrait();
    
    
    boolean enableNewBubbleAnimations();
    
    
    boolean enableOptionalBubbleOverflow();
    
    boolean enablePip2Implementation();
    
    
    boolean enablePipUmoExperience();
    
    
    boolean enableRetrievableBubbles();
    
    
    boolean enableSplitContextual();
    
    
    boolean enableTaskbarNavbarUnification();

    boolean enableDynamicInsetsForAppLaunch();

    boolean enableShellTopTaskTracking();

    boolean enableFlexibleSplit();
    
    boolean enableTinyTaskbar();
    
    
    boolean onlyReuseBubbledTaskWhenLaunchedFromBubble();
}
