package day170511.User_Inter;


import day170511.User.User_unus;
import day170511.User.User_unusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface User_unusMapper {
    long countByExample(User_unusExample example);

    int deleteByExample(User_unusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User_unus record);

    int insertSelective(User_unus record);

    List<User_unus> selectByExample(User_unusExample example);

    User_unus selectByPrimaryKey(String userGuid);

    int updateByExampleSelective(@Param("record") User_unus record, @Param("example") User_unusExample example);

    int updateByExample(@Param("record") User_unus record, @Param("example") User_unusExample example);

    int updateByPrimaryKeySelective(User_unus record);

    int updateByPrimaryKey(User_unus record);
}