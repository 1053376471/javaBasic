package com.neuedu.homework0528;

public class WorkTest {
    public static void main(String[] args) {
    Worker worker = new Worker();
    worker.setName("zhangsan");
    worker.setNum(20);
    worker.setSalary(20);
    worker.computesalay();

    WorkerSalesman workerSalesman = new WorkerSalesman();
    workerSalesman.setName("lisi");
    workerSalesman.setZi(1000);
    workerSalesman.setTi(500);
    workerSalesman.computSalay();

    WorkerManager workerManager = new WorkerManager();
    workerManager.setName("x");
    workerManager.setSalay(500);
    workerManager.computSalay();

    WorkerFloater workerFloater = new WorkerFloater();
    workerFloater.setName("w");
    workerFloater.setHour(5);
    workerFloater.setSalary(30);
    workerFloater.computeSalay();





    }
}
