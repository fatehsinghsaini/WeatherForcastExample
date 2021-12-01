package com.wf.weatherforcastexample.domain.model.predictions;

import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/wf/weatherforcastexample/domain/model/predictions/PredictionsItem;", "", "reference", "", "structuredFormatting", "Lcom/wf/weatherforcastexample/domain/model/predictions/StructuredFormatting;", "placeId", "description", "(Ljava/lang/String;Lcom/wf/weatherforcastexample/domain/model/predictions/StructuredFormatting;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getPlaceId", "getReference", "getStructuredFormatting", "()Lcom/wf/weatherforcastexample/domain/model/predictions/StructuredFormatting;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class PredictionsItem {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "reference")
    private final java.lang.String reference = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "structured_formatting")
    private final com.wf.weatherforcastexample.domain.model.predictions.StructuredFormatting structuredFormatting = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "place_id")
    private final java.lang.String placeId = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "description")
    private final java.lang.String description = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.wf.weatherforcastexample.domain.model.predictions.PredictionsItem copy(@org.jetbrains.annotations.Nullable()
    java.lang.String reference, @org.jetbrains.annotations.Nullable()
    com.wf.weatherforcastexample.domain.model.predictions.StructuredFormatting structuredFormatting, @org.jetbrains.annotations.Nullable()
    java.lang.String placeId, @org.jetbrains.annotations.Nullable()
    java.lang.String description) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PredictionsItem() {
        super();
    }
    
    public PredictionsItem(@org.jetbrains.annotations.Nullable()
    java.lang.String reference, @org.jetbrains.annotations.Nullable()
    com.wf.weatherforcastexample.domain.model.predictions.StructuredFormatting structuredFormatting, @org.jetbrains.annotations.Nullable()
    java.lang.String placeId, @org.jetbrains.annotations.Nullable()
    java.lang.String description) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReference() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wf.weatherforcastexample.domain.model.predictions.StructuredFormatting component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wf.weatherforcastexample.domain.model.predictions.StructuredFormatting getStructuredFormatting() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlaceId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
}