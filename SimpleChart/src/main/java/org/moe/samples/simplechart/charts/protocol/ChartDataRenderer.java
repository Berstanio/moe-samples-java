package org.moe.samples.simplechart.charts.protocol;


import apple.coregraphics.opaque.CGContextRef;
import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.samples.simplechart.charts.ChartAnimator;
import org.moe.samples.simplechart.charts.ChartData;
import org.moe.samples.simplechart.charts.ChartHighlight;
import org.moe.samples.simplechart.charts.ChartViewBase;
import org.moe.samples.simplechart.charts.NSUIAccessibilityElement;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ChartDataRenderer")
public interface ChartDataRenderer extends ChartRenderer {
    /**
     * An array of accessibility elements that are presented to the ChartViewBase accessibility methods.
     * Note that the order of elements in this array determines the order in which they are presented and navigated by
     * Accessibility clients such as VoiceOver.
     * Renderers should ensure that the order of elements makes sense to a client presenting an audio-only interface to a user.
     * Subclasses should populate this array in drawData() or drawDataSet() to make the chart accessible.
     */
    @Generated
    @Selector("accessibleChartElements")
    NSArray<? extends NSUIAccessibilityElement> accessibleChartElements();

    @Generated
    @Selector("animator")
    ChartAnimator animator();

    /**
     * Creates an <code>NSUIAccessibilityElement</code> that acts as the first and primary header describing a chart view.
     * \param chart The chartView object being described
     * 
     * \param data A non optional data source about the chart
     * 
     * \param defaultDescription A simple string describing the type/design of Chart.
     * 
     * 
     * returns:
     * A header <code>NSUIAccessibilityElement</code> that can be added to accessibleChartElements.
     */
    @Generated
    @Selector("createAccessibleHeaderUsingChart:andData:withDefaultDescription:")
    NSUIAccessibilityElement createAccessibleHeaderUsingChartAndDataWithDefaultDescription(ChartViewBase chart,
            ChartData data, String defaultDescription);

    @Generated
    @Selector("drawDataWithContext:")
    void drawDataWithContext(CGContextRef context);

    @Generated
    @Selector("drawExtrasWithContext:")
    void drawExtrasWithContext(CGContextRef context);

    /**
     * Draws all highlight indicators for the values that are currently highlighted.
     * \param indices the highlighted values
     */
    @Generated
    @Selector("drawHighlightedWithContext:indices:")
    void drawHighlightedWithContextIndices(CGContextRef context, NSArray<? extends ChartHighlight> indices);

    @Generated
    @Selector("drawValuesWithContext:")
    void drawValuesWithContext(CGContextRef context);

    /**
     * An opportunity for initializing internal buffers used for rendering with a new size.
     * Since this might do memory allocations, it should only be called if necessary.
     */
    @Generated
    @Selector("initBuffers")
    void initBuffers();

    @Generated
    @Selector("isDrawingValuesAllowedWithDataProvider:")
    boolean isDrawingValuesAllowedWithDataProvider(@Mapped(ObjCObjectMapper.class) ChartDataProvider dataProvider);
}