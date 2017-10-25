package jmeter;

import static org.junit.Assert.*;

import org.junit.Test;

public class jmeterTest {
	jmeter myjmeter = new jmeter();
	@Test
	public void testSetName() {
		myjmeter.setName("syj");
	}

	@Test
	public void testGetName() {
		myjmeter.setName("syj");
		myjmeter.getName();
	}

	@Test
	public void testSetFriend() {
		myjmeter.setFriend("fjy");
	}

	@Test
	public void testGetFriend() {
		myjmeter.setFriend("fjy");
		myjmeter.getFriend();
	}

	@Test
	public void testMain() {
		
	}

}
