package Product;

public class ProductInfo {
  protected String Item_Code;
  protected String Item_Name;
  protected int Item_Rate;
  protected int quantity = 0; 
  protected int totalPrice = 0; 
  int cgst, sgst, subtotal=0, discount=0;  
  int invoice_total; 
  Character choice; 
  String paymentmode;
  Integer number;
  Integer cvv;
  String Date;
  
public ProductInfo() { //default constructor without arguments
	super(); }

public ProductInfo(String item_Code, String item_Name, int item_Rate, int quantity, int totalPrice,
		int overAllPrice, int cgst, int sgst, int subtotal, int discount, int invoice_total, Character choice,
		String paymentmode, Integer number, Integer cvv, String date) {
	super();
	this.Item_Code = item_Code;
	this.Item_Name = item_Name;
	this.Item_Rate = item_Rate;
	this.quantity = quantity;
	this.totalPrice = totalPrice;
	this.cgst = cgst;
	this.sgst = sgst;
	this.subtotal = subtotal;
	this.discount = discount;
	this.invoice_total = invoice_total;
	this.choice = choice;
	this.paymentmode = paymentmode;
	this.number = number;
	this.cvv = cvv;
	Date = date;
}


public ProductInfo(String item_Code, String item_Name, int item_Rate, Integer quantity, int totalPrice,
		 int cgst, int sgst, int subtotal, int discount, Integer invoice_total) {
	super();
	this.Item_Code = item_Code;
	this.Item_Name = item_Name;
	this.Item_Rate = item_Rate;
	this.quantity = quantity;
	this.totalPrice = totalPrice;
	this.cgst = cgst;
	this.sgst = sgst;
	this.subtotal = subtotal;
	this.discount = discount;
	this.invoice_total = invoice_total;
}

public String getItem_Code() {
	return Item_Code;
}

public void setItem_Code(String item_Code) {
	Item_Code = item_Code;
}

public String getItem_Name() {
	return Item_Name;
}

public void setItem_Name(String item_Name) {
	Item_Name = item_Name;
}

public int getItem_Rate() {
	return Item_Rate;
}

public void setItem_Rate(int item_Rate) {
	Item_Rate = item_Rate;
}

public Integer getQuantity() {
	return quantity;
}

public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}

public int getTotalPrice() {
	return totalPrice;
}

public void setTotalPrice(int totalPrice) {
	this.totalPrice = totalPrice;
}

public int getCgst() {
	return cgst;
}

public void setCgst(int cgst) {
	this.cgst = cgst;
}

public int getSgst() {
	return sgst;
}

public void setSgst(int sgst) {
	this.sgst = sgst;
}

public int getSubtotal() {
	return subtotal;
}

public void setSubtotal(int subtotal) {
	this.subtotal = subtotal;
}


public int getDiscount() {
	return discount;
}

public void setDiscount(int discount) {
	this.discount = discount;
}

public Integer getInvoice_total() {
	return invoice_total;
}

public void setInvoice_total(Integer invoice_total) {
	this.invoice_total = invoice_total;
}

public String getDate() {
	return Date;
}

public void setDate(String date) {
	Date = date;
}

public Character getChoice() {
	return choice;
}

public void setChoice(Character choice) {
	this.choice = choice;
}

public String getPaymentmode() {
	return paymentmode;
}

public void setPaymentmode(String paymentmode) {
	this.paymentmode = paymentmode;
}

public Integer getNumber() {
	return number;
}

public void setNumber(Integer number) {
	this.number = number;
}

public Integer getCvv() {
	return cvv;
}

public void setCvv(Integer cvv) {
	this.cvv = cvv;
}

@Override
public String toString() {
	return "ProductInfo [Item_Code=" + Item_Code + ", Item_Name=" + Item_Name + ", Item_Rate=" + Item_Rate
			+ ", quantity=" + quantity + ", totalPrice=" + totalPrice + ", overAllPrice=" +  ", cgst="
			+ cgst + ", sgst=" + sgst + ", subtotal=" + subtotal + ", discount=" + discount + ", invoice_total="
			+ invoice_total + "]";
	
}
}

