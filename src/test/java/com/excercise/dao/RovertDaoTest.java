package com.excercise.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.exercise.Application;
import com.exercise.dao.RovertDao;
import com.exercise.domain.enumeration.Direction;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RovertDaoTest {
	
	@Autowired
	private RovertDao dao;

	@Test
    public void testMoveDown() {
        // Before
		String expected = "D";
		
		// Test
		this.dao.move(Direction.D);
		
		// After
		Assert.assertEquals(expected, this.dao.status()[0]);
    }
}
