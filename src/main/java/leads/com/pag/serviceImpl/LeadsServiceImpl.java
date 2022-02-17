package leads.com.pag.serviceImpl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import leads.com.pag.entity.Leads;
import leads.com.pag.mapper.LeadsMapper;
import leads.com.pag.service.LeadsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * <p>
 * leads表。 服务实现类
 * </p>
 *
 * @author yanyinan
 * @since 2022-01-13
 */
@Service
public class LeadsServiceImpl extends ServiceImpl<LeadsMapper, Leads> implements LeadsService {

    @Override
    public void updateLeadsTitle(Leads leads, String newTitle) {
        Leads instance = getOne(Wrappers.lambdaQuery(Leads.class).eq(Leads::getId, leads.getId()));
        instance.setTitle(newTitle);
        update(instance, Wrappers.lambdaQuery(Leads.class).eq(Leads::getId, leads.getId()));


        Optional<String> reduce = Arrays.stream(new Leads[0])
                .map(Leads::getTitle)
                .filter(it -> !Objects.isNull(it))
                .filter(it -> it.length() != 0)
                .map(it -> String.format("leads's title: %s", it))
                .reduce((i1, i2) -> i1 + i2);

    }
}
