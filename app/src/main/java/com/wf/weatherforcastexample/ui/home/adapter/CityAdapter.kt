package com.wf.weatherforcastexample.ui.home.adapter

import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.AsyncListDiffer
import com.wf.weatherforcastexample.R
import com.wf.weatherforcastexample.core.base.adapter.BaseAdapter
import com.wf.weatherforcastexample.core.base.adapter.BaseViewHolder
import com.wf.weatherforcastexample.core.base.adapter.CityInterface
import com.wf.weatherforcastexample.core.base.adapter.DiffCallBack
import com.wf.weatherforcastexample.core.utils.getBindingRow
import com.wf.weatherforcastexample.databinding.ItemRvCityWeatherBinding
import com.wf.weatherforcastexample.db.CityModel

class CityAdapter: BaseAdapter<CityModel>() {

    private var mDiffer = AsyncListDiffer(this, DiffCallBack<CityModel>())
    private lateinit var interfaceCity: CityInterface

    override fun setDataList(dataList: List<CityModel>) {
        mDiffer.submitList(dataList)
    }

    override fun addDataList(dataList: List<CityModel>) {
        mDiffer.currentList.addAll(dataList)
    }

    override fun clearDataList() {
        mDiffer.currentList.clear()
    }

    fun interfaceInit(interfaceCity: CityInterface) {
        this.interfaceCity = interfaceCity
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<CityModel> {
        return ViewHolderCity(
            getBindingRow(
                parent,
                R.layout.item_rv_city_weather
            ) as ItemRvCityWeatherBinding
        )
    }

    override fun onBindViewHolder(holder: BaseViewHolder<CityModel>, position: Int) {
        val model = mDiffer.currentList[position]
        holder.apply {
            bind(model)
            itemView.apply {
                animation = AnimationUtils.loadAnimation(holder.itemView.context, R.anim.ver_anim)
            }

            itemView.setOnClickListener {
                model.name?.let { city -> interfaceCity.onItemClick(city , model.id) }
            }
        }
    }

    override fun getItemCount(): Int = mDiffer.currentList.size


}