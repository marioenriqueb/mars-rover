package com.excercise.dao;

import com.excercise.BaseTest;
import com.exercise.Application;
import com.exercise.dao.RovertDao;
import com.exercise.dao.impl.RovertDaoImpl;
import com.exercise.domain.enumeration.Direction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class RovertDaoTest extends BaseTest {

	private RovertDao dao;

	@Before
	public void init() {
		this.dao = new RovertDaoImpl();
	}

	@Test
    public void testMoveDown() {
        // Before
		String expected = "D";
		
		// Test
		this.dao.move(Direction.D);
		
		// After
		Assert.assertEquals(expected, this.dao.status()[0]);
    }

	@Test
	public void testMoveRight() {
		// Before
		String expected = "R";

		// Test
		this.dao.move(Direction.R);

		// After
		Assert.assertEquals(expected, this.dao.status()[0]);
	}

	@Test
	public void testMoveLeft() {
		// Before
		String expected = "L";

		// Test
		this.dao.move(Direction.L);

		// After
		Assert.assertEquals(expected, this.dao.status()[0]);
	}

	@Test
	public void testMoveUp() {
		// Before
		String expected = "U";

		// Test
		this.dao.move(Direction.U);

		// After
		Assert.assertEquals(expected, this.dao.status()[0]);
	}

	@Test
	public void testStand() {
		// Before
		String expected = "C";

		// Test
		this.dao.stand();

		// After
		Assert.assertEquals(expected, this.dao.status()[0]);
	}

	@Test
	public void testTransmit() {
		// Before
		String expected = "hola";

		// Test
		this.dao.transmit(expected);

		// After
		Assert.assertEquals("[" + expected + "]", this.dao.status()[0]);
	}

	@Test
	public void testStatus() {
		// Before
		this.dao.move(Direction.R);
		this.dao.transmit("hola");
		this.dao.move(Direction.L);
		this.dao.stand();
		this.dao.move(Direction.R);

		// Test
		String[] status = this.dao.status();

		// After
		Assert.assertEquals("R", this.dao.status()[0]);
		Assert.assertEquals("[hola]", this.dao.status()[1]);
		Assert.assertEquals("L", this.dao.status()[2]);
		Assert.assertEquals("C", this.dao.status()[3]);
		Assert.assertEquals("R", this.dao.status()[4]);
	}
}
