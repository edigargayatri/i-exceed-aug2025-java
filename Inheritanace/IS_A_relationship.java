class company {
    String nameofcom;
    String city;

    company(String nameofcom, String city) {
        this.nameofcom = nameofcom;
        this.city = city;
    }

    public void display() {
        System.out.println("Name of the company: " + nameofcom + " in " + city);
    }
}

class HR extends company {
    public HR() {
        super("HR", "Koramangala");
    }
}

class finance extends company {
    public finance() {
        super("Finance", "BTM Layout");
    }
}

public class IS_A_relationship {
    public static void main(String[] args) {
        HR hrObj = new HR();
        finance finObj = new finance();

        hrObj.display();
        finObj.display();
    }
}
