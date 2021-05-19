package com.bsoft.common.dao.primary;

import com.bsoft.common.entity.primary.ModifyRecordDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Author Xuhui Lin
 * @Date 2020/9/11 9:36
 * @Description
 */
@Repository
public interface ModifyRecordDao extends JpaRepository<ModifyRecordDO,Integer>, JpaSpecificationExecutor<ModifyRecordDO> {
}
