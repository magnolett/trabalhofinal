package br.com.trabalhofinal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.trabalhofinal.entities.CustomerInfo;
import br.com.trabalhofinal.entities.SavingsAccount;
import br.com.trabalhofinal.repository.SavingsAccountRepository;
import br.com.trabalhofinal.service.SavingsAccountService;

@Service
public class SavingsAccountServiceImpl implements SavingsAccountService {

	@Autowired
	SavingsAccountRepository savingsAccountRepository;

	@Override
	public void save(SavingsAccount savingsAccount) {
		savingsAccountRepository.save(savingsAccount);
	}

	@Override
	public void delete(SavingsAccount savingsAccount) {
		savingsAccountRepository.delete(savingsAccount);
	}

	@Override
	public SavingsAccount findById(Long savingsAccountId) {
		return savingsAccountRepository.findById(savingsAccountId).get();

	}

	public SavingsAccount findByAccountNumberAndPassword(final String accountNumber, final String accountPassword) {
		return savingsAccountRepository.findByAccountNumberAndPassword(accountNumber, accountPassword);

	}

	@Override
	public SavingsAccount findByCostumerInfo(CustomerInfo customerInfo) {
		return savingsAccountRepository.findByCostumerInfo(customerInfo);
	}
}
