package DUKE_UC_SANDIEGO.Solving_Problems_with_Software;

import java.util.List;

public abstract class Document {
    public String text;
    protected List<String> getTokens(String pattern){
        return List.of(pattern.split(" +"));
    }



}
