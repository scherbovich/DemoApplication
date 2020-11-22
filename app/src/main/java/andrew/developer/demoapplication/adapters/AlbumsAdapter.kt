package andrew.developer.demoapplication.adapters

import andrew.developer.demoapplication.R
import andrew.developer.demoapplication.adapters.base.BaseAdapter
import andrew.developer.demoapplication.adapters.base.BaseViewHolder
import andrew.developer.demoapplication.data.entity.AlbumsItem
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class AlbumsAdapter: BaseAdapter<AlbumsItem>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<AlbumsItem> {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_albums_item, parent, false))
    }

    class ViewHolder(itemView: View): BaseViewHolder<AlbumsItem>(itemView){
        private var tvId: TextView = itemView.findViewById(R.id.tv_id)
        private var tvTitle: TextView = itemView.findViewById(R.id.tv_title)
        private var tvUserId: TextView = itemView.findViewById(R.id.tv_userId)

        override fun bind(model: AlbumsItem) {
            tvId.text = model.id.toString()
            tvTitle.text = model.title
            tvUserId.text = model.userId.toString()
        }
    }


}