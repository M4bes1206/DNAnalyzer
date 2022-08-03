// Imports the Java Time Library for measuring the time it takes for the program to run. 
import java.time.Duration;
import java.time.Instant;

// Program starts here.
public class entryPoint {
    public static void main(String[] args) {
        
        // Start measuring time
        Instant start = Instant.now();
        
        // Create a new instance of the dnaSequence and codonData classes and send the information to the dnaSequencer's ds constructor.
        int count = 0;
        while (count < 1000) {
            dnaSequencer ds = new dnaSequencer();
            codonData cd = new codonData();
            ds.getSequenceAndAminoAcid(cd.getIsoleucine(), cd.getLeucine(), cd.getValine(), cd.getPhenylalanine(), cd.getMethionine(), cd.getCysteine(), cd.getAlanine(), cd.getGlycine(), cd.getProline(), cd.getThreonine(), cd.getSerine(), cd.getTyrosine(), cd.getTryptophan(), cd.getGlutamine(), cd.getAsparagine(), cd.getHistidine(), cd.getGlutamicAcid(), cd.getAsparticAcid(), cd.getLysine(), cd.getArginine(), cd.getStop());
            count++;
        }

        // Stop measuring time
        findGeneWithAminoAcid.main(args);
        Instant end = Instant.now();
        Duration timeTaken = Duration.between(start, end);
        System.out.println("Time taken: " + timeTaken.toMillis() + " milliseconds");
    }
}

/*
 * Data sources:
 * https://pubmed.ncbi.nlm.nih.gov/12804578/
 * https://en.wikipedia.org/wiki/DNA_and_RNA_codon_tables
 * http://algoart.com/aatable.htm
 */