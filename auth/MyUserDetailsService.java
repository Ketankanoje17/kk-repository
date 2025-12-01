package auth;


import com.mahindraFinance.common.autofin.exception.ExceptionCode;
import com.mahindraFinance.common.autofin.exception.InactiveUserException;
import com.mahindraFinance.common.autofin.exception.UserServiceException;
import com.mahindraFinance.common.autofin.model.user.LMSModule;
import com.mahindraFinance.common.autofin.model.user.UserDetails;
import com.mahindrafinance.entitymaster.service.user.UserAccessService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private final UserAccessService lmsUserService;

    @Autowired
    public MyUserDetailsService(UserAccessService lmsUserService) {
        this.lmsUserService = lmsUserService;
    }

    @SneakyThrows
    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String userId) {
        System.out.println("userId = " + userId);
        if (userId == null) {
            throw new UserServiceException(ExceptionCode.USER_ACCESS_DATA_NOT_FOUND, "UserId is null");
        }
        UserDetails userDetails = lmsUserService.getUserDetails(userId, LMSModule.AUTOFIN, true, true);
        System.out.println("userDetails = " + userDetails);
        if ((Objects.nonNull(userDetails.getUser().getEndDate()) && userDetails.getUser().getEndDate().isBefore(LocalDateTime.now()))
                || (Objects.nonNull(userDetails.getUser().getActive()) && userDetails.getUser().getActive().equals("N"))) {
            throw new InactiveUserException("User is inactive");
        }
        return new LMSUserDetails(userDetails);
    }
}
