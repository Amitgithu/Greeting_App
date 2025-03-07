package org.spring.project.service;

import org.spring.project.dto.AuthUserDTO;
import org.spring.project.dto.LoginDTO;
import org.spring.project.exception.UserException;
import org.spring.project.model.AuthUser;

public interface IAuthenticationService {
    AuthUser register(AuthUserDTO userDTO) throws Exception;
    String login(LoginDTO loginDTO) throws UserException;
}
