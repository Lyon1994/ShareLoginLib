package com.liulishuo.share.type;

import android.support.annotation.IntDef;

/**
 * Created by echo on 5/18/15.
 */
@IntDef({ContentType.TEXT, ContentType.PIC, ContentType.WEBPAGE, ContentType.MUSIC})
public @interface ContentType {

    /**
     * text
     */
    int TEXT = 1;

    /**
     * picture
     */
    int PIC = 2;

    /**
     * webPage
     */
    int WEBPAGE = 3;

    /**
     * music
     */
    int MUSIC = 4;

}