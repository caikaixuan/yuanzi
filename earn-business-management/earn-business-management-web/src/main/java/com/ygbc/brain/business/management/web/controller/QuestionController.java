package com.ygbc.brain.business.management.web.controller;

import com.ygbc.brain.base.rpc.Req;
import com.ygbc.brain.base.rpc.Resp;
import com.ygbc.brain.business.management.api.QuestionServiceFacade;
import com.ygbc.brain.business.management.api.dto.question.*;
import com.ygbc.brain.business.management.api.model.QuestionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    private QuestionServiceFacade questionServiceFacade;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Resp<List<QuestionModel>> list(@RequestBody Req<QueryQuestionListReqDTO> req) {
        return questionServiceFacade.list(req);
    }

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public Resp<QuestionModel> detail(@RequestBody Req<QueryQuestionDetailReqDTO> req) {
        return questionServiceFacade.detail(req);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Resp create(@RequestBody Req<CreateQuestionReqDTO> req) {
        return questionServiceFacade.create(req);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Resp update(@RequestBody Req<UpdateQuestionReqDTO> req) {
        return questionServiceFacade.update(req);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Resp delete(@RequestBody Req<DeleteQuestionReqDTO> req) {
        return questionServiceFacade.delete(req);
    }
}
