package com.wf.weatherforcastexample.databinding;
import com.wf.weatherforcastexample.R;
import com.wf.weatherforcastexample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRvForcastBindingImpl extends ItemRvForcastBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.text_label_degree, 5);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemRvForcastBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemRvForcastBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.imgWeather.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCity.setTag(null);
        this.tvDate.setTag(null);
        this.tvTemp.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.model == variableId) {
            setModel((com.wf.weatherforcastexample.db.ForecastRow) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.wf.weatherforcastexample.db.ForecastRow Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.wf.weatherforcastexample.db.ForecastRow model = mModel;
        java.lang.String modelMain = null;
        java.lang.String modelIcon = null;
        java.lang.Double modelTemp = null;
        java.lang.String modelTime = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.main
                    modelMain = model.getMain();
                    // read model.icon
                    modelIcon = model.getIcon();
                    // read model.temp
                    modelTemp = model.getTemp();
                    // read model.time
                    modelTime = model.getTime();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.wf.weatherforcastexample.core.utils.ExtensionsAdapterKt.setBindImage(this.imgWeather, modelIcon);
            com.wf.weatherforcastexample.core.utils.ExtensionsAdapterKt.setBindString(this.tvCity, modelMain);
            com.wf.weatherforcastexample.core.utils.ExtensionsAdapterKt.setBindString(this.tvDate, modelTime);
            com.wf.weatherforcastexample.core.utils.ExtensionsAdapterKt.setBindTemp(this.tvTemp, modelTemp);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}