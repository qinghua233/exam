package exam;

import java.time.LocalDate;

public interface CatCafe {
    void BUYCAT(Cat CAT) throws exam.InsufficientBalanceException;
    void Entertaincustomers(exam.Customer customer) throws exam.CatNotFoundException;
    void Closeshop(LocalDate a);

}
