package homework05.service;

public interface UserBalanceService {
    void payment(int index, int amount);

    int withdrawal(int index, int amount);

    int getBalance(int index);
}
