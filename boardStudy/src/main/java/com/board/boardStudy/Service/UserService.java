package com.board.boardStudy.Service;

import com.board.boardStudy.domain.User;
import com.board.boardStudy.dto.UserForm;
import com.board.boardStudy.exception.DuplicateEmailException;
import com.board.boardStudy.repository.UserRepository;
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
        if(userRepository.existsByEmail(email)){
            throw new DuplicateEmailException();
        }
    }
}
