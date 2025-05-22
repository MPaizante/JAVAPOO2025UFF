package DUKE_UC_SANDIEGO.Solving_Problems_with_Software;

public class AllCodons {
    public int findStopCondon(String dnaStr , int startIndex, String stopCodon){
        int currIndex = dnaStr.indexOf(stopCodon , startIndex +3);
        while (currIndex != -1){
            int diff = currIndex - startIndex;
            if (diff % 3 == 0){
                return currIndex;
            }
            else {
                currIndex = dnaStr.indexOf(stopCodon, currIndex+1);

            }
        }
      return dnaStr.length();
    }
    public String FindGene(String dna){
        int statIndex = dna.indexOf("ATG");
        if (statIndex == -1){
            return "";
        }
        int taaIndex = findStopCondon(dna,statIndex,"TAA");
        int tagIndex = findStopCondon(dna,statIndex,"TAG");
        int tgaIndex = findStopCondon(dna, statIndex , "TGA");
        int temp = Math.min(taaIndex,tagIndex);
        int minIndex = Math.min(temp,tgaIndex);
       // int minIndex = Math.min(taaIndex,Math.min(taaIndex,tgaIndex));
        if (minIndex == dna.length()){
            return "";
        }
        return dna.substring(statIndex,minIndex + 3);
    }

    public static void main(String[] args) {
        AllCodons test = new AllCodons();

    }
}
