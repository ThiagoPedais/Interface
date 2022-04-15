package model.entities;

public class Invoice {

	private Double basciPayment;
	private Double tax;
	
	public Invoice() {
		
	}

	public Invoice(Double basciPayment, Double tax) {
		this.basciPayment = basciPayment;
		this.tax = tax;
	}

	public Double getBasciPayment() {
		return basciPayment;
	}

	public void setBasciPayment(Double basciPayment) {
		this.basciPayment = basciPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment() {
		return getBasciPayment() + getTax();
	}
}
