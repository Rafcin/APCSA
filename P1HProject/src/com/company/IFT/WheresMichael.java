package com.company.IFT;

public class WheresMichael {

    static String[] peopleArray;
    static String result = "YAY YOU FOUND HIM";
    static String targ = "Jackson 5";


    public static void main(String[] args) {

        System.out.println("Targ: "+targ);

        String testString = new String();
        testString = "Hi";

        int[] num = new int[3];
        double[] dub = new double[3];
        String[] stringsOStr = new String[4];



        stringsOStr[0] = "Red";
        stringsOStr[1] = "Blue";
        stringsOStr[2] = "Green";

        peopleArray = new String [4];

        peopleArray[0] = "Janet Jackson";
        peopleArray[1] = "Michael Jackson";
        peopleArray[2] = "Jackson 5";
        peopleArray[3] = "Jack Johnson";

        for(int I = 0; I<peopleArray.length;I++){
            System.out.println(peopleArray[I]);
        }
        System.out.println("--------------------------------------");
        for(int I = 0; I<peopleArray.length;I++){
            if(peopleArray[I].contains(targ)){
                System.out.println("Array Index: "+I+" Contains Target: "+targ);
                String eResult = IFTCore.encryptXOR(result,CodeCore.creativeCode());
                System.out.println(eResult);
            }
        }


    }

}


