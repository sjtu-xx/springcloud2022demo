package com.xx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xx.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xuexuan
 * @since 2023-06-02
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
