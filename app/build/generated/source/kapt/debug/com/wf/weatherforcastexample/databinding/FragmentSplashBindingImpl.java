package com.wf.weatherforcastexample.databinding;
import com.wf.weatherforcastexample.R;
import com.wf.weatherforcastexample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSplashBindingImpl extends FragmentSplashBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(5);
        sIncludes.setIncludes(0, 
            new String[] {"container_splash", "view_no_internet", "view_no_gps", "view_no_permissions"},
            new int[] {1, 2, 3, 4},
            new int[] {com.wf.weatherforcastexample.R.layout.container_splash,
                com.wf.weatherforcastexample.R.layout.view_no_internet,
                com.wf.weatherforcastexample.R.layout.view_no_gps,
                com.wf.weatherforcastexample.R.layout.view_no_permissions});
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSplashBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentSplashBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.wf.weatherforcastexample.databinding.ContainerSplashBinding) bindings[1]
            , (android.widget.ViewFlipper) bindings[0]
            , (com.wf.weatherforcastexample.databinding.ViewNoGpsBinding) bindings[3]
            , (com.wf.weatherforcastexample.databinding.ViewNoInternetBinding) bindings[2]
            , (com.wf.weatherforcastexample.databinding.ViewNoPermissionsBinding) bindings[4]
            );
        setContainedBinding(this.containerSplash);
        this.viewFlipper.setTag(null);
        setContainedBinding(this.viewNoGps);
        setContainedBinding(this.viewNoInternet);
        setContainedBinding(this.viewTakePermissions);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        containerSplash.invalidateAll();
        viewNoInternet.invalidateAll();
        viewNoGps.invalidateAll();
        viewTakePermissions.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (containerSplash.hasPendingBindings()) {
            return true;
        }
        if (viewNoInternet.hasPendingBindings()) {
            return true;
        }
        if (viewNoGps.hasPendingBindings()) {
            return true;
        }
        if (viewTakePermissions.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragment == variableId) {
            setFragment((com.wf.weatherforcastexample.ui.splash.view.SplashFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.wf.weatherforcastexample.ui.splash.view.SplashFragment Fragment) {
        this.mFragment = Fragment;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        containerSplash.setLifecycleOwner(lifecycleOwner);
        viewNoInternet.setLifecycleOwner(lifecycleOwner);
        viewNoGps.setLifecycleOwner(lifecycleOwner);
        viewTakePermissions.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewNoGps((com.wf.weatherforcastexample.databinding.ViewNoGpsBinding) object, fieldId);
            case 1 :
                return onChangeViewTakePermissions((com.wf.weatherforcastexample.databinding.ViewNoPermissionsBinding) object, fieldId);
            case 2 :
                return onChangeViewNoInternet((com.wf.weatherforcastexample.databinding.ViewNoInternetBinding) object, fieldId);
            case 3 :
                return onChangeContainerSplash((com.wf.weatherforcastexample.databinding.ContainerSplashBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewNoGps(com.wf.weatherforcastexample.databinding.ViewNoGpsBinding ViewNoGps, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewTakePermissions(com.wf.weatherforcastexample.databinding.ViewNoPermissionsBinding ViewTakePermissions, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewNoInternet(com.wf.weatherforcastexample.databinding.ViewNoInternetBinding ViewNoInternet, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeContainerSplash(com.wf.weatherforcastexample.databinding.ContainerSplashBinding ContainerSplash, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        executeBindingsOn(containerSplash);
        executeBindingsOn(viewNoInternet);
        executeBindingsOn(viewNoGps);
        executeBindingsOn(viewTakePermissions);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewNoGps
        flag 1 (0x2L): viewTakePermissions
        flag 2 (0x3L): viewNoInternet
        flag 3 (0x4L): containerSplash
        flag 4 (0x5L): fragment
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}