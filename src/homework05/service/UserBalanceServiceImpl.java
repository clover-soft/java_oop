package homework05.service;

import homework05.repository.UserRepository;

public class UserBalanceServiceImpl implements UserBalanceService {

    @Override
    public void payment(int index, int amount) {
        UserRepository.payment(index, amount);

    }

    @Override
    public int withdrawal(int index, int amount) {
        return UserRepository.withdrawal(index, amount);
    }

    @Override
    public int getBalance(int index) {
        return UserRepository.getBalance(index);
    }
}
