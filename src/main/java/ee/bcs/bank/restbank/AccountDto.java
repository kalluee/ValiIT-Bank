package ee.bcs.bank.restbank;

import lombok.Getter;
import lombok.Setter;

// Lombok'i annotatsioonid, mis loovad koodi kompileerimise hetkel vajalikud getterid ja setterid
@Setter
@Getter
public class AccountDto {
    // DTO - Data Transfer Object
    private int id;
    private String accountNumber;
    private String firstName;
    private String lastName;
    private Integer balance;
    private Boolean locked;

}
