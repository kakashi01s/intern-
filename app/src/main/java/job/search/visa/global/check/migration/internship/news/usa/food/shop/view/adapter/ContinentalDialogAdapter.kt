package job.search.fantasy.hub.online.global.shopping.world.social.all.view.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import job.search.visa.global.check.migration.internship.news.usa.food.shop.view.listener.ContinentalDialogListener
import job.search.visa.global.check.migration.internship.news.usa.food.shop.view.viewholder.ContinentalDialogViewHolder
import job.search.visa.global.check.migration.internship.news.usa.food.shop.R

class ContinentalDialogAdapter(val context: Context?, val cardList: List<List<String>>, val dialogListener: ContinentalDialogListener) : RecyclerView.Adapter<ContinentalDialogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContinentalDialogViewHolder {
        return ContinentalDialogViewHolder(LayoutInflater.from(context).inflate(R.layout.card_all_apps_portal_layout,parent,false))
    }

    override fun onBindViewHolder(holder: ContinentalDialogViewHolder, position: Int) {
        Log.d("TAG", "onBindViewHolder: "+cardList.size)
        Glide.with(context!!)
            .load(cardList.get(position).get(3))
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(holder.ivCardIcon)

        holder.tvCardName.text = cardList.get(position).get(1)

        holder.ivCardIcon.setOnClickListener{
            dialogListener.onContinentalDialogClick(cardList.get(position))
        }
    }

    override fun getItemCount(): Int {
        return cardList.size
    }
}