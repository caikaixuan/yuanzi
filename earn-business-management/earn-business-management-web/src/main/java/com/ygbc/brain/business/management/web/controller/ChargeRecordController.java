package com.ygbc.brain.business.management.web.controller;

import com.ygbc.brain.base.rpc.Req;
import com.ygbc.brain.base.rpc.Resp;
import com.ygbc.brain.business.management.api.ChargeRecordServiceFacade;
import com.ygbc.brain.business.management.api.dto.charge_record.*;
import com.ygbc.brain.business.management.api.model.ChargeRecordModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("chartRecord")
public class ChargeRecordController {
    @Autowired
    private ChargeRecordServiceFacade chartRecordServiceFacade;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Resp<List<ChargeRecordModel>> list(@RequestBody Req<QueryChargeRecordListReqDTO> req) {
        return chartRecordServiceFacade.list(req);
    }

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public Resp<ChargeRecordModel> detail(@RequestBody Req<QueryChargeRecordDetailReqDTO> req) {
        return chartRecordServiceFacade.detail(req);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Resp create(@RequestBody Req<CreateChargeRecordReqDTO> req) {
        return chartRecordServiceFacade.create(req);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Resp update(@RequestBody Req<UpdateChargeRecordReqDTO> req) {
        return chartRecordServiceFacade.update(req);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Resp delete(@RequestBody Req<DeleteChargeRecordReqDTO> req) {
        return chartRecordServiceFacade.delete(req);
    }
}
