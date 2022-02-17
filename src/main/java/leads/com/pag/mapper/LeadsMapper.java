package leads.com.pag.mapper;

import leads.com.pag.entity.Leads;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * leads表。 Mapper 接口
 * </p>
 *
 * @author yanyinan
 * @since 2022-01-13
 */
@Mapper
public interface LeadsMapper extends BaseMapper<Leads> {

}
