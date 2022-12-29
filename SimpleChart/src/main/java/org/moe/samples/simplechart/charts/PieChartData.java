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
import org.moe.samples.simplechart.charts.protocol.PieChartDataSetProtocol;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts12PieChartData")
@ObjCClassBinding
public class PieChartData extends ChartData {
    static {
        NatJ.register();
    }

    @Generated
    protected PieChartData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PieChartData alloc();

    @Owned @Generated
    @Selector("allocWithZone:")
    public static native PieChartData allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * returns:
     * All up to one dataSet object this ChartData object holds.
     */
    @Generated
    @Selector("dataSets")
    public native NSArray<?> dataSets();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PieChartData init();

    @Generated
    @Selector("initWithDataSet:")
    public native PieChartData initWithDataSet(@Mapped(ObjCObjectMapper.class) ChartDataSetProtocol dataSet);

    @Generated
    @Selector("initWithDataSets:")
    public native PieChartData initWithDataSets(NSArray<?> dataSets);

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
    @Owned
    @Selector("new")
    public static native PieChartData new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * returns:
     * All up to one dataSet object this ChartData object holds.
     */
    @Generated
    @Selector("setDataSets:")
    public native void setDataSets(NSArray<?> value);

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

    /**
     * The total y-value sum across all DataSet objects the this object represents.
     */
    @Generated
    @Selector("yValueSum")
    public native double yValueSum();

    @Generated
    @Selector("dataSet")
    @MappedReturn(ObjCObjectMapper.class)
    public native PieChartDataSetProtocol dataSet();

    @Generated
    @Selector("dataSetAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native ChartDataSetProtocol dataSetAtIndex(long index);

    @Generated
    @Selector("dataSetForLabel:ignorecase:")
    @MappedReturn(ObjCObjectMapper.class)
    public native ChartDataSetProtocol dataSetForLabelIgnorecase(String label, boolean ignorecase);

    @Generated
    @Selector("entryFor:")
    public native ChartDataEntry entryFor(ChartHighlight highlight);

    @Generated
    @Selector("setDataSet:")
    public native void setDataSet(@Mapped(ObjCObjectMapper.class) PieChartDataSetProtocol value);
}