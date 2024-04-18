package com.ibeyoung.simu.system.service.auth;


import com.ibeyoung.simu.system.controller.admin.auth.vo.AuthLoginReqVO;
import com.ibeyoung.simu.system.controller.admin.auth.vo.AuthLoginRespVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AdminAuthServiceImpl implements AdminAuthService{
    @Override
    public AuthLoginRespVO login(AuthLoginReqVO reqVO) {
        log.debug("*****************登录*****************");
        log.debug("{}",reqVO);
        AuthLoginRespVO respVO=new AuthLoginRespVO();
        return respVO;
    }

    @Override
    public AuthLoginRespVO authenticate(String username, String password) {
        //校验账户是否存在      根据username查询表


        return null;
    }
}
