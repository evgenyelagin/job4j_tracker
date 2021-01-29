package pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 455);
        Book skazka = new Book("Skazka", 120);
        Book alfabet = new Book("Alfabet", 10);
        Book firstJava = new Book("First Java", 560);

        Book[] bookMassive = new Book[4];
        bookMassive[0] = cleanCode;
        bookMassive[1] = skazka;
        bookMassive[2] = alfabet;
        bookMassive[3] = firstJava;
        for(int index = 0; index < bookMassive.length; index++) {
            Book bookich = bookMassive[index];
            System.out.println(bookich.getName() + " - " + bookich.getCount());
        }
        System.out.println();
        System.out.println("Замена значения ячеек");
        bookMassive[0] = firstJava;
        bookMassive[3] = cleanCode;
        for(int i = 0; i < bookMassive.length; i++) {
            Book bookich = bookMassive[i];
            System.out.println(bookich.getName() + " - " + bookich.getCount());
        }
        System.out.println();
        System.out.println("Вывод книги Clean Code");
        for(int j = 0; j < bookMassive.length; j++) {
            Book bookich = bookMassive[j];
            if (bookich.getName().equals("Clean Code")) {
                System.out.println(bookich.getName() + " - " + bookich.getCount());
            }
        }
    }
}


