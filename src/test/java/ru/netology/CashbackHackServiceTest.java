package ru.netology;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.concurrent.Callable;

class CashbackHackServiceTest {

    @Test
    public void shouldCount1Test() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1), 999);

    }

    @Test
    public void shouldCount2Test() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(2), 998);
    }

    @Test
    public void shouldCount3Test() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(3), 997);
    }

    @Test
    public void shouldCount500Test() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(500), 500);
    }

    @Test
    public void shouldCount999Test() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldCount998Test() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(998), 2);
    }

    @Test
    public void shouldCount997Test() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(997), 3);
    }
    @Test
    public void shouldCheckBoarders(){
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(-1), 1001);
    }

    @Test
    public void shouldCheckBoarder(){
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(0),1000);
    }
}
