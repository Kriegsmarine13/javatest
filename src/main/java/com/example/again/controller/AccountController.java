package com.example.again.controller;

import com.example.again.entity.Account;
import com.example.again.repository.AccountRepository;
import com.example.again.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class AccountController {

    AccountRepository repository;
    AccountService accountService;

    public AccountController(AccountRepository repository, AccountService accountService) {
        this.repository = repository;
        this.accountService = accountService;
    }

    @GetMapping("/")
    public String index() {
        return "Hi, at least I'm working!";
    }

    @GetMapping("/account/{accountId}")
    public Optional<Account> findAccount(@PathVariable long accountId) {
        return repository.findById(accountId);
    }

    @GetMapping(value = "/account/find")
    public List<Account> findAccountBy(@RequestParam Map<String, String> queryParameters) {
        return accountService.searchAccounts(queryParameters);

    }

    @PostMapping(value = "/create", consumes = {"application/json"})
    public Account createAccount(@RequestBody Account accountData) {
        Account newAccount = new Account();
        newAccount.setBank_id(accountData.getBank_id());
        newAccount.setLastName(accountData.getLastName());
        newAccount.setFirstName(accountData.getFirstName());
        newAccount.setMiddleName(accountData.getMiddleName());
        newAccount.setDateOfBirth(accountData.getDateOfBirth());
        newAccount.setPlaceOfBirth(accountData.getPlaceOfBirth());
        newAccount.setPassportNumber(accountData.getPassportNumber());
        newAccount.setPhoneNumber(accountData.getPhoneNumber());
        newAccount.setLivingAddress(accountData.getLivingAddress());
        newAccount.setRegistrationAddress(accountData.getRegistrationAddress());
        newAccount.setEmail(accountData.getEmail());
        return repository.save(newAccount);
    }
}
