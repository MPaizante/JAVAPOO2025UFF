package DUKE_UC_SANDIEGO.Solving_Problems_with_Software;

public class FindGeneWhile {
    public String findGene(String dna){
    int startIndex = dna.indexOf("ATG");
    int currIndex = dna.indexOf("TAA",startIndex + 3 );
    while (currIndex != -1){
        if ((currIndex - startIndex) % 3 == 0 ){
            return dna.substring(startIndex,currIndex + 3);
        }else {
            currIndex = dna.indexOf("TAA",currIndex + 1);
        }
    }
    return "ERRO";
    }
    public void  testFindGeneSimple(String dna){
        System.out.println("DNA strand is "+ dna);
        String gene = findGene(dna);
        System.out.println("Gene is "+ gene);
    }

    public static void main(String[] args) {
        FindGeneWhile test = new FindGeneWhile();
        test.testFindGeneSimple("CGATGGTTGATAAGCCTAAGCTATAA");
        test.testFindGeneSimple("AATGCGTAATTAATCG");
        test.testFindGeneSimple("CGATGGTTGATAAGCCTAAGCTATAA");

    }
}
