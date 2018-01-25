package com.ocnyang.uapplibrary;


import android.support.v4.app.Fragment;
import android.text.TextUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class UAppBaseFragment extends Fragment implements IContextName {

    @Override
    public void onResume() {
        super.onResume();
        String pageName = getPageName();
        UMengHelper.onPageStart(TextUtils.isEmpty(pageName) ? "unknownNamePage" : pageName);
    }

    @Override
    public void onPause() {
        super.onPause();
        String pageName = getPageName();
        UMengHelper.onPageEnd(TextUtils.isEmpty(pageName) ? "unknownNamePage" : pageName);
    }
}
