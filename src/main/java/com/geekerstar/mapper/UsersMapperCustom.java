package com.geekerstar.mapper;

import java.util.List;

import com.geekerstar.pojo.Users;
import com.geekerstar.pojo.vo.FriendRequestVO;
import com.geekerstar.pojo.vo.MyFriendsVO;
import com.geekerstar.utils.MyMapper;

public interface UsersMapperCustom extends MyMapper<Users> {

	public List<FriendRequestVO> queryFriendRequestList(String acceptUserId);

	public List<MyFriendsVO> queryMyFriends(String userId);

	public void batchUpdateMsgSigned(List<String> msgIdList);

}
