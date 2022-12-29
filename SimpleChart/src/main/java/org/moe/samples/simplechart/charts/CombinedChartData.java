package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.samples.simplechart.charts.protocol.IChartDataSet;
import org.moe.samples.simplechart.charts.protocol.ChartDataSetProtocol;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts17CombinedChartData")
@ObjCClassBinding
public class CombinedChartData extends BarLineScatterCandleBubbleChartData {
    static {
        NatJ.register();
    }

    @Generated
    protected CombinedChartData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * All data objects in row: line-bar-scatter-candle-bubble if not null.
     */
    @Generated
    @Selector("allData")
    public native NSArray<? extends ChartData> allData();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CombinedChartData alloc();

    @Owned @Generated
    @Selector("allocWithZone:")
    public static native CombinedChartData allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("barData")
    public native BarChartData barData();

    @Generated
    @Selector("bubbleData")
    public native BubbleChartData bubbleData();

    @Generated
    @Selector("calcMinMax")
    public native void calcMinMax();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("candleData")
    public native CandleChartData candleData();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("dataByIndex:")
    public native ChartData dataByIndex(long index);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Get dataset for highlight
     * \param highlight current highlight
     * 
     * 
     * returns:
     * dataset related to highlight
     */
    @Generated
    @Selector("getDataSetByHighlight:")
    @MappedReturn(ObjCObjectMapper.class)
    public native ChartDataSetProtocol getDataSetByHighlight(ChartHighlight highlight);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CombinedChartData init();

    @Generated
    @Selector("initWithDataSet:")
    public native CombinedChartData initWithDataSet(@Mapped(ObjCObjectMapper.class) ChartDataSetProtocol dataSet);

    @Generated
    @Selector("initWithDataSets:")
    public native CombinedChartData initWithDataSets(NSArray<?> dataSets);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("lineData")
    public native LineChartData lineData();

    @Generated
    @Owned
    @Selector("new")
    public static native CombinedChartData new_objc();

    @Generated
    @Selector("notifyDataChanged")
    public native void notifyDataChanged();

    @MappedReturn(ObjCObjectMapper.class) @Generated
    @Selector("removeDataSet:")
    public native ChartDataSetProtocol removeDataSet(@Mapped(ObjCObjectMapper.class) ChartDataSetProtocol dataSet);

    @MappedReturn(ObjCObjectMapper.class) @Generated
    @Selector("removeDataSetByIndex:")
    public native ChartDataSetProtocol removeDataSetByIndex(long i);

    @Generated
    @Selector("removeEntry:dataSetIndex:")
    public native boolean removeEntryDataSetIndex(ChartDataEntry entry, long dataSetIndex);

    @Generated
    @Selector("removeEntryWithXValue:dataSetIndex:")
    public native boolean removeEntryWithXValueDataSetIndex(double xValue, long dataSetIndex);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("scatterData")
    public native ScatterChartData scatterData();

    @Generated
    @Selector("setBarData:")
    public native void setBarData(BarChartData value);

    @Generated
    @Selector("setBubbleData:")
    public native void setBubbleData(BubbleChartData value);

    @Generated
    @Selector("setCandleData:")
    public native void setCandleData(CandleChartData value);

    @Generated
    @Selector("setLineData:")
    public native void setLineData(LineChartData value);

    @Generated
    @Selector("setScatterData:")
    public native void setScatterData(ScatterChartData value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("addDataSet:")
    public native void addDataSet(@Mapped(ObjCObjectMapper.class) ChartDataSetProtocol newElement);

    /**
     * Get the Entry for a corresponding highlight object
     * \param highlight
     * 
     * 
     * returns:
     * The entry that is highlighted
     */
    @Generated
    @Selector("entryFor:")
    public native ChartDataEntry entryFor(ChartHighlight highlight);
}