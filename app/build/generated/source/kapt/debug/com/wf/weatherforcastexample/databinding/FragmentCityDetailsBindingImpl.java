package com.wf.weatherforcastexample.databinding;
import com.wf.weatherforcastexample.R;
import com.wf.weatherforcastexample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCityDetailsBindingImpl extends FragmentCityDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(0, 
            new String[] {"view_loading", "view_no_internet", "container_details"},
            new int[] {1, 2, 3},
            new int[] {com.wf.weatherforcastexample.R.layout.view_loading,
                com.wf.weatherforcastexample.R.layout.view_no_internet,
                com.wf.weatherforcastexample.R.layout.container_details});
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCityDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentCityDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.wf.weatherforcastexample.databinding.ContainerDetailsBinding) bindings[3]
            , (android.widget.ViewFlipper) bindings[0]
            , (com.wf.weatherforcastexample.databinding.ViewLoadingBinding) bindings[1]
            , (com.wf.weatherforcastexample.databinding.ViewNoInternetBinding) bindings[2]
            );
        setContainedBinding(this.containerDetails);
        this.viewFlipper.setTag(null);
        setContainedBinding(this.viewLoading);
        setContainedBinding(this.viewNoInternet);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        viewLoading.invalidateAll();
        viewNoInternet.invalidateAll();
        containerDetails.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (viewLoading.hasPendingBindings()) {
            return true;
        }
        if (viewNoInternet.hasPendingBindings()) {
            return true;
        }
        if (containerDetails.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragment == variableId) {
            setFragment((com.wf.weatherforcastexample.ui.details.view.CityDetailsFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.wf.weatherforcastexample.ui.details.view.CityDetailsFragment Fragment) {
        this.mFragment = Fragment;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        viewLoading.setLifecycleOwner(lifecycleOwner);
        viewNoInternet.setLifecycleOwner(lifecycleOwner);
        containerDetails.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewNoInternet((com.wf.weatherforcastexample.databinding.ViewNoInternetBinding) object, fieldId);
            case 1 :
                return onChangeContainerDetails((com.wf.weatherforcastexample.databinding.ContainerDetailsBinding) object, fieldId);
            case 2 :
                return onChangeViewLoading((com.wf.weatherforcastexample.databinding.ViewLoadingBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewNoInternet(com.wf.weatherforcastexample.databinding.ViewNoInternetBinding ViewNoInternet, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeContainerDetails(com.wf.weatherforcastexample.databinding.ContainerDetailsBinding ContainerDetails, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewLoading(com.wf.weatherforcastexample.databinding.ViewLoadingBinding ViewLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
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
        // batch finished
        executeBindingsOn(viewLoading);
        executeBindingsOn(viewNoInternet);
        executeBindingsOn(containerDetails);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewNoInternet
        flag 1 (0x2L): containerDetails
        flag 2 (0x3L): viewLoading
        flag 3 (0x4L): fragment
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}