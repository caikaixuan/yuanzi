package com.ygbc.brain.business.management.web.controller;

import com.ygbc.brain.base.rpc.Req;
import com.ygbc.brain.base.rpc.Resp;
import com.ygbc.brain.business.management.api.WithdrawRecordServiceFacade;
import com.ygbc.brain.business.management.api.dto.withdraw_record.*;
import com.ygbc.brain.business.management.api.model.WithdrawRecordModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("withdrawRecord")
public class WithdrawRecordController {
    @Autowired
    private WithdrawRecordServiceFacade withdrawRecordServiceFacade;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Resp<List<WithdrawRecordModel>> list(@RequestBody Req<QueryWithdrawRecordListReqDTO> req) {
        return withdrawRecordServiceFacade.list(req);
    }

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public Resp<WithdrawRecordModel> detail(@RequestBody Req<QueryWithdrawRecordDetailReqDTO> req) {
        return withdrawRecordServiceFacade.detail(req);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Resp create(@RequestBody Req<CreateWithdrawRecordReqDTO> req) {
        return withdrawRecordServiceFacade.create(req);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Resp update(@RequestBody Req<UpdateWithdrawRecordReqDTO> req) {
        return withdrawRecordServiceFacade.update(req);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Resp delete(@RequestBody Req<DeleteWithdrawRecordReqDTO> req) {
        return withdrawRecordServiceFacade.delete(req);
    }
}
