package project.user;

public interface IUserActions {
    /**
     * Интерфейс взаимодействия пользователя с аккаунтом
     * Предусмотрены смена имени, пароля.
     * Добавление/удаление фото профиля
     * Добавление/удаление карт/кошельков
     * Просмотр истории/текущих сделок
     * */

    void changeName();          //изменение имени
    void changePassword();      //изменение пароля
    void addPhoto();            //ссылка на фото из соц.сетей
    void deletePhoto();         //удаление фото
    void addCard();             //добавление карты
    void deleteCard();          //удаление карты (кроме единственной)
    void addWallet();           //добавление кошелька
    void deleteWallet();        //удаление кошелька
    void getStory();            //получение истории
    void getCurrentDeals();     //получение текущих сделок
    void deleteAccount();       //удаление аккаунта, возможно только по завершении активных сделок

}
