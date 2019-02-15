package com.ygbc.brain.business.management.web.controller;

import com.ygbc.brain.base.rpc.Req;
import com.ygbc.brain.base.rpc.Resp;
import com.ygbc.brain.business.management.api.InviteNumberServiceFacade;
import com.ygbc.brain.business.management.api.dto.invite_number.*;
import com.ygbc.brain.business.management.api.model.InviteNumberModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("inviteNumber")
public class InviteNumberController {
    @Autowired
    private InviteNumberServiceFacade inviteNumberServiceFacade;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Resp<List<InviteNumberModel>> list(@RequestBody Req<QueryInviteNumberListReqDTO> req) {
        return inviteNumberServiceFacade.list(req);
    }

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public Resp<InviteNumberModel> detail(@RequestBody Req<QueryInviteNumberDetailReqDTO> req) {
        return inviteNumberServiceFacade.detail(req);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Resp create(@RequestBody Req<CreateInviteNumberReqDTO> req) {
        return inviteNumberServiceFacade.create(req);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Resp update(@RequestBody Req<UpdateInviteNumberReqDTO> req) {
        return inviteNumberServiceFacade.update(req);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Resp delete(@RequestBody Req<DeleteInviteNumberReqDTO> req) {
        return inviteNumberServiceFacade.delete(req);
    }
}
