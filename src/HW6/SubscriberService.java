package HW6;

public interface SubscriberService {

//    a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
    void subsInfoCityTimeCallsExceedsSpecified(double time);


//    b) сведения об абонентах, которые пользовались междугородней связью;
    void subsInfoWhoUsedLongDistanceCommunication();

//    c) сведения об абонентах ФИО, номер телефона, баланс у который первая бука фамилии передается как параметр.
    void subsInfo(String firstLetterOfSurname);

//  d) суммарное потребление трафика интернета для определенного города
    void totalConsumptionInetTrafficForCity(String city);

//    e) количество абонентов с отрицательны балансом
    void numberSubsWithNegativeBalance();
}
