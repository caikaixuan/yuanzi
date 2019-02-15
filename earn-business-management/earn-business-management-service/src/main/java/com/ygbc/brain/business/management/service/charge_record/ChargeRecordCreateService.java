package com.ygbc.brain.business.management.service.charge_record;

import com.ygbc.brain.base.rpc.Req;
import com.ygbc.brain.base.rpc.Resp;
import com.ygbc.brain.business.common.module.Platform;
import com.ygbc.brain.business.common.service.base.BaseExecutableService;
import com.ygbc.brain.business.management.api.dto.charge_record.CreateChargeRecordReqDTO;
import com.ygbc.brain.business.common.dal.data.ChargeRecordData;
import com.ygbc.brain.common.utils.DeepBeanUtils;
import com.ygbc.brain.common.utils.IdWorker;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;

@Service
public class ChargeRecordCreateService extends BaseExecutableService<Req<CreateChargeRecordReqDTO>,Resp>{
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Resp execute(@Valid Req<CreateChargeRecordReqDTO> req) throws Exception {
        CreateChargeRecordReqDTO reqDTO = req.getData();
        ChargeRecordData chargeRecordData = DeepBeanUtils.copyAs(reqDTO,ChargeRecordData.class);
        if(chargeRecordData != null){
            chargeRecordData.setChargeRecordId(IdWorker.getFlowIdWorkerInstance().nextId());
            Platform.sdbInsert(chargeRecordData);
        }
        return Resp.build();
    }
}
