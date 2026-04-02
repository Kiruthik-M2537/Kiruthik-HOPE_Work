package Day6;
public class MultipleApartments {
    public static void main(String[] args) {

        Apartment a1 = new Apartment();
        System.out.println("Apartment 1:");
        a1.display();

        Apartment a2 = new Apartment(2);
        System.out.println("Apartment 2:");
        a2.display();
        
        Apartment a3 = new Apartment(4, 4);
        System.out.println("Apartment 3:");
        a3.display();
    }
}
class Apartment {
    int bedrooms;
    int washrooms;
    int kitchens;
    int diningHalls;
    int halls;
    int playgrounds;

   
    Apartment() {
        bedrooms = 1;
        washrooms = 1;
        kitchens = 1;
        diningHalls = 1;
        halls = 1;
        playgrounds = 1;
    }

    Apartment(int type) {
        if (type == 2) {
            bedrooms = 2;
            washrooms = 2; 
            kitchens = 1;
            diningHalls = 1;
            halls = 1;
            playgrounds = 1;
        }
    }

    Apartment(int bedrooms, int washrooms) {
        this.bedrooms = bedrooms;
        this.washrooms = washrooms; 
        this.kitchens = 1; 
        this.diningHalls = 1;
        this.halls = bedrooms / 2; 
        this.playgrounds = 1;
    }

    void display() {
        System.out.println("There are"+ bedrooms + "bedrooms"+washrooms+"washrooms"+kitchens+"kitchens"+diningHalls+"diningHalls"+playgrounds+"playgrounds");
  
    }
}