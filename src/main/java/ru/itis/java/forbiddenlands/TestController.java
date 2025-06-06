package ru.itis.java.forbiddenlands;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.java.forbiddenlands.model.entity.Account;
import ru.itis.java.forbiddenlands.model.entity.AccountRepository;

@RestController("/test")
@NoArgsConstructor
public class TestController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/fuck")
    public ResponseEntity<String> testFuck() {
        return ResponseEntity.ok("test fuck");
    }

    @GetMapping("/account")
    public ResponseEntity<String> testAccount() {
        return ResponseEntity.ok(accountRepository.findById(1L)
                .map(Account::toString)
                .orElse("не существует аккаунтов"));
    }
}
