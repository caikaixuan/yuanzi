package com.ygbc.brain.business.management.web.controller;

import com.ygbc.brain.base.rpc.Req;
import com.ygbc.brain.base.rpc.Resp;
import com.ygbc.brain.business.management.api.UserPoolRecordServiceFacade;
import com.ygbc.brain.business.management.api.dto.user_pool_record.*;
import com.ygbc.brain.business.management.api.model.UserPoolRecordModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("userPoolRecord")
public class UserPoolRecordController {
    @Autowired
    private UserPoolRecordServiceFacade userPoolRecordServiceFacade;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Resp<List<UserPoolRecordModel>> list(@RequestBody Req<QueryUserPoolRecordListReqDTO> req) {
        return userPoolRecordServiceFacade.list(req);
    }

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public Resp<UserPoolRecordModel> detail(@RequestBody Req<QueryUserPoolRecordDetailReqDTO> req) {
        return userPoolRecordServiceFacade.detail(req);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Resp create(@RequestBody Req<CreateUserPoolRecordReqDTO> req) {
        return userPoolRecordServiceFacade.create(req);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Resp update(@RequestBody Req<UpdateUserPoolRecordReqDTO> req) {
        return userPoolRecordServiceFacade.update(req);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Resp delete(@RequestBody Req<DeleteUserPoolRecordReqDTO> req) {
        return userPoolRecordServiceFacade.delete(req);
    }
}
