package org.moe.samples.simplechart.charts.protocol;


import apple.foundation.NSArray;
import apple.foundation.NSNumber;
import apple.uikit.UIColor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("BarLineScatterCandleBubbleChartDataSetProtocol")
@ObjCProtocolName("_TtP6Charts46BarLineScatterCandleBubbleChartDataSetProtocol_")
public interface BarLineScatterCandleBubbleChartDataSetProtocol extends ChartDataSetProtocol {
    @Generated
    @Selector("highlightColor")
    UIColor highlightColor();

    @Generated
    @Selector("highlightLineDashLengths")
    NSArray<? extends NSNumber> highlightLineDashLengths();

    @Generated
    @Selector("highlightLineDashPhase")
    double highlightLineDashPhase();

    @Generated
    @Selector("highlightLineWidth")
    double highlightLineWidth();

    @Generated
    @Selector("setHighlightColor:")
    void setHighlightColor(UIColor value);

    @Generated
    @Selector("setHighlightLineDashLengths:")
    void setHighlightLineDashLengths(NSArray<? extends NSNumber> value);

    @Generated
    @Selector("setHighlightLineDashPhase:")
    void setHighlightLineDashPhase(double value);

    @Generated
    @Selector("setHighlightLineWidth:")
    void setHighlightLineWidth(double value);
}