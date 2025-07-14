package DUKE_UC_SANDIEGO.Solving_Problems_with_Software;

public class AllCodonsAnd {
    public  int findStopCodon(String dnaStr, int startIndex, String stopCodon){
        int currIndex = dnaStr.indexOf(stopCodon, startIndex);
        while (currIndex != -1){
            int diff = currIndex - startIndex;
            if(diff % 3 == 0){
                return currIndex;
            }else {
                currIndex = dnaStr.indexOf(stopCodon);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        AllCodons allCodons = new AllCodons();
        System.out.println(allCodons.findStopCondon("CGATGGTTGATAAGCCTAAGCTATAA",0,"TAA"));
    }
}
