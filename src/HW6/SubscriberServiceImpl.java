package HW6;

import java.util.Arrays;

public class SubscriberServiceImpl implements SubscriberService {

//    private Subscriber[] subs;
//
//    public void setSubscriber(Subscriber sub) {
//        subs[sub.getId() - 1] = sub;
//    }


    //    a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
    @Override
    public void subsInfoCityTimeCallsExceedsSpecified(Subscriber[] subs, double time) {
        System.out.println("Information about subscribers whose time of intra city calls exceeds " + time);
        for (Subscriber sub : subs) {
            if (sub.getCityTimeMinute() > time) {
                System.out.println(sub);
            }
        }
    }

    //    b) сведения об абонентах, которые пользовались междугородней связью;
    @Override
    public void subsInfoWhoUsedLongDistanceCommunication(Subscriber[] subs) {
        System.out.println("Information about subscribers who used long-distance communication");
        for (Subscriber sub : subs) {
            if (sub.getTimeOfLongDistanceMinute() > 0) {
                System.out.println(sub);
            }
        }
    }

    //    c) сведения об абонентах ФИО, номер телефона, баланс у который первая бука фамилии передается как параметр.
    @Override
    public void subsInfo(Subscriber[] subs, String firstLetterOfSurname) {
        System.out.println("Information about subscribers in which the first letter of the surname starts with "
                + firstLetterOfSurname);
        for (Subscriber sub : subs) {
            if (sub.getSurname().startsWith(firstLetterOfSurname)) {
                System.out.println("Subscriber{" +
                        "surname='" + sub.getSurname() + '\'' +
                        ", name='" + sub.getName() + '\'' +
                        ", patronymic='" + sub.getPatronymic() + '\'' +
                        ", phone='" + sub.getPhone() + '\'' +
                        ", balance=" + sub.getBalance() +
                        '}');
            }
        }
    }


    //    d) суммарное потребление трафика интернета для определенного города
    @Override
    public void totalConsumptionInetTrafficForCity(Subscriber[] subs, String city) {
        int sum = 0;
        for (Subscriber sub : subs) {
            if (sub.getCity().equals(city)) {
                sum += sub.getInternetTrafficGb();
            }
        }
        System.out.println("Total consumption of Internet traffic for " + city + " is " + sum + " GB");
    }

    //    e) количество абонентов с отрицательны балансом
    @Override
    public void numberSubsWithNegativeBalance(Subscriber[] subs) {
        int i = 0;
        for (Subscriber sub : subs) {
            if (sub.getBalance() < 0) {
                i++;
            }
        }
        System.out.println("Number of subscribers with negative balance " + i);
    }


    //    @Override
//    public String toString() {
//        return "SubscriberServiceImpl{" +
//                "subs=" + Arrays.toString(subs) +
//                '}';
//    }

}
