package designPatterns.patterrns.structural.adapter;

public interface Xpay {
	
	public String getCreditCardNo();
	public String getCustomerName();
	public String getCardExpMonth();
	public String getCardExpYear();
	public String getCardCvv();
	public String getAmount();
	
	public void setCreditCardNo(String creditCardNo);
	public void setCustomerName(String customerName);
	public void setCardExpMonth(String cardExpMonth);
	public void setCardExpYear(String cardExpYear);
	
	

}
