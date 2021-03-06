package br.com.trabalhofinal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_INFORMATION")
public class CustomerInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String customerName;
	
	@Column
	private String customerSurname;
	
	@Column
	private String customerCPF;
	
	@Column
	private String customerStreetAddress;
	
	@Column
	private String customerIncome;

	@Column
	@Enumerated
	private AccountType accountType;
	
	public CustomerInfo(String customerName, String customerSurname, String customerCPF,
			String customerStreetAddress, String customerIncome, AccountType accountType) {
		
		this.customerName = customerName;
		this.customerSurname = customerSurname;
		this.customerCPF = customerCPF;
		this.customerStreetAddress = customerStreetAddress;
		this.customerIncome = customerIncome;
		this.accountType = accountType;
		
	}

	public CustomerInfo() {}
	
	public AccountType getAccountType() {
		return accountType;
	}
	
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerSurname() {
		return customerSurname;
	}
	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}
	public String getCustomerCPF() {
		return customerCPF;
	}
	public void setCustomerCPF(String customerCPF) {
		this.customerCPF = customerCPF;
	}
	public String getCustomerStreetAddress() {
		return customerStreetAddress;
	}
	public void setCustomerStreetAddress(String customerStreetAddress) {
		this.customerStreetAddress = customerStreetAddress;
	}
	public String getCustomerIncome() {
		return customerIncome;
	}
	public void setCustomerIncome(String customerIncome) {
		this.customerIncome = customerIncome;
	}
	
	
	
}
