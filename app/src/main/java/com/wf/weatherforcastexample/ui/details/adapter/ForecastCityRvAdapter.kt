package com.wf.weatherforcastexample.ui.details.adapter

import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.AsyncListDiffer
import com.wf.weatherforcastexample.BR
import com.wf.weatherforcastexample.core.base.adapter.BaseAdapter
import com.wf.weatherforcastexample.core.base.adapter.BaseViewHolder
import com.wf.weatherforcastexample.core.base.adapter.DiffCallBack
import com.wf.weatherforcastexample.core.utils.getBindingRow
import com.wf.weatherforcastexample.R
import com.wf.weatherforcastexample.databinding.ItemRvForcastBinding
import com.wf.weatherforcastexample.db.ForecastRow


class ForecastCityRvAdapter: BaseAdapter<ForecastRow>() {

    private var mDiffer = AsyncListDiffer(this, DiffCallBack<ForecastRow>())

    override fun setDataList(dataList: List<ForecastRow>) {
        mDiffer.submitList(dataList)
    }

    override fun addDataList(dataList: List<ForecastRow>) {
        mDiffer.currentList.addAll(dataList)
    }

    override fun clearDataList() {
        mDiffer.currentList.clear()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<ForecastRow> {
        return ViewHolderForecastCity(getBindingRow(parent, R.layout.item_rv_forcast) as ItemRvForcastBinding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<ForecastRow>, position: Int) {
        val model = mDiffer.currentList[position]
        holder.apply {
            bind(model)
            itemView.apply {
                animation = AnimationUtils.loadAnimation(holder.itemView.context, R.anim.ver_anim)
            }
        }
    }

    override fun getItemCount(): Int = mDiffer.currentList.size


}

class ViewHolderForecastCity (binding: ItemRvForcastBinding): BaseViewHolder<ForecastRow>(binding)  {

    override var itemRowBinding: ViewDataBinding = binding

    override fun bind(result: ForecastRow) {
        itemRowBinding.setVariable(BR.model , result)
        itemRowBinding.executePendingBindings()
    }
}
