package com.example.again.service;

import com.example.again.entity.Account;
import com.example.again.repository.AccountRepository;
import com.example.again.specification.AccountSpecifications;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> searchAccounts(Map<String, String> queryParameters) {
        Specification<Account> specification = null;
        for (Map.Entry<String, String> entry : queryParameters.entrySet()) {
            String parameterName = entry.getKey();
            String parameterValue = entry.getValue();

            if (parameterName != null && parameterValue != null) {
                Specification<Account> parameterSpecification = AccountSpecifications.hasParameter(parameterName, parameterValue);
                specification = specification == null ? parameterSpecification : specification.and(parameterSpecification);
            }
        }

        return accountRepository.findAll(specification);
    }
}
