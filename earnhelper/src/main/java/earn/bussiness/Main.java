package earn.bussiness;

import com.ygbc.brain.base.rpc.Resp;
import com.ygbc.brain.business.management.api.dto.user.QueryUserListReqDTO;
import com.ygbc.brain.business.management.api.model.UserModel;
import earn.bussiness.http.request.user.GetUsersRequest;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GetUsersRequest getUsersRequest = new GetUsersRequest(new QueryUserListReqDTO());
        Resp<List<UserModel>> resp = getUsersRequest.exec();
        if(resp != null){
            List<UserModel> userModelList = resp.getData();
            for(UserModel userModel : userModelList){
                System.out.println("ID: " + userModel.getUserId() + " name: " + userModel.getNickName());
            }
        }

    }


}
