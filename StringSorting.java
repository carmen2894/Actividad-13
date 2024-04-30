import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringSorting {
    private List<String> stringList = new ArrayList<>();

    public StringSorting() {
        // Agregar al menos 10 diferentes cadenas de texto al ArrayList
        stringList.add("Naturaleza");
        stringList.add("Flor");
        stringList.add("Río");
        stringList.add("Montañas");
        stringList.add("Animales");
        stringList.add("Cascada");
        stringList.add("Tierra");
        stringList.add("Estrellas");
        stringList.add("Laguna");
        stringList.add("Bosque");
    }

    public void sortStringsByLengthUsingAnonymousClass() {
        stringList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        System.out.println("Ordenado por longitud usando clase anónima:");
        System.out.println(stringList);
    }

    public void sortStringsByLengthUsingLambda() {
        stringList.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Ordenado por longitud usando expresión lambda:");
        System.out.println(stringList);
    }

    public void sortStringsByLengthUsingMethodReference() {
        stringList.sort(Comparator.comparingInt(String::length));
        System.out.println("Ordenado por longitud usando método de referencia:");
        System.out.println(stringList);
    }

    public void sortStringsAlphabeticallyUsingAnonymousClass() {
        stringList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println("Ordenado alfabéticamente usando clase anónima:");
        System.out.println(stringList);
    }

    public void sortStringsAlphabeticallyUsingLambda() {
        stringList.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Ordenado alfabéticamente usando expresión lambda:");
        System.out.println(stringList);
    }

    public void sortStringsAlphabeticallyUsingMethodReference() {
        stringList.sort(String::compareTo);
        System.out.println("Ordenado alfabéticamente usando método de referencia:");
        System.out.println(stringList);
    }

    public static void main(String[] args) {
        StringSorting sorter = new StringSorting();
        sorter.sortStringsByLengthUsingAnonymousClass();
        sorter.sortStringsByLengthUsingLambda();
        sorter.sortStringsByLengthUsingMethodReference();
        sorter.sortStringsAlphabeticallyUsingAnonymousClass();
        sorter.sortStringsAlphabeticallyUsingLambda();
        sorter.sortStringsAlphabeticallyUsingMethodReference();
    }
}
