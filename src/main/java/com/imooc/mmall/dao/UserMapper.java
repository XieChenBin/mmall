package com.imooc.mmall.dao;

import com.imooc.mmall.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author XieChenBin
 */
@Mapper
public interface UserMapper {

    int selectNumByUsername(String username);

    int selectNumByEmail(String email);

    User selectByUsernameAndPwd(@Param("username") String username, @Param("password") String password);

    int insert(User user);

    String selectQuestionByUsername(String username);

    int selectNumByUsernameAndQuestionAndAnswer(@Param("username") String username,
                                                @Param("question") String question, @Param("answer") String answer);

    int updatePasswordByUsername(@Param("username") String username, @Param("password") String password);

    int selectNumByIdAndPwd(@Param("id") Integer id, @Param("password") String password);

    int updateByPrimaryKeySelective(User user);

    int checkEmailById(@Param("id") Integer id, @Param("email") String email);

}