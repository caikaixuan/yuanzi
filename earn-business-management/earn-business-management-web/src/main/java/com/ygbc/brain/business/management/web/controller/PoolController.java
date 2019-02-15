package com.ygbc.brain.business.management.web.controller;

import com.ygbc.brain.base.rpc.Req;
import com.ygbc.brain.base.rpc.Resp;
import com.ygbc.brain.business.management.api.PoolServiceFacade;
import com.ygbc.brain.business.management.api.dto.pool.*;
import com.ygbc.brain.business.management.api.model.PoolModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pool")
public class PoolController {
    @Autowired
    private PoolServiceFacade poolServiceFacade;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Resp<List<PoolModel>> list(@RequestBody Req<QueryPoolListReqDTO> req) {
        return poolServiceFacade.list(req);
    }

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public Resp<PoolModel> detail(@RequestBody Req<QueryPoolDetailReqDTO> req) {
        return poolServiceFacade.detail(req);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Resp create(@RequestBody Req<CreatePoolReqDTO> req) {
        return poolServiceFacade.create(req);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Resp update(@RequestBody Req<UpdatePoolReqDTO> req) {
        return poolServiceFacade.update(req);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Resp delete(@RequestBody Req<DeletePoolReqDTO> req) {
        return poolServiceFacade.delete(req);
    }
}
