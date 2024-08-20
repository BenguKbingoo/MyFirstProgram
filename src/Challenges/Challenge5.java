package Challenges;

public class Challenge5 {

    public static void main(String[] args) {

        String[] dnaSamples = new String[] {
                "atgcatgcat",
                "gcaxtXagtc",
                "tgactgcXag",
                "ctatgcgatt",
                "ctatgcgatt",
                "tgactgcXag",
                "gcagxcagtc",
                "gcagacagtc",
                "tgcagcagtc",
                "ctgcacagtc"
        };

        dnaTester(dnaSamples);



    }

    public static void dnaTester(String[] dnaSamples){


        for(int i = 0; i < dnaSamples.length; i++){

            if(dnaSamples[i].contains("x") || dnaSamples[i].contains("X")){
                System.out.println("Dna # "+(i+1) +" is wrong");
            }

            else {
                System.out.println("Dna # " +(i+1) + " is correct");
            }
        }
    }
}
