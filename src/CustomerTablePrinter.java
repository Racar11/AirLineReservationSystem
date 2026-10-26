public class CustomerTablePrinter {

    void printHeader() {
        System.out.println();
        System.out.printf("%10s+------------+------------+----------------------------------+---------+-----------------------------+-------------------------------------+-------------------------+\n", "");
        System.out.printf("%10s| SerialNum  |   UserID   | Passenger Names                  | Age     | EmailID\t\t       | Home Address\t\t\t     | Phone Number\t       |%n", "");
        System.out.printf("%10s+------------+------------+----------------------------------+---------+-----------------------------+-------------------------------------+-------------------------+\n", "");
        System.out.println();
    }

    String row(int i, Customer c) {
        return String.format("%10s| %-10d | %-10s | %-32s | %-7s | %-27s | %-35s | %-23s |", "",
                i, c.randomIDDisplay(c.getUserID()), c.getName(), c.getAge(),
                c.getEmail(), c.getAddress(), c.getPhone());
    }
}
