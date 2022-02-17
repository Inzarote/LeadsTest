package leads.com.pag.service;

import leads.com.pag.entity.Leads;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * leads表。 服务类
 * </p>
 *
 * @author yanyinan
 * @since 2022-01-13
 */
public interface LeadsService extends IService<Leads> {

    void updateLeadsTitle(Leads leads, String newTitle);

}
