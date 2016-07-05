package Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ahorcado.ernes.ebolapp.MapFragment;
import com.ahorcado.ernes.ebolapp.NewsFragment;

/**
 * Created by ernes on 6/30/2016.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NewsFragment();
        } else {
            return new MapFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
