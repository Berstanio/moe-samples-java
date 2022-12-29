package org.moe.samples.simplechart.charts.protocol;


import apple.uikit.UIColor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("ScatterChartDataSetProtocol")
@ObjCProtocolName("_TtP6Charts27ScatterChartDataSetProtocol_")
public interface ScatterChartDataSetProtocol extends LineScatterCandleRadarChartDataSetProtocol {
    /**
     * returns:
     * Color for the hole in the shape. Setting to <code>nil</code> will behave as transparent.
     * <em>default</em>: nil
     */
    @Generated
    @Selector("scatterShapeHoleColor")
    UIColor scatterShapeHoleColor();

    /**
     * returns:
     * The radius of the hole in the shape (applies to Square, Circle and Triangle)
     * Set this to <= 0 to remove holes.
     * <em>default</em>: 0.0
     */
    @Generated
    @Selector("scatterShapeHoleRadius")
    double scatterShapeHoleRadius();

    /**
     * returns:
     * The size the scatter shape will have
     */
    @Generated
    @Selector("scatterShapeSize")
    double scatterShapeSize();

    /**
     * returns:
     * The ShapeRenderer responsible for rendering this DataSet.
     */
    @Generated
    @Selector("shapeRenderer")
    @MappedReturn(ObjCObjectMapper.class)
    ShapeRenderer shapeRenderer();
}