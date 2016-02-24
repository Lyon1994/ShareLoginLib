package com.liulishuo.share.weibo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * @author Jack Tony
 * @date 2015/10/26
 */
public class SL_WeiBoLoginActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            // 防止不保留活动情况下activity被重置后直接进行操作的情况
            WeiboLoginManager.sendLoginMsg(this);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        WeiboLoginManager.handlerOnActivityResult(requestCode, resultCode, data);
        finish();
    }
}