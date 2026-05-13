package app.murinelauncher.util

object Constants {
    /**
     * List of known app stores
     */
    @JvmField val KNOWN_STORES: Array<String> = arrayOf(
        "com.android.vending",                               // Google Play Store
        "org.fdroid.fdroid",                                 // F-Droid
        "org.fdroid.basic",                                  // F-Droid Basic
        "com.aurora.store",                                  // Aurora Store
        "com.aurora.adroid",                                 // Aurora Droid
        "com.looker.droidify",                               // Droid-ify
        "com.machiav3lli.fdroid",                            // Neo Store
        "com.machiav3lli.neo",                               // Neo Store (alternate/newer)
        "nya.kitsunyan.foxydroid",                           // Foxy Droid
        "eu.bubu1.fdroidclassic",                            // F-Droid Classic
        "in.sunilpaulmathew.smanager",                       // Smart App Manager
        "com.aptoide.partners",                              // Aptoide (partners)
        "cm.aptoide.pt",                                     // Aptoide
        "com.apkpure.aegon",                                 // APKPure
        "com.uptodown",                                      // Uptodown
        "com.sec.android.app.samsungapps",                   // Samsung Galaxy Store
        "com.huawei.appmarket",                              // Huawei AppGallery
        "com.xiaomi.market",                                 // Xiaomi GetApps
        "com.oppo.market",                                   // OPPO App Market
        "com.heytap.market",                                 // OPPO/OnePlus HeyTap Market
        "com.bbk.appstore",                                  // Vivo App Store
        "ru.vk.store",                                       // RuStore
        "com.slideme.sam.manager",                           // SlideME
        "org.grapheneos.apps",                               // GrapheneOS Apps
        "app.accrescent",                                    // Accrescent
        "dev.nicholasgasior.obtainium",                      // Obtainium
        "com.github.nicholasgasior.obtainium",               // Obtainium (alt package)
        "com.amazon.venezia",                                // Amazon Appstore
        "com.sonymobile.anvil",                              // Sony Select / What's New
        "com.lge.appstore",                                  // LG SmartWorld
        "com.tencent.android.qqdownloader",                  // Tencent App Gem (China)
        "com.baidu.appsearch",                               // Baidu App Store (China)
        "com.qihoo.appstore",                                // 360 Mobile Assistant (China)
        "com.yandex.store"                                   // Yandex.Store
    )
}