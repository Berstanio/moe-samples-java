package org.moe.samples.simplechart.charts.protocol;


import apple.coregraphics.struct.CGRect;
import apple.coregraphics.opaque.CGContextRef;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ChartFill")
public interface ChartFill {
    /**
     * Draws the provided path in filled mode with the provided area
     */
    @Generated
    @Selector("fillPathWithContext:rect:")
    void fillPathWithContextRect(CGContextRef context, @ByValue CGRect rect);
}