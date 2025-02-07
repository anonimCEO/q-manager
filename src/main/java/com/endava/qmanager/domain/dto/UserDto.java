package com.endava.qmanager.domain.dto;

import com.endava.qmanager.domain.model.Privileges;
import com.endava.qmanager.domain.model.User;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class UserDto {

    @NotBlank
    @Size(min = 2, message = "Username should be at least 2 symbols")
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String confirm;


    public User toUser(PasswordEncoder passwordEncoder) {
        if (!confirm.equals(password)) {
            throw new IllegalArgumentException("Passwords must match");
        }
        return new User(username, passwordEncoder.encode(password));
    }
}