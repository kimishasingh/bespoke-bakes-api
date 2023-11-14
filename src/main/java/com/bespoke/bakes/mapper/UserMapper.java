package com.bespoke.bakes.mapper;

import com.bespoke.bakes.domain.BakerProfile;
import com.bespoke.bakes.domain.User;
import com.bespoke.bakes.domain.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static UserDTO toUserDTO(User user, BakerProfile bakerProfile) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setSurname(user.getSurname());
        userDTO.setMobileNumber(user.getMobileNumber());
        userDTO.setEmailAddress(user.getEmailAddress());
        userDTO.setActive(user.isActive());
        userDTO.setBakerProfile(bakerProfile);
        return userDTO;
    }
}
