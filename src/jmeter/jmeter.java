package jmeter;

public class jmeter {
	String name;
	String friend;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		System.out.println(name);
		return name;
	}
	public void setFriend(String friend) {
		this.friend = friend;
	}
	public String getFriend() {
		System.out.println(friend);
		return friend;
	}
	public static void main(String[] args) {
		jmeter myjmeter = new jmeter();
		myjmeter.setName("syj");
		myjmeter.getName();
		myjmeter.setFriend("fjy");
		myjmeter.getFriend();
	}

}
