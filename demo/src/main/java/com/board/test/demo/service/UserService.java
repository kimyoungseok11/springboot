package com.board.test.demo.service;

import com.board.test.demo.domain.User;
import com.board.test.demo.dto.UserForm;
import com.board.test.demo.exception.DuplicateEmailException;
import com.board.test.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void signUpUser(UserForm userForm) throws Exception{
        validateDuplicateEmail(userForm.getEmail());
        userRepository.save(User.createUser(userForm));
    }

    private void validateDuplicateEmail(String email) throws Exception{
        if(userRepository.existByEmail(email)){
            throw new DuplicateEmailException();
        }
    }
}
