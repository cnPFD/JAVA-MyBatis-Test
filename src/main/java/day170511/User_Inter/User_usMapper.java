package day170511.User_Inter;


import day170511.User.User_us;
import day170511.User.User_usExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface User_usMapper {
    long countByExample(User_usExample example);

    int deleteByExample(User_usExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User_us record);

    int insertSelective(User_us record);

    List<User_us> selectByExample(User_usExample example);

    User_us selectByPrimaryKey(String userPhone);

    int updateByExampleSelective(@Param("record") User_us record, @Param("example") User_usExample example);

    int updateByExample(@Param("record") User_us record, @Param("example") User_usExample example);

    int updateByPrimaryKeySelective(User_us record);

    int updateByPrimaryKey(User_us record);
}