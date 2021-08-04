package com.fsociety.affirmationsapp.adapter

import com.fsociety.affirmationsapp.model.Affirmation

class ItemAdapter(private val context: Context,private val dataset: List<Affirmation>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
    	TODO("Not yet implemented")
    	val adapterLayout = LayoutInflater.from(parent.context)
    	.inflate(R.layout.list_item, parent, false)
	}

override fun getItemCount() = dataset.size

override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
	    TODO("Not yet implemented")
	}
}

