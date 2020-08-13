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
	public String getCardCvv() {
		// TODO Auto-generated method stub
		return cardCvv;
	}

	@Override
	public String getAmount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCreditCardNo(String creditCardNo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCustomerName(String customerName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCardExpMonth(String cardExpMonth) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCardExpYear(String cardExpYear) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCardCvv() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAmount() {
		// TODO Auto-generated method stub

	}

}
