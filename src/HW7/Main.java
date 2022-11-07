package HW7;

public class Main {

    public static void main(String[] args) {
        String[] array = new String[]{"alal", "blblb", null, "blblbl"};

        Collection collection = new Collection();
        System.out.println(collection.get(array, 1));
        collection.add(array, 5,"ggkggk");

        System.out.println(collection.toString());

    }


}
