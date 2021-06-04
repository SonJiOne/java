package data_management;

public class PhoneItem {
	private String name;
	private String title;
	private String telNum;
	
	public PhoneItem() {
	}
	
	public PhoneItem(String name, String title, String telNum) {
		super();
		this.name = name;
		this.title = title;
		this.telNum = telNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	
	@Override
	public String toString() {
		return "PhoneItem [name = " + name + ", title = " + title + ", telNum = " + telNum + "]";
	}
	
}
