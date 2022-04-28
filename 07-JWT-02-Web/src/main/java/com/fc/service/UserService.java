package com.fc.service;

import com.fc.vo.UserVO;

import java.util.Map;

public interface UserService {
    UserVO login(String username, String password);
}
