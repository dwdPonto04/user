package com.david.santos.user.business;

import com.david.santos.user.business.converter.UserConverter;
import com.david.santos.user.business.dto.UserDTO;
import com.david.santos.user.infrastructure.entity.User;
import com.david.santos.user.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserConverter userConverter;

    public UserDTO saveUser(UserDTO userDTO){
        User user = userConverter.forUser(userDTO);
        user = userRepository.save(user);
        return userConverter.forUserDTO(user);

    }

}
