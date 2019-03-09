package earn.bussiness.http.request.user;

import com.alibaba.fastjson.JSONObject;
import com.ygbc.brain.base.rpc.Req;
import com.ygbc.brain.base.rpc.Resp;
import com.ygbc.brain.business.management.api.dto.user.QueryUserListReqDTO;
import com.ygbc.brain.business.management.api.model.UserModel;
import earn.bussiness.http.request.BaseRequest;
import org.apache.http.entity.StringEntity;

import java.net.URI;
import java.nio.charset.Charset;
import java.util.List;

public class GetUsersRequest extends BaseRequest<QueryUserListReqDTO,List<UserModel>> {

    private final String url = GetUsersRequest.BASE_REQUEST_URL + "/user/list";


    public GetUsersRequest(QueryUserListReqDTO reqDTO) {
        this.req.setData(reqDTO);
        init_HttpPost(this.req);
    }

    public void init_HttpPost(Req<QueryUserListReqDTO> req){
        this.httpPost.setURI(URI.create(url));
        StringEntity stringEntity = new StringEntity(JSONObject.toJSONString(req), Charset.forName("UTF-8"));
        httpPost.setEntity(stringEntity);
    }

    public Resp<List<UserModel>> exec(){
        return this.exec(this.httpPost);
    }

    @Override
    public Class getRespDataClass() {
        return UserModel.class;
    }
}
