package com.ygbc.brain.business.management.service.pool;

import com.ygbc.brain.base.rpc.Req;
import com.ygbc.brain.base.rpc.Resp;
import com.ygbc.brain.business.common.module.Platform;
import com.ygbc.brain.business.common.service.base.BaseExecutableService;
import com.ygbc.brain.business.management.api.dto.pool.CreatePoolReqDTO;
import com.ygbc.brain.business.common.dal.data.PoolData;
import com.ygbc.brain.common.utils.DeepBeanUtils;
import com.ygbc.brain.common.utils.IdWorker;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;

@Service
public class PoolCreateService extends BaseExecutableService<Req<CreatePoolReqDTO>,Resp>{
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Resp execute(@Valid Req<CreatePoolReqDTO> req) throws Exception {
        CreatePoolReqDTO reqDTO = req.getData();
        PoolData poolData = DeepBeanUtils.copyAs(reqDTO,PoolData.class);
        if(poolData != null){
            poolData.setPoolId(IdWorker.getFlowIdWorkerInstance().nextId());
            Platform.sdbInsert(poolData);
        }
        return Resp.build();
    }
}
