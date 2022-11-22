package HW6;

public interface SubscriberService {

//    a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
    void subsInfoCityTimeCallsExceedsSpecified(Subscriber[] subs,double time);


//    b) сведения об абонентах, которые пользовались междугородней связью;
    void subsInfoWhoUsedLongDistanceCommunication(Subscriber[] subs);

//    c) сведения об абонентах ФИО, номер телефона, баланс у который первая бука фамилии передается как параметр.
    void subsInfo(Subscriber[] subs,String firstLetterOfSurname);

//  d) суммарное потребление трафика интернета для определенного города
    void totalConsumptionInetTrafficForCity(Subscriber[] subs,String city);

//    e) количество абонентов с отрицательны балансом
    void numberSubsWithNegativeBalance(Subscriber[] subs);
}
