package demo.com.todoandroid.biz.viewPagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import demo.com.todoandroid.biz.postDetail.RvFragment;
import demo.com.todoandroid.biz.postDetail.TextFragment;

/**
 * Created by panchenhuan on 17/8/25.
 */

public class VpAdapter extends FragmentPagerAdapter {
    public VpAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return RvFragment.newInstance();
            default:
                return TextFragment.newInstance("FRAGMENT : " + position);
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "TAB " + position;
    }
}
