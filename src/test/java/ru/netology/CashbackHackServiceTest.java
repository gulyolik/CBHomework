package ru.netology;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static ru.netology.Rule.service;

public class CashbackHackServiceTest {
@Rule
    @Test
    public void shouldCount1Test() {
        Assert.assertEquals( 1, service.remain(999));

    }

    @Test
    public void shouldCount2Test() {
        Assert.assertEquals( 2,service.remain(998));
    }

    @Test
    public void shouldCount3Test() {
        Assert.assertEquals(3, service.remain(997));
    }

    @Test
    public void shouldCount500Test() {
        Assert.assertEquals( 500, service.remain(500));
    }

    @Test
    public void shouldCount999Test() {
        Assert.assertEquals( 999,service.remain(1));
    }

    @Test
    public void shouldCount998Test() {
        Assert.assertEquals( 998, service.remain(2));
    }

    @Test
    public void shouldCount997Test() {
        Assert.assertEquals( 997,service.remain(3));
    }

    @Test
    public void shouldCheckBoarder(){
        Assert.assertEquals(0,service.remain(1000));
    }

    @Test
    public void shouldCount1TestJupiter(){
        Assertions.assertEquals(1,service.remain(999));
    }

    @Test
    public void shouldCount2TestJupiter(){
    Assertions.assertEquals(2, service.remain(998));
    }

    @Test
    public void shouldCount3TestJupiter(){
    Assertions.assertEquals(3,service.remain(997));
    }


    @Test
    public void shouldCount500TestJupiter(){
    Assertions.assertEquals(500, service.remain(500));
    }

    @Test
    public void shouldCount999TestJupiter(){
    Assertions.assertEquals(999, service.remain(1));
    }

    @Test
    public void shouldCount998TestJupiter(){
    Assertions.assertEquals(998, service.remain(2));
    }

    @Test
    public void shouldCount997TestJupiter(){
    Assertions.assertEquals(997, service.remain(3));
    }

    @Test
    public void shouldCheckTheBoardersTestJupiter(){
    Assertions.assertEquals(0, service.remain(1000));
    }

}

