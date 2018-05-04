package rocks.lechick.android.tourlondon;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by alek on 25/04/2018.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private String tabTitles[];




    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
        tabTitles = new String[] {
                mContext.getResources().getString(R.string.museums),
                mContext.getResources().getString(R.string.parks),
                mContext.getResources().getString(R.string.theatres),
                mContext.getResources().getString(R.string.walks)
        };
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MuseumsFragment();
        } else if (position == 1) {
            return new ParksFragment();
        } else if (position == 2) {
            return new TheatresFragment();
        } else {
            return new WalksFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
        }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}
