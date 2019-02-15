package com.ygbc.brain.business.management.web.controller;

import com.ygbc.brain.base.rpc.Req;
import com.ygbc.brain.base.rpc.Resp;
import com.ygbc.brain.business.management.api.SysParameterServiceFacade;
import com.ygbc.brain.business.management.api.dto.sys_parameter.*;
import com.ygbc.brain.business.management.api.model.SysParameterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sysParameter")
public class SysParameterController {
    @Autowired
    private SysParameterServiceFacade sysParameterServiceFacade;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Resp<List<SysParameterModel>> list(@RequestBody Req<QuerySysParameterListReqDTO> req) {
        return sysParameterServiceFacade.list(req);
    }

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public Resp<SysParameterModel> detail(@RequestBody Req<QuerySysParameterDetailReqDTO> req) {
        return sysParameterServiceFacade.detail(req);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Resp create(@RequestBody Req<CreateSysParameterReqDTO> req) {
        return sysParameterServiceFacade.create(req);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Resp update(@RequestBody Req<UpdateSysParameterReqDTO> req) {
        return sysParameterServiceFacade.update(req);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Resp delete(@RequestBody Req<DeleteSysParameterReqDTO> req) {
        return sysParameterServiceFacade.delete(req);
    }
}
