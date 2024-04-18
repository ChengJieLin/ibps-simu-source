package com.ibeyoung.simu.system.service.auth;

import com.ibeyoung.simu.system.controller.admin.auth.vo.AuthLoginReqVO;
import com.ibeyoung.simu.system.controller.admin.auth.vo.AuthLoginRespVO;
import jakarta.validation.Valid;

public interface AdminAuthService {
    /**
     * 账号登录
     *
     * @param reqVO 登录信息
     * @return 登录结果
     */
    AuthLoginRespVO login(@Valid AuthLoginReqVO reqVO);
    /**
     * 验证账号 + 密码。如果通过，则返回用户
     *
     * @param username 账号
     * @param password 密码
     * @return 用户
     */
    AuthLoginRespVO authenticate(String username, String password);
}
