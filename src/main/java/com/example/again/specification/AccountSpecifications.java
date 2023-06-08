package com.example.again.specification;

import com.example.again.entity.Account;
import org.springframework.data.jpa.domain.Specification;

public class AccountSpecifications {

    public static Specification<Account> hasParameter(String parameterName, String parameterValue) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get(parameterName), parameterValue);
    }
}