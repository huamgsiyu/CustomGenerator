package com.syh.online.shopping.mall.service.impl.authority;

import com.syh.online.shopping.mall.entity.authority.UserVo;
import com.syh.online.shopping.mall.mapper.authority.UserMapper;
import com.syh.online.shopping.mall.service.authority.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HSY
 * @since 2020-05-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserVo> implements IUserService {

}
