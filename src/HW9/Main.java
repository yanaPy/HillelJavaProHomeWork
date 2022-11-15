package HW9;

public class Main {

    public static void main(String[] args) {
        CustomCollection collecttion = new CustomCollectionService();
        collecttion.add("blablb");
        System.out.println(collecttion.toString());
    }

//    на основе интерфейса - реализовать коллекцию на основе связного списка
//
//    PS в 5 разделе Связанные списки - найдете много интресного что поможет вам выполнить ДЗ
}
