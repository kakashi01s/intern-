package job.search.visa.global.check.migration.internship.news.usa.food.shop.view.listener

import job.search.visa.global.check.migration.internship.news.usa.food.shop.base.listener.BaseRecyclerListener

interface CategoryStoresItemClickListener<T> : BaseRecyclerListener {
    fun CategoryStoresCardClick(item: T)
}