package ru.netology;

import org.junit.Assert;
import org.junit.Test;

import static ru.netology.Rule.service;

public class CashbackHackServiceTest {
@Rule
    @Test
    public void shouldCount1Test() {
        Assert.assertEquals(service.remain(999), 1);

    }

    @Test
    public void shouldCount2Test() {
        Assert.assertEquals(service.remain(998), 2);
    }

    @Test
    public void shouldCount3Test() {
        Assert.assertEquals(service.remain(997), 3);
    }

    @Test
    public void shouldCount500Test() {
        Assert.assertEquals(service.remain(500), 500);
    }

    @Test
    public void shouldCount999Test() {
        Assert.assertEquals(service.remain(1), 999);
    }

    @Test
    public void shouldCount998Test() {
        Assert.assertEquals(service.remain(2), 998);
    }

    @Test
    public void shouldCount997Test() {
        Assert.assertEquals(service.remain(3), 997);
    }
    @Test
    public void shouldCheckBoarders(){
        Assert.assertEquals( -1,service.remain(1001));
    }

    @Test
    public void shouldCheckBoarder(){
        Assert.assertEquals(0,service.remain(1000));
    }

}
