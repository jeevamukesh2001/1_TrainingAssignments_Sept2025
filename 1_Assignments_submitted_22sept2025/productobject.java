package guvi1;

public class productobject {

    public static void main(String[] args) {
        productclass samsung = new productclass();
        samsung.pname = "Samsung Mobile Phone";
        samsung.bname = "Galaxy 120";
        samsung.price = 30000;
        samsung.nops = 125;
        samsung.high();
        System.out.println(samsung.pname+" "+samsung.bname+" "+samsung.price+" "+samsung.nops+" "+samsung.total);

        productclass oppo = new productclass();
        oppo.pname = "OPPO Mobile Phone";
        oppo.bname = "A59 5G";
        oppo.price = 15000;
        oppo.nops = 150;
        oppo.high();
        System.out.println(oppo.pname+" "+oppo.bname+" "+oppo.price+" "+oppo.nops+" "+oppo.total);

        productclass redmi = new productclass();
        redmi.pname = "Redmi Mobile Phone";
        redmi.bname = "13 5G";
        redmi.price = 25500;
        redmi.nops = 105;
        redmi.high();
        System.out.println(redmi.pname+" "+redmi.bname+" "+redmi.price+" "+redmi.nops+" "+redmi.total);

        productclass highest = samsung;

        if (oppo.total > highest.total) {
            highest = oppo;
        }
        if (redmi.total > highest.total) {
            highest = redmi;
        }

        System.out.println("Highest Amount:");
        System.out.println(highest.pname + " - ₹" + highest.total);
    }
}
