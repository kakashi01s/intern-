package food.delivery.fantasy.hub.online.coupons.deals.network.bazaar.tracker.view.adapter.home

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import food.delivery.fantasy.hub.online.coupons.deals.network.bazaar.tracker.R
import food.delivery.fantasy.hub.online.coupons.deals.network.bazaar.tracker.base.adapter.GenericRecyclerAdapter
import food.delivery.fantasy.hub.online.coupons.deals.network.bazaar.tracker.model.AllAppsModel
import food.delivery.fantasy.hub.online.coupons.deals.network.bazaar.tracker.view.WebActivity
import food.delivery.fantasy.hub.online.coupons.deals.network.bazaar.tracker.view.listener.AllAppsItemClickListener
import food.delivery.fantasy.hub.online.coupons.deals.network.bazaar.tracker.view.viewholder.AllAppsViewHolder

class AllAppsAdapter(val  context: Context,private val parents: AllAppsModel) :
    RecyclerView.Adapter<AllAppsViewHolder>() {
    override fun getItemCount(): Int {
        return parents.getValues()!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllAppsViewHolder {
        val context: Context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView: View = inflater.inflate(R.layout.card_all_apps_portal_layout, parent, false)

        return AllAppsViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: AllAppsViewHolder, position: Int) {

        Glide.with(holder.ivAllAppsPortal!!.context)
            .load(parents.getValues()!![position][3])
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(holder.ivAllAppsPortal!!)

        holder.tvPortalName!!.text = parents.getValues()!![position][1]

        holder.cvPortal?.setOnClickListener {
            val intent: Intent? = Intent(context, WebActivity::class.java)
            intent?.putExtra("title", parents.getValues()!![position][1])
            intent?.putExtra("url", parents.getValues()!![position][2])
            intent?.putExtra("app_icon", parents.getValues()!![position][3])
            holder.cvPortal!!.context.startActivity(intent)
        }
    }
}
