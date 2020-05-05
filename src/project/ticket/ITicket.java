package project.ticket;

public interface ITicket {
    //заявка
    void placeRequest();//запрос на получение кредита
    void placeOrder();//запрос на размещение предложения

    void getTicket(); //поиск заявок
}
