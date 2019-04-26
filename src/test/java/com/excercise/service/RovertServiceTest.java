package com.excercise.service;

import com.excercise.BaseTest;
import com.exercise.dao.RovertDao;
import com.exercise.domain.enumeration.Direction;
import com.exercise.exception.RovertException;
import com.exercise.service.RovertService;
import com.exercise.service.impl.RovertServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by mario on 26/04/2019.
 */
public class RovertServiceTest extends BaseTest {

    @InjectMocks
    private RovertServiceImpl service;

    @Mock
    private RovertDao dao;

    public RovertServiceTest() {
        MockitoAnnotations.initMocks(this);
        Mockito.doNothing().when(this.dao).move(Mockito.any(Direction.class));
        Mockito.doNothing().when(this.dao).transmit(Mockito.anyString());
        Mockito.doNothing().when(this.dao).stand();
    }

    @Test
    public void testMoveDown() throws RovertException {
        // Before
        String[] expected = {"D"};
        Mockito.when(dao.status()).thenReturn(expected);

        // Test
        this.service.move("down");

        // After
        Assert.assertEquals(expected[0], this.service.status().getStatus());
    }

    @Test
    public void testMoveLeft() throws RovertException {
        // Before
        String[] expected = {"L"};
        Mockito.when(dao.status()).thenReturn(expected);

        // Test
        this.service.move("left");

        // After
        Assert.assertEquals(expected[0], this.service.status().getStatus());
    }

    @Test
    public void testMoveRight() throws RovertException {
        // Before
        String[] expected = {"R"};
        Mockito.when(dao.status()).thenReturn(expected);

        // Test
        this.service.move("right");

        // After
        Assert.assertEquals(expected[0], this.service.status().getStatus());
    }

    @Test
    public void testMoveUp() throws RovertException {
        // Before
        String[] expected = {"U"};
        Mockito.when(dao.status()).thenReturn(expected);

        // Test
        this.service.move("up");

        // After
        Assert.assertEquals(expected[0], this.service.status().getStatus());
    }

    @Test
    public void testStand() throws RovertException {
        // Before
        String[] expected = {"S"};
        Mockito.when(dao.status()).thenReturn(expected);

        // Test
        this.service.stand();

        // After
        Assert.assertEquals(expected[0], this.service.status().getStatus());
    }

    @Test
    public void testTransmit() throws RovertException {
        // Before
        String[] expected = {"[hola]"};
        Mockito.when(dao.status()).thenReturn(expected);

        // Test
        this.service.transmit(expected[0]);

        // After
        Assert.assertEquals(expected[0], this.service.status().getStatus());
    }

    @Test(expected = RovertException.class)
    public void testMoveException() throws RovertException {
        // Before

        // Test
        this.service.move("nada");
    }
}
