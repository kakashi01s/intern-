package food.delivery.fantasy.hub.online.coupons.deals.network.bazaar.tracker.viewpager
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import food.delivery.fantasy.hub.online.coupons.deals.network.bazaar.tracker.model.AllAppsModel
import food.delivery.fantasy.hub.online.coupons.deals.network.bazaar.tracker.view.fragment.*

class AppPagerAdapter(fragmentManager: FragmentManager,val homeFragmentData: AllAppsModel?) : FragmentPagerAdapter(fragmentManager) {

    val NUM_ITEMS = 4;

    override fun getCount(): Int {
        return NUM_ITEMS
    }

    override fun getItem(position: Int): Fragment {
        when (position){
            0 -> {
                return ContinentalFragment.newInstance(position, "Continent")
            }
            1 -> {
                return HomeFragment.newInstance(position, "Home",homeFragmentData!!)
            }
            2 -> {
                return CategoryFragment.newInstance(position, "Global")
            }
            3 -> {
                return ToolsFragment.newInstance(position, "News")
            }

            else -> return HomeFragment.newInstance(position, "Home",homeFragmentData!!)
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title : String? = null;
        if (position == 0) {
            title = "Continent"
        } else if (position == 1) {
            title = "Home"
        }
        else if (position == 2) {
            title = "Global"
        }
        else if (position == 3) {
            title = "Tools"
        }
        return title
    }
}