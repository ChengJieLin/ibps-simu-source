package com.ibeyoung.simu.system.controller.admin.auth;

import com.ibeyoung.framework.common.web.HttpResult;
import com.ibeyoung.simu.system.controller.admin.auth.vo.AuthLoginReqVO;
import com.ibeyoung.simu.system.controller.admin.auth.vo.AuthLoginRespVO;
import com.ibeyoung.simu.system.service.auth.AdminAuthService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/system/auth")
public class AuthController {

    @Resource
    private AdminAuthService authService;

    @PostMapping("/login")
    public HttpResult<AuthLoginRespVO> login(@RequestBody @Valid AuthLoginReqVO reqVO){
        return HttpResult.success(authService.login(reqVO));
    }

}
