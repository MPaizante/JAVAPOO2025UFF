package DUKE_UC_SANDIEGO.Solving_Problems_with_Software;

public class FindGeneSimpleAndTest {
    public String findGeneSimple(String dna){
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if(startIndex == -1){
            return "";
        }
        int stopIndex = dna.indexOf("TAA", startIndex+3);
        if(stopIndex == -1){
            return "";
        }
        result = dna.substring(startIndex,stopIndex + 3);
        return result;
    }
    public void testFindGeneSimple(){
        String dna = "AATGCGTAATATGGT";
        System.out.println("DNA strand is "+dna);
        String gene = findGeneSimple(dna);
        System.out.println("Gene is "+gene);
        System.out.println("----------------");
        dna = "AATGCTAGGGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is "+gene);
        System.out.println("----------------");
        dna = "ATCCTATGCTTCGGCTGCTCTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is "+gene);
        System.out.println("----------------");
        dna = "ATGTAA";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is "+gene);
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        FindGeneSimpleAndTest teste = new FindGeneSimpleAndTest();
        teste.testFindGeneSimple();

    }

}
