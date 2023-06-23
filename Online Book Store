public class OnlineBookStore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please choose the services that you need:");
        System.out.println();
        System.out.println("1.E-Book       2.Physical Book ");
        int number = input.nextInt();
        
        if( number == 1){
            System.out.println();
            EBook ebook = new EBook("The Lord of the Rings", "J. R. R. Tolkien", 10, 4, ".pdf");
            System.out.println("EBook Title: " + ebook.getTitle());
            System.out.println("EBook Author: " + ebook.getAuthor());
            System.out.println("EBook Price: RM" + ebook.getPrice());
            System.out.println("EBook Quantity: " + ebook.getQuantity());
            System.out.println("EBook File Format: " + ebook.getFileFormat());
            System.out.println();
            System.out.println("You just see our book on online or download it");
            System.out.println("1.Open Book       2.Download Book");
            int abc = input.nextInt();
            if(abc==1){
                ebook.openBook();
            }
            else{
                ebook.downloadBook();
            }
        }
        else{
            System.out.println();
            PhysicalBook physicalBook = new PhysicalBook("The Catcher in the Rye", "J. D. Salinger", 40, 1, 1000);
            System.out.println("Physical Book Title: " + physicalBook.getTitle());
            System.out.println("Physical Book Author: " + physicalBook.getAuthor());
            System.out.println("Physical Book Price: RM" + physicalBook.getPrice());
            System.out.println("Physical Book Quantity: " + physicalBook.getQuantity());
            System.out.println("Physical Book Weight: " + physicalBook.getWeight() + "g");
            System.out.println("Shipping Cost: RM" + physicalBook.calculateShippingCost());
            System.out.println("Weight in pounds: " + physicalBook.getWeightInPounds());
        }
    }
}
