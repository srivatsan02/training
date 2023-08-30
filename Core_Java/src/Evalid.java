public class Evalid {

 

    public static void main(String[] args) {

        String email = "saidutarun1999@gmail.com";

        

        String[] subString = email.split("@");

        if(subString[0].length()<4) {

            System.out.println("Email invalid");

        }     

        else {

            String[] subString1 = subString[1].split("\\.");

            if(subString1[0].length()<3 && subString1[1].length()<2 ) {

                System.out.println("Email invalid");         

             }

        else {

            System.out.println("Email valid");

        }

    }

  }

}

 

// 1 -min 4 characters before @

// 2- min 3 characters between @ and .

// 3- min 2 chars after .

// 4- Only 1 occurence of @ and . is allowed

// Note: No regular expressions allowed

 

 

/*

* int indexat = email.indexOf('@');

* int indexdot = email.indexOf('.');

* if(indexat == email.lastIndexOf('@') && indexdot == lastIndexOf('.') &&

* indexat >= 4 && (indexat -indexdot) >= 3 && (email.lenght() - idexdot >= 2)

* {

* System.out.println("Valid");

* }

* else {

* Invalid;

* }

* */