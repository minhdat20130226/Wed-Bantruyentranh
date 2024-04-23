package cdweb.sellstories.sellstories.service;

import cdweb.sellstories.sellstories.dto.UserDTO;
import cdweb.sellstories.sellstories.entity.User;

public interface PasswordResetTokenService {

    void initTokenUser(UserDTO userDTO);
    boolean verifyToken(String token);
}
