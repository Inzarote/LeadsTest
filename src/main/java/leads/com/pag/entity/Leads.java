package leads.com.pag.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * leads表。
 * </p>
 *
 * @author yanyinan
 * @since 2022-01-13
 */
@Data
@TableName("leads")
@ApiModel(value = "Leads对象", description = "leads表。")
public class Leads implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("创建者uid")
    @TableField("uid")
    private Long uid;

    @ApiModelProperty("名字")
    @TableField("title")
    private String title;

    @ApiModelProperty("处理过空格的词")
    @TableField("trim_title")
    private String trimTitle;

    @ApiModelProperty("获取名字颜色和背景颜色的ID")
    @TableField("color_id")
    private Long colorId;

    @ApiModelProperty("状态：1-正常，2-举报，3-委员会判定违规，4-机审违规，5-删除")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("是否申诉：0-没有，1-已申诉")
    @TableField("is_appeal")
    private Integer isAppeal;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @ApiModelProperty("一级：只能是1")
    @TableField("level")
    private Integer level;

    @ApiModelProperty("链接地址")
    @TableField("url")
    private String url;

    @ApiModelProperty("链接类型：1-跳转到专家号文章详情，2-外链接（跳转到手机浏览器）")
    @TableField("link_type")
    private Integer linkType;

    @ApiModelProperty("内容ID")
    @TableField("content_id")
    private Long contentId;

    @ApiModelProperty("内容长度")
    @TableField("content_count")
    private Long contentCount;

    @ApiModelProperty("封面图")
    @TableField("cover_url")
    private String coverUrl;

    @ApiModelProperty("媒体资源：数组字符串")
    @TableField("media_list")
    private String mediaList;


}
