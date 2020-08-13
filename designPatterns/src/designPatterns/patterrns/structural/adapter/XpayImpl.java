package designPatterns.patterrns.structural.adapter;

public class XpayImpl implements Xpay {

	private String creditCardNo;
	private String customerName;
	private String cardExpMonth;
	private String cardExpYear;
	private Short cardCvv;
	private Double amount;

	@Override
	public String getCreditCardNo() {

		return creditCardNo;
	}

	@Override
	public String getCustomerName() {

		return customerName;
	}

	@Override
	public String getCardExpMonth() {

		return cardExpMonth;
	}

	@Override
	public String getCardExpYear() {

		return cardExpYear;
	}

	@Override
	public Short getCardCvv() {
		// TODO Auto-generated method stub
		return cardCvv;
	}

	@Override
	public Double getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

	@Override
	public void setCreditCardNo(String creditCardNo) {
		// TODO Auto-generated method stub
		this.creditCardNo = creditCardNo;

	}

	@Override
	public void setCustomerName(String customerName) {
		// TODO Auto-generated method stub
		this.customerName = customerName;
	}

	@Override
	public void setCardExpMonth(String cardExpMonth) {
		// TODO Auto-generated method stub
		this.cardExpMonth = cardExpMonth;
	}

	@Override
	public void setCardExpYear(String cardExpYear) {
		// TODO Auto-generated method stub
		this.cardExpYear = cardExpYear;
	}

	@Override
	public void setCardCvv(Short cardCvv) {
		// TODO Auto-generated method stub
		this.cardCvv = cardCvv;
	}

	@Override
	public void setAmount(Double amount) {
		// TODO Auto-generated method stub
		this.amount = amount;
	}

}
