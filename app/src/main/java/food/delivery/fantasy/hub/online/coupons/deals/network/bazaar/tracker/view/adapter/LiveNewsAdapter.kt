package food.delivery.fantasy.hub.online.coupons.deals.network.bazaar.tracker.view.adapter

import android.content.Context
import android.view.ViewGroup
import food.delivery.fantasy.hub.online.coupons.deals.network.bazaar.tracker.R
import food.delivery.fantasy.hub.online.coupons.deals.network.bazaar.tracker.base.adapter.GenericRecyclerAdapter
import food.delivery.fantasy.hub.online.coupons.deals.network.bazaar.tracker.view.listener.LiveNewsItemClickListener
import food.delivery.fantasy.hub.online.coupons.deals.network.bazaar.tracker.view.viewholder.LiveNewsViewHolder

class LiveNewsAdapter(context: Context?) :
    GenericRecyclerAdapter<List<String>, LiveNewsItemClickListener<List<String>>, LiveNewsViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LiveNewsViewHolder {
        return LiveNewsViewHolder(inflate(R.layout.card_all_apps_portal_layout,parent))
    }
}