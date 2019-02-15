package com.ygbc.brain.business.management.service.validator;

import com.ygbc.brain.business.common.module.Platform;
import com.ygbc.brain.business.management.api.dto.algorithm.DeleteAlgorithmReqDTO;
import com.ygbc.brain.business.common.dal.data.AlgorithmData;
import com.ygbc.brain.common.validate.BaseValidator;
import com.ygbc.brain.common.validate.annotation.Validate;
import org.springframework.stereotype.Component;

@Component
@SuppressWarnings("unused")
public class DeleteAlgorithmValidator extends BaseValidator {

    @Validate(value = "id")
    public String validateAlgorithm(Long value, DeleteAlgorithmReqDTO context) {
        AlgorithmData algorithmData = Platform.sdbRead(AlgorithmData.class, value);
            if (algorithmData == null || algorithmData.getId() == null) {
                return "该算法不存在";
            }
            return null;

    }
}
