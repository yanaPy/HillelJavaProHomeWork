package HW6;

import HW5.Student;

public class Subscriber {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String city;
    private String phone;
    private String numDeal;
    private double balance;
    private int cityTimeMinute;
    private int timeOfLongDistanceMinute ;
    private int internetTrafficGb;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNumDeal() {
        return numDeal;
    }

    public void setNumDeal(String numDeal) {
        this.numDeal = numDeal;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCityTimeMinute() {
        return cityTimeMinute;
    }

    public void setCityTimeMinute(int cityTimeMinute) {
        this.cityTimeMinute = cityTimeMinute;
    }

    public int getTimeOfLongDistanceMinute() {
        return timeOfLongDistanceMinute;
    }

    public void setTimeOfLongDistanceMinute(int timeOfLongDistanceMinute) {
        this.timeOfLongDistanceMinute = timeOfLongDistanceMinute;
    }

    public int getInternetTrafficGb() {
        return internetTrafficGb;
    }

    public void setInternetTrafficGb(int internetTrafficGb) {
        this.internetTrafficGb = internetTrafficGb;
    }

    public Subscriber(int id, String surname, String name, String patronymic, String city, String phone, String numDeal,
                      double balance, int cityTimeMinute, int timeOfLongDistanceMinute, int internetTrafficGb) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.city = city;
        this.phone = phone;
        this.numDeal = numDeal;
        this.balance = balance;
        this.cityTimeMinute = cityTimeMinute;
        this.timeOfLongDistanceMinute = timeOfLongDistanceMinute;
        this.internetTrafficGb = internetTrafficGb;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", numDeal='" + numDeal + '\'' +
                ", balance='" + balance + '\'' +
                ", cityTimeMinute='" + cityTimeMinute + '\'' +
                ", timeOfLongDistanceMinute='" + timeOfLongDistanceMinute + '\'' +
                ", internetTrafficGb='" + internetTrafficGb + '\'' +
                '}';
    }

}
