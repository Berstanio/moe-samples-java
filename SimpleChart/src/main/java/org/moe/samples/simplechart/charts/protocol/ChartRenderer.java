package org.moe.samples.simplechart.charts.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.simplechart.charts.ChartViewPortHandler;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ChartRenderer")
public interface ChartRenderer {
    /**
     * the component that handles the drawing area of the chart and it’s offsets
     */
    @Generated
    @Selector("viewPortHandler")
    ChartViewPortHandler viewPortHandler();
}