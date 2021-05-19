package com.bsoft.person.dao.primary;

import com.bsoft.person.entity.primary.TrainShareViewDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Author Xuhui Lin
 * @Date 2020/7/21 13:53
 * @Description
 */
@Repository
public interface TrainShareViewDao extends JpaRepository<TrainShareViewDO, Integer>, JpaSpecificationExecutor<TrainShareViewDO> {
}
