package com.ygbc.brain.business.management.web.controller;

import com.ygbc.brain.base.rpc.Req;
import com.ygbc.brain.base.rpc.Resp;
import com.ygbc.brain.business.management.api.AnswerRecordServiceFacade;
import com.ygbc.brain.business.management.api.dto.answer_record.*;
import com.ygbc.brain.business.management.api.model.AnswerRecordModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("answerRecord")
public class AnswerRecordController {
    @Autowired
    private AnswerRecordServiceFacade answerRecordServiceFacade;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Resp<List<AnswerRecordModel>> list(@RequestBody Req<QueryAnswerRecordListReqDTO> req) {
        return answerRecordServiceFacade.list(req);
    }

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public Resp<AnswerRecordModel> detail(@RequestBody Req<QueryAnswerRecordDetailReqDTO> req) {
        return answerRecordServiceFacade.detail(req);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Resp create(@RequestBody Req<CreateAnswerRecordReqDTO> req) {
        return answerRecordServiceFacade.create(req);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Resp update(@RequestBody Req<UpdateAnswerRecordReqDTO> req) {
        return answerRecordServiceFacade.update(req);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Resp delete(@RequestBody Req<DeleteAnswerRecordReqDTO> req) {
        return answerRecordServiceFacade.delete(req);
    }
}
