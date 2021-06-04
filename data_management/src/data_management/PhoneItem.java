package data_management;

public class PhoneItem {
	private String name;		//부서명을 넣을 곳
	private String title;		//직함을 넣을 곳
	private String telNum;		//전화번호를 넣을 곳
	
	public PhoneItem() {
	}
	
	public PhoneItem(String name, String title, String telNum) {
		super();
		this.name = name;
		this.title = title;
		this.telNum = telNum;
	}
	
	//부서명, 직함, 전화번호 모두 private로 설정했기 때문에, 이클립스에서
	//제공해주는 제너럴 겟터, 섹터를 사용하였다.

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
